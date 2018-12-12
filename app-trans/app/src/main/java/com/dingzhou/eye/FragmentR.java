package com.dingzhou.eye;


import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.util.Device;
import android.os.Bundle;
import android.app.Fragment;
import android.content.Intent;
//import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dingzhou.eye.SelectChange.TxtViewVessel;

public class FragmentR extends Fragment {
	public LinearLayout lyout_l_1;
	public LinearLayout lyout_l_2;
	public LinearLayout lyout_l_3;
	public LinearLayout lyout_l_4;
	public LinearLayout lyout_l_5;
	public LinearLayout lyout_l_6;
	public int l_1 = R.drawable.l_1;
	public int l_2 = R.drawable.l_2;
	public int l_3 = R.drawable.r_3;
	public int l_4 = R.drawable.l_4;
	public int l_5 = R.drawable.l_5;
	public int l_6 = R.drawable.l_6;
	private MyApp app;
	public TxtViewVessel vessel_R;
	protected FragmentLeft mActivity;

	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View messageLayout = inflater.inflate(R.layout.frgment_r, container, false);
		lyout_l_1 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_1);
		lyout_l_2 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_2);
		lyout_l_3 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_3);
		lyout_l_4 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_4);
		lyout_l_5 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_5);
		lyout_l_6 = (LinearLayout) messageLayout.findViewById(R.id.Lyout_l_6);
		lyout_l_6.setOnClickListener(ClickListener);
		lyout_l_5.setOnClickListener(ClickListener);
		lyout_l_4.setOnClickListener(ClickListener);
		lyout_l_3.setOnClickListener(ClickListener);
		lyout_l_2.setOnClickListener(ClickListener);
		lyout_l_1.setOnClickListener(ClickListener);
		app = (MyApp) getActivity().getApplication();
		return messageLayout;
	}
	public OnClickListener ClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.Lyout_l_1:
				
				Intent intent_l_1 = new Intent();
				
				intent_l_1.putExtra("cd", l_1);
				
				getActivity().setResult(1, intent_l_1);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_l_2:
				
				Intent intent_l_2 = new Intent();
				
				intent_l_2.putExtra("cd", l_2);
				
				getActivity().setResult(1, intent_l_2);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUBB]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_l_3:
				
				Intent intent_l_3 = new Intent();
				
				intent_l_3.putExtra("cd", l_3);
				
				getActivity().setResult(1, intent_l_3);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66]");
				getActivity().finish();
              
			   app.lj_6 = false;
			   app.lj_10 = true;
               app.z_13 = 13;
               app.txtCount = Constants.EYE_D;
               app.txtState = Constants.EYE_H;
               vessel_R = TxtViewVessel.getInstance(mActivity);
              
               app.position = app.Hposition; 
               vessel_R.ChangeBg(Constants.EYE_H, Constants.EYE_H);
               app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
               ///////////////////////////////////////////////
				break;
			case R.id.Lyout_l_4:
			
				Intent intent_l_4 = new Intent();
				
				intent_l_4.putExtra("cd", l_4);
				
				getActivity().setResult(1, intent_l_4);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU88]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_l_5:
				
				Intent intent_l_5 = new Intent();
				
				intent_l_5.putExtra("cd", l_5);
			
				getActivity().setResult(1, intent_l_5);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU55]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_l_6:
				
				Intent intent_l_6 = new Intent();
				
				intent_l_6.putExtra("cd", l_6);
			
				getActivity().setResult(1, intent_l_6);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU11]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
			default:
				break;
			}
		}
	};


}
