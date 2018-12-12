package com.dingzhou.eye.bluetooth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.R;

public class BluetoothMenu extends Activity {
	public static String gPin;
	public static String gName;

	ListView _listViewPrinters;
	Button _buttonCancel;
	private Context mContext;
	private String m_PrinterDefaultAddress;
	private String m_PrinterDefaultName;
	private int _defaultPrinterIndex;
	private List<String> _printerList;
	private MyThread _threadUpdataUI;
	// static ThreadPrint thPrint;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		mContext = this;
		setContentView(R.layout.menu);

		_buttonCancel = (Button) findViewById(R.id.button2);
		_buttonCancel.setOnClickListener(ButtonClickListener);
		_listViewPrinters = (ListView) findViewById(R.id.listView1);
		_listViewPrinters.setOnCreateContextMenuListener(new OnCreateContextMenuListener() {
			public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
				final AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
				menu.setHeaderTitle("设置");
				menu.add(0, 0, 0, "删除设备");
				menu.add(0, 1, 0, "设置默认设备");
			}
		});
		gPin = "0000";
		gName = "";

		_printerList = new ArrayList<String>();
		printer_list_load();
		_threadUpdataUI = new MyThread();
		_threadUpdataUI.run();
	}

	void printer_list_load() {
		SharedPreferences mySP = getSharedPreferences("zicox_printer_list", Activity.MODE_WORLD_READABLE);
		int count = mySP.getInt("PrinterCount", 0);
		int index = mySP.getInt("DefaultPrinterIndex", 0);
		_defaultPrinterIndex = index;
		if (count == 0)
			return;
		if ((_defaultPrinterIndex + 1) > count)
			_defaultPrinterIndex = count - 1;
		for (int i = 0; i < count; i++)
			_printerList.add(mySP.getString("Printer" + i, ""));
		String pattern = ",";
		Pattern pat = Pattern.compile(pattern);
		String str = _printerList.get(index);
		String[] strArray = new String[2];
		strArray = pat.split(str);
		m_PrinterDefaultName = strArray[0];
		m_PrinterDefaultAddress = strArray[1];
	}

	void printer_list_save(List list, int defaultPrinterIndex) {
//		SharedPreferences.Editor editor = getSharedPreferences(Constants.BT_STATE_LIST, Activity.MODE_WORLD_WRITEABLE).edit();
		SharedPreferences.Editor editor = getSharedPreferences(Constants.BT_STATE_LIST, Activity.MODE_PRIVATE).edit();
		editor.putInt("PrinterCount", list.size());
		editor.putInt("DefaultPrinterIndex", defaultPrinterIndex);

		for (int i = 0; i < list.size(); i++) {
			editor.remove("Printer" + i);
			editor.putString("Printer" + i, (String) list.get(i));
		}
		editor.commit();
	}

	private void ui_updata() {
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.newfile, new String[] { "img_pre", "text", "text2", "text1" },
				new int[] { R.id.img_pre, R.id.text, R.id.text2, R.id.text1 });
		_listViewPrinters.setAdapter(adapter);
	}

	private List<? extends Map<String, ?>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String strArray[] = new String[2];
		String pattern = ",";
		Pattern pat = Pattern.compile(pattern);

		for (int i = 0; i < _printerList.size(); i++) {
			strArray = pat.split(_printerList.get(i));
			Map<String, Object> map = new HashMap<String, Object>();
			if (i == _defaultPrinterIndex) {
				map.put("text1", "默认");
			}
			map.put("text", strArray[0]);
			map.put("text2", strArray[1]);
			map.put("img_pre", R.drawable.printer);
			list.add(map);
		}
		return list;
	}

	public class MyThread implements Runnable {
		public void run() {
			Message message = new Message();
			message.what = 1;
			handler.sendMessage(message);// 发送消息
		}
	}

	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			// 要做的事情
			ui_updata();
			super.handleMessage(msg);
		}
	};

	public static boolean send_bytes(byte[] buf, int timeout) {
		int time = 0;
		while (time < timeout) {
			// if(thPrint.isBusy)
			// {
			// try {Thread.sleep(10);} catch (InterruptedException e) {}
			// time+=10;
			// continue;
			// }
			// else
			// {
			// thPrint.PrinterBuf.put(buf);
			// time = timeout+1;
			// return true;
			// }
		}
		return false;
	}

	public boolean onContextItemSelected(MenuItem item) {
		ContextMenuInfo info = item.getMenuInfo();
		AdapterView.AdapterContextMenuInfo contextMenuInfo = (AdapterView.AdapterContextMenuInfo) info;
		if (item.getItemId() == 0) {
			if (contextMenuInfo.position == _defaultPrinterIndex)
				_defaultPrinterIndex = 0;
			else if (contextMenuInfo.position < _defaultPrinterIndex)
				_defaultPrinterIndex -= 1;

			_printerList.remove(contextMenuInfo.position);
			printer_list_save(_printerList, _defaultPrinterIndex);
			_threadUpdataUI.run();
		}
		if (item.getItemId() == 1) {
			_defaultPrinterIndex = contextMenuInfo.position;
			printer_list_save(_printerList, _defaultPrinterIndex);
			_threadUpdataUI.run();
		} else if (item.getItemId() == 2) {
			// PRINT
			String pattern = ",";
			Pattern pat = Pattern.compile(pattern);
			String str1 = _printerList.get(contextMenuInfo.position);
			String[] strArray = new String[2];
			strArray = pat.split(str1);
			// thPrint.bt_address_changed(strArray[1]);
			String str = "print test \r\n";
			send_bytes(str.getBytes(), 3000);
		}
		return super.onContextItemSelected(item);
	}
	
	private OnClickListener ButtonClickListener = new OnClickListener() {

		public void onClick(View arg0) {
			switch (arg0.getId()) {
//			case R.id.button1:
//				Toast.makeText(mContext, "add", Toast.LENGTH_SHORT).show();
//				/*
//				 * List <String>list = new ArrayList<String>();
//				 * list.add("testName1,testAddress1");
//				 * list.add("testName2,testAddress2");
//				 * list.add("testName3,testAddress3");
//				 * list.add("testName4,testAddress4");
//				 * printer_list_save(list,0);
//				 */
//				show_search_printer_activity();
//				break;
			case R.id.button2:
				// thPrint.bt_address_changed(m_PrinterDefaultAddress);
				Intent intent = new Intent();
				setResult(Activity.RESULT_OK, intent);
				finish();
				break;
			}
		}
	};

	void wait_ms(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

	private void show_search_printer_activity() {
		Intent intent = new Intent(this, BluetoothSearchPrinter.class);
		startActivityForResult(intent, BluetoothState.REQUEST_CONNECT_DEVICE);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == BluetoothState.REQUEST_CONNECT_DEVICE) {
			switch (resultCode) {
			case RESULT_OK:
				Bundle b = data.getExtras(); // data为B中回传的Intent
				m_PrinterDefaultName = b.getString("PrinterName");
				m_PrinterDefaultAddress = b.getString("PrinterAddress");

				String[] strArray = new String[2];
				String pattern = ",";
				Pattern pat = Pattern.compile(pattern);
				for (int i = 0; i < _printerList.size(); i++) {
					strArray = pat.split(_printerList.get(i));
					if (strArray[1].equals(m_PrinterDefaultAddress))
						_printerList.remove(i);
				}

				_printerList.add(m_PrinterDefaultName + "," + m_PrinterDefaultAddress);
				_defaultPrinterIndex = _printerList.size() - 1;
				printer_list_save(_printerList, _defaultPrinterIndex);
				_threadUpdataUI.run();
				break;
			default:
				break;
			}
		}
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			// thPrint.bt_address_changed(m_PrinterDefaultAddress);
			finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction()==0){
			return false;
		}
		return super.onTouchEvent(event);
	}

}
