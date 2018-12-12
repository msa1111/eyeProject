package com.dingzhou.eye;

import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.util.Device;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class FragmentBIN extends Fragment {
	private LinearLayout _llt1;
	private LinearLayout _llt2;
	private LinearLayout _llt3;
	private LinearLayout _llt4;
	private int iv_3 = R.drawable.iv_3;
	private int iv_4 = R.drawable.iv_4;
	private int iv_5 = R.drawable.iv_5;
	private int iv_6 = R.drawable.iv_6;
	private int iv_8 = R.drawable.iv_8;
	private MyApp app;
	
	
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			View v =  inflater.inflate(R.layout.fragment_bin, container, false);
			_llt1 = (LinearLayout) v.findViewById(R.id.LLt1);
			_llt2 = (LinearLayout) v.findViewById(R.id.LLt2);
			_llt3 = (LinearLayout) v.findViewById(R.id.LLt3);
			_llt4 = (LinearLayout) v.findViewById(R.id.LLt4);
			_llt4.setOnClickListener(ClickListener);
			_llt3.setOnClickListener(ClickListener);
			_llt2.setOnClickListener(ClickListener);
			_llt1.setOnClickListener(ClickListener);
			app = (MyApp) getActivity().getApplication();
			return v;
		}
		
		
		public OnClickListener ClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				switch (v.getId()) {
				case R.id.LLt1:
					
					Intent intent_BIN_1 = new Intent();
					
					intent_BIN_1.putExtra("BIN", iv_3);
					intent_BIN_1.putExtra("BIN2", iv_4);
					
					getActivity().setResult(3, intent_BIN_1);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.lj_10 = true;
					app.lj_6 = true;
		            app.z_13 = 0;
					
					getActivity().finish();
					break;
				case R.id.LLt2:
					
					Intent intent_BIN_2 = new Intent();
					
					intent_BIN_2.putExtra("BIN", iv_5);
					intent_BIN_2.putExtra("BIN2", iv_6);
					
					getActivity().setResult(3, intent_BIN_2);
					
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
					app.lj_10 = true;
					app.lj_6 = true;
		            app.z_13 = 0;
					getActivity().finish();
					break;
				case R.id.LLt3:
					
					Intent intent_BIN_3 = new Intent();
					
					intent_BIN_3.putExtra("BIN", iv_8);
					intent_BIN_3.putExtra("BIN2", iv_8);
					
					getActivity().setResult(3, intent_BIN_3);
					
					getActivity().finish();
					break;
				case R.id.LLt4:
					
					Intent intent_BIN_4 = new Intent();
					
					intent_BIN_4.putExtra("BIN", iv_4);
					intent_BIN_4.putExtra("BIN2", iv_3);
					
					getActivity().setResult(3, intent_BIN_4);
					
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU99][lU99]");
					app.lj_10 = true;
					app.lj_6 = true;
		            app.z_13 = 0;
					getActivity().finish();
					break;
				default:
					break;
				}
			}
		};
}
