package com.dingzhou.eye;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.util.Device;

import android.util.Log;

public class Fragmentov extends Fragment {
	private RadioGroup _rg;
	private MyApp app;
	private RadioButton _rmk_1;
	private RadioButton _rmk_2;
	private RadioButton _rmk_3;
	private RadioButton _rmk_4;
	private int id;
	private Button _bt;
	private String label_rmk = null;
	private String _label_rmk  = "";
			@Override
			public View onCreateView(LayoutInflater inflater, ViewGroup container,
					Bundle savedInstanceState) {
				
				View v = inflater.inflate(R.layout.fragment_ov, container,false);
				app = (MyApp)getActivity().getApplication();
				_rg = (RadioGroup) v.findViewById(R.id.rmkGroup);
				_rmk_1 =(RadioButton) v.findViewById(R.id.rmk_1);
				_rmk_2 = (RadioButton) v.findViewById(R.id.rmk_2);
				_rmk_3 = (RadioButton) v.findViewById(R.id.rmk_3);
				_rmk_4 = (RadioButton) v.findViewById(R.id.rmk_4);
				
				_bt = (Button) v.findViewById(R.id.btt_rmk);
				_bt.setOnClickListener(ClickListener);	
				if(app.language_flag==1){
					_bt.setText("save");
				}else if(app.language_flag==2){
					_bt.setText("保存");
				}
				_rg.setOnCheckedChangeListener(ChangeListener);
		        cdReadl();
				chsh_rmk();
				return v;
			}
			
			public OnCheckedChangeListener ChangeListener = new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					
					id = arg0.getCheckedRadioButtonId();
				}
			};
			
			public void chsh_rmk(){
				if (_label_rmk.equals("1")) {
					_rmk_1.setChecked(true);
				}
				if(_label_rmk.equals("2")){
					_rmk_2.setChecked(true);
				}
				if(_label_rmk.equals("3")){
					_rmk_3.setChecked(true);
				}
				if(_label_rmk.equals("4")){
					_rmk_4.setChecked(true);
				}		
			}
			public OnClickListener ClickListener = new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					
					switch (id) {
					///////////////////////////////////////////////
					case R.id.rmk_1:
						_label_rmk = "1";
						cdSave();
						if(app.language.equals("E")){
							Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
						}else if(app.language.equals("C")){
							Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
						}
						break;
					case R.id.rmk_2:
						_label_rmk = "2";
						cdSave();
						if(app.language.equals("E")){
							Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
						}else if(app.language.equals("C")){
							Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
						}
						break;
					case R.id.rmk_3:
						_label_rmk = "3";
						cdSave();
						if(app.language.equals("E")){
							Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
						}else if(app.language.equals("C")){
							Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
						}
						break;
					///////////////////////////////////////////////
					case R.id.rmk_4:
						_label_rmk = "4";
						cdSave();
						if(app.language.equals("E")){
							Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
						}else if(app.language.equals("C")){
							Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
						}
						break;
					default:
						break; 
					}
				}
			};
			
			public void cdSave() {
				SharedPreferences mySharedPreferences = getActivity()
						.getSharedPreferences("set_rmk", getActivity().MODE_PRIVATE);
				SharedPreferences.Editor editor = mySharedPreferences.edit();
				editor.putString("label_rmk", _label_rmk);
				editor.clear();
				editor.commit();
			}
			
			private void cdReadl() {
				SharedPreferences sharedPreferences = getActivity()
						.getSharedPreferences("set_rmk", getActivity().MODE_PRIVATE);
				_label_rmk = sharedPreferences.getString("label_rmk", "");
			}
		}
