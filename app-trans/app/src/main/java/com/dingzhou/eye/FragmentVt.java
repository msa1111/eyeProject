package com.dingzhou.eye;

import com.dingzhou.eye.tool.MyApp;

import android.app.Fragment;
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

public class FragmentVt extends Fragment {
	private RadioGroup _rg;
	private MyApp app;
	private RadioButton _chi;
	private RadioButton _eng;
	private int id;
	private Button _bt;
	private String label = null;
	private String _label = "";

			@Override 
			public View onCreateView(LayoutInflater inflater, ViewGroup container,
					Bundle savedInstanceState) {
				View v = inflater.inflate(R.layout.fragment_vt, container, false);
				app = (MyApp)getActivity().getApplication();
				_rg = (RadioGroup) v.findViewById(R.id.radioGroup);
				_chi = (RadioButton) v.findViewById(R.id.rad1);
				_eng = (RadioButton) v.findViewById(R.id.rad2);
				_bt = (Button) v.findViewById(R.id.btt_);
				_bt.setOnClickListener(OnClickListener);	
				_rg.setOnCheckedChangeListener(ChangeListener);
				if(app.language_flag==1){
					_chi.setText("CHINESE(中文)");
					_eng.setText("ENGLISH(英文)");
					_bt.setText("save(保存)");
				}else if(app.language_flag==2){
					_chi.setText("中文(CHINESE)");
					_eng.setText("英文(ENGLISH)");
					_bt.setText("保存(save)");
				}
				return v;
			}
			
			public OnCheckedChangeListener ChangeListener = new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(RadioGroup arg0, int arg1) {
					id = arg0.getCheckedRadioButtonId();
				}
			};
			
			
			public OnClickListener OnClickListener = new OnClickListener() {
				@Override
				public void onClick(View v) {
					switch (id) {
					case R.id.rad1:
						label = "C";
						cdSave();
						if(app.language.equals("E")){
							Toast.makeText(getActivity(), "Save successful! When you exit APP,and re-enter,the system settings will take effect。", Toast.LENGTH_SHORT).show();
						}else if(app.language.equals("C")){
							Toast.makeText(getActivity(), "保存成功!,退出APP,再次进入，系统设置才会有效。", Toast.LENGTH_SHORT).show();
						}
						break;
					case R.id.rad2:
						break;
					default:
						break;
					}
				}
			};
			
			public void cdSave() {
				SharedPreferences mySharedPreferences = getActivity()
						.getSharedPreferences("lang", getActivity().MODE_PRIVATE);
				SharedPreferences.Editor editor = mySharedPreferences.edit();
				editor.putString("label", label);
				editor.clear();
				editor.commit();
			}

}
