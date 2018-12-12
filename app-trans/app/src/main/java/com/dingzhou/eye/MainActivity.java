package com.dingzhou.eye;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dingzhou.eye.SelectChange.ImgView;
import com.dingzhou.eye.SelectChange.TxtViewVessel;
import com.dingzhou.eye.bluetooth.BluetoothDialog;
import com.dingzhou.eye.bluetooth.BluetoothMenu;
import com.dingzhou.eye.bluetooth.BluetoothState;
import com.dingzhou.eye.tool.BlockDialog;
import com.dingzhou.eye.tool.BtAPI;
import com.dingzhou.eye.tool.BtAPI.DataCome;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.ui.SelectPicPopupWindow;
import com.dingzhou.eye.util.Device;
import com.dingzhou.eye.util.ReadTextUtil;
import com.lidroid.xutils.ViewUtils;
import com.zhy.m.permission.MPermissions;
import com.zhy.m.permission.PermissionGrant;

public class MainActivity extends FragmentActivity implements OnTouchListener, DataCome {
	public String yuanyong_80 = "[rP1E][lu0000]";
	public String jinyong_75 = "[rP19][lu0701]", jinyong_76 = "[rP1E][lu0000]",
			jinyong_77 = "[rP1E][lu0000]";
	public String yuanyong_79 = "[rP1D][lu0000]";
	public String jinyong_74 = "[rP18][lu06E8]";
	public String yuanyong_78 = "[rP1C][lu0000]";
	public String jinyong_73 = "[rP17][lu06D1]";
	public String yuanyong_77 = "[rP1B][lu0000]";
	public String jinyong_72 = "[rP16][lu06BA]";
	public String yuanyong_76 = "[rP1A][lu0000]";
	public String jinyong_71 = "[rP15][lu06A1]";
	public String yuanyong_75 = "[rP19][lu0000]";
	public String jinyong_70 = "[rP14][lu068A]";
	public String yuanyong_74 = "[rP18][lu0000]";
	public String jinyong_69 = "[rP13][lu0671]";
	public String yuanyong_73 = "[rP17][lu0000]";
	public String jinyong_68 = "[rP12][lu065A]";
	public String yuanyong_72 = "[rP16][lu0000]";
	public String jinyong_67 = "[rP11][lu0643]";
	public String yuanyong_71 = "[rP15][lu0000]";
	public String jinyong_66 = "[rP10][lu062A]";
	public String yuanyong_70 = "[rP14][lu0000]";
	public String jinyong_65 = "[rP0F][lu0613]";
	public String yuanyong_69 = "[rP13][lu0000]";
	public String jinyong_64 = "[rP0E][lu05FA]";
	public String yuanyong_68 = "[rP12][lu0000]";
	public String jinyong_63 = "[rP0D][lu05E3]";
	public String yuanyong_67 = "[rP11][lu0000]";
	public String jinyong_62 = "[rP0C][lu05CC]";
	public String yuanyong_66 = "[rP10][lu0000]";
	public String jinyong_61 = "[rP0B][lu05B3]";
	public String yuanyong_65 = "[rP0F][lu0000]";
	public String jinyong_60 = "[rP0A][lu059C]";
	public String yuanyong_64 = "[rP0E][lu0000]";
	public String jinyong_59 = "[rP09][lu0583]";
	public String yuanyong_63 = "[rP0D][lu0000]";
	public String jinyong_58 = "[rP08][lu056C]";
	public String yuanyong_62 = "[rP0C][lu0000]";
	public String jinyong_57 = "[rP07][lu0553]";
	public String yuanyong_61 = "[rP0B][lu0000]";
	public String jinyong_56 = "[rP06][lu053C]";
	public String yuanyong_60 = "[rP0A][lu0000]";
	public String jinyong_55 = "[rP05][lu0525]";
	public String yuanyong_59 = "[rP09][lu0000]";
	public String jinyong_54 = "[rP04][lu050C]";
	public String yuanyong_58 = "[rP08][lu0000]";
	public String jinyong_53 = "[rP03][lu04F5]";
	public String yuanyong_57 = "[rP07][lu0000]";
	public String jinyong_52 = "[rP02][lu04DC]";
	public String yuanyong_56 = "[rP06][lu0000]";
	public String jinyong_51 = "[rP01][lu04C5]";
	public String yuanyong_55 = "[rP05][lu0000]";
	public String jinyong_50 = "[rP00][lu04AC]";
	public String yuanyong_54 = "[rP04][lu0000]";
	public String jinyong_49 = "[lu0495]";
	public String yuanyong_53 = "[rP03][lu0000]";
	public String jinyong_48 = "[lu047E]";
	public String yuanyong_52 = "[rP02][lu0000]";
	public String jinyong_47 = "[lu0465]";
	public String yuanyong_51 = "[rP01][lu0000]";
	public String jinyong_46 = "[lu0465]";
	public String yuanyong_50 = "[rP00][lu0000]";
	public String jinyong_45 = "[lu0465]";
	public String label = "";


	private BlockDialog _dialog;
	
	private List<String> list_S;
	private List<String> list_C;
	private List<String> list_A;
	private List<String> list_H;
	private List<String> list_V;
	private List<String> list_Add;
	private final static String TAG = "MainActivity";
	public ImageButton imgbtr;
	public ImageButton imgbtl;
	public ImageView lv1, r_PD;
	public ImageView lv2, l_PD;
	private ImageView image;
	public Context mContext;
	private MyApp app;
	public TxtViewVessel vessel_FARNEAR;
	protected FragmentLeft mActivity;
	private long mExitTime;
	private GestureDetector mGestureDetector;
	private LinearLayout layout;
	public String b_s_l, b_s_r;
	public String b_c_l, b_c_r;
	public String b_a_l, b_a_r;
	public String b_add_l, b_add_r;
	public String b_h_l, b_h_r;
	public String b_v_l, b_v_r;
	public String b_s_L, b_s_R;
	public String b_c_L, b_c_R;
	public String b_a_L, b_a_R;
	public String b_add_L, b_add_R;
	public String b_h_L, b_h_R;
	public String b_v_L, b_v_R;
	public String pd, pd1;
	private TextView mTxtYuanyong, mTxtDayin, mTxt_RL_Show;
	public TextView mTxtEye_S_Left, mTxtEye_S_Right;
	public TextView mTxtEye_C_Left, mTxtEye_C_Right;
	public TextView mTxtEye_A_Left, mTxtEye_A_Right;
	public TextView mTxtEye_H_Left, mTxtEye_H_Right;
	public TextView mTxtEye_V_Left, mTxtEye_V_Right;
	public TextView mTxtEye_ADD_Left, mTxtEye_ADD_Right;
	private TextView mTxt_R, mTxt_L;
	public int cd;
	private String pad;
	private ImageButton mImgBtn_jia, mImgBtn_jian;
	private ImageButton mImgBtn_1, mImgBtn_2;
	
	public TextView m_niuyan,m_chart,m_ref,m_printer,m_program,m_set;

	public ImageView m_bt;
	private String aa;
	//
	SelectPicPopupWindow menuWindow;
	private boolean xYuan_jin = true;
	
	private BtAPI btApi;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image = (ImageView) findViewById(R.id.image01);
		lv1 = (ImageView) findViewById(R.id.iv_1);
		lv2 = (ImageView) findViewById(R.id.iv_2);
		mTxtDayin = (TextView) findViewById(R.id.txt_title_dayin);
		mTxtDayin.setOnClickListener(MyClick);
		mTxt_RL_Show = (TextView) findViewById(R.id.txt_rl_show);
		mTxtEye_S_Left = (TextView) findViewById(R.id.txt_eye_s_left);
		mTxtEye_S_Right = (TextView) findViewById(R.id.txt_eye_s_right);
		mTxtEye_C_Left = (TextView) findViewById(R.id.txt_eye_c_left);
		mTxtEye_C_Right = (TextView) findViewById(R.id.txt_eye_c_right);
		mTxtEye_A_Left = (TextView) findViewById(R.id.txt_eye_a_left);
		mTxtEye_A_Right = (TextView) findViewById(R.id.txt_eye_a_right);
		mTxtEye_H_Left = (TextView) findViewById(R.id.txt_eye_h_left);
		mTxtEye_H_Right = (TextView) findViewById(R.id.txt_eye_h_right);
		mTxtEye_V_Left = (TextView) findViewById(R.id.txt_eye_v_left);
		mTxtEye_V_Right = (TextView) findViewById(R.id.txt_eye_v_right);
		mTxtEye_ADD_Left = (TextView) findViewById(R.id.txt_eye_add_left);
		mTxtEye_ADD_Right = (TextView) findViewById(R.id.txt_eye_add_right);
		mImgBtn_jia = (ImageButton) findViewById(R.id.imgbtn_jia);
		mImgBtn_jian = (ImageButton) findViewById(R.id.imgbtn_jian);
		mImgBtn_1 = (ImageButton) findViewById(R.id.imgbtn_1);
		mImgBtn_2 = (ImageButton) findViewById(R.id.imgbtn_2);
		mTxt_L = (TextView) findViewById(R.id.txt_l);
		mTxt_R = (TextView) findViewById(R.id.txt_r);
		r_PD = (ImageView) findViewById(R.id.txt_rignt);
		l_PD = (ImageView) findViewById(R.id.txt_left);
		
		 m_niuyan =(TextView) findViewById(R.id.txt_title_niuyan);
		 m_niuyan.setOnClickListener(MyClick);
		 m_chart  =(TextView) findViewById(R.id.txt_title_chart);
		 m_chart.setOnClickListener(MyClick);
		 m_ref    =(TextView) findViewById(R.id.txt_title_REF);
		 m_ref.setOnClickListener(MyClick);
		 m_printer=(TextView) findViewById(R.id.txt_title_printer);
		 m_printer.setOnClickListener(MyClick);
		 m_program=(TextView) findViewById(R.id.txt_title_program);
		 m_program.setOnClickListener(MyClick);
		 m_set    =(TextView) findViewById(R.id.txt_title_set);
		 m_set.setOnClickListener(MyClick);
		 m_set.setOnLongClickListener(ClickListener_set);
		 
		 m_bt    =(ImageView) findViewById(R.id.txt_title_bt);
		 blink();
	
		MarginLayoutParams margin6 = new MarginLayoutParams(mImgBtn_2.getLayoutParams());
		margin6.setMargins(243, 15, 0, 0);
		RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(margin6);
		layoutParams6.height = 45;
		layoutParams6.width = 75; 
		mImgBtn_2.setLayoutParams(layoutParams6);
		
		MarginLayoutParams margin5 = new MarginLayoutParams(mImgBtn_1.getLayoutParams());
		margin5.setMargins(15, 15, 0, 0);
		RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(margin5);
		layoutParams5.height = 45;
		layoutParams5.width = 75; 
		mImgBtn_1.setLayoutParams(layoutParams5);
		
		MarginLayoutParams margin4 = new MarginLayoutParams(mImgBtn_jian.getLayoutParams());
		margin4.setMargins(250, 15, 0, 0);
		RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(margin4);
		layoutParams4.height = 45;
		layoutParams4.width = 75; 
		mImgBtn_jian.setLayoutParams(layoutParams4);

		MarginLayoutParams margin3 = new MarginLayoutParams(mImgBtn_jia.getLayoutParams());
		margin3.setMargins(2, 15, 0, 0);
		RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(margin3);
		layoutParams3.height = 45;
		layoutParams3.width = 75; 
		mImgBtn_jia.setLayoutParams(layoutParams3);

		MarginLayoutParams margin1 = new MarginLayoutParams(l_PD.getLayoutParams());
		margin1.setMargins(185, 0, 0, 20);
		RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(margin1);
		layoutParams1.height = 40;
		layoutParams1.width = 90; 
		l_PD.setLayoutParams(layoutParams1);

		MarginLayoutParams margin2 = new MarginLayoutParams(r_PD.getLayoutParams());
		margin2.setMargins(30, 0, 0, 20);
		RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(margin2);
		layoutParams2.height = 40;
		layoutParams2.width = 90; 
		r_PD.setLayoutParams(layoutParams2);

		MarginLayoutParams margin9 = new MarginLayoutParams(image.getLayoutParams());
		margin9.setMargins(231, 110, 0, 0);
		RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(margin9);
		layoutParams9.height = 206;
		layoutParams9.width = 206;
		imgbtr = (ImageButton) findViewById(R.id.imgbtn_right);
		imgbtl = (ImageButton) findViewById(R.id.imgbtn_left);
		//////////////////////////////////////////////////////////////////////
		list_S = ReadTextUtil.getString(this, R.raw.s);
		list_C = ReadTextUtil.getString(this, R.raw.c);
		list_A = ReadTextUtil.getString(this, R.raw.a);
		////////////////////////////////////////////////////////////////////////////
		mTxtYuanyong = (TextView) findViewById(R.id.txt_title_yuanyong);
		mTxtYuanyong.setOnClickListener(new OnClickListener() {
			@SuppressLint("UseValueOf")
			@Override
			public void onClick(View arg0) {
				String bb = mTxt_RL_Show.getText().toString();
				double Txt_RL_Show = new Double(
						bb.substring(bb.indexOf(":") + 1));
				if (xYuan_jin) {       
					xYuan_jin = false;
					app.entirepd = false;
					if(app.language_flag==1)
					    mTxtYuanyong.setText("NEAR");
					else if(app.language_flag==2)
						mTxtYuanyong.setText("近");
					
					cdSave();
					cdRead1();
					//entire();
					app.tonear=true;
					app.IsModeFar = false;
					int _cd = 0;
					if (Txt_RL_Show == 80) {
						double xR = 37.5;
						double xL = 37.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_75));
					}
					if (Txt_RL_Show == 79) {
						double xR = 37.0;
						double xL = 37.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_74));
					}
					if (Txt_RL_Show == 78) {
						double xR = 36.5;
						double xL = 36.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_73));
					}
					if (Txt_RL_Show == 77) {
						double xR = 36.0;
						double xL = 36.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_72));
					}
					if (Txt_RL_Show == 76) {
						double xR = 35.5;
						double xL = 35.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_71));
					}
					if (Txt_RL_Show == 75) {
						double xR = 35.0;
						double xL = 35.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_70));
					}
					if (Txt_RL_Show == 74) {
						double xR = 35.0;
						double xL = 35.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_70));
					}
					if (Txt_RL_Show == 73) {
						double xR = 34.5;
						double xL = 34.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_69));
					}
					if (Txt_RL_Show == 72) {
						double xR = 34.0;
						double xL = 34.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_68));
					}
					if (Txt_RL_Show == 71) {
						double xR = 33.5;
						double xL = 33.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_67));
					}
					if (Txt_RL_Show == 70) {
						double xR = 33.0;
						double xL = 33.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_66));
					}
					if (Txt_RL_Show == 69) {
						double xR = 32.5;
						double xL = 32.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_65));
					}
					if (Txt_RL_Show == 68) {
						double xR = 32.0;
						double xL = 32.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_64));
					}
					if (Txt_RL_Show == 67) {
						double xR = 31.5;
						double xL = 31.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_63));
					}
					if (Txt_RL_Show == 66) {
						double xR = 31.0;
						double xL = 31.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_62));
					}
					if (Txt_RL_Show == 65) {
						double xR = 30.5;
						double xL = 30.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_61));
					}
					if (Txt_RL_Show == 64) {
						double xR = 30.0;
						double xL = 30.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_60));
					}
					if (Txt_RL_Show == 63) {
						double xR = 29.5;
						double xL = 29.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_59));
					}
					if (Txt_RL_Show == 62) {
						double xR = 29.0;
						double xL = 29.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_58));
					}
					if (Txt_RL_Show == 61) {
						double xR = 28.5;
						double xL = 28.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_57));
					}
					if (Txt_RL_Show == 60) {
						double xR = 28.0;
						double xL = 28.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_56));
					}
					if (Txt_RL_Show == 59) {
						double xR = 27.5;
						double xL = 27.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_55));
					}
					if (Txt_RL_Show == 58) {
						double xR = 27.0;
						double xL = 27.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_54));
					}
					if (Txt_RL_Show == 57) {
						double xR = 27.0;
						double xL = 27.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_54));
					}
					if (Txt_RL_Show == 56) {
						double xR = 26.5;
						double xL = 26.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_53));
					}
					if (Txt_RL_Show == 55) {
						double xR = 26.0;
						double xL = 26.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_52));
					}
					if (Txt_RL_Show == 54) {
						double xR = 25.5;
						double xL = 25.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_51));
					}
					if (Txt_RL_Show == 53) {
						double xR = 25.0;
						double xL = 25.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_50));
					}
					if (Txt_RL_Show == 52) {
						double xR = 24.5;
						double xL = 24.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_49));
					}
					if (Txt_RL_Show == 51) {
						double xR = 24.0;
						double xL = 24.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_48));
					}
					if (Txt_RL_Show == 50) {
						double xR = 23.5;
						double xL = 23.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(jinyong_47));
					}
				} else {
					xYuan_jin = true;
					app.entirepd = true;
					if(app.language_flag==1)
					    mTxtYuanyong.setText("FAR");
					else if(app.language_flag==2)
						mTxtYuanyong.setText("远");
					cdSave1();
					cdRead();
					//entire_2();
					app.IsModeFar = true;
					int _cd = 0;
					if (Txt_RL_Show == 77) {
						double xR = 40.0;
						double xL = 40.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_80));
					}
					if (Txt_RL_Show == 76) {
						double xR = 40.0;
						double xL = 40.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_80));
					}
					if (Txt_RL_Show == 75) {
						double xR = 40.0;
						double xL = 40.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_80));
					}
					if (Txt_RL_Show == 74) {
						double xR = 39.5;
						double xL = 39.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_79));
					}
					if (Txt_RL_Show == 73) {
						double xR = 39.0;
						double xL = 39.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_78));
					}
					if (Txt_RL_Show == 72) {
						double xR = 38.5;
						double xL = 38.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_77));
					}
					if (Txt_RL_Show == 71) {
						double xR = 38.0;
						double xL = 38.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_76));
					}
					if (Txt_RL_Show == 70) {
						double xR = 37.5;
						double xL = 37.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_75));
					}
					if (Txt_RL_Show == 69) {
						double xR = 36.5;
						double xL = 36.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_73));
					}
					if (Txt_RL_Show == 68) {
						double xR = 36.0;
						double xL = 36.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_72));
					}
					if (Txt_RL_Show == 67) {
						double xR = 35.5;
						double xL = 35.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_71));
					}
					if (Txt_RL_Show == 66) {
						double xR = 35.0;
						double xL = 35.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_70));
					}
					if (Txt_RL_Show == 65) {
						double xR = 34.5;
						double xL = 34.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_69));
					}
					if (Txt_RL_Show == 64) {
						double xR = 34.0;
						double xL = 34.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_68));
					}
					if (Txt_RL_Show == 63) {
						double xR = 33.5;
						double xL = 33.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_67));
					}
					if (Txt_RL_Show == 62) {
						double xR = 33.0;
						double xL = 33.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_66));
					}
					if (Txt_RL_Show == 61) {
						double xR = 32.5;
						double xL = 32.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_65));
					}
					if (Txt_RL_Show == 60) {
						double xR = 32.0;
						double xL = 32.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_64));
					}
					if (Txt_RL_Show == 59) {
						double xR = 31.5;
						double xL = 31.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_63));
					}
					if (Txt_RL_Show == 58) {
						double xR = 31.0;
						double xL = 31.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_62));
					}
					if (Txt_RL_Show == 57) {
						double xR = 30.5;
						double xL = 30.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_61));
					}
					if (Txt_RL_Show == 56) {
						double xR = 30.0;
						double xL = 30.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_60));
					}
					if (Txt_RL_Show == 55) {
						double xR = 29.5;
						double xL = 29.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_59));
					}
					if (Txt_RL_Show == 54) {
						double xR = 29.0;
						double xL = 29.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_58));
					}
					if (Txt_RL_Show == 53) {
						double xR = 28.0;
						double xL = 28.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_56));
					}
					if (Txt_RL_Show == 52) {
						double xR = 27.5;
						double xL = 27.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_55));
					}
					if (Txt_RL_Show == 51) {
						double xR = 27.0;
						double xL = 27.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_54));
					}
					if (Txt_RL_Show == 50) {
						double xR = 26.5;
						double xL = 26.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_53));
					}
					if (Txt_RL_Show == 49) {
						double xR = 26.0;
						double xL = 26.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_52));
					}
					if (Txt_RL_Show == 48) {
						double xR = 25.5;
						double xL = 25.5;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_51));
					}
					if (Txt_RL_Show == 47) {
						double xR = 25.0;
						double xL = 25.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_50));
					}
					if (Txt_RL_Show == 46) {
						double xR = 25.0;
						double xL = 25.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_50));
					}
					if (Txt_RL_Show == 45) {
						double xR = 25.0;
						double xL = 25.0;
						_cd = (int) (xL + xR);
						mTxt_L.setText("L:" + xL);
						mTxt_R.setText("R:" + xR);
						mTxt_RL_Show.setText("PD: " + _cd);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format(yuanyong_50));
					}
				}
			}
		});

		imgbtl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivityForResult(new Intent(MainActivity.this,
						SkiplActivity.class), 1);
			}
		});
		imgbtr.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View argv0) {
				startActivityForResult(new Intent(MainActivity.this,
						SkiplActivity.class), 1);
			}
		});
		image.setLayoutParams(layoutParams9);


		Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);//需要BLUETOOTH权限
		startActivityForResult(intent,RESULT_OK);




		ViewUtils.inject(this);
		app = (MyApp) getApplication();
		app.addActivity(this);
		btApi=BtAPI.getInstance(this);
		btApi.setOnDataCome(this);
		mContext = this;
		mGestureDetector = new GestureDetector(this, new MySimpleGesture());
		app.BluetoothAPI.info_load();
		cdSave();
		cdSave1();
		lv1.setImageResource(R.drawable.l_1);
		lv2.setImageResource(R.drawable.l_1);
		cd();


		//getUUID
		MPermissions.requestPermissions(this,0, Manifest.permission.READ_PHONE_STATE);
//		getMyUUID();
//		bbq();
//		if (!pad.equals(aa)) {
//			intent();
//		}
	}
	
	
	
	public void entire(){
		list_S = ReadTextUtil.getString(this, R.raw.s);
		list_C = ReadTextUtil.getString(this, R.raw.c);
		list_A = ReadTextUtil.getString(this, R.raw.a);
		list_H = ReadTextUtil.getString(this, R.raw.h);
		list_V = ReadTextUtil.getString(this, R.raw.v);
		list_Add = ReadTextUtil.getString(this, R.raw.add);
		if(app.txtCount == 1000){
			setList(list_S,app.BullEye_L_S);
			setList(list_C,app.BullEye_L_C);
			setList(list_A,app.BullEye_L_A);
			//setList(list_SS,app.BullEye_L_ADD);
		}
		if(app.txtCount == 1001){
			setList(list_S,app.BullEye_R_S);
			setList(list_C,app.BullEye_R_C);
			setList(list_A,app.BullEye_R_A);
			//setList(list_SS,app.BullEye_R_ADD);
		}
		if(app.txtCount == 1002){
			setList(list_S,app.BullEye_L_S);
			setList(list_C,app.BullEye_L_C);
			setList(list_A,app.BullEye_L_A);
			//setList(list_SS,app.BullEye_L_ADD);
			//setList(list_SS,app.BullEye_R_ADD);
			setList(list_A,app.BullEye_R_A);
			setList(list_C,app.BullEye_R_C);
			setList(list_S,app.BullEye_R_S);
			
		}
	}
	
	public void entire_2(){
		list_S = ReadTextUtil.getString(this, R.raw.s);
		list_C = ReadTextUtil.getString(this, R.raw.c);
		list_A = ReadTextUtil.getString(this, R.raw.a);
		list_H = ReadTextUtil.getString(this, R.raw.h);
		list_V = ReadTextUtil.getString(this, R.raw.v);
		list_Add = ReadTextUtil.getString(this, R.raw.add);
		if(app.txtCount == 1000){
			setList(list_S,app.BullEye_L_S2);
			setList(list_C,app.BullEye_L_C2);
			setList(list_A,app.BullEye_L_A2);
			//setList(list_SS,app.BullEye_L_ADD2);
		}
		if(app.txtCount == 1001){
			setList(list_S,app.BullEye_R_S2);
			setList(list_C,app.BullEye_R_C2);
			setList(list_A,app.BullEye_R_A2);
			//setList(list_SS,app.BullEye_R_ADD2);
		}
		if(app.txtCount == 1002){
			setList(list_S,app.BullEye_L_S2);
			setList(list_C,app.BullEye_L_C2);
			setList(list_A,app.BullEye_L_A2);
			//setList(list_SS,app.BullEye_L_ADD2);
			//setList(list_SS,app.BullEye_R_ADD2);
			setList(list_A,app.BullEye_R_A2);
			setList(list_C,app.BullEye_R_C2);
			setList(list_S,app.BullEye_R_S2);
			
		}
	}
	
	private String setList(List<String> list, int count) {
		
		String [] temp = null;  
		
		temp = list.get(count).split(","); 
		String xx = temp[0];
		String cmdR = temp[1];
		String cmdL = temp[2];
		String cmd ;
		if(app.txtCount == Constants.EYE_L)cmd = cmdL;
		else cmd = cmdR;
		
		if (app.BluetoothAPI != null)
		{
			app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);	
		}
		return xx;
	}

	
	private String getMyUUID() {

		final TelephonyManager tm = (TelephonyManager) getBaseContext()
				.getSystemService(this.TELEPHONY_SERVICE);

		final String tmDevice, tmSerial, tmPhone, androidId;

		tmDevice = "" + tm.getDeviceId();

		tmSerial = "" + tm.getSimSerialNumber();

		androidId = ""
				+ android.provider.Settings.Secure.getString(
						getContentResolver(),
						android.provider.Settings.Secure.ANDROID_ID);

		UUID deviceUuid = new UUID(androidId.hashCode(),
				((long) tmDevice.hashCode() << 32) | tmSerial.hashCode());

		app._id = deviceUuid.toString();

		return app._id;

	}

	public void bbq() {
		int n = 12;
		String b = app._id.substring(app._id.length() - n, app._id.length());
		aa = b.substring(0, 3);
	}

	public void cd() {
		SharedPreferences sp = getSharedPreferences("pad", MODE_PRIVATE);
		pad = sp.getString("postStr", "");
	}

	public void intent() {
		Intent intent = new Intent(MainActivity.this, registerActivity.class);
		Intent intent1 = new Intent(MainActivity.this, shieldActivity.class);
		startActivity(intent1);
		startActivity(intent);
	}

	
	void cdSave() {
		SharedPreferences mySharedPreferences = getSharedPreferences("test1",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		b_s_l = mTxtEye_S_Left.getText().toString();
		b_s_r = mTxtEye_S_Right.getText().toString();
		b_c_l = mTxtEye_C_Left.getText().toString();
		b_c_r = mTxtEye_C_Right.getText().toString();
		b_a_l = mTxtEye_A_Left.getText().toString();
		b_a_r = mTxtEye_A_Right.getText().toString();
		b_h_l = mTxtEye_H_Left.getText().toString();
		b_h_r = mTxtEye_H_Right.getText().toString();
		b_v_l = mTxtEye_V_Left.getText().toString();
		b_v_r = mTxtEye_V_Right.getText().toString();
		b_add_l = mTxtEye_ADD_Left.getText().toString();
		b_add_r = mTxtEye_ADD_Right.getText().toString();
		pd = mTxt_RL_Show.getText().toString();
		editor.putString("b_s_l", b_s_l);//
		editor.putString("b_s_r", b_s_r);
		editor.putString("b_c_l", b_c_l);
		editor.putString("b_c_r", b_c_r);
		editor.putString("b_a_l", b_a_l);
		editor.putString("b_a_r", b_a_r);
		editor.putString("b_h_l", b_h_l);
		editor.putString("b_h_r", b_h_r);
		editor.putString("b_v_l", b_v_l);
		editor.putString("b_v_r", b_v_r);
		editor.putString("b_add_l", b_add_l);
		editor.putString("b_add_r", b_add_r);
		editor.clear();
		editor.commit();
	}

	void cdSave1() {
		SharedPreferences mySharedPreferences = getSharedPreferences("test123",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		b_s_L = mTxtEye_S_Left.getText().toString();
		b_s_R = mTxtEye_S_Right.getText().toString();
		b_c_L = mTxtEye_C_Left.getText().toString();
		b_c_R = mTxtEye_C_Right.getText().toString();
		b_a_L = mTxtEye_A_Left.getText().toString();
		b_a_R = mTxtEye_A_Right.getText().toString();
		b_h_L = mTxtEye_H_Left.getText().toString();
		b_h_R = mTxtEye_H_Right.getText().toString();
		b_v_L = mTxtEye_V_Left.getText().toString();
		b_v_R = mTxtEye_V_Right.getText().toString();
		b_add_L = mTxtEye_ADD_Left.getText().toString();
		b_add_R = mTxtEye_ADD_Right.getText().toString();
		pd1 = mTxt_RL_Show.getText().toString();
		editor.putString("b_s_L", b_s_L);
		editor.putString("b_s_R", b_s_R);
		editor.putString("b_c_L", b_c_L);
		editor.putString("b_c_R", b_c_R);
		editor.putString("b_a_L", b_a_L);
		editor.putString("b_a_R", b_a_R);
		editor.putString("b_h_L", b_h_L);
		editor.putString("b_h_R", b_h_R);
		editor.putString("b_v_L", b_v_L);
		editor.putString("b_v_R", b_v_R);
		editor.putString("b_add_L", b_add_L);
		editor.putString("b_add_R", b_add_R);
		editor.clear();
		editor.commit();
	}

	void cdRead1() {
		app.count_fartonear++;
		if(app.count_fartonear==1){
			b_s_L = b_s_l;
			b_s_R = b_s_r;
			b_c_L = b_c_l;
			b_c_R = b_c_r;
			b_a_L = b_a_l;
			b_a_R = b_a_r;
			b_h_L = b_h_l;
			b_h_R = b_h_r;
			b_v_L = b_v_l;
			b_v_R = b_v_r;
			b_add_L = b_add_l;
			b_add_R = b_add_r;
//			app.s_r_fartonear=b_s_r;
//			app.s_l_fartonear=b_s_l;
//			app.c_r_fartonear=b_c_r;
//			app.c_l_fartonear=b_c_l;
//			app.a_r_fartonear=b_a_r;
//			app.a_l_fartonear=b_a_l;
//			app.h_r_fartonear=b_h_r;
//			app.h_l_fartonear= b_h_l;
//			app.v_r_fartonear= b_v_r;
//			app.v_l_fartonear= b_v_l;
//			app.add_r_fartonear= b_add_r;
//			app.add_l_fartonear= b_add_l;
			
			app.s_r_fartonear=b_s_l;
			app.s_l_fartonear=b_s_r;
			app.c_r_fartonear=b_c_l;
			app.c_l_fartonear=b_c_r;
			app.a_r_fartonear=b_a_l;
			app.a_l_fartonear=b_a_r;
			app.h_r_fartonear=b_h_l;
			app.h_l_fartonear= b_h_r;
			app.v_r_fartonear= b_v_l;
			app.v_l_fartonear= b_v_r;
			app.add_r_fartonear= b_add_l;
			app.add_l_fartonear= b_add_r;
			
		    app.OnLeftFARtoNEAR=true;
		    app.OnRightFARtoNEAR=true;
			
		}else{
			SharedPreferences sharedPreferences = getSharedPreferences("test123",
					Activity.MODE_PRIVATE);
			b_s_L = sharedPreferences.getString("b_s_L", "");
			b_s_R = sharedPreferences.getString("b_s_R", "");
			b_c_L = sharedPreferences.getString("b_c_L", "");
			b_c_R = sharedPreferences.getString("b_c_R", "");
			b_a_L = sharedPreferences.getString("b_a_L", "");
			b_a_R = sharedPreferences.getString("b_a_R", "");
			b_h_L = sharedPreferences.getString("b_h_L", "");
			b_h_R = sharedPreferences.getString("b_h_R", "");
			b_v_L = sharedPreferences.getString("b_v_L", "");
			b_v_R = sharedPreferences.getString("b_v_R", "");
			b_add_L = sharedPreferences.getString("b_add_L", "");
			b_add_R = sharedPreferences.getString("b_add_R", "");
			pd1 = sharedPreferences.getString("pd1", "");
		}
		mTxtEye_S_Left.setText(b_s_L);
		mTxtEye_S_Right.setText(b_s_R);
		mTxtEye_C_Left.setText(b_c_L);
		mTxtEye_C_Right.setText(b_c_R);
		mTxtEye_A_Left.setText(b_a_L);
		mTxtEye_A_Right.setText(b_a_R);
		mTxtEye_H_Left.setText(b_h_L);
		mTxtEye_H_Right.setText(b_h_R);
		mTxtEye_V_Left.setText(b_v_L);
		mTxtEye_V_Right.setText(b_v_R);
		mTxtEye_ADD_Left.setText(b_add_L);
		mTxtEye_ADD_Right.setText(b_add_R);
		///////////////////////////////////
		refractor_Data(b_s_R,"S","R");
		refractor_Data(b_c_R,"C","R");
		refractor_Data(b_a_R,"A","R");
		refractor_Data(b_s_L,"S","L");
		refractor_Data(b_c_L,"C","L");
		refractor_Data(b_a_L,"A","L");
		//////////////////////////////////
		app.txtCount = Constants.EYE_D;
        app.txtState = Constants.EYE_S;
        vessel_FARNEAR = TxtViewVessel.getInstance(mActivity);
        vessel_FARNEAR.ChangeBg(Constants.EYE_S, Constants.EYE_S);	
	}

	
	void cdRead() {
		SharedPreferences sharedPreferences = getSharedPreferences("test1",
				Activity.MODE_PRIVATE);
		b_s_l = sharedPreferences.getString("b_s_l", "");
		b_s_r = sharedPreferences.getString("b_s_r", "");
		b_c_l = sharedPreferences.getString("b_c_l", "");
		b_c_r = sharedPreferences.getString("b_c_r", "");
		b_a_l = sharedPreferences.getString("b_a_l", "");
		b_a_r = sharedPreferences.getString("b_a_r", "");
		b_h_l = sharedPreferences.getString("b_h_l", "");
		b_h_r = sharedPreferences.getString("b_h_r", "");
		b_v_l = sharedPreferences.getString("b_v_l", "");
		b_v_r = sharedPreferences.getString("b_v_r", "");
		b_add_l = sharedPreferences.getString("b_add_l", "");
		b_add_r = sharedPreferences.getString("b_add_r", "");
		pd = sharedPreferences.getString("pd", "");
		mTxtEye_S_Left.setText(b_s_l);
		mTxtEye_S_Right.setText(b_s_r);
		mTxtEye_C_Left.setText(b_c_l);
		mTxtEye_C_Right.setText(b_c_r);
		mTxtEye_A_Left.setText(b_a_l);
		mTxtEye_A_Right.setText(b_a_r);
		mTxtEye_H_Left.setText(b_h_l);
		mTxtEye_H_Right.setText(b_h_r);
		mTxtEye_V_Left.setText(b_v_l);
		mTxtEye_V_Right.setText(b_v_r);
		mTxtEye_ADD_Left.setText(b_add_l);
		mTxtEye_ADD_Right.setText(b_add_r);
		///////////////////////////////////
		refractor_Data(b_s_r,"S","R");
		refractor_Data(b_c_r,"C","R");
		refractor_Data(b_a_r,"A","R");
		refractor_Data(b_s_l,"S","L");
		refractor_Data(b_c_l,"C","L");
		refractor_Data(b_a_l,"A","L");
		//////////////////////////////////
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_S;
		vessel_FARNEAR = TxtViewVessel.getInstance(mActivity);
		vessel_FARNEAR.ChangeBg(Constants.EYE_S, Constants.EYE_S);	
	}
	
	////////////////////////////////////////////////////////////////////////
	public OnLongClickListener ClickListener_set = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			
	    	  Intent intent = new Intent(MainActivity.this,
						AdministratorActivity.class);
				startActivity(intent);
			return true;
		}
			
	};
	////////////////////////////////////////////////////////////////////////

	public OnClickListener MyClick = new OnClickListener() {

		@SuppressLint("SimpleDateFormat")
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			////////////////////////////////////////////
			switch (arg0.getId()) {
			      case R.id.txt_title_niuyan:
			    	  show_dialog_config(Device.TypeBullEye);
			    	  break;
			    	  
			      case R.id.txt_title_chart:
			    	  show_dialog_config(Device.TypeBalopticon);
			    	  break;
			    	  
			      case R.id.txt_title_REF:
			    	  show_dialog_config(Device.TypeRMK);
			    	  break;
			    	  
			      case R.id.txt_title_printer:
			    	  show_dialog_config(Device.TypePrinter);
			    	  break;
			    	  
			      case R.id.txt_title_program:
			    	  Intent intent1 = new Intent(MainActivity.this,
								cxhygActivity.class);
						startActivity(intent1);
			    	  break;
			    	  
			      case R.id.txt_title_set:
			    	  Intent intent = new Intent(MainActivity.this,SetActivity.class);
					  startActivity(intent);
			    	  break;
			    	  
			      case R.id.txt_title_dayin:
			    	  
			    	  app.printCount ++;
			    	  if(app.printCount >2)
			    	  {
			    		if(app.language.equals("E")){
			  				Toast.makeText(mContext, "If can't print ,Please record the prescription,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "If can't print ,Please record the prescription,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "If can't print ,Please record the prescription,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "If can't print ,Please record the prescription,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "If can't print ,Please record the prescription,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
			    			//app.BluetoothAPI.show_dialog("", "Please record the prescription,exit APP, and reenter APP");
			  			}else if(app.language.equals("C")){
			  				Toast.makeText(mContext, "如果不打印，请记录下处方,退出APP,重新进入APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "如果不打印，请记录下处方,退出APP,重新进入APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "如果不打印，请记录下处方,退出APP,重新进入APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "如果不打印，请记录下处方,退出APP,重新进入APP", Toast.LENGTH_SHORT).show();
			  				Toast.makeText(mContext, "如果不打印，请记录下处方,退出APP,重新进入APP", Toast.LENGTH_SHORT).show();
			  				//app.BluetoothAPI.show_dialog("", "如果不打印，请记录下处方,退出APP,重新进入APP");
			  			}
			    	  }
			    		  
			    		if(!app.tonear){
			    			cdSave();
			    			SimpleDateFormat formatter = new SimpleDateFormat(
			    					"yyyy/MM/dd  HH:mm");
			    			Date curDate = new Date(System.currentTimeMillis());// 鑾峰彇褰撳墠鏃堕棿
			    			String str = formatter.format(curDate);
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n" + "     Data:" + str + "\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n    [    Subjective Data    ]\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        --<R>-------<L>--\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("   	  FAR\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s SPH %-6s\r\n", b_s_l, b_s_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s CYL %-6s\r\n", b_c_l, b_c_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s AXS %-6s\r\n", b_a_l, b_a_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  X  %-6s\r\n", b_h_l, b_h_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  Y  %-6s\r\n", b_v_l, b_v_r));
			    			app.BluetoothAPI
			    					.send_command_ack(Device.TypePrinter, String.format(
			    							"        %6s ADD %-6s\r\n", b_add_l, b_add_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %15s \r\n", pd));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n\r\n\r\n\r\n"));
			    		}else{
			    			
			    			if(app.IsModeFar)
			    				cdSave();
			    			else
			    				cdSave1();
			    			SimpleDateFormat formatter = new SimpleDateFormat(
			    					"yyyy/MM/dd  HH:mm");
			    			Date curDate = new Date(System.currentTimeMillis());
			    			String str = formatter.format(curDate);
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n" + "     Data:" + str + "\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n    [    Subjective Data    ]\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        --<R>-------<L>--\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("   	  FAR\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s SPH %-6s\r\n", b_s_l, b_s_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s CYL %-6s\r\n", b_c_l, b_c_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s AXS %-6s\r\n", b_a_l, b_a_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  X  %-6s\r\n", b_h_l, b_h_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  Y  %-6s\r\n", b_v_l, b_v_r));
			    			app.BluetoothAPI
			    					.send_command_ack(Device.TypePrinter, String.format(
			    							"        %6s ADD %-6s\r\n", b_add_l, b_add_r));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %15s \r\n", pd));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("     NEAR\r\n"));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s SPH %-6s\r\n", b_s_L, b_s_R));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s CYL %-6s\r\n", b_c_L, b_c_R));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s AXS %-6s\r\n", b_a_L, b_a_R));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  X  %-6s\r\n", b_h_L, b_h_R));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %6s  Y  %-6s\r\n", b_v_L, b_v_R));
			    			app.BluetoothAPI
			    					.send_command_ack(Device.TypePrinter, String.format(
			    							"        %6s ADD %-6s\r\n", b_add_L, b_add_R));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("        %15s \r\n", pd1));
			    			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
			    					String.format("\r\n\r\n\r\n\r\n"));
			    		}
			    	  break;
			    	  
			  default:
			    	  break;
			    
			}
			/////////////////////////////////////////////////
//		if(!app.tonear){
//			cdSave();
//			SimpleDateFormat formatter = new SimpleDateFormat(
//					"yyyy/MM/dd  HH:mm");
//			Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
//			String str = formatter.format(curDate);
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n" + "     Data:" + str + "\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n    [    Subjective Data    ]\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        --<R>-------<L>--\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("   	  FAR\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s SPH %-6s\r\n", b_s_l, b_s_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s CYL %-6s\r\n", b_c_l, b_c_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s AXS %-6s\r\n", b_a_l, b_a_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  X  %-6s\r\n", b_h_l, b_h_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  Y  %-6s\r\n", b_v_l, b_v_r));
//			app.BluetoothAPI
//					.send_command_ack(Device.TypePrinter, String.format(
//							"        %6s ADD %-6s\r\n", b_add_l, b_add_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %15s \r\n", pd));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n\r\n\r\n\r\n"));
//		}else{
//			
//			if(app.IsModeFar)
//				cdSave();
//			else
//				cdSave1();
//			SimpleDateFormat formatter = new SimpleDateFormat(
//					"yyyy/MM/dd  HH:mm");
//			Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
//			String str = formatter.format(curDate);
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n" + "     Data:" + str + "\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n    [    Subjective Data    ]\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        --<R>-------<L>--\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("   	  FAR\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s SPH %-6s\r\n", b_s_l, b_s_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s CYL %-6s\r\n", b_c_l, b_c_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s AXS %-6s\r\n", b_a_l, b_a_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  X  %-6s\r\n", b_h_l, b_h_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  Y  %-6s\r\n", b_v_l, b_v_r));
//			app.BluetoothAPI
//					.send_command_ack(Device.TypePrinter, String.format(
//							"        %6s ADD %-6s\r\n", b_add_l, b_add_r));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %15s \r\n", pd));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("     NEAR\r\n"));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s SPH %-6s\r\n", b_s_L, b_s_R));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s CYL %-6s\r\n", b_c_L, b_c_R));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s AXS %-6s\r\n", b_a_L, b_a_R));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  X  %-6s\r\n", b_h_L, b_h_R));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %6s  Y  %-6s\r\n", b_v_L, b_v_R));
//			app.BluetoothAPI
//					.send_command_ack(Device.TypePrinter, String.format(
//							"        %6s ADD %-6s\r\n", b_add_L, b_add_R));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("        %15s \r\n", pd1));
//			app.BluetoothAPI.send_command_ack(Device.TypePrinter,
//					String.format("\r\n\r\n\r\n\r\n"));
//		}
	  }
	};

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		layout = (LinearLayout) findViewById(R.id.main);
		layout.setOnTouchListener(this);
		layout.setFocusable(true);
		layout.setClickable(true);
		layout.setLongClickable(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.menu_settings:
			Intent intent = new Intent(mContext, BluetoothMenu.class);
			startActivityForResult(intent,
					BluetoothState.REQUEST_CONNECT_DEVICE);
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
		   exit();
		   return false;
		} 
		return super.onKeyDown(keyCode, event);
    }
	
	public void exit(){
		if ((System.currentTimeMillis() - mExitTime) > 2000) {
			if(app.language.equals("E")){
				Toast.makeText(this, "Press the exit program again", Toast.LENGTH_SHORT).show();
			}else if(app.language.equals("C")){
				Toast.makeText(this, "gradle assemblerelease再按一次退出程序", Toast.LENGTH_SHORT).show();
			}
				mExitTime = System.currentTimeMillis();
		} else {
			   finish();
		       System.exit(0);
		}
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
	
		return mGestureDetector.onTouchEvent(event);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return mGestureDetector.onTouchEvent(event);
	}

	private class MySimpleGesture extends SimpleOnGestureListener {
	
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
			if (e1.getX() < 10 && e2.getX() > 40) {
				
				menuWindow = new SelectPicPopupWindow(MainActivity.this,
						itemsOnClick);
			}
			return super.onScroll(e1, e2, distanceX, distanceY);
		}
	}

	
	private OnClickListener itemsOnClick = new OnClickListener() {
		public void onClick(View v) {
			menuWindow.dismiss();
			switch (v.getId()) {
			case R.id.btn_set_1:

				break;
			case R.id.btn_set_2:
				
				break;
			case R.id.btn_set_3:
				
				break;
			case R.id.btn_set_4:
				

				break;
			
			case R.id.btn_set_6:
				
				break;
			case R.id.btn_set_7:

				break;
			case R.id.btn_set_8:

				break;
			default:
				break;
			}
		}

	};

	private void show_dialog_config(String type) {
//		SharedPreferences.Editor editor = getSharedPreferences("InfoPublic",
//				Activity.MODE_WORLD_WRITEABLE).edit();

		SharedPreferences.Editor editor = getSharedPreferences("InfoPublic",
				Activity.MODE_PRIVATE).edit();
		editor.putString("Type", type);
		editor.commit();
		Intent intent = new Intent(this, BluetoothDialog.class);
		startActivityForResult(intent, BluetoothState.REQUEST_CONNECT_DEVICE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (resultCode) {
		case RESULT_OK:
			app.BluetoothAPI.info_load();
			break;
		case 1:
			int cd = data.getExtras().getInt("cd");
			lv1.setImageResource(cd);
			break;
		case 2:
			int result = data.getExtras().getInt("result");
															
			lv2.setImageResource(result);
			break;
		case 3:
			int BIN = data.getExtras().getInt("BIN");
			int BIN2 = data.getExtras().getInt("BIN2");
			lv1.setImageResource(BIN);
			lv2.setImageResource(BIN2);
			break;
		case 4:

			break;
		default:
			break;
		}
	}

	public void  refractor_Data(String eyeDataArray,String Data,String R_L){
		String[] temp = null;
			if(Data.equals("S")){
				for(int i = 0 ;i< list_S.size() ; i++){
				temp = list_S.get(i).split(","); 
				if(temp[0].equals(eyeDataArray)){
					if(R_L.equals("R")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[1]);
					}
					if(R_L.equals("L")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[2]);
					}
				}  
			  }
			}
			if(Data.equals("C")){
				for(int i = 0 ;i< list_C.size() ; i++){
				temp = list_C.get(i).split(","); 
				if(temp[0].equals(eyeDataArray)){
					if(R_L.equals("R")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[1]);
					}
					if(R_L.equals("L")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[2]);
					}
				}  
			  }
			}
			if(Data.equals("A")){
				for(int i = 0 ;i< list_A.size() ; i++){
				temp = list_A.get(i).split(","); 
				if(temp[0].equals(eyeDataArray)){
					if(R_L.equals("R")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[1]);
					}
					if(R_L.equals("L")){
						app.BluetoothAPI.send_command(Device.TypeBullEye,temp[2]);
					}
				}  
			  }
			}
	}
	
	//////////////////////////////////
	private Animation alphaAnimation;
	private void blink(){
		alphaAnimation = new AlphaAnimation( 1, 0.4f );  
	    alphaAnimation.setDuration( 300 );  
	    alphaAnimation.setInterpolator( new LinearInterpolator( ) );  
	    alphaAnimation.setRepeatCount( Animation.INFINITE );  
	    alphaAnimation.setRepeatMode( Animation.REVERSE );
	}

	
	@Override
	public void setData(boolean isCome) {
		// TODO Auto-generated method stub
		if(isCome){
			m_ref.setBackgroundResource(R.drawable.b_4_1);
		    
		}
		else{
			m_ref.setBackgroundResource(R.drawable.b_4);
		}
	}

	//////////////////////////////////


	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		MPermissions.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}

	@PermissionGrant(0)
	public void requestSdcardSuccess()
	{
		getMyUUID();
		bbq();
		if (!pad.equals(aa)) {
			intent();
		}
	}
}
