package com.dingzhou.eye;

import com.dingzhou.eye.SelectChange.TxtViewVessel;
import com.dingzhou.eye.tool.Constants;
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

public class FragmentL extends Fragment {
	public LinearLayout Lyout_r_1;
	public LinearLayout Lyout_r_2;
	public LinearLayout Lyout_r_3;
	public LinearLayout Lyout_r_4;
	public LinearLayout Lyout_r_5;
	public LinearLayout Lyout_r_6;
	public int r_6 = R.drawable.r_6;
	public int r_5 = R.drawable.r_5;
	public int r_4 = R.drawable.r_4;
	public int r_3 = R.drawable.l_3;
	public int r_2 = R.drawable.r_2;
	public int r_1 = R.drawable.r_1;
	private MyApp app;
	public TxtViewVessel vessel_L;
	protected FragmentLeft mActivity;
	
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_l, container, false);
		Lyout_r_1 = (LinearLayout) v.findViewById(R.id.Lyout_r_1);
		Lyout_r_2 = (LinearLayout) v.findViewById(R.id.Lyout_r_2);
		Lyout_r_3 = (LinearLayout) v.findViewById(R.id.Lyout_r_3);
		Lyout_r_4 = (LinearLayout) v.findViewById(R.id.Lyout_r_4);
		Lyout_r_5 = (LinearLayout) v.findViewById(R.id.Lyout_r_5);
		Lyout_r_6 = (LinearLayout) v.findViewById(R.id.Lyout_r_6);
		Lyout_r_1.setOnClickListener(ClickListener);
		Lyout_r_2.setOnClickListener(ClickListener);
		Lyout_r_3.setOnClickListener(ClickListener);
		Lyout_r_4.setOnClickListener(ClickListener);
		Lyout_r_5.setOnClickListener(ClickListener);
		Lyout_r_6.setOnClickListener(ClickListener);
		app = (MyApp) getActivity().getApplication();
		return v;
	}
	public OnClickListener ClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.Lyout_r_1:
				
				Intent intent_r_1 = new Intent();
				
				intent_r_1.putExtra("result", r_1);
				
				getActivity().setResult(2, intent_r_1);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lU00]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_r_2:
				
				Intent intent_r_2 = new Intent();
				
				intent_r_2.putExtra("result", r_2);
				
				getActivity().setResult(2, intent_r_2);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lUBB]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_r_3:
				
				Intent intent_r_3 = new Intent();
				
				intent_r_3.putExtra("result", r_3);
				
				getActivity().setResult(2, intent_r_3);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lU66]");
			    
				app.lj_10 = false;
				app.lj_6 = true;
	            app.z_13 = 12;
	            app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_V;
	            vessel_L = TxtViewVessel.getInstance(mActivity);
	            
	            app.position =app.Vposition;
	            vessel_L.ChangeBg(Constants.EYE_V, Constants.EYE_V);
	            app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
	            
				getActivity().finish();
				break;
			case R.id.Lyout_r_4:
				
				Intent intent_r_4 = new Intent();
				
				intent_r_4.putExtra("result", r_4);
				
				getActivity().setResult(2, intent_r_4);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lU88]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_r_5:
				
				Intent intent_r_5 = new Intent();
				
				intent_r_5.putExtra("result", r_5);
				
				getActivity().setResult(2, intent_r_5);
				 
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lU55]");
				app.lj_10 = true;
				app.lj_6 = true;
	            app.z_13 = 0;
				getActivity().finish();
				break;
			case R.id.Lyout_r_6:
				
				Intent intent_r_6 = new Intent();
				
				intent_r_6.putExtra("result", r_6);
				
				getActivity().setResult(2, intent_r_6);
				
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[lU11]");
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
