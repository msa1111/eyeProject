package com.dingzhou.eye.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class Device 
{
	public static String TypeBullEye   = "BullEye";
	public static String TypeBalopticon = "Balopticon"; 
	public static String TypeRMK = "RMK"; 
	public static String TypePrinter = "Printer";
	
	public String Name = null;
	public String Mac  = null;
	public String Type = null;
	
	private Context _context;
	
	public Device(Context context,String type)
	{
		_context = context;
		Type = type;
	}
	public Device(Context context)
	{
		_context = context;
	}
	public void type_update()
	{
//		SharedPreferences spType=_context.getSharedPreferences("InfoPublic", Activity.MODE_WORLD_READABLE);
		SharedPreferences spType=_context.getSharedPreferences("InfoPublic", Activity.MODE_PRIVATE);
		Type = spType.getString("Type", "");
	}
	
	public void save_info(String name,String mac)
	{
//		SharedPreferences.Editor editor=_context.getSharedPreferences("Supore_Device"+Type, Activity.MODE_WORLD_WRITEABLE).edit();
		SharedPreferences.Editor editor=_context.getSharedPreferences("Supore_Device"+Type, Activity.MODE_PRIVATE).edit();
		editor.clear();
		editor.putString("Name", name);
		editor.putString("Mac", mac);
		editor.commit();
		load_info();
	}
	
	public void load_info()
	{
//		SharedPreferences sp=_context.getSharedPreferences("Supore_Device"+Type, Activity.MODE_WORLD_READABLE);
		SharedPreferences sp=_context.getSharedPreferences("Supore_Device"+Type, Activity.MODE_PRIVATE);
		Name = sp.getString("Name", "");
		Mac = sp.getString("Mac","");
	}
}
