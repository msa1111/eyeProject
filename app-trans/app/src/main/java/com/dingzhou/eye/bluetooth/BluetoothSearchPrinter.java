package com.dingzhou.eye.bluetooth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.ui.StatusBox;
import com.dingzhou.eye.R;

public class BluetoothSearchPrinter extends Activity {
	int COD_UNKOWN = 0;
	int COD_PRINTER = 1;
	int COD_COMPUTER = 2;
	int COD_PHONE = 3;
	int COD_AUDIO = 4;
	Button msearchage;
	private BluetoothAdapter mBtAdapter;
	private Button CloseButton;
	private Button searchButton;
	private ListView _btDevicesListView;
	private List<String> _bluetoothDeviceList; 
	private List<String> _printerList;
	private ThreadTimeOut _thTimeOut;
	public static String EXTRA_DEVICE_ADDRESS = "device_address";
	public String btname;
	static public String printerAddress;
	static public String printerName;
	static public BluetoothDevice device;
	public static BluetoothSocket btSocket;
	private TextView textStatus;
	public static Activity ac;
	private int _timeOut;
	private StatusBox _waitDialog;

	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.searchprints);

		ac = this;
		_btDevicesListView = (ListView) findViewById(R.id.listView1);

		WindowManager wm = this.getWindowManager();
		int height = wm.getDefaultDisplay().getHeight();
		ViewGroup.LayoutParams params = _btDevicesListView.getLayoutParams();
		params.height = height / 2;
		_btDevicesListView.setLayoutParams(params);

		_btDevicesListView.setOnItemClickListener(mDeviceClickListener);
		_bluetoothDeviceList = new ArrayList<String>();
		textStatus = (TextView) findViewById(R.id.textView1);
		CloseButton = (Button) findViewById(R.id.close);
		CloseButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setResult(Activity.RESULT_CANCELED, null);
				finish();
			}
		});
		searchButton = (Button) findViewById(R.id.search_s);
		searchButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				search_printers();
			}
		});

		_printerList = new ArrayList<String>();
		printer_list_load();

		_timeOut = -1;
		_thTimeOut = new ThreadTimeOut();
		_thTimeOut.start();

		mBtAdapter = BluetoothAdapter.getDefaultAdapter();
		if (!mBtAdapter.isEnabled()) {
			dialog_message_show();
		} else {
			search_printers();
		}
		_waitDialog = new StatusBox(ac, searchButton);
	}

	private List<? extends Map<String, ?>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String strArray[] = new String[5];
		String pattern = ",";
		Pattern pat = Pattern.compile(pattern);
		for (int i = 0; i < _bluetoothDeviceList.size(); i++) {
			strArray = pat.split(_bluetoothDeviceList.get(i));
			Map<String, Object> map = new HashMap<String, Object>();
			if (Integer.valueOf(strArray[4]).intValue() > 0)
				map.put("text1", "已配对");
			if (Integer.valueOf(strArray[2]).intValue() > 0)
				map.put("text1", "已安装");
			int type = Integer.valueOf(strArray[3]).intValue();
			if (type == 0)
				map.put("img_pre", R.drawable.cod0);
			else if (type == 1)
				map.put("img_pre", R.drawable.cod1);
			else if (type == 2)
				map.put("img_pre", R.drawable.cod2);
			else if (type == 3)
				map.put("img_pre", R.drawable.cod3);
			else if (type == 4)
				map.put("img_pre", R.drawable.cod4);
			map.put("text", strArray[0]);
			map.put("text2", strArray[1]);
			list.add(map);
		}
		return list;
	}

	private void search_printers() {
		String str = getString(R.string.PrinterSearching) + String.format(" (%s*)", BluetoothMenu.gName);
		textStatus.setText(str);

		_timeOut = 10;
		_bluetoothDeviceList.clear();
		Message message = new Message();
		message.what = 1;
		handlerUIUpdata.sendMessage(message);
		String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
		IntentFilter intent = new IntentFilter();
		intent.addAction(BluetoothDevice.ACTION_FOUND);
		intent.addAction(BluetoothDevice.ACTION_BOND_STATE_CHANGED);
		intent.addAction(ACTION_PAIRING_REQUEST);
		intent.addAction(BluetoothAdapter.ACTION_SCAN_MODE_CHANGED);
		intent.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);

		registerReceiver(mReceiver, intent);
		mBtAdapter = BluetoothAdapter.getDefaultAdapter();
		if (mBtAdapter.isDiscovering()) {
			mBtAdapter.cancelDiscovery();
		}
		mBtAdapter.startDiscovery();
	}

	private void back_last_activity() {
		Intent intent = new Intent();
		intent.putExtra("PrinterName", printerName);
		intent.putExtra("PrinterAddress", printerAddress);
		setResult(Activity.RESULT_OK, intent);
		finish();
	}

	
	private OnItemClickListener mDeviceClickListener = new OnItemClickListener() {
		@SuppressLint("NewApi")
		public void onItemClick(AdapterView<?> av, View v, int arg2, long arg3) {
			mBtAdapter.cancelDiscovery();
			String pattern = ",";
			Pattern pat = Pattern.compile(pattern);
			String str1 = _bluetoothDeviceList.get(arg2);
			String[] strArray = new String[5];
			strArray = pat.split(str1);
			printerAddress = strArray[1];
			printerName = strArray[0];
			int isInstalled = Integer.valueOf(strArray[2]).intValue();
			if (isInstalled > 0) {
				back_last_activity();
				Toast.makeText(getApplicationContext(), "设备已经存在", Toast.LENGTH_SHORT).show();
				return;
			}
			BluetoothDevice btDev = mBtAdapter.getRemoteDevice(printerAddress);
			try {
				if (btDev.getBondState() == BluetoothDevice.BOND_NONE) {
					_waitDialog = new StatusBox(ac, v);
					_waitDialog.Show(getString(R.string.MsgPrinterAdding));
					btDev.createBond();
				} else if (btDev.getBondState() == BluetoothDevice.BOND_BONDED) {
					back_last_activity();
					Toast.makeText(getApplicationContext(), "设备已添加", Toast.LENGTH_SHORT).show();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	void printer_list_load() {
		SharedPreferences mySP = getSharedPreferences(Constants.BT_STATE_LIST, Activity.MODE_WORLD_READABLE);
		int count = mySP.getInt("PrinterCount", 0);
		if (count == 0)
			return;
		for (int i = 0; i < count; i++)
			_printerList.add(mySP.getString(Constants.BT_STATE + i, ""));
	}

	private BroadcastReceiver mReceiver = new BroadcastReceiver() {
		@SuppressLint("NewApi")
		public void onReceive(Context context, Intent intent) {
			String action = intent.getAction();
			// 当发现设备

			if (BluetoothDevice.ACTION_FOUND.equals(action)) {
				int type = COD_UNKOWN;
				device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
				BluetoothClass btc = device.getBluetoothClass();
				if (btc != null) {
					int cod = btc.getDeviceClass();
					int cod_maj = cod / 256;
					int cod_min = cod % 256;
					if (cod_maj == 0x06 && cod_min == 0x80)
						type = COD_PRINTER; // printer
					else if (cod_maj == 0x01)
						type = COD_COMPUTER; // cpu
					else if (cod_maj == 0x02)
						type = COD_PHONE; // phone
					else if (cod_maj == 0x04)
						type = COD_AUDIO; // audio
					else
						type = COD_UNKOWN;
				}

				// 判断是否过滤设备名名称
				int filterNameLen = BluetoothMenu.gName.length();
				if (filterNameLen > 0) {
					if (device.getName().length() >= filterNameLen) {
						if (!BluetoothMenu.gName.equals(device.getName().substring(0, filterNameLen).toUpperCase()))
							return;
					} else
						return;
				}
				{
					String strInstalled = "0";
					String strCOD = String.valueOf(type);
					String strBonded = "0";

					String pattern = ",";
					Pattern pat = Pattern.compile(pattern);
					String[] strArray = new String[2];
					for (int m = 0; m < _printerList.size(); m++) {
						strArray = pat.split(_printerList.get(m));
						if (strArray[1].equals(device.getAddress()))
							strInstalled = "1";
					}
					if (device.getBondState() == device.BOND_BONDED)
						strBonded = "1";
					_bluetoothDeviceList.add(device.getName() + "," + device.getAddress() + "," + strInstalled + "," + strCOD + "," + strBonded);
					Message message = new Message();
					message.what = 1;
					handlerUIUpdata.sendMessage(message);// 发送消息
				}
			} else if (BluetoothDevice.ACTION_BOND_STATE_CHANGED.equals(action)) {
				device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
				switch (device.getBondState()) {
				case BluetoothDevice.BOND_BONDING:
					Log.d("long", "正在配对......");
					break;
				case BluetoothDevice.BOND_BONDED:
					Log.d("long", "完成配对");
					_waitDialog.Close();
					back_last_activity();
					break;
				case BluetoothDevice.BOND_NONE:
					_waitDialog.Close();
					Log.d("long", "取消配对");
				default:
					break;
				}
			} else if (action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
				device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
				try {
					device.setPin("0000".getBytes());
				} catch (Exception e) {
				}
			}
		}
	};

	private void ui_ipdata() {
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.item_layout, new String[] { "img_pre", "text", "text2", "text1" }, new int[] { R.id.img_pre, R.id.text, R.id.text2,
				R.id.text1 });
		_btDevicesListView.setAdapter(adapter);
	}

	Handler handlerUIUpdata = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 1:
				ui_ipdata();
				break;
			case 2:
				String str = getString(R.string.ButtonSearchText) + String.format("(%d)", _timeOut);
				searchButton.setText(str);
				break;
			case 3:
				textStatus.setText(getString(R.string.SearchFinishMessage) + String.format(" (%s*)", BluetoothMenu.gName));
				searchButton.setText(R.string.ButtonSearchText);
				break;
			}
			super.handleMessage(msg);
		}
	};

	class ThreadTimeOut extends Thread {
		public void run() {
			while (true) {
				if (_timeOut > 0) {
					Message msg = new Message();
					msg.what = 2;
					handlerUIUpdata.sendMessage(msg);
					_timeOut--;
				} else if (_timeOut == 0) {
					Message msg = new Message();
					msg.what = 3;
					handlerUIUpdata.sendMessage(msg);
					_timeOut--;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void dialog_message_show() {
		AlertDialog.Builder _dialogMessage = new Builder(BluetoothSearchPrinter.this);
		_dialogMessage.create();

		_dialogMessage.setInverseBackgroundForced(true);
		_dialogMessage.setCancelable(false);

		_dialogMessage.setTitle(R.string.DialogTitleBTState);
		_dialogMessage.setMessage(R.string.DialogMsgBTState);

		_dialogMessage.setPositiveButton(R.string.DialogMsgButtonOK, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface arg0, int arg1) {
				// BluetoothDeviceLocal.enable();
				// while (BluetoothDeviceLocal.is_enabled() == false) {
				// wait_ms(500);
				// }
			}
		});

		_dialogMessage.setNegativeButton(R.string.DialogMsgButtonNO, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface arg0, int arg1) {
				setResult(Activity.RESULT_CANCELED, null);
				finish();
			}
		});
		_dialogMessage.show();
	}

	void wait_ms(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if (event.getAction() == 0) {
			return false;
		}
		return super.onTouchEvent(event);
	}
}
