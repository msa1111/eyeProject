package com.dingzhou.eye;

import com.dingzhou.eye.tool.MyApp;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class FragmentChart extends Fragment {
	private RadioGroup _rg;
	private MyApp app;
	
	private RadioButton _acp_2;
	
	private RadioButton _acp_8;
	private RadioButton _acp_6;
	private RadioButton _acp_7;
	private RadioButton _acp_1004;
	private RadioButton _acp_60;
	private Button _bt;
	private int id;
	private String label = "0";
	private String _label = "";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_chart, container, false);
		app = (MyApp)getActivity().getApplication();
		_rg = (RadioGroup) v.findViewById(R.id.radioGroup);
		_acp_60 =(RadioButton) v.findViewById(R.id.acp_60);
		_acp_7 = (RadioButton) v.findViewById(R.id.acp_7);
		_acp_6 = (RadioButton) v.findViewById(R.id.acp_6);
		_acp_8 = (RadioButton) v.findViewById(R.id.acp_8);
		_acp_1004 = (RadioButton) v.findViewById(R.id.acp_100);
		
		_acp_2 = (RadioButton) v.findViewById(R.id.acp_B);
		
		_bt = (Button) v.findViewById(R.id.btt);
		_bt.setOnClickListener(ClickListener);	
		if(app.language_flag==1){
			_bt.setText("save");
		}else if(app.language_flag==2){
			_bt.setText("保存");
		}
		_rg.setOnCheckedChangeListener(ChangeListener);
        cdReadl();
		chsh();
		return v;
	}

	public OnCheckedChangeListener ChangeListener = new OnCheckedChangeListener() {
		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			
			id = arg0.getCheckedRadioButtonId();
		}
	};
	
	public void chsh(){
		if (_label.equals("7") || _label.equals("")) {
			_acp_7.setChecked(true);
		}
		if(_label.equals("8")){
			_acp_8.setChecked(true);
		}
		if(_label.equals("6")){
			_acp_6.setChecked(true);
		}
		if(_label.equals("60")){
			_acp_60.setChecked(true);
		}
		if(_label.equals("100")){
			_acp_1004.setChecked(true);
		}
		if(_label.equals("2")){
			_acp_2.setChecked(true);
		}
	}
	public OnClickListener ClickListener = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			
			switch (id) {
			case R.id.acp_B:
				label = "2";
				cdSave();
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
				}else if(app.language.equals("C")){
					Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.acp_6:
				label = "6";
				cdSave();
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
				}else if(app.language.equals("C")){
					Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.acp_7:
				label = "7";
				cdSave();
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
				}else if(app.language.equals("C")){
					Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.acp_8:
				label = "8";
				cdSave();
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
				}else if(app.language.equals("C")){
					Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.acp_60:
				label = "60";
				cdSave();
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
				}else if(app.language.equals("C")){
					Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.acp_100:
				label = "100";
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
				.getSharedPreferences("set", getActivity().MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putString("label", label);
		editor.clear();
		editor.commit();
	}
	
	private void cdReadl() {
		SharedPreferences sharedPreferences = getActivity()
				.getSharedPreferences("set", getActivity().MODE_PRIVATE);
		_label = sharedPreferences.getString("label", "");
	}
}
