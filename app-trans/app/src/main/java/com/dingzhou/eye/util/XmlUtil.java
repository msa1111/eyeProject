package com.dingzhou.eye.util;

import java.io.File;
import java.io.FileOutputStream;




import org.xmlpull.v1.XmlSerializer;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Xml;

public class XmlUtil 
{
	
	
	private FileOutputStream _xmlFile;
	private XmlSerializer _serializer;
	private Context       _context;
	
	public XmlUtil(Context context,String name)
	{
		_context = context;
		try {
			
			File filename = new File(context.getFilesDir(),"example.xml");
			Log.d("long",context.getFilesDir().toString());
			if(!filename.exists())
			{
				_xmlFile = new FileOutputStream(filename);
				_serializer = Xml.newSerializer();
                _serializer.setOutput(_xmlFile, "UTF-8");
                _serializer.startDocument(null, Boolean.valueOf(true));
                _serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                _serializer.startTag(null, "AddressBook");
			}
			else 
			{
				_xmlFile = new FileOutputStream(filename);
				_serializer = Xml.newSerializer();
                _serializer.setOutput(_xmlFile, "UTF-8");
			}
        } catch (Exception e) {}
	}
	
	public void device_add(String type,String name,String mac)
	{
//		SharedPreferences.Editor editor=_context.getSharedPreferences("supore_device_"+type, Activity.MODE_WORLD_WRITEABLE).edit();
		SharedPreferences.Editor editor=_context.getSharedPreferences("supore_device_"+type, Activity.MODE_PRIVATE).edit();
		editor.clear();
		editor.putString("Name", name);
		editor.putString("Mac", mac);
		editor.commit();
	}
	public void device_read_info(String type)
	{
		String name = null,mac = null;
//		SharedPreferences sp=_context.getSharedPreferences("supore_device_"+type, Activity.MODE_WORLD_READABLE);
		SharedPreferences sp=_context.getSharedPreferences("supore_device_"+type, Activity.MODE_PRIVATE);
		name = sp.getString("Name", "");
		Log.d("long","Name:"+name);
		mac = sp.getString("Mac","");
		Log.d("long","Mac:"+mac);
	}
	
	
	
	
}
