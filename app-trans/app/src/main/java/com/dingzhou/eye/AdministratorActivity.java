package com.dingzhou.eye;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdministratorActivity extends Activity {
	private Button _btn;
	private EditText _et;
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.administrator_layout);
			_btn = (Button) findViewById(R.id.BTN);
			_btn.setOnClickListener(ClickListener);
			_et = (EditText) findViewById(R.id.ET);
		}
	
		public OnClickListener ClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(!_et.getText().toString().equals("88")){
				if(_et.getText().toString().equals("66")){
						Intent intent = new Intent(AdministratorActivity.this, AdminuiActivity.class);
						startActivity(intent);
						AdministratorActivity.this.finish();
				}else if(_et.getText().toString().equals("")){{
						Toast.makeText(AdministratorActivity.this, "请输入密码", Toast.LENGTH_LONG).show();
					}
				}else if (!_et.getText().toString().equals("66")){
						Toast.makeText(AdministratorActivity.this, "密码错误", Toast.LENGTH_LONG).show();
						
				}
			}
				if(!_et.getText().toString().equals("66")){
				if(_et.getText().toString().equals("88")){
					Intent intent = new Intent(AdministratorActivity.this, SetActivity.class);
					startActivity(intent);
					AdministratorActivity.this.finish();
			}else if(_et.getText().toString().equals("")){{
					Toast.makeText(AdministratorActivity.this, "请输入密码", Toast.LENGTH_LONG).show();
				}
			}else if (!_et.getText().toString().equals("88")){
					Toast.makeText(AdministratorActivity.this, "密码错误", Toast.LENGTH_LONG).show();
			}
			}
				
			}
		};
}
