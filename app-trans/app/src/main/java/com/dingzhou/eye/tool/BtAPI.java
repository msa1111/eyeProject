package com.dingzhou.eye.tool;

import java.io.UnsupportedEncodingException;

import com.dingzhou.eye.ui.MyDialog;
import com.dingzhou.eye.util.Device;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;
import asp.lib.bt.BluetoothDeviceLocal;
import asp.lib.bt.BluetoothSPP;
import asp.lib.bt.BluetoothState;

import com.dingzhou.eye.tool.MyApp;
//import com.dingzhou.eye.MainActivity;
import com.dingzhou.eye.R;

public class BtAPI 
{
	public enum DeviceState {
		BTLocalEnabled, 
		BTLocalDisable, 
		DeviceDisconnect, 
		DeviceConnected,
	};
	
	public static BtAPI BluetoothAPI;
	
	private Context     _context;
	private MyApp app;
	private BlockDialog _dialog;
	private String 		_deviceAddress;
	public  static DeviceState ConnectState;
	private BluetoothSPP _btSpp;
	public Device     _devBull;   
	private Device     _devOHL;
    public Device     _devRMK;     
	private Device     _devPrinter;
	private String 	   _lastConectType;
	public  String     StrReceive = "";
	

	public static BtAPI getInstance(Context _context) {
		if (BluetoothAPI == null) {
			synchronized (BtAPI.class) {
				if (BluetoothAPI == null) {
					BluetoothAPI = new BtAPI(_context);
				}
			}
		}
		return BluetoothAPI;
	}
	
	public BtAPI(Context context)
	{
		
		_context = context;
		//TODO 改动
		if (BluetoothAdapter.getDefaultAdapter()!= null && BluetoothDeviceLocal.is_enabled())ConnectState = DeviceState.BTLocalEnabled;
		else ConnectState = DeviceState.BTLocalDisable;
		_dialog = new BlockDialog((Activity) context);
		_devBull = new Device(_context,Device.TypeBullEye);
		_devOHL  = new Device(_context,Device.TypeBalopticon);
		_devRMK  = new Device(_context,Device.TypeRMK);
		_devPrinter = new Device(_context,Device.TypePrinter);
		_lastConectType = "";
		spp_create();

	}
	
	public void info_load()
	{
		_devBull.load_info();
		_devOHL.load_info();
		_devRMK.load_info();
		_devPrinter.load_info();
	}
	
	public boolean open(String type)
	{

		if(type!=_lastConectType)
		{
			
			_lastConectType = type;
			if(Device.TypeBullEye.equals(type))_deviceAddress = _devBull.Mac;	
			else if(Device.TypeBalopticon.equals(type)) _deviceAddress = _devOHL.Mac;	
			else if(Device.TypeRMK.equals(type))_deviceAddress =_devBull.Mac;
			else if(Device.TypePrinter.equals(type))_deviceAddress = _devPrinter.Mac;
			wait_ms(20);
			if(ConnectState == DeviceState.DeviceConnected)close();
			_btSpp.connect(_deviceAddress);
			_dialog.show_dialog();
			if (ConnectState == DeviceState.DeviceConnected)return true;
			return false;
		}
		return true;
	}
	
	////////////////////////////////////
	public boolean  open_RMK()
	{
			_btSpp.connect(_devBull.Mac);
			
		return true;
	}
	//////////////////////////////////////////
	
	public boolean read_RMK()
	{         
		if(!_devRMK.Mac.equals("")){
		StrReceive = "";
		open(Device.TypeRMK);
		_dialog.show_dialog();
		
		}
		else {Toast.makeText(_context, "请确定是否链接蓝牙设备", Toast.LENGTH_SHORT).show();}
		return true;
	}
	
	public boolean read_refractor()
	{   
		if(!_devBull.Mac.equals("")){
	    StrReceive = "";
	    wait_ms(120);
		open(Device.TypeBullEye);
		wait_ms(120);
		_dialog.show_dialog();
		}
		else{Toast.makeText(_context, "请确定是否链接蓝牙设备", Toast.LENGTH_SHORT).show();}
		return true;
	}
	
	public void close()
	{
		_btSpp.disconnect();
		_dialog.show_dialog();
	}
	
	public void send_command(String type,String cmd)
	{
		if(!_devBull.Mac.equals("") && !_devOHL.Mac.equals("")){
		if(open(type))
		{
			send_str(cmd);
		}

		else
		{
			//printf_lcd("Bluetooth signal connecting。。。 If it is not reconnected for a long time,exit APP, and reenter APP");
		}
	
		StrReceive = "";

		open(type);}
		else{Toast.makeText(_context, "请确定是否链接蓝牙设备", Toast.LENGTH_SHORT).show();}
//		_dialog.show_dialog();
    	//Log.d("long",StrReceive);
	}
	
	
	
	public void send_command_hex(String type, byte[] data,int len)//20160706淇敼
	{
		if(!_devPrinter.Mac.equals("")){
		if(open(type))send_byte(data,len);
		else printf_lcd("蓝牙连接错误");
		}
	}
	
	
	public boolean send_command_ack(String type,String cmd)
	{
		if(!_devPrinter.Mac.equals("")){
			if(open(type))send_str(cmd);
			else printf_lcd("蓝牙连接错误");}
		else {Toast.makeText(_context, "请确定是否链接蓝牙设备", Toast.LENGTH_SHORT).show();}
		return true;
	}
	
	
	public void send_str(String str) {
		try {_btSpp.send(str.getBytes("GBK"), false);} catch (UnsupportedEncodingException e) {e.printStackTrace();}
	}

	public void send_byte(byte[] bytes, int len) 
	{
		byte[] tem = new byte[len];
		System.arraycopy(bytes, 0, tem, 0, len);
		_btSpp.send(tem, false);
	}

	public void send_byte(byte[] bytes) {
		_btSpp.send(bytes, false);
	}

	public void send_byte(byte by) {
		byte[] tem = new byte[1];
		tem[0] = by;
		_btSpp.send(tem, false);
	}
	
	public void wait_ms(int time) 
	{
		try {Thread.sleep(time);} catch (InterruptedException e) {}
	}

	public void printf_lcd(String str) {
		Toast.makeText(_context, str, Toast.LENGTH_SHORT).show();
	}
	
	///////////////////////////////////////////////
	public void setOnDataCome(DataCome data){
		datacome=data;
	}

	public  DataCome datacome=null;
	public interface DataCome{
		void setData(boolean isCome);
	}
///////////////////////////////////////////////////////
	
	public void show_dialog(String title,String msg)
	{
		MyDialog.showProgress(_context, title, msg);
	}
	
	public void close_dialog()
	{
		MyDialog.dismissProgress();
	}
	
	private void spp_create() 
	{
		_btSpp = new BluetoothSPP(_context);
		_btSpp.setOnDataReceivedListener(new BluetoothSPP.OnDataReceivedListener() {
			public void onDataReceived(byte[] data, String message) {
				StrReceive = StrReceive+message;

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if(_dialog.isShowing())handlerDialog.sendEmptyMessage(0);
			}
		});

		_btSpp.setBluetoothConnectionListener(new BluetoothSPP.BluetoothConnectionListener() {
			public void onDeviceConnected(String name, String address) {
				ConnectState = DeviceState.DeviceConnected;
				
				if(_dialog.isShowing())handlerDialog.sendEmptyMessage(0);
			}

			public void onDeviceDisconnected() {
				ConnectState = DeviceState.DeviceDisconnect;
				
				if(_dialog.isShowing())handlerDialog.sendEmptyMessage(0);
			}

			public void onDeviceConnectionFailed() {
			ConnectState = DeviceState.DeviceDisconnect;
			if(_dialog.isShowing())handlerDialog.sendEmptyMessage(0);
			}
		});

		// 蓝牙空指针改动
		if (!_btSpp.isServiceAvailable() && BluetoothAdapter.getDefaultAdapter() != null) {
			_btSpp.setupService();
			_btSpp.startService(BluetoothState.DEVICE_OTHER);
		}
	}
	

	
	private Handler handlerDialog = new Handler() {
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			if(_dialog.isShowing())_dialog.close();
		}
	};
	
}
