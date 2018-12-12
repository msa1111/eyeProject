package com.dingzhou.eye;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.util.Device;
import android.util.Log;

public class FragmentRmk extends Fragment {
	private MyApp app;
	private Context mcontext;
	private Button _prismr;
	private Button _prisml;
	private int id;
			@Override
			public View onCreateView(LayoutInflater inflater, ViewGroup container,
					Bundle savedInstanceState) {
				View v = inflater.inflate(R.layout.fragment_rmk, container,false);
				app = (MyApp)getActivity().getApplication();
				_prismr = (Button) v.findViewById(R.id.p1);
				_prismr.setOnClickListener(OnClickListener);
				_prisml = (Button) v.findViewById(R.id.p2);
				_prisml.setOnClickListener(OnClickListener);
				if(app.language_flag==1){
					_prismr.setText("PRISM_R");
					_prisml.setText("PRISM_L");
				}else if(app.language_flag==2){
					_prismr.setText("强制翻转棱镜_右");
					_prisml.setText("强制翻转棱镜_左");
				}
				return v;
			}
			
			public OnClickListener OnClickListener = new OnClickListener() {
				@Override
				public void onClick(View v) {
					switch (v.getId()) {
					case R.id.p1:
						 prism_r_do();
						break;
					case R.id.p2:
						prism_l_do();
						break;
					default:
						break;
					}
				}
			};
			
			private void prism_r_do(){
				app.cdRead_ljr();
				int lj = Integer.parseInt(app.label_ljr);
				 if(lj>0)
			     {   
					 lj=lj-360; 
			         app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rN%04X]", (short)lj));		         
			     } 
			     else if(lj<0)
			     {
			    	 lj=lj+360;
			         app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rN%04X]", (short)lj));
			     }
				 app.BluetoothAPI.send_command(Device.TypeBullEye,"[rs][rR00]");
				 app.lj_r=Integer.toString(lj);
			     app.cdSave_ljr();
			}
			
            private void prism_l_do(){
            	app.cdRead_ljl();
            	int lj = Integer.parseInt(app.label_ljl);
            	if(lj>0)
			     {   
					 lj=lj-360; 
			         app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lN%04X]", (short)lj));		         
			     } 
			     else if(lj<0)
			     {
			    	 lj=lj+360;
			         app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lN%04X]", (short)lj));
			     }
				 app.BluetoothAPI.send_command(Device.TypeBullEye,"[ls][lR00]");
				 app.lj_l=Integer.toString(lj);
			     app.cdSave_ljl();	 
			}	
            	
}
