package com.dingzhou.eye;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import com.dingzhou.eye.tool.MyApp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerActivity extends Activity {
	private Button _bt;
	private EditText _et;
	static final String algorithmStr = "AES/ECB/PKCS5Padding";

	private static final Object TAG = "AES";

	static private KeyGenerator keyGen;

	static private Cipher cipher;

	static boolean isInited = false;
	private static String postStr;
	private MyApp app;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.register_layout);
		
		getWindow().setFlags(LayoutParams.FLAG_NOT_TOUCH_MODAL,
				LayoutParams.FLAG_NOT_TOUCH_MODAL);

		_et = (EditText) findViewById(R.id.ET);
		_bt = (Button) findViewById(R.id.BTN);
		_bt.setOnClickListener(ClickListener);

	}

	//
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_HOME:
			return true;
		case KeyEvent.KEYCODE_BACK:
			return true;
		case KeyEvent.KEYCODE_CALL:
			return true;
		case KeyEvent.KEYCODE_SYM:
			return true;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			return true;
		case KeyEvent.KEYCODE_VOLUME_UP:
			return true;
		case KeyEvent.KEYCODE_STAR:
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	public OnClickListener ClickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int n = 12;
			int e = 3;
			@SuppressWarnings("static-access")
			String b = app._id.substring(app._id.length() - n, app._id.length());
			String c = b.substring(0,3);
//			String a = _et.getText().toString();
			String _Cc = encode(c);

			// TODO
			_et.setText(_Cc);
			String a = _et.getText().toString();

			if(!_Cc.equals(a)){
				Toast.makeText(registerActivity.this, "请输入商家提供的注册码",
						Toast.LENGTH_SHORT).show();
			}else{
					test1(a);
					if (postStr.equals(c))
					registerActivity.this.finish();
					shieldActivity.instance.finish();
					cd();
					Toast.makeText(registerActivity.this, "注册成功",
							Toast.LENGTH_SHORT).show();
			}
		}
	};

	private static void init() {
		try {

			keyGen = KeyGenerator.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		keyGen.init(128); 
		try {
			
			cipher = Cipher.getInstance(algorithmStr);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
		
		isInited = true;
	}

	private static byte[] genKey() {
		if (!isInited) {
			init();
		}
		
		return keyGen.generateKey().getEncoded();
	}

	private static byte[] encrypt(byte[] content, byte[] keyBytes) {
		byte[] encryptedText = null;
		if (!isInited) {
			init();
		}

		Key key = new SecretKeySpec(keyBytes, "AES");
		try {
			
			cipher.init(Cipher.ENCRYPT_MODE, key);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
		try {
			
			encryptedText = cipher.doFinal(content);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return encryptedText;
	}

	private static byte[] encrypt(String content, String password) {
		try {
			byte[] keyStr = getKey(password);
			SecretKeySpec key = new SecretKeySpec(keyStr, "AES");
			Cipher cipher = Cipher.getInstance(algorithmStr);
			byte[] byteContent = content.getBytes("utf-8");
			cipher.init(Cipher.ENCRYPT_MODE, key);// 
			byte[] result = cipher.doFinal(byteContent);
			return result; //
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static byte[] decrypt(byte[] content, String password) {
		try {
			byte[] keyStr = getKey(password);
			SecretKeySpec key = new SecretKeySpec(keyStr, "AES");
			Cipher cipher = Cipher.getInstance(algorithmStr);
			cipher.init(Cipher.DECRYPT_MODE, key);// 始
			byte[] result = cipher.doFinal(content);
			return result; //
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static byte[] getKey(String password) {
		byte[] rByte = null;
		if (password != null) {
			rByte = password.getBytes();
		} else {
			rByte = new byte[24];
		}
		return rByte;
	}
	

	public static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}


	public static byte[] parseHexStr2Byte(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length() / 2];
		for (int i = 0; i < hexStr.length() / 2; i++) {
			int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
					16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}

	
	private static final String keyBytes = "afb9cegg0fbc3ede";
	

	public static String encode(String content){
	       
		return parseByte2HexStr(encrypt(content, keyBytes));
	}


	public static String decode(String content) {
		
		byte[] b = decrypt(parseHexStr2Byte(content), keyBytes);
		return new String(b);
	}


	public static void test1(String a) {
		postStr = decode(a);
	}

	public void cd() {
		SharedPreferences mySharedPreferences = getSharedPreferences("pad",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putString("postStr", postStr);
		editor.commit();
	}
}
