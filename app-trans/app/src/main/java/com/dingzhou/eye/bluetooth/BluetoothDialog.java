package com.dingzhou.eye.bluetooth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import com.dingzhou.eye.R;
import com.dingzhou.eye.util.Device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class BluetoothDialog extends Activity
{
	private Context _context;
	private Button   _buttonClose;
	private ListView _btDeviceListView;
	private MyThread     _threadUpdataUI;
	private List<String> _btDeviceList; // name,address,installed,cod
	private Device       _suporeDevice;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		_context = this;
		setContentView(R.layout.menu);
		_suporeDevice = new Device(_context,Device.TypeBullEye);
		_btDeviceList = new ArrayList<String>();

		_btDeviceListView = (ListView)findViewById(R.id.listView1);
		_btDeviceListView.setOnCreateContextMenuListener(new OnCreateContextMenuListener() {
			public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
				final AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
//				menu.setHeaderTitle("设置");
//				menu.add(0, 0, 0, "设置默认设备");
				
				menu.setHeaderTitle("Set");
				menu.add(0, 0, 0, "Set default device");
			}
		});
		_buttonClose = (Button) findViewById(R.id.button2);
		_buttonClose.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent();
				setResult(Activity.RESULT_OK, intent);
				finish();
			}
		});
		on_show_load();
		_threadUpdataUI = new MyThread();
		_threadUpdataUI.run();
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			Intent intent = new Intent();
			setResult(Activity.RESULT_OK, intent);
			finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	private void on_show_load()
	{
		_suporeDevice.type_update();
		_suporeDevice.load_info();
		
		BluetoothAdapter myBluetoothAdapter = null;
		if((myBluetoothAdapter = BluetoothAdapter.getDefaultAdapter())==null)
        {
     		Toast.makeText(this,"没有找到蓝牙适配器", Toast.LENGTH_LONG).show();
     		return;
        }
        Set <BluetoothDevice> pairedDevices = myBluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() <= 0)return;
        for (BluetoothDevice device : pairedDevices)
        {
        	_btDeviceList.add(device.getName()+","+device.getAddress());
        }
        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.newfile, new String[] { "img_pre", "text", "text2", "text1" },
				new int[] { R.id.img_pre, R.id.text, R.id.text2, R.id.text1 });
		_btDeviceListView.setAdapter(adapter);
	}
	
	private void ui_updata() {
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.newfile, new String[] { "img_pre", "text", "text2", "text1" },
				new int[] { R.id.img_pre, R.id.text, R.id.text2, R.id.text1 });
		_btDeviceListView.setAdapter(adapter);
	}
	
	private List<? extends Map<String, ?>> getData() 
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String strArray[] = new String[2];
		String pattern = ",";
		Pattern pat = Pattern.compile(pattern);
		for (int i = 0; i < _btDeviceList.size(); i++) {
			strArray = pat.split(_btDeviceList.get(i));
			Map<String, Object> map = new HashMap<String, Object>();
//			if ( strArray[1].equals(_suporeDevice.Mac)) map.put("text1", "默认");
			
			if ( strArray[1].equals(_suporeDevice.Mac)) map.put("text1", "Default");
			map.put("text", strArray[0]);
			map.put("text2", strArray[1]);
			map.put("img_pre", R.drawable.printer);
			list.add(map);
		}
		return list;
	}
	public boolean onContextItemSelected(MenuItem item) {
		ContextMenuInfo info = item.getMenuInfo();
		AdapterView.AdapterContextMenuInfo contextMenuInfo = (AdapterView.AdapterContextMenuInfo) info;
		String pattern = ",";
		Pattern pat = Pattern.compile(pattern);
		String str1 = _btDeviceList.get(contextMenuInfo.position);
		String[] strArray = new String[2];
		strArray = pat.split(str1);
		_suporeDevice.save_info(strArray[0], strArray[1]);
		_threadUpdataUI.run();
		return super.onContextItemSelected(item);
	}
//*******************************************************************************
// ui thread
	public class MyThread implements Runnable {
		public void run() {
			Message message = new Message();
			message.what = 1;
			handler.sendMessage(message);
		}
	}
	
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			// 要做的事情
			ui_updata();
			super.handleMessage(msg);
		}
	};
}
