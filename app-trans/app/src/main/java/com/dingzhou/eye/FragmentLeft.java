package com.dingzhou.eye;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.util.List;

import com.dingzhou.eye.SelectChange.TxtEye;
import com.dingzhou.eye.SelectChange.TxtViewVessel;
import com.dingzhou.eye.tool.BtAPI;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.tool.BtAPI.DeviceState;
import com.dingzhou.eye.ui.RotatView;
import com.dingzhou.eye.util.Device;
import com.dingzhou.eye.util.ReadTextUtil;

public class FragmentLeft extends Fragment {
	public ImageView lv1;
	public ImageView lv2;
	public ImageView iv_l_r;
	public ImageView iv_l_l;
	public TextView mTxtEye_S_Left, mTxtEye_S_Right;
	public Spinner mSpiEyeS;
	public TextView mTxtEye_C_Left, mTxtEye_C_Right;
	public Spinner mSpiEyeC;
	public TextView mTxtEye_A_Left, mTxtEye_A_Right;
	public Spinner mSpiEyeA;
	public TextView mTxtEye_H_Left, mTxtEye_H_Right;
	public Spinner mSpiEyeH;
	public TextView mTxtEye_V_Left, mTxtEye_V_Right;
	public Spinner mSpiEyeV;
	public TextView mTxtEye_ADD_Left, mTxtEye_ADD_Right;
	public Spinner mSpiEyeADD;
	public LinearLayout cd_1;
	public LinearLayout cd_2;
	public LinearLayout cd_3;
	boolean b = false;

	final static int CONTEXT_MENU_1 = Menu.FIRST;
	final static int CONTEXT_MENU_2 = Menu.FIRST + 1;
	final static int CONTEXT_MENU_3 = Menu.FIRST + 2;
	final static int CONTEXT_MENU_4 = Menu.FIRST + 3;
	final static int CONTEXT_MENU_5 = Menu.FIRST + 4;
	final static int CONTEXT_MENU_6 = Menu.FIRST + 5;
	final static int CONTEXT_MENU_7 = Menu.FIRST + 6;
	final static int CONTEXT_MENU_8 = Menu.FIRST + 7;
	final static int CONTEXT_MENU_9 = Menu.FIRST + 8;
	final static int CONTEXT_MENU_10 = Menu.FIRST + 9;
	final static int CONTEXT_MENU_11 = Menu.FIRST + 10;
	final static int CONTEXT_MENU_12 = Menu.FIRST + 11;

	public int pbshu;
	public int bb = 0;
	
	private TextView mTxtYuanyong, mTxtLuoYan, mTxtYanguangtou, mTxtChufang,
			mTxtNext;
	
	private Spinner mTxtBack;
	
	public TextView mTxt_R, mTxt_L, mTxt_RL_Show;
	
	public ImageView mTxt_Right, mTxt_Left,_explain;
	
	@SuppressWarnings("unused")
	private ImageButton mImgBtn_R, mImgBtn_L, mImgBtn_jia, mImgBtn_jian,
			mImgBtn_1, mImgBtn_2;
	private MyApp app;
	public TxtViewVessel vessel;
	@SuppressWarnings("unused")
	private boolean xYuan_jin = true;

	private ImageButton ib;
	public ImageView lv;
	public ImageView _lv1;
	public ImageView _lv2;
	public ImageView _lv3;

	public ImageView lv_1;
	public ImageView lv_2;
	public ImageView lv_3;
	public ImageView lv_4;
	private RelativeLayout rl;
	private RelativeLayout rl_;
	float weight;
	String asd;
	public TxtEye tt;
	public double ab;
	public double ac;
	public int jis = 0;
	public int a = 0;
	SharedPreferences mySharedPreferences;
	private List<String> list_S;
	private List<String> list_C;
	private List<String> list_A;

	@SuppressLint("CutPasteId")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_left, null);
		app = (MyApp) getActivity().getApplication();
		app.cdReadlang();
		init(view);
		lv1 = (ImageView) view.findViewById(R.id.iv_1);
		lv2 = (ImageView) view.findViewById(R.id.iv_2);
		iv_l_l = (ImageView) view.findViewById(R.id.iv_2);
		iv_l_r = (ImageView) view.findViewById(R.id.iv_1);
		cd_1 = (LinearLayout) view.findViewById(R.id.cd_1);
		cd_2 = (LinearLayout) view.findViewById(R.id.cd_2);
		cd_3 = (LinearLayout) view.findViewById(R.id.cd_3);
		cd_1.setOnClickListener(ClickListener_1);
		cd_2.setOnClickListener(ClickListener_2);
		cd_3.setOnClickListener(ClickListener_3);
		RotatView rotatView = (RotatView) view.findViewById(R.id.myRotatView);
		rotatView.setRotatDrawableResource(R.drawable.cd_1, this);
		vessel = TxtViewVessel.getInstance(this);
		vessel.init(true);
		app.L_R = 2;
		

		delArray_STA();
		delArray_CUS1();
		delArray_CUS2();
		delArray_CUS3();
		delArray_CUS4();
		delArray_CUS5();
		delArray_CUS6();
		delArray_CUS7();
		delArray_CUS8();
		delArray_CUS9();
		delArray_CUS10();
		delArray_CUS11();
		initanimation();

		lv.setVisibility(View.INVISIBLE);
		_lv1.setVisibility(View.INVISIBLE);
		_lv2.setVisibility(View.INVISIBLE);
		_lv3.setVisibility(View.INVISIBLE);

		lv_1.setVisibility(View.INVISIBLE);
		lv_2.setVisibility(View.INVISIBLE);
		lv_3.setVisibility(View.INVISIBLE);
		lv_4.setVisibility(View.INVISIBLE);
		new Thread(new MyThread()).start();
		
		list_S = ReadTextUtil.getString(getActivity(), R.raw.s);
		list_C = ReadTextUtil.getString(getActivity(), R.raw.c);
		list_A = ReadTextUtil.getString(getActivity(), R.raw.a);
		
		return view;
	}

	public OnClickListener ClickListener_1 = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_V;
			app.position = mSpiEyeV.getSelectedItemPosition();
			vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);	
			vessel.ChangeYText();
		}
	};

	public OnClickListener ClickListener_2 = new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_S;
			app.position = mSpiEyeS.getSelectedItemPosition();
			vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
			vessel.ChangeSText();
		}
	};

	public OnClickListener ClickListener_3 = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_H;
			app.position = mSpiEyeH.getSelectedItemPosition();
			vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
			vessel.ChangeXText();
		}
	};

	private void init(View view) {
		_explain =  (ImageView) view.findViewById(R.id.explain);
		lv = (ImageView) view.findViewById(R.id.iv_1_1);
		_lv1 = (ImageView) view.findViewById(R.id.iv_1_2);
		_lv2 = (ImageView) view.findViewById(R.id.iv_1_3);
		_lv3 = (ImageView) view.findViewById(R.id.iv_1_4);

		lv_1 = (ImageView) view.findViewById(R.id.iv_2_2);
		lv_2 = (ImageView) view.findViewById(R.id.iv_2_3);
		lv_3 = (ImageView) view.findViewById(R.id.iv_2_4);
		lv_4 = (ImageView) view.findViewById(R.id.iv_2_5);

		mTxtEye_C_Left = (TextView) view.findViewById(R.id.txt_eye_c_left);
		mTxtEye_C_Left.setOnClickListener(MyClick);
		mTxtEye_C_Left.setOnLongClickListener(ClickListener_C_LR);
		mTxtEye_C_Right = (TextView) view.findViewById(R.id.txt_eye_c_right);
		mTxtEye_C_Right.setOnClickListener(MyClick);
		mTxtEye_C_Right.setOnLongClickListener(ClickListener_C_LR);
		mSpiEyeC = (Spinner) view.findViewById(R.id.spi_eye_c);
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_c, R.layout.spinnerlayout);
		adapter1.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeC.setAdapter(adapter1);
		mSpiEyeC.setOnItemSelectedListener(MySpinnerItemClick);
		mTxtEye_A_Left = (TextView) view.findViewById(R.id.txt_eye_a_left);
		mTxtEye_A_Left.setOnClickListener(MyClick);
		mTxtEye_A_Left.setOnLongClickListener(ClickListener_A_LR);
		mTxtEye_A_Right = (TextView) view.findViewById(R.id.txt_eye_a_right);
		mTxtEye_A_Right.setOnClickListener(MyClick);
		mTxtEye_A_Right.setOnLongClickListener(ClickListener_A_LR);
		mSpiEyeA = (Spinner) view.findViewById(R.id.spi_eye_a);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_a, R.layout.spinnerlayout);
		adapter2.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeA.setAdapter(adapter2);
		mSpiEyeA.setOnItemSelectedListener(MySpinnerItemClick);

		mTxtEye_H_Left = (TextView) view.findViewById(R.id.txt_eye_h_left);
		mTxtEye_H_Left.setOnClickListener(MyClick);
		mTxtEye_H_Left.setOnLongClickListener(ClickListener_H_LR);
		mTxtEye_H_Right = (TextView) view.findViewById(R.id.txt_eye_h_right);
		mTxtEye_H_Right.setOnClickListener(MyClick);
		mTxtEye_H_Right.setOnLongClickListener(ClickListener_H_LR);
		mSpiEyeH = (Spinner) view.findViewById(R.id.spi_eye_h);
		ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_h, R.layout.spinnerlayout);
		adapter3.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeH.setAdapter(adapter3);
		mSpiEyeH.setOnItemSelectedListener(MySpinnerItemClick);

		mTxtEye_V_Left = (TextView) view.findViewById(R.id.txt_eye_v_left);
		mTxtEye_V_Left.setOnClickListener(MyClick);
		mTxtEye_V_Left.setOnLongClickListener(ClickListener_V_LR);
		mTxtEye_V_Right = (TextView) view.findViewById(R.id.txt_eye_v_right);
		mTxtEye_V_Right.setOnClickListener(MyClick);
		mTxtEye_V_Right.setOnLongClickListener(ClickListener_V_LR);
		mSpiEyeV = (Spinner) view.findViewById(R.id.spi_eye_v);
		ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_v, R.layout.spinnerlayout);
		adapter4.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeV.setAdapter(adapter4);
		mSpiEyeV.setOnItemSelectedListener(MySpinnerItemClick);
		mTxtEye_ADD_Left = (TextView) view.findViewById(R.id.txt_eye_add_left);
		mTxtEye_ADD_Left.setOnClickListener(MyClick);
		mTxtEye_ADD_Left.setOnLongClickListener(ClickListener_ADD_LR);
		mTxtEye_ADD_Right = (TextView) view
				.findViewById(R.id.txt_eye_add_right);
		mTxtEye_ADD_Right.setOnClickListener(MyClick);
		mTxtEye_ADD_Right.setOnLongClickListener(ClickListener_ADD_LR);
		mSpiEyeADD = (Spinner) view.findViewById(R.id.spi_eye_add);
		ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_add, R.layout.spinnerlayout);
		adapter5.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeADD.setAdapter(adapter5);
		mSpiEyeADD.setOnItemSelectedListener(MySpinnerItemClick);

		mTxtEye_S_Left = (TextView) view.findViewById(R.id.txt_eye_s_left);
		mTxtEye_S_Left.setOnClickListener(MyClick);
		mTxtEye_S_Left.setOnLongClickListener(ClickListener_S_LR);
		mTxtEye_S_Right = (TextView) view.findViewById(R.id.txt_eye_s_right);
		mTxtEye_S_Right.setOnClickListener(MyClick);
		mTxtEye_S_Right.setOnLongClickListener(ClickListener_S_LR);
		mSpiEyeS = (Spinner) view.findViewById(R.id.spi_eye_s);
		ArrayAdapter<CharSequence> adapter0 = ArrayAdapter.createFromResource(
				getActivity(), R.array.spi_s, R.layout.spinnerlayout);
		adapter0.setDropDownViewResource(R.layout.spinnerlayout_drop);
		mSpiEyeS.setAdapter(adapter0);
		mSpiEyeS.setOnItemSelectedListener(MySpinnerItemClick);
		
		mSpiEyeS.setSelection(0);
		mSpiEyeC.setSelection(0);
		mSpiEyeA.setSelection(1);
		mSpiEyeH.setSelection(2);
		mSpiEyeV.setSelection(2);
		mSpiEyeADD.setSelection(0);
		
		app.Sposition=0;
		app.Cposition=0;
		app.Aposition=1;
		app.ADDposition=0;
		app.Hposition=2;
		app.Vposition=2;

		mTxtYuanyong = (TextView) view.findViewById(R.id.txt_title_yuanyong);
		mTxtLuoYan = (TextView) view.findViewById(R.id.txt_title_luoyan);
		mTxtLuoYan.setOnClickListener(MyClick);
		mTxtYanguangtou = (TextView) view.findViewById(R.id.txt_title_dayin);
		mTxtYanguangtou.setOnClickListener(MyClick);
		mTxtChufang = (TextView) view.findViewById(R.id.txt_title_chufang);
		mTxtChufang.setOnClickListener(MyClick);
		
		mTxtBack = (Spinner) view.findViewById(R.id.txt_title_back);
		if(app.language.equals("E")){
			ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(
					getActivity(), R.array.spi_program, R.layout.spinnerlayout);
			adapter9.setDropDownViewResource(R.layout.spinnerlayout_drop);
			mTxtBack.setAdapter(adapter9);
		}else if(app.language.equals("C")){
			ArrayAdapter<CharSequence> adapter90 = ArrayAdapter.createFromResource(
					getActivity(), R.array.spi_program1, R.layout.spinnerlayout);
			adapter90.setDropDownViewResource(R.layout.spinnerlayout_drop);
			mTxtBack.setAdapter(adapter90);
		}
		mTxtBack.setOnItemSelectedListener(MySpinnerItemClick);
		mTxtBack.setSelection(0);
		mTxtNext = (TextView) view.findViewById(R.id.txt_title_next);
		mTxtNext.setOnClickListener(MyClick1);
		
		
		if(app.language.equals("E")){
			app.language_flag=1;
			mTxtYuanyong.setText("FAR");
			mTxtLuoYan.setText("RESET");
			mTxtYanguangtou.setText("PRINT");
			mTxtChufang.setText("OBJ");
			
			mTxtNext.setText("NEXT");
		}else if(app.language.equals("C")){
			app.language_flag=2;
			mTxtYuanyong.setText("远");
			mTxtLuoYan.setText("复位清零");
			mTxtYanguangtou.setText("打印");
			mTxtChufang.setText("客观处方");
			
			mTxtNext.setText("下一步");
		}
		////////////////////////////////////////////////////////////////

		mTxt_R = (TextView) view.findViewById(R.id.txt_r);
		mTxt_R.setOnClickListener(MyClick);
		mTxt_L = (TextView) view.findViewById(R.id.txt_l);
		mTxt_L.setOnClickListener(MyClick);
		mTxt_Right = (ImageView) view.findViewById(R.id.txt_rignt);
		mTxt_Right.setOnClickListener(MyClick);
		mTxt_Left = (ImageView) view.findViewById(R.id.txt_left);
		mTxt_Left.setOnClickListener(MyClick);
		mTxt_RL_Show = (TextView) view.findViewById(R.id.txt_rl_show);
		mTxt_RL_Show.setOnClickListener(MyClick);
		mImgBtn_jia = (ImageButton) view.findViewById(R.id.imgbtn_jia);
		mImgBtn_jia.setOnClickListener(MyClick);
		mImgBtn_jian = (ImageButton) view.findViewById(R.id.imgbtn_jian);
		mImgBtn_jian.setOnClickListener(MyClick);
		mImgBtn_1 = (ImageButton) view.findViewById(R.id.imgbtn_1);
		mImgBtn_1.setOnClickListener(MyClick);
		mImgBtn_2 = (ImageButton) view.findViewById(R.id.imgbtn_2);
		mImgBtn_2.setOnClickListener(MyClick);
		rl = (RelativeLayout) view.findViewById(R.id.rotate);
		rl_ = (RelativeLayout) view.findViewById(R.id.rotate_t);
		ib = (ImageButton) view.findViewById(R.id.imgbtn_lefte);
		
	}

	
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			if (app.Trl == false) {
				initanimation();
			}
			if (app.Trl == true) {
				initanimation_();
			}
			super.handleMessage(msg);
		}
	};

	public class MyThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(80);
					Message message = new Message();
					message.what = 1;
					handler.sendMessage(message);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void initanimation() {
		asd = mTxtEye_A_Left.getText().toString();

		if (app.ackz == false || app.jiushi == true) {
			weight = Float.parseFloat(asd);
		}
		if (app.ackz == true) {
			weight = Float.parseFloat(asd) + 45;
		}
		if (app.jiushi == false) {
			weight = weight+90;
		}
		
		AnimationSet animationSet = new AnimationSet(true);
		RotateAnimation rotateAnimation = new RotateAnimation(weight, weight,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		rotateAnimation.setDuration(800);
		animationSet.addAnimation(rotateAnimation);
		animationSet.setFillAfter(true);
		rl.startAnimation(animationSet);
	}

	public void initanimation_() {
		asd = mTxtEye_A_Right.getText().toString();
		if (app.ackz == false || app.jiushi == true) {
			weight = Float.parseFloat(asd);
		}
		if (app.ackz == true) {
			weight = Float.parseFloat(asd) + 45;
		}
		if (app.jiushi == false) {
			weight =weight+ 90;
		}
		AnimationSet animationSet = new AnimationSet(true);
		RotateAnimation rotateAnimation = new RotateAnimation(weight, weight,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		rotateAnimation.setDuration(800);
		animationSet.addAnimation(rotateAnimation);
		animationSet.setFillAfter(true);
		rl_.startAnimation(animationSet);
	}

	public void initanimation_j() {
		asd = mTxtEye_A_Right.getText().toString();
		if (app.jiushi == true) {
			weight = Float.parseFloat(asd);
		}
		if (app.jiushi == false) {
			weight = Float.parseFloat(asd) + 90;
		}

		AnimationSet animationSet = new AnimationSet(true);
		RotateAnimation rotateAnimation = new RotateAnimation(weight, weight,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		rotateAnimation.setDuration(800);
		animationSet.addAnimation(rotateAnimation);
		animationSet.setFillAfter(true);
		rl_.startAnimation(animationSet);
	}

	public OnLongClickListener ClickListener_S_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			
		
	if(app.lj_10 != false){
		if(app.lj_6 != false){
			if(app.Pfdot != false){
				if(app.Rfgf != false){
					app.Lr = false;
					INVISIBLE();
					app.pzy = 3;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
					lv1.setImageResource(R.drawable.r_1);
					lv2.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				}else if(app.Rfgf == false){
					app.Lr = false;
					INVISIBLE();
					app.pzy = 3;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
					lv1.setImageResource(R.drawable.iv_5);
					lv2.setImageResource(R.drawable.iv_6);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
				}	
			}else if(app.Pfdot == false){
				/////////////////////////////////////////////////////////
				app.position = mSpiEyeS.getSelectedItemPosition();
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_S;
				vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
				lv1.setImageResource(R.drawable.iv_4);
				lv2.setImageResource(R.drawable.iv_3);
				vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
			}
		}else if(app.lj_6 == false){
			app.position = mSpiEyeS.getSelectedItemPosition();
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_S;
			vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
			lv1.setImageResource(R.drawable.r_3);
			lv2.setImageResource(R.drawable.r_1);
			vessel.ChangeSText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
		}
	}else if(app.lj_10 == false){
		app.position = mSpiEyeS.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_S;
		vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
		lv1.setImageResource(R.drawable.l_1);
		lv2.setImageResource(R.drawable.l_3);
		vessel.ChangeSText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
	}
			return true;
		}
	};
	public OnLongClickListener ClickListener_C_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stubs
			if(app.Rfgf != false){
				if(app.Pfdot != false){
					app.Lr = false;
					app.position = mSpiEyeC.getSelectedItemPosition();
					INVISIBLE();
					app.pzy = 3;
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, Constants.EYE_C);
					lv1.setImageResource(R.drawable.r_1);
					lv2.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				}else if(app.Pfdot == false){
					app.Lr = false;
					app.position = mSpiEyeC.getSelectedItemPosition();
					INVISIBLE();
					app.pzy = 3;
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, Constants.EYE_C);
					lv1.setImageResource(R.drawable.iv_4);
					lv2.setImageResource(R.drawable.iv_3);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
//					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
				}
			}else if(app.Rfgf == false){
				//////////////////////////////////////////////////////////////
				app.position = mSpiEyeC.getSelectedItemPosition();
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_C;
				vessel.ChangeBg(Constants.EYE_C, Constants.EYE_C);
				lv1.setImageResource(R.drawable.iv_5);
				lv2.setImageResource(R.drawable.iv_6);
				vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
//				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
				////////////////////////////////////////////////////////////////
			}
			return true;
		}
	};

	public OnLongClickListener ClickListener_A_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stubs
			if(app.Pfdot != false){
				if(app.Rfgf != false){
					app.Lr = false;
					app.position = mSpiEyeA.getSelectedItemPosition();
					INVISIBLE();
					app.pzy = 3;
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, Constants.EYE_A);
					lv1.setImageResource(R.drawable.r_1);
					lv2.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				}else if(app.Rfgf == false){
					app.Lr = false;
					app.position = mSpiEyeA.getSelectedItemPosition();
					INVISIBLE();
					app.pzy = 3;
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, Constants.EYE_A);
					lv1.setImageResource(R.drawable.iv_5);
					lv2.setImageResource(R.drawable.iv_6);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
//					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
				}
			}else if(app.Pfdot == false){
				app.Lr = false;
				app.position = mSpiEyeA.getSelectedItemPosition();
				INVISIBLE();
				app.pzy = 3;
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_A;
				vessel.ChangeBg(Constants.EYE_A, Constants.EYE_A);
				lv1.setImageResource(R.drawable.iv_4);
				lv2.setImageResource(R.drawable.iv_3);
				vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
//				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
			}
			return true;
		}
	};

	public OnLongClickListener ClickListener_H_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stubs
			app.Lr = false;
			INVISIBLE();
if (app.z_13 != 13){
	if (app.z_13 != 8){
		if (app.z_13 != 7){
			if (app.z_13 != 6) {
				if (app.z_13 != 5) {
					if (app.z_13 != 4) {
						if (app.z_13 != 1) {
							if (app.z_13 != 2){
								app.position = mSpiEyeH.getSelectedItemPosition();
								app.pzy = 3;
								app.txtCount = Constants.EYE_D;
								app.txtState = Constants.EYE_H;
								vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
								lv1.setImageResource(R.drawable.r_1);
								lv2.setImageResource(R.drawable.l_1);
								vessel.ChangeXText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,
										"[rU00]");
								app.BluetoothAPI.send_command(Device.TypeBullEye,
										"[lU00]");
							}
							else if(app.z_13 == 2){
								app.position = mSpiEyeH.getSelectedItemPosition();
								app.pzy = 3;
								app.txtCount = Constants.EYE_D;
								app.txtState = Constants.EYE_H;
								vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								vessel.ChangeXText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 1) {
							app.position = mSpiEyeH.getSelectedItemPosition();
							app.txtCount = Constants.EYE_D;
							app.txtState = Constants.EYE_H;
							vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
							iv_l_l.setImageResource(R.drawable.iv_6);
							iv_l_r.setImageResource(R.drawable.iv_5);
							vessel.ChangeXText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[rU77][lU77]");
						}
					} else if (app.z_13 == 4) {
						app.position = mSpiEyeH.getSelectedItemPosition();
						app.txtCount = Constants.EYE_D;
						app.txtState = Constants.EYE_H;
						vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
						iv_l_l.setImageResource(R.drawable.iv_3);
						iv_l_r.setImageResource(R.drawable.iv_4);
						vessel.ChangeXText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rU88][lUaa]");
					}
				} else if (app.z_13 == 5) {
					app.position = mSpiEyeH.getSelectedItemPosition();
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_H;
					vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
					iv_l_l.setImageResource(R.drawable.iv_3);
					iv_l_r.setImageResource(R.drawable.iv_4);
					vessel.ChangeXText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							"[rU88][lUaa]");
				}
			} else if (app.z_13 == 6) {
				app.position = mSpiEyeH.getSelectedItemPosition();
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_H;
				vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
				iv_l_l.setImageResource(R.drawable.l_1);
				iv_l_r.setImageResource(R.drawable.iv_7);
				vessel.ChangeXText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[rU55]");
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[lU00]");
			}
		}else if(app.z_13 == 7){
			app.position = mSpiEyeH.getSelectedItemPosition();
			app.pzy = 3;
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_H;
			vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
			iv_l_l.setImageResource(R.drawable.iv_3);
			iv_l_r.setImageResource(R.drawable.iv_4);
			vessel.ChangeXText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
		}
	}else if(app.z_13 == 8){
		app.position = mSpiEyeH.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_H;
		vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
		iv_l_l.setImageResource(R.drawable.iv_6);
		iv_l_r.setImageResource(R.drawable.iv_5);
		vessel.ChangeXText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,
				"[rU77][lU77]");
	}
  }else if(app.z_13 == 13){
	    app.position = mSpiEyeH.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_H;
		vessel.ChangeBg(Constants.EYE_H, Constants.EYE_H);
		iv_l_l.setImageResource(R.drawable.r_1);
		iv_l_r.setImageResource(R.drawable.r_3);
		vessel.ChangeXText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
  }
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rE77][lE77]");
			return true;
		}
	};

	public OnLongClickListener ClickListener_V_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			app.Lr = false;
			INVISIBLE();
if (app.z_13 != 12){
	if (app.z_13 != 8){
		if (app.z_13 != 7){
			if (app.z_13 != 6) {
				if (app.z_13 != 5) {
					if (app.z_13 != 4) {
						if (app.z_13 != 1) {
							if (app.z_13 != 2){
								app.position = mSpiEyeV.getSelectedItemPosition();
								app.pzy = 3;
								app.txtCount = Constants.EYE_D;
								app.txtState = Constants.EYE_V;
								vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
								lv1.setImageResource(R.drawable.r_1);
								lv2.setImageResource(R.drawable.l_1);
								vessel.ChangeYText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,
										"[rU00]");
								app.BluetoothAPI.send_command(Device.TypeBullEye,
										"[lU00]");
							}else if(app.z_13 == 2){
								app.position = mSpiEyeV.getSelectedItemPosition();
								app.pzy = 3;
								app.txtCount = Constants.EYE_D;
								app.txtState = Constants.EYE_V;
								vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								vessel.ChangeYText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 1) {
							app.position = mSpiEyeV.getSelectedItemPosition();
							app.txtCount = Constants.EYE_D;
							app.txtState = Constants.EYE_V;
							vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
							iv_l_l.setImageResource(R.drawable.iv_6);
							iv_l_r.setImageResource(R.drawable.iv_5);
							vessel.ChangeYText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[rU77][lU77]");
						}
					} else if (app.z_13 == 4) {
						app.position = mSpiEyeV.getSelectedItemPosition();
						app.txtCount = Constants.EYE_D;
						app.txtState = Constants.EYE_V;
						vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
						iv_l_l.setImageResource(R.drawable.iv_3);
						iv_l_r.setImageResource(R.drawable.iv_4);
						vessel.ChangeYText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rU88][lUaa]");
					}
				} else if (app.z_13 == 5) {
					app.position = mSpiEyeV.getSelectedItemPosition();
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_V;
					vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
					iv_l_l.setImageResource(R.drawable.iv_3);
					iv_l_r.setImageResource(R.drawable.iv_4);
					//vessel.ChangeSText();
					vessel.ChangeYText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							"[rU88][lUaa]");
				}
			} else if (app.z_13 == 6) {
				app.position = mSpiEyeV.getSelectedItemPosition();
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_V;
				vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
				iv_l_l.setImageResource(R.drawable.r_5);
				iv_l_r.setImageResource(R.drawable.l_1);
				//vessel.ChangeSText();
				vessel.ChangeYText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[rU00]");
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[lU55]");
			}
		}else if(app.z_13 == 7){
			app.position = mSpiEyeV.getSelectedItemPosition();
			app.pzy = 3;
			app.txtCount = Constants.EYE_D;
			app.txtState = Constants.EYE_V;
			vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
			iv_l_l.setImageResource(R.drawable.iv_3);
			iv_l_r.setImageResource(R.drawable.iv_4);
			//vessel.ChangeSText();
			vessel.ChangeYText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
		}
	}else if(app.z_13 == 8){
		app.position = mSpiEyeV.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_V;
		vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
		iv_l_l.setImageResource(R.drawable.iv_6);
		iv_l_r.setImageResource(R.drawable.iv_5);
		//vessel.ChangeSText();
		vessel.ChangeYText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,
				"[rU77][lU77]");
	}
}else if(app.z_13 == 12){
	app.position = mSpiEyeV.getSelectedItemPosition();
	app.txtCount = Constants.EYE_D;
	app.txtState = Constants.EYE_V;
	vessel.ChangeBg(Constants.EYE_V, Constants.EYE_V);
	iv_l_l.setImageResource(R.drawable.l_3);
	iv_l_r.setImageResource(R.drawable.l_1);
	vessel.ChangeYText();
	app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
}
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rE77][lE77]");
			return true;
		}
	};

	public OnLongClickListener ClickListener_ADD_LR = new OnLongClickListener() {
		@Override
		public boolean onLongClick(View v) {
			// TODO Auto-generated method stubs
			if(app.z_13 == 3){
				app.Lr = false;
				app.position = mSpiEyeADD.getSelectedItemPosition();
				INVISIBLE();
				app.pzy = 3;
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_ADD;
				vessel.ChangeBg(Constants.EYE_ADD, Constants.EYE_ADD);
				lv1.setImageResource(R.drawable.r_4);
				lv2.setImageResource(R.drawable.l_4);
				vessel.ChangeADDText();
				app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU88][rE00]");
				app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU88][lE00]");
			}else {
				app.Lr = false;
				app.position = mSpiEyeADD.getSelectedItemPosition();
				INVISIBLE();
				app.pzy = 3;
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_ADD;
				vessel.ChangeBg(Constants.EYE_ADD, Constants.EYE_ADD);
				lv1.setImageResource(R.drawable.r_1);
				lv2.setImageResource(R.drawable.l_1);
				vessel.ChangeADDText();
				app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00][rE00]");
				app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00][lE00]");
			}

			return true;
		}
	};

	@SuppressWarnings("static-access")
	public void cdc() {
		FragmentManager fm = getActivity().getSupportFragmentManager();
		FragmentRight fragmentright = (FragmentRight) fm
				.findFragmentById(R.id.frag_right);
		if (app.pdan == 0)
			fragmentright.mtv.setText(app.program0_cnt + "/7");
		if (app.pdan == 1)
			fragmentright.mtv.setText(app.program1_cnt + "/11");
		if (app.pdan == 2)
			fragmentright.mtv.setText(app.program2_cnt + "/17");
		if (app.pdan == 3)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM3.size());
		if (app.pdan == 4)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM4.size());
		if (app.pdan == 5)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM5.size());
		if (app.pdan == 6)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM6.size());
		if (app.pdan == 7)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM7.size());
		if (app.pdan == 8)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM8.size());
		if (app.pdan == 9)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM9.size());
		if (app.pdan == 10)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM10.size());
		if (app.pdan == 11)
			fragmentright.mtv.setText(jis + "/" + app.CUSTOM11.size());
	}

	public OnClickListener MyClick1 = new OnClickListener() {
		@SuppressWarnings("static-access")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (app.xzhi == false)
				app.xzhi = true;
			FragmentManager fm = getActivity().getSupportFragmentManager();
			FragmentRight fragmentright = (FragmentRight) fm
					.findFragmentById(R.id.frag_right);
//			if (app.cxyg == false) {
//				Toast.makeText(getActivity(), "请先进入程序化验光状态", Toast.LENGTH_LONG)
//						.show();
//				return;
//			}
			if (app.pdan == 0) {
//				if (a >= app.STANDARD.size()) {
//					a = 0;
//				}
//				pbshu = Integer.parseInt(app.STANDARD.get(a));
				app.program0_cnt++;
				   if(app.program0_cnt>7)
					   app.program0_cnt=7;
				   switch(app.program0_cnt){
				   case 1:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 2:
					     app.Trl = false;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 3:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 4:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 5:
					     app.Trl = true;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 6:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 7:
					     fragmentright.mll_z9.callOnClick();
					     break;
				   default:
					     break;       
				   }
				   cdc();
			}
			if (app.pdan == 1) {
//				if (a >= app.CUSTOM1.size()) {
//					a = 0;
//				}
//				pbshu = Integer.parseInt(app.CUSTOM1.get(a));
				app.program1_cnt++;
				   if(app.program1_cnt>11)
					   app.program1_cnt=11;
				   switch(app.program1_cnt){
				   case 1:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 2:
					     app.Trl = false;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 3:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 4:
					      app.Trl = false;
					     fragmentright.mll_z7.callOnClick();
					     break;
				   case 5:
					     app.Trl = false;
					     fragmentright.mll_z10.callOnClick();
					     break;
				   case 6:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 7:
					     app.Trl = true;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 8:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 9:
					    app.Trl =true;
					     fragmentright.mll_z7.callOnClick();
					     break;
				   case 10:
					     app.Trl =true;
					     fragmentright.mll_z10.callOnClick();
					     break;
				   case 11:
					     fragmentright.mll_z9.callOnClick();
					     break;
				   default:
					     break;       
				   }
				   cdc();
			}
			if (app.pdan == 2) {
//				if (a >= app.CUSTOM2.size()) {
//					a = 0;
//				}
//				pbshu = Integer.parseInt(app.CUSTOM2.get(a));
				app.program2_cnt++;
				   if(app.program2_cnt>17)
					   app.program2_cnt=17;
				   switch(app.program2_cnt){
				   case 1:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 2:
					     app.Trl = false;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 3:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					     break;
				   case 4:
					      app.Trl = false;
					     fragmentright.mll_z7.callOnClick();
					     break;
				   case 5:
					     app.Trl = false;
					     fragmentright.mll_z10.callOnClick();
					     break;
				   case 6:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 7:
					     app.Trl = true;
					     fragmentright.mll_z1.callOnClick();
					     break;
				   case 8:
					   if(app.chartor.equals("7")){
						   fragmentright.mll_e7.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_h1.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Right.callOnClick();
					   }
					     break;
				   case 9:
					    app.Trl =true;
					     fragmentright.mll_z7.callOnClick();
					     break;
				   case 10:
					     app.Trl =true;
					     fragmentright.mll_z10.callOnClick();
					     break;
				   case 11:
					     fragmentright.mll_z9.callOnClick();
					     break;
				   case 12:
					     fragmentright.mll_z8.callOnClick();
					     break;
				   case 13:
					     fragmentright.mll_z11.callOnClick();
					     break;
				   case 14:
					     fragmentright.mll_z6.callOnClick();
					     break;
				   case 15:
					     fragmentright.mll_z13.callOnClick();
					     break;
				   case 16:
					     fragmentright.mll_z5.callOnClick();
					     break;
				   case 17:
					     fragmentright.mll_z2.callOnClick();
					     break;
				   default:
					     break;       
				   }
				   cdc();
			}
			if (app.pdan == 3) {
				if (a >= app.CUSTOM3.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM3.get(a));
			}
			if (app.pdan == 4) {
				if (a >= app.CUSTOM4.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM4.get(a));
			}
			if (app.pdan == 5) {
				if (a >= app.CUSTOM5.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM5.get(a));
			}
			if (app.pdan == 6) {
				if (a >= app.CUSTOM6.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM6.get(a));
			}
			if (app.pdan == 7) {
				if (a >= app.CUSTOM7.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM7.get(a));
			}
			if (app.pdan == 8) {
				if (a >= app.CUSTOM8.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM8.get(a));
			}
			if (app.pdan == 9) {
				if (a >= app.CUSTOM9.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM9.get(a));
			}
			if (app.pdan == 10) {
				if (a >= app.CUSTOM10.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM10.get(a));
			}
			if (app.pdan == 11) {
				if (a >= app.CUSTOM11.size()) {
					a = 0;
				}
				pbshu = Integer.parseInt(app.CUSTOM11.get(a));
			}
			jis++;
			switch (pbshu) {
			case 1:
				if (fragmentright != null)
					fragmentright.mll_e1.callOnClick();
				cdc();
				break;
			case 2:
				if (fragmentright != null)
					fragmentright.mll_e2.callOnClick();
				cdc();
				break;
			case 3:
				if (fragmentright != null)
					fragmentright.mll_e3.callOnClick();
				cdc();
				break;
			case 4:
				if (fragmentright != null)
					fragmentright.mll_e4.callOnClick();
				cdc();
				break;
			case 5:
				if (fragmentright != null)
					fragmentright.mll_e5.callOnClick();
				cdc();
				break;
			case 6:
				if (fragmentright != null)
					fragmentright.mll_e6.callOnClick();
				cdc();
				break;
			case 7:
				if (fragmentright != null)
					fragmentright.mll_e7.callOnClick();
				cdc();
				break;
			case 8:
				if (fragmentright != null)
					fragmentright.mll_e8.callOnClick();
				cdc();
				break;
			case 9:
				if (fragmentright != null)
					fragmentright.mll_c1.callOnClick();
				cdc();
				break;
			case 10:
				if (fragmentright != null)
					fragmentright.mll_c2.callOnClick();
				cdc();
				break;
			case 11:
				if (fragmentright != null)
					fragmentright.mll_c3.callOnClick();
				cdc();
				break;
			case 12:
				if (fragmentright != null)
					fragmentright.mll_c4.callOnClick();
				cdc();
				break;
			case 13:
				if (fragmentright != null)
					fragmentright.mll_c5.callOnClick();
				cdc();
				break;
			case 14:
				if (fragmentright != null)
					fragmentright.mll_c6.callOnClick();
				cdc();
				break;
			case 15:
				if (fragmentright != null)
					fragmentright.mll_c7.callOnClick();
				cdc();
				break;
			case 16:
				if (fragmentright != null)
					fragmentright.mll_c8.callOnClick();
				cdc();
				break;
			case 17:
				if (fragmentright != null)
					fragmentright.mll_h1.callOnClick();
				cdc();
				break;
			case 18:
				if (fragmentright != null)
					fragmentright.mll_h2.callOnClick();
				cdc();
				break;
			case 19:
				if (fragmentright != null)
					fragmentright.mll_h3.callOnClick();
				cdc();
				break;
			case 20:
				if (fragmentright != null)
					fragmentright.mll_h4.callOnClick();
				cdc();
				break;
			case 21:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z1.callOnClick();
				break;
			case 22:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z2.callOnClick();
				break;
			case 23:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z3.callOnClick();
				break;
			case 24:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z4.callOnClick();
				break;
			case 25:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z5.callOnClick();
				break;
			case 26:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z6.callOnClick();
				break;
			case 27:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z8.callOnClick();
				break;
			case 28:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z7.callOnClick();
				break;
			case 29:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z9.callOnClick();
				break;
			case 30:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z10.callOnClick();
				break;
			case 31:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z11.callOnClick();
				break;
			case 32:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z12.callOnClick();
				break;
			case 33:
				if (fragmentright != null)
					cdc();
				fragmentright.mll_z13.callOnClick();
				break;
			default:
				break;
			}
			if (app.STANDARD.size() <= jis && app.pdan == 0) {
				jis = 0;
			}
			if (app.CUSTOM1.size() <= jis && app.pdan == 1) {
				jis = 0;
			}
			if (app.CUSTOM2.size() <= jis && app.pdan == 2) {
				jis = 0;
			}
			if (app.CUSTOM3.size() <= jis && app.pdan == 3) {
				jis = 0;
			}
			if (app.CUSTOM4.size() <= jis && app.pdan == 4) {
				jis = 0;
			}
			if (app.CUSTOM5.size() <= jis && app.pdan == 5) {
				jis = 0;
			}
			if (app.CUSTOM6.size() <= jis && app.pdan == 6) {
				jis = 0;
			}
			if (app.CUSTOM7.size() <= jis && app.pdan == 7) {
				jis = 0;
			}
			if (app.CUSTOM8.size() <= jis && app.pdan == 8) {
				jis = 0;
			}
			if (app.CUSTOM9.size() <= jis && app.pdan == 9) {
				jis = 0;
			}
			if (app.CUSTOM10.size() <= jis && app.pdan == 10) {
				jis = 0;
			}
			if (app.CUSTOM11.size() <= jis && app.pdan == 11) {
				jis = 0;
			}
			a++;
			app.xzhi = false;
		}

	};

	public void delArray_STA() {
		app.STANDARD.clear();
		mySharedPreferences = getActivity().getSharedPreferences("STANDARD",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.STANDARD.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS1() {
		app.CUSTOM1.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM1",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM1.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS2() {
		app.CUSTOM2.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM2",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM2.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS3() {
		app.CUSTOM3.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM3",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM3.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS4() {
		app.CUSTOM4.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM4",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM4.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS5() {
		app.CUSTOM5.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM5",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM5.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS6() {
		app.CUSTOM6.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM6",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM6.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS7() {
		app.CUSTOM7.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM7",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM7.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS8() {
		app.CUSTOM8.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM8",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM8.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS9() {
		app.CUSTOM9.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM9",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM9.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS10() {
		app.CUSTOM10.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM10",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM10.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	public void delArray_CUS11() {
		app.CUSTOM11.clear();
		mySharedPreferences = getActivity().getSharedPreferences("CUSTOM11",
				Activity.MODE_PRIVATE);
		int size = mySharedPreferences.getInt("optometry", 0);
		for (int i = 0; i < size; i++) {
			app.CUSTOM11.add(mySharedPreferences.getString("optometry_" + i,
					null));
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		FragmentManager fm = getActivity().getSupportFragmentManager();
		FragmentRight fragmentright = (FragmentRight) fm
				.findFragmentById(R.id.frag_right);
		switch (item.getItemId()) {
		case CONTEXT_MENU_1:
			app.pdan = 0;
			app.program0_cnt=1;
			if(app.chartor.equals("7")){
				   fragmentright.mll_e6.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("2")){
				   fragmentright.mll_c5.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
				   fragmentright.mll_c1.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }
			cdc();
			break;
		case CONTEXT_MENU_2:
			app.pdan = 1;
			//delArray_CUS1();
			app.program1_cnt=1;
			if(app.chartor.equals("7")){
				   fragmentright.mll_e6.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("2")){
				   fragmentright.mll_c5.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
				   fragmentright.mll_c1.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }
			cdc();
			break;
		case CONTEXT_MENU_3:
			app.pdan = 2;
			//delArray_CUS2();
			app.program2_cnt=1;
			if(app.chartor.equals("7")){
				   fragmentright.mll_e6.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("2")){
				   fragmentright.mll_c5.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
				   fragmentright.mll_c1.callOnClick();
				   mTxtEye_S_Left.callOnClick();
			   }
			cdc();
			break;
		case CONTEXT_MENU_4:
			app.pdan = 3;
			delArray_CUS3();
			break;
		case CONTEXT_MENU_5:
			app.pdan = 4;
			delArray_CUS4();
			break;
		case CONTEXT_MENU_6:
			app.pdan = 5;
			delArray_CUS5();
			break;
		case CONTEXT_MENU_7:
			app.pdan = 6;
			delArray_CUS6();
			break;
		case CONTEXT_MENU_8:
			app.pdan = 7;
			delArray_CUS7();
			break;
		case CONTEXT_MENU_9:
			app.pdan = 8;
			delArray_CUS8();
			break;
		case CONTEXT_MENU_10:
			app.pdan = 9;
			delArray_CUS9();
			break;
		case CONTEXT_MENU_11:
			app.pdan = 10;
			delArray_CUS10();
			break;
		case CONTEXT_MENU_12:
			app.pdan = 11;
			delArray_CUS11();
			break;
		default:
			break;
		}
		return super.onContextItemSelected(item);
	}

	
	public OnClickListener MyClick = new OnClickListener() {

		@SuppressLint("UseValueOf")
		@Override
		public void onClick(View v) {
		
		app.open++;
		if(app.open>1)
			app.open=2;
		if(app.open==2){
			if (BtAPI.ConnectState != DeviceState.DeviceConnected){
				
				if(app.language.equals("E")){
					Toast.makeText(getActivity(), "Bluetooth signal connecting。。。  If it is not reconnected for a long time,exit APP, and reenter APP", Toast.LENGTH_SHORT).show();
	              }else if(app.language.equals("C")){
	                Toast.makeText(getActivity(), "蓝牙信号正在尝试连接中。。。  如果长时间还是连接不上蓝牙,请退出APP, 和重新进入APP", Toast.LENGTH_SHORT).show(); 
	              }	
				return ;
			}
			else{
				app.BluetoothAPI.datacome.setData(false);
			}
		}

			FragmentManager fm = getActivity().getSupportFragmentManager();
			FragmentRight fragmentright = (FragmentRight) fm
					.findFragmentById(R.id.frag_right);
			switch (v.getId()) {
			case R.id.txt_title_back:
				if (app.pdan == 0) {
					if (app.STANDARD.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.STANDARD.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}
				}

				if (app.pdan == 1) {
					if (app.CUSTOM1.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM1.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 2) {
					if (app.CUSTOM2.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)

							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM2.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 3) {
					if (app.CUSTOM3.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM3.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 4) {
					if (app.CUSTOM4.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM4.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 5) {
					if (app.CUSTOM5.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM5.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 6) {
					if (app.CUSTOM6.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM6.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 7) {
					if (app.CUSTOM7.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM7.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 8) {
					if (app.CUSTOM8.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM8.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 9) {
					if (app.CUSTOM9.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM9.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 10) {
					if (app.CUSTOM10.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM10.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (app.pdan == 11) {
					if (app.CUSTOM11.size() == 0) {
						Toast.makeText(getActivity(), "请确认添加了验光数据",
								Toast.LENGTH_LONG).show();
						return;
					}
					bb++;
					if (bb == 1) {
						app.cxyg = true;
						if (fragmentright != null)
							fragmentright.mtv.setText(jis + "/"
									+ app.CUSTOM11.size());
					} else if (bb == 2) {
						app.cxyg = false;
						fragmentright.mtv.setText("");
					}

				}
				if (bb >= 2) {
					bb = 0;
				}
				break;
			case R.id.txt_eye_c_left:
				app.c_L = false;
				app.Trl = false;
				app.ackz = true;
				app.pzy = 0;
				app.z_13 = 0;
                if(app.Pfdot == false){
                      app.txtCount = Constants.EYE_L;
  					  app.txtState = Constants.EYE_C;
  					  vessel.ChangeBg(Constants.EYE_C, true);
                      lv1.setImageResource(R.drawable.iv_4);
                      lv2.setImageResource(R.drawable.iv_3);
                      vessel.ChangeSText();
                      app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
//                      app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
                      break;
                 }
				if (app.ptk == false) {
					lv_1.setVisibility(View.INVISIBLE);
					lv_2.setVisibility(View.INVISIBLE);
					lv_3.setVisibility(View.INVISIBLE);
					lv_4.setVisibility(View.INVISIBLE);
					lv.setVisibility(View.VISIBLE);
					_lv1.setVisibility(View.VISIBLE);
					_lv2.setVisibility(View.VISIBLE);
					_lv3.setVisibility(View.VISIBLE);
					if(app.er2 == false){
					app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rx%04X]", (short)(app._ccar +90)));
					}
					if(app.a_L == false){
							app.BluetoothAPI.send_command(Device.TypeBullEye,String.format
								("[rx%04X]", (short)(app._ccar+90)));
					}
					app.position = mSpiEyeC.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, true);
					iv_l_r.setImageResource(R.drawable.iv_1);
					iv_l_l.setImageResource(R.drawable.l_2);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rE11][rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB]");
				}
				if (app.ptk == true) {
					app.position = mSpiEyeC.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, true);
					iv_l_r.setImageResource(R.drawable.l_1);
					iv_l_l.setImageResource(R.drawable.l_2);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB]");
				}
				break;
			case R.id.txt_eye_c_right:
				app.c_R = false;
				app.Trl = true;
				app.ackz = true;
				app.pzy = 1;
				app.z_13 = 0;
				if(app.Pfdot == false){
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, false);
					lv1.setImageResource(R.drawable.iv_4);
					lv2.setImageResource(R.drawable.iv_3);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
//					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
					break;
				}
				if (app.ptk == true) {
					app.position = mSpiEyeC.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, false);
					iv_l_r.setImageResource(R.drawable.l_2);
					iv_l_l.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
//					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lE00]");
				} else if (app.ptk == false) {
					lv_1.setVisibility(View.VISIBLE);
					lv_2.setVisibility(View.VISIBLE);
					lv_3.setVisibility(View.VISIBLE);
					lv_4.setVisibility(View.VISIBLE);
					lv.setVisibility(View.INVISIBLE);
					_lv1.setVisibility(View.INVISIBLE);
					_lv2.setVisibility(View.INVISIBLE);
					_lv3.setVisibility(View.INVISIBLE);
					if(app.er2 == false){
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lx%04X]", (short)(app._ccal + 90)));
						
					}
					if(app.a_R == false){
							app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lx%04X]", (short)(app._ccal+90)));
							
					}
					app.position = mSpiEyeC.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_C;
					vessel.ChangeBg(Constants.EYE_C, false);
					iv_l_r.setImageResource(R.drawable.l_2);
					iv_l_l.setImageResource(R.drawable.iv_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lE11][lU00]");
				}
				break;
			case R.id.txt_eye_a_left:
				app.a_L = false;
				app.Trl = false;
				app.ackz = false;
				app.czypt = false;
				/////////////////////////////////////////
				if(app.Pfdot == false){
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, true);
					lv1.setImageResource(R.drawable.iv_4);
					lv2.setImageResource(R.drawable.iv_3);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					break;
				}
				//////////////////////////////////////////
				if (app.kzp != 0 && app.pzy != 0) {
					app.pzy = 0;
				}
				app.z_13 = 0;
				app.position = mSpiEyeA.getSelectedItemPosition();
				if (app.pzy == 0 || app.pzy == 5) {
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, true);
					if (app.ptk == true) {
						iv_l_l.setImageResource(R.drawable.l_2);
						iv_l_r.setImageResource(R.drawable.l_1);
						vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rU00]");
					} else if (app.ptk == false) {
						lv_1.setVisibility(View.INVISIBLE);
						lv_2.setVisibility(View.INVISIBLE);
						lv_3.setVisibility(View.INVISIBLE);
						lv_4.setVisibility(View.INVISIBLE);
						lv.setVisibility(View.VISIBLE);
						_lv1.setVisibility(View.VISIBLE);
						_lv2.setVisibility(View.VISIBLE);
						_lv3.setVisibility(View.VISIBLE);
						if(app.c_L == false){
							app.BluetoothAPI.send_command(Device.TypeBullEye,String.format
									("[rx%04X]", (short)(app._ccar)));
						}
						vessel.ChangeSText();
						iv_l_l.setImageResource(R.drawable.l_2);
						iv_l_r.setImageResource(R.drawable.iv_1);
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rE11][rU00]");
				}
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB]");
			}
				if (app.pzy == 1) {
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, true);
					if (app.ptk == true) {
						iv_l_r.setImageResource(R.drawable.l_2);
						iv_l_l.setImageResource(R.drawable.l_1);
						vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[lU00]");
					} else if (app.ptk == false) {
						lv_1.setVisibility(View.INVISIBLE);
						lv_2.setVisibility(View.INVISIBLE);
						lv_3.setVisibility(View.INVISIBLE);
						lv_4.setVisibility(View.INVISIBLE);
						lv.setVisibility(View.VISIBLE);
						_lv1.setVisibility(View.VISIBLE);
						_lv2.setVisibility(View.VISIBLE);
						_lv3.setVisibility(View.VISIBLE);
						if(app.c_L == false){
							app.BluetoothAPI.send_command(Device.TypeBullEye,String.format
									("[lx%04X]", (short)(app._ccal)));
						}
						iv_l_r.setImageResource(R.drawable.l_2);
						iv_l_l.setImageResource(R.drawable.iv_1);
						vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[lE11][lU00]");
					}
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
				}

				if (app.kzp == 0)
					app.kzp = 5;
				break;
			case R.id.txt_eye_a_right:
				app.a_R = false;
				app.Trl = true;
				app.ackz = false;
				app.czypt = false;
				app.pzy = 1;
				app.z_13 = 0;
				if(app.Pfdot == false){
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, false);
					lv1.setImageResource(R.drawable.iv_4);
					lv2.setImageResource(R.drawable.iv_3);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					break;
				}
				
				if (app.ptk == true) {
					app.position = mSpiEyeA.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, false);
					iv_l_r.setImageResource(R.drawable.l_2);
					iv_l_l.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				} else if (app.ptk == false) {
					lv_1.setVisibility(View.VISIBLE);
					lv_2.setVisibility(View.VISIBLE);
					lv_3.setVisibility(View.VISIBLE);
					lv_4.setVisibility(View.VISIBLE);
					lv.setVisibility(View.INVISIBLE);
					_lv1.setVisibility(View.INVISIBLE);
					_lv2.setVisibility(View.INVISIBLE);
					_lv3.setVisibility(View.INVISIBLE);
					if(app.c_R == false){
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format
								("[lx%04X]", (short)(app._ccal)));
					}
					app.position = mSpiEyeA.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_A;
					vessel.ChangeBg(Constants.EYE_A, false);
					iv_l_r.setImageResource(R.drawable.l_2);
					iv_l_l.setImageResource(R.drawable.iv_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lE11][lU00]");
				}
				break;
			case R.id.txt_eye_h_left:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.Lr = false;
				yanc();
				app.Trl = false;
	if (app.z_13 != 13){
		if (app.z_13 != 8){
			if (app.z_13 != 7){
				if (app.z_13 != 6) {
					if (app.z_13 != 5) {
						if (app.z_13 != 4) {
							if (app.z_13 != 2){
								if (app.z_13 != 1){
									app.pzy = 0;
									app.position = mSpiEyeH.getSelectedItemPosition();
									app.txtCount = Constants.EYE_L;
									app.txtState = Constants.EYE_H;
									vessel.ChangeBg(Constants.EYE_H, true);
									iv_l_r.setImageResource(R.drawable.l_1);
									iv_l_l.setImageResource(R.drawable.l_2);
									//vessel.ChangeSText();
									vessel.ChangeXText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU00]");
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[lUBB]");
								}else if(app.z_13 == 1){
									app.pzy = 0;
									app.position = mSpiEyeH.getSelectedItemPosition();
									app.txtCount = Constants.EYE_L;
									app.txtState = Constants.EYE_H;
									vessel.ChangeBg(Constants.EYE_H, true);
									iv_l_l.setImageResource(R.drawable.iv_6);
									iv_l_r.setImageResource(R.drawable.iv_5);
									//vessel.ChangeSText();
									vessel.ChangeXText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU77][lU77]");
								}
							}else if(app.z_13 == 2){
								app.pzy = 0;
								app.position = mSpiEyeH.getSelectedItemPosition();
								app.txtCount = Constants.EYE_L;
								app.txtState = Constants.EYE_H;
								vessel.ChangeBg(Constants.EYE_H, true);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								//vessel.ChangeSText();
								vessel.ChangeXText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 4) {
							app.pzy = 0;
							app.position = mSpiEyeH.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_H;
							vessel.ChangeBg(Constants.EYE_H, true);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							//vessel.ChangeSText();
							vessel.ChangeXText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}
					} else if (app.z_13 == 5) {
						app.pzy = 0;
						app.position = mSpiEyeH.getSelectedItemPosition();
						app.txtCount = Constants.EYE_L;
						app.txtState = Constants.EYE_H;
						vessel.ChangeBg(Constants.EYE_H, true);
						iv_l_l.setImageResource(R.drawable.iv_3);
						iv_l_r.setImageResource(R.drawable.iv_4);
						//vessel.ChangeSText();
						vessel.ChangeXText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					}
				} else if (app.z_13 == 6) {
					app.pzy = 0;
					app.position = mSpiEyeH.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_H;
					vessel.ChangeBg(Constants.EYE_H, true);
					vessel.ChangeXText();
					//vessel.ChangeSText();
				}
			}else if(app.z_13 == 7){
				app.pzy = 0;
				app.position = mSpiEyeH.getSelectedItemPosition();
				app.txtCount = Constants.EYE_L;
				app.txtState = Constants.EYE_H;
				vessel.ChangeBg(Constants.EYE_H, true);
				iv_l_l.setImageResource(R.drawable.iv_3);
				iv_l_r.setImageResource(R.drawable.iv_4);
				vessel.ChangeXText();
				//vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
			}
		}else if(app.z_13 == 8){
			app.pzy = 0;
			app.position = mSpiEyeH.getSelectedItemPosition();
			app.txtCount = Constants.EYE_L;
			app.txtState = Constants.EYE_H;
			vessel.ChangeBg(Constants.EYE_H, true);
			iv_l_l.setImageResource(R.drawable.iv_6);
			iv_l_r.setImageResource(R.drawable.iv_5);
			vessel.ChangeXText();
			//vessel.ChangeSText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rU77][lU77]");
		}
	}else if(app.z_13 == 13){
		app.pzy = 0;
		app.position = mSpiEyeH.getSelectedItemPosition();
		app.txtCount = Constants.EYE_L;
		app.txtState = Constants.EYE_H;
		vessel.ChangeBg(Constants.EYE_H, true);
		iv_l_l.setImageResource(R.drawable.r_1);
		iv_l_r.setImageResource(R.drawable.r_3);
		vessel.ChangeXText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
	}
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[rE77]");
				break;
			case R.id.txt_eye_h_right:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.Lr = false;
				yanc();
				app.Trl = true;
    if (app.z_13 != 13){
		if (app.z_13 != 8) {
			if (app.z_13 != 7) {
				if (app.z_13 != 6) {
					if (app.z_13 != 5) {
						if (app.z_13 != 4) {
							if (app.z_13 != 2){
								if (app.z_13 != 1){
									app.pzy = 1;
									app.position = mSpiEyeH.getSelectedItemPosition();
									app.txtCount = Constants.EYE_R;
									app.txtState = Constants.EYE_H;
									vessel.ChangeBg(Constants.EYE_H, false);
									iv_l_r.setImageResource(R.drawable.l_2);
									iv_l_l.setImageResource(R.drawable.l_1);
									vessel.ChangeXText();
									//vessel.ChangeSText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rUBB]");
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[lU00]");
								}else if(app.z_13 == 1){
									app.pzy = 1;
									app.position = mSpiEyeH.getSelectedItemPosition();
									app.txtCount = Constants.EYE_R;
									app.txtState = Constants.EYE_H;
									vessel.ChangeBg(Constants.EYE_H, false);
									iv_l_l.setImageResource(R.drawable.iv_6);
									iv_l_r.setImageResource(R.drawable.iv_5);
									vessel.ChangeXText();
									//vessel.ChangeSText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU77][lU77]");
								}
							}else if(app.z_13 == 2){
								app.pzy = 1;
								app.position = mSpiEyeH.getSelectedItemPosition();
								app.txtCount = Constants.EYE_R;
								app.txtState = Constants.EYE_H;
								vessel.ChangeBg(Constants.EYE_H, false);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								vessel.ChangeXText();
								//vessel.ChangeSText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 4) {
							app.pzy = 1;
							app.position = mSpiEyeH.getSelectedItemPosition();
							app.txtCount = Constants.EYE_R;
							app.txtState = Constants.EYE_H;
							vessel.ChangeBg(Constants.EYE_H, false);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							vessel.ChangeXText();
							//vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						  }
						} else if (app.z_13 == 5) {
							app.pzy = 1;
							app.position = mSpiEyeH.getSelectedItemPosition();
							app.txtCount = Constants.EYE_R;
							app.txtState = Constants.EYE_H;
							vessel.ChangeBg(Constants.EYE_H, false);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							vessel.ChangeXText();
							//vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}
				} else if (app.z_13 == 6) {
					app.pzy = 1;
					app.position = mSpiEyeH.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_H;
					vessel.ChangeBg(Constants.EYE_H, false);
					vessel.ChangeXText();
					//vessel.ChangeSText();
				}
			}else if(app.z_13 == 7){
				app.pzy = 1;
				app.position = mSpiEyeH.getSelectedItemPosition();
				app.txtCount = Constants.EYE_R;
				app.txtState = Constants.EYE_H;
				vessel.ChangeBg(Constants.EYE_H, false);
				iv_l_l.setImageResource(R.drawable.iv_3);
				iv_l_r.setImageResource(R.drawable.iv_4);
				vessel.ChangeXText();
				//vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
			}
		}else if(app.z_13 == 8){
			app.pzy = 1;
			app.position = mSpiEyeH.getSelectedItemPosition();
			app.txtCount = Constants.EYE_R;
			app.txtState = Constants.EYE_H;
			vessel.ChangeBg(Constants.EYE_H, false);
			iv_l_l.setImageResource(R.drawable.iv_6);
			iv_l_r.setImageResource(R.drawable.iv_5);
			vessel.ChangeXText();
			//vessel.ChangeSText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rU77][lU77]");
		}
    }else if(app.z_13 == 13){
    	app.pzy = 1;
		app.position = mSpiEyeH.getSelectedItemPosition();
		app.txtCount = Constants.EYE_R;
		app.txtState = Constants.EYE_H;
		vessel.ChangeBg(Constants.EYE_H, false);
		iv_l_l.setImageResource(R.drawable.r_1);
		iv_l_r.setImageResource(R.drawable.r_3);
		vessel.ChangeXText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
    }
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[lE77]");
				break;
			case R.id.txt_eye_v_left:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.Lr = false;
				yanc();
				app.Trl = false;
   if (app.z_13 != 12){
		if (app.z_13 != 8){
			if (app.z_13 != 7){
				if (app.z_13 != 6) {
					if (app.z_13 != 5) {
						if (app.z_13 != 4) {
							if (app.z_13 != 2){
								if (app.z_13 != 1){
									app.pzy = 0;
									app.position = mSpiEyeV.getSelectedItemPosition();
									app.txtCount = Constants.EYE_L;
									app.txtState = Constants.EYE_V;
									vessel.ChangeBg(Constants.EYE_V, true);
									iv_l_r.setImageResource(R.drawable.l_1);
									iv_l_l.setImageResource(R.drawable.l_2);
									//vessel.ChangeSText();
									vessel.ChangeYText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU00]");
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[lUBB]");
								}else if(app.z_13 == 1){
									app.pzy = 0;
									app.position = mSpiEyeV.getSelectedItemPosition();
									app.txtCount = Constants.EYE_L;
									app.txtState = Constants.EYE_V;
									vessel.ChangeBg(Constants.EYE_V, true);
									iv_l_l.setImageResource(R.drawable.iv_6);
									iv_l_r.setImageResource(R.drawable.iv_5);
									//vessel.ChangeSText();
									vessel.ChangeYText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU77][lU77]");
								}
							}else if(app.z_13 == 2){
								app.pzy = 0;
								app.position = mSpiEyeV.getSelectedItemPosition();
								app.txtCount = Constants.EYE_L;
								app.txtState = Constants.EYE_V;
								vessel.ChangeBg(Constants.EYE_V, true);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								//vessel.ChangeSText();
								vessel.ChangeYText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 4) {
							app.pzy = 0;
							app.position = mSpiEyeV.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_V;
							vessel.ChangeBg(Constants.EYE_V, true);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							//vessel.ChangeSText();
							vessel.ChangeYText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}
					} else if (app.z_13 == 5) {
						app.pzy = 0;
						app.position = mSpiEyeV.getSelectedItemPosition();
						app.txtCount = Constants.EYE_L;
						app.txtState = Constants.EYE_V;
						vessel.ChangeBg(Constants.EYE_V, true);
						iv_l_l.setImageResource(R.drawable.iv_3);
						iv_l_r.setImageResource(R.drawable.iv_4);
						//vessel.ChangeSText();
						vessel.ChangeYText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");

					}
				} else if (app.z_13 == 6) {
					app.pzy = 0;
					app.position = mSpiEyeV.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_V;
					vessel.ChangeBg(Constants.EYE_V, true);
					vessel.ChangeYText();
					//vessel.ChangeSText();
				}
			}else if(app.z_13 == 7){
				app.pzy = 0;
				app.position = mSpiEyeV.getSelectedItemPosition();
				app.txtCount = Constants.EYE_L;
				app.txtState = Constants.EYE_V;
				vessel.ChangeBg(Constants.EYE_V, true);
				iv_l_l.setImageResource(R.drawable.iv_3);
				iv_l_r.setImageResource(R.drawable.iv_4);
				vessel.ChangeYText();
				//vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
			}
		}else if(app.z_13 == 8) {
			app.pzy = 0;
			app.position = mSpiEyeV.getSelectedItemPosition();
			app.txtCount = Constants.EYE_L;
			app.txtState = Constants.EYE_V;
			vessel.ChangeBg(Constants.EYE_V, true);
			iv_l_l.setImageResource(R.drawable.iv_6);
			iv_l_r.setImageResource(R.drawable.iv_5);
			vessel.ChangeYText();
			//vessel.ChangeSText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rU77][lU77]");
		}
   }else if(app.z_13 == 12) {
	    app.pzy = 0;
	    app.position = mSpiEyeV.getSelectedItemPosition();
	    app.txtCount = Constants.EYE_L;
		app.txtState = Constants.EYE_V;
		vessel.ChangeBg(Constants.EYE_V, true);
		iv_l_l.setImageResource(R.drawable.l_3);
		iv_l_r.setImageResource(R.drawable.l_1);
		vessel.ChangeYText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
   }
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[rE77]");
				break;
			case R.id.txt_eye_v_right:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.Lr = false;
				yanc();
				app.Trl = true;
  if (app.z_13 != 12){
		if (app.z_13 != 8){
			if (app.z_13 != 7){
				if (app.z_13 != 6) {
					if (app.z_13 != 5) {
						if (app.z_13 != 4) {
							if (app.z_13 != 2){
								if (app.z_13 != 1){
									app.pzy = 1;
									app.position = mSpiEyeV.getSelectedItemPosition();
									app.txtCount = Constants.EYE_R;
									app.txtState = Constants.EYE_V;
									vessel.ChangeBg(Constants.EYE_V, false);
									iv_l_r.setImageResource(R.drawable.l_2);
									iv_l_l.setImageResource(R.drawable.l_1);
									vessel.ChangeYText();
									//vessel.ChangeSText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rUBB]");
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[lU00]");
								}else if(app.z_13 == 1){
									app.pzy = 1;
									app.position = mSpiEyeV.getSelectedItemPosition();
									app.txtCount = Constants.EYE_R;
									app.txtState = Constants.EYE_V;
									vessel.ChangeBg(Constants.EYE_V, false);
									iv_l_l.setImageResource(R.drawable.iv_6);
									iv_l_r.setImageResource(R.drawable.iv_5);
									vessel.ChangeYText();
									//vessel.ChangeSText();
									app.BluetoothAPI.send_command(Device.TypeBullEye,
											"[rU77][lU77]");
								}
							}else if(app.z_13 == 2){
								app.pzy = 1;
								app.position = mSpiEyeV.getSelectedItemPosition();
								app.txtCount = Constants.EYE_R;
								app.txtState = Constants.EYE_V;
								vessel.ChangeBg(Constants.EYE_V, false);
								iv_l_l.setImageResource(R.drawable.iv_3);
								iv_l_r.setImageResource(R.drawable.iv_4);
								vessel.ChangeYText();
								//vessel.ChangeSText();
								app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
							}
						} else if (app.z_13 == 4) {
							app.pzy = 1;
							app.position = mSpiEyeV.getSelectedItemPosition();
							app.txtCount = Constants.EYE_R;
							app.txtState = Constants.EYE_V;
							vessel.ChangeBg(Constants.EYE_V, false);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							vessel.ChangeYText();
							//vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}
					} else if (app.z_13 == 5) {
						app.pzy = 1;
						app.position = mSpiEyeV.getSelectedItemPosition();
						app.txtCount = Constants.EYE_R;
						app.txtState = Constants.EYE_V;
						vessel.ChangeBg(Constants.EYE_V, false);
						iv_l_l.setImageResource(R.drawable.iv_3);
						iv_l_r.setImageResource(R.drawable.iv_4);
						vessel.ChangeYText();
						//vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					}
				} else if (app.z_13 == 6) {
					app.pzy = 1;
					app.position = mSpiEyeV.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_V;
					vessel.ChangeBg(Constants.EYE_V, false);
					vessel.ChangeYText();
					//vessel.ChangeSText();
				}
			}else if(app.z_13 == 7){
				app.pzy = 1;
				app.position = mSpiEyeV.getSelectedItemPosition();
				app.txtCount = Constants.EYE_R;
				app.txtState = Constants.EYE_V;
				vessel.ChangeBg(Constants.EYE_V, false);
				iv_l_l.setImageResource(R.drawable.iv_3);
				iv_l_r.setImageResource(R.drawable.iv_4);
				vessel.ChangeYText();
				//vessel.ChangeSText();
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
			}	
		}else if(app.z_13 == 8){
			app.pzy = 1;
			app.position = mSpiEyeV.getSelectedItemPosition();
			app.txtCount = Constants.EYE_R;
			app.txtState = Constants.EYE_V;
			vessel.ChangeBg(Constants.EYE_V, false);
			iv_l_l.setImageResource(R.drawable.iv_6);
			iv_l_r.setImageResource(R.drawable.iv_5);
			vessel.ChangeYText();
			//vessel.ChangeSText();
			app.BluetoothAPI.send_command(Device.TypeBullEye,
					"[rU77][lU77]");
		}
  }else if(app.z_13 == 12){
	    app.pzy = 1;
	    app.position = mSpiEyeV.getSelectedItemPosition();
	    app.txtCount = Constants.EYE_R;
		app.txtState = Constants.EYE_V;
		vessel.ChangeBg(Constants.EYE_V, false);
		iv_l_l.setImageResource(R.drawable.l_3);
		iv_l_r.setImageResource(R.drawable.l_1);
		vessel.ChangeYText();
		app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
  }
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						"[lE77]");
				break;
			case R.id.txt_eye_add_left:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.pzy = 0;
				//app.z_13 = 0;
				app.Lr = false;
				yanc();
				if(app.z_13 == 3){
					app.Trl = false;
					app.position = mSpiEyeADD.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_ADD;
					vessel.ChangeBg(Constants.EYE_ADD, true);
					iv_l_r.setImageResource(R.drawable.r_4);
					iv_l_l.setImageResource(R.drawable.l_2);
					vessel.ChangeADDText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU88][rE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB][lE00]");
				}else{
					app.Trl = false;
					app.position = mSpiEyeADD.getSelectedItemPosition();
					app.txtCount = Constants.EYE_L;
					app.txtState = Constants.EYE_ADD;
					vessel.ChangeBg(Constants.EYE_ADD, true);
					iv_l_r.setImageResource(R.drawable.l_1);
					iv_l_l.setImageResource(R.drawable.l_2);
					vessel.ChangeADDText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00][rE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB][lE00]");
				}
//				app.Trl = false;
//				app.position = mSpiEyeADD.getSelectedItemPosition();
//				app.txtCount = Constants.EYE_L;
//				app.txtState = Constants.EYE_ADD;
//				vessel.ChangeBg(Constants.EYE_ADD, true);
//				iv_l_r.setImageResource(R.drawable.l_1);
//				iv_l_l.setImageResource(R.drawable.l_2);
//				vessel.ChangeADDText();
//				app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00][rE00]");
//				app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB][lE00");
				break;
			case R.id.txt_eye_add_right:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				app.ptk = true;
				app.pzy = 1;
				//app.z_13 = 0;
				app.Lr = true;
				yanc();
				if(app.z_13 == 3){
					app.Trl = true;
					app.position = mSpiEyeADD.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_ADD;
					vessel.ChangeBg(Constants.EYE_ADD, false);
					iv_l_r.setImageResource(R.drawable.r_2);
					iv_l_l.setImageResource(R.drawable.l_4);
					vessel.ChangeADDText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB][rE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU88][lE00]");
				}else{
					app.Trl = true;
					app.position = mSpiEyeADD.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_ADD;
					vessel.ChangeBg(Constants.EYE_ADD, false);
					iv_l_r.setImageResource(R.drawable.l_2);
					iv_l_l.setImageResource(R.drawable.l_1);
					vessel.ChangeADDText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB][rE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00][lE00]");
				}
//				app.Trl = true;
//				app.position = mSpiEyeADD.getSelectedItemPosition();
//				app.txtCount = Constants.EYE_R;
//				app.txtState = Constants.EYE_ADD;
//				vessel.ChangeBg(Constants.EYE_ADD, false);
//				iv_l_r.setImageResource(R.drawable.l_2);
//				iv_l_l.setImageResource(R.drawable.l_1);
//				vessel.ChangeADDText();
//				app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
//				app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				break;
			case R.id.txt_eye_s_left:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.Lr = false;
				app.fwshuj = true;
				app.ptk = true;

				if (app.kzp != 0 && app.pzy != 0) {
					app.pzy = 0;
				}
				yanc();
				app.Trl = false;
				app.position = mSpiEyeS.getSelectedItemPosition();
				if (app.pzy == 0 || app.pzy == 5) {          
					if (app.ptk == true) {
						if (app.z_13 == 3) {
							app.position = mSpiEyeS.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_r.setImageResource(R.drawable.r_4);
							iv_l_l.setImageResource(R.drawable.l_2);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU88]");
							app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB]");
						}else if((app.z_13 == 2)||(app.z_13 == 4)||(app.z_13 == 5)||(app.z_13 == 7)){
							app.position = mSpiEyeS.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}else if((app.z_13 == 1) ||(app.z_13 == 8)){
							app.position = mSpiEyeS.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_l.setImageResource(R.drawable.iv_6);
							iv_l_r.setImageResource(R.drawable.iv_5);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
						}else if(app.z_13 == 11){
                            ///////////////////////////////////////
							app.position = mSpiEyeS.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_l.setImageResource(R.drawable.r_1);
							iv_l_r.setImageResource(R.drawable.r_3);
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
							/////////////////////////////////////
						}else if(app.z_13 == 12){
					        app.position = mSpiEyeS.getSelectedItemPosition();
					        app.txtCount = Constants.EYE_L;
					        app.txtState = Constants.EYE_S;
					        vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_l.setImageResource(R.drawable.l_3);
							iv_l_r.setImageResource(R.drawable.l_1);
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
						}else if(app.z_13 == 16 || app.z_13 == 19){
							app.position = mSpiEyeS.getSelectedItemPosition();
					        app.txtCount = Constants.EYE_L;
					        app.txtState = Constants.EYE_S;
					        vessel.ChangeBg(Constants.EYE_S, true);
					        iv_l_l.setImageResource(R.drawable.iv_3);
							iv_l_r.setImageResource(R.drawable.iv_4);
							app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
						}else{
							app.position = mSpiEyeS.getSelectedItemPosition();
							app.txtCount = Constants.EYE_L;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, true);
							iv_l_r.setImageResource(R.drawable.r_1);
							iv_l_l.setImageResource(R.drawable.l_2);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
							app.BluetoothAPI.send_command(Device.TypeBullEye, "[lUBB]");
						}
						//////////////////////////////////////////////////////////
					} else {
						app.txtCount = Constants.EYE_D;
						app.txtState = Constants.EYE_S;
						vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
						iv_l_r.setImageResource(R.drawable.r_4);
						iv_l_l.setImageResource(R.drawable.l_4);
						vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rU88]");
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[lU88]");
						app.ptk = true;
					}
				}
				if (app.pzy == 1) {              
					if (app.ptk == true) {
						if (app.z_13 != 3) {
							app.txtCount = Constants.EYE_R;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, false);
							iv_l_l.setImageResource(R.drawable.l_1);
							iv_l_r.setImageResource(R.drawable.r_2);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[lU00]");
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[rUBB]");
						} else if (app.z_13 == 3) {
							app.txtCount = Constants.EYE_R;
							app.txtState = Constants.EYE_S;
							vessel.ChangeBg(Constants.EYE_S, false);
							iv_l_l.setImageResource(R.drawable.l_4);
							iv_l_r.setImageResource(R.drawable.r_2);
							vessel.ChangeSText();
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[lU88]");
							app.BluetoothAPI.send_command(Device.TypeBullEye,
									"[rUBB]");
						}
					} else {
						vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
						iv_l_l.setImageResource(R.drawable.l_4);
						iv_l_r.setImageResource(R.drawable.r_4);
						vessel.ChangeSText();
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[lU88]");
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								"[rU88]");
						app.ptk = true;
					}
				}
				if (app.pzy == 3) {
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
					iv_l_l.setImageResource(R.drawable.l_1);
					iv_l_r.setImageResource(R.drawable.r_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
					app.pzy = 5;
				}
				if (app.kzp == 0)
					app.kzp = 5;
				break;
			case R.id.txt_eye_s_right:
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.Lr = false;
				app.fwshuj = true;
				app.ptk = true;
				yanc();
				app.Trl = true;

				if (app.z_13 == 3) {
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_r.setImageResource(R.drawable.r_2);
					iv_l_l.setImageResource(R.drawable.l_4);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU88]");
				}else if((app.z_13 == 2)||(app.z_13 == 4)||(app.z_13 == 5)||(app.z_13 == 7)){
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_l.setImageResource(R.drawable.iv_3);
					iv_l_r.setImageResource(R.drawable.iv_4);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
				}else if((app.z_13 == 1) ||(app.z_13 == 8)){
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_l.setImageResource(R.drawable.iv_6);
					iv_l_r.setImageResource(R.drawable.iv_5);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
				}else if(app.z_13 == 11){
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
			        iv_l_l.setImageResource(R.drawable.r_1);
			        iv_l_r.setImageResource(R.drawable.r_3);
			        app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU66][lU00]");
			        /////////////////////////////////////
				}else if(app.z_13 == 12){
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_l.setImageResource(R.drawable.l_3);
					iv_l_r.setImageResource(R.drawable.l_1);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU00][lU66]");
				}else if(app.z_13 == 16 || app.z_13 == 19){
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_l.setImageResource(R.drawable.iv_3);
					iv_l_r.setImageResource(R.drawable.iv_4);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
				}else{
					app.pzy = 1;
					app.position = mSpiEyeS.getSelectedItemPosition();
					app.txtCount = Constants.EYE_R;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, false);
					iv_l_r.setImageResource(R.drawable.r_2);
					iv_l_l.setImageResource(R.drawable.l_1);
					vessel.ChangeSText();
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB]");
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU00]");
				}
				///////////////////////////////////////////////////////////////////////
				break;


			case R.id.txt_title_chufang:
				double PD = 0;
				double PD_L = 0;
				double PD_R = 0;
				
              if(app.BluetoothAPI._devBull.Mac.equals("")){
            	Toast.makeText(getActivity(), "请确定是否链接蓝牙设备", Toast.LENGTH_SHORT).show();
            	return;
              }
              
              if(app.language.equals("E")){
            	  app.BluetoothAPI.show_dialog("", "Wait......If the time is long,Please touch the panel exit key.Exit!");
              }else if(app.language.equals("C")){
            	  app.BluetoothAPI.show_dialog("", "等待客观数据......若一直没有客观数据，建议按平板的返回键，退出！");
              }
              wait_mss(120);
			  app.BluetoothAPI.read_refractor();
			  wait_mss(120);
			  
			    String[] strArray1 = null;
				strArray1 = app.BluetoothAPI.StrReceive.split("E");
				int eyeCount_1 = strArray1.length;
				if(eyeCount_1==2)
				{
					if(app.language.equals("E")){
		            	  app.BluetoothAPI.show_dialog("", "Please press the OBJ button, next press the optical instrument print button.");
		              }else if(app.language.equals("C")){
		            	  app.BluetoothAPI.show_dialog("", "请按客观处方键，再次按验光仪打印键，重新传数据！");
		              }
		              wait_mss(120);
					  app.BluetoothAPI.read_refractor();
					  wait_mss(1200);
					  wait_mss(1200);
					  wait_mss(1200);
				}
				wait_mss(120);
				app.BluetoothAPI.close_dialog();
				
				String[] strArray = null;
				strArray = app.BluetoothAPI.StrReceive.split("E");
				int eyeCount = strArray.length;
				String[] eyeDataArray = null;
				
				String eyeDataArray_0;
				String eyeDataArray_1;
				String eyeDataArray_2;
				String eyeDataArray_3;
				String eyeDataArray_4;
				
				if (eyeCount == 2) {
					eyeDataArray_0 =strArray[1].substring(0, 5);
					eyeDataArray_1 =strArray[1].substring(6, 12);
					eyeDataArray_2 =strArray[1].substring(13, 19);
					if(eyeDataArray_2.equals("+00.00"))
						eyeDataArray_2 = "00.00";
					else if(eyeDataArray_2.equals("-00.00"))
						eyeDataArray_2 = "00.00";
					
					if((strArray[1].substring(21,22).equals(" ")))
						eyeDataArray_3 = strArray[1].substring(23, 24);
					else if((strArray[1].substring(21,22).equals("+")))
						eyeDataArray_3  = strArray[1].substring(22, 24);
					else 
					{
						if((strArray[1].substring(21,22).equals("0")) && (strArray[1].substring(22,23).equals("0")) && (strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3 =  "0";
						else if((strArray[1].substring(21,22).equals("0")) && (strArray[1].substring(22,23).equals("0")) && (!strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(23, 24);
						else if((strArray[1].substring(21,22).equals("0")) && (!strArray[1].substring(22,23).equals("0"))&& (strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(22, 24);
						else if((strArray[1].substring(21,22).equals("0")) && (!strArray[1].substring(22,23).equals("0")) && (!strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(22, 24);
						else
							eyeDataArray_3  = strArray[1].substring(21, 24);
					}
					
					if((strArray[1].substring(25,27).equals("  ")))
					    eyeDataArray_4  = "64";
					else
						eyeDataArray_4  = strArray[1].substring(25,27);

					if (eyeDataArray_0.equals("S-R-R")){
						app.txtCount = Constants.EYE_L;
						app.txtState = Constants.EYE_S;
						vessel.ChangeBg(Constants.EYE_S, true);
						mTxtEye_S_Left.setText(eyeDataArray_1);
						mTxtEye_C_Left.setText(eyeDataArray_2);
						mTxtEye_A_Left.setText(eyeDataArray_3);
						refractor_Data(eyeDataArray_1,"S","R");//20160920 changed
						refractor_Data(eyeDataArray_2,"C","R");//20160920 changed
						refractor_Data(eyeDataArray_3,"A","R");//20160920 changed
						
						app.dcils_s_r1=eyeDataArray_1;
						app.dcils_s_r2=eyeDataArray_2;
						app.dcils_s_r3=eyeDataArray_3;
						app.OnRightRMK = true;
					} else if (eyeDataArray_0.equals("S-R-L")) {
//						app.dcils_s_l = null;
						app.txtCount = Constants.EYE_R;
						app.txtState = Constants.EYE_S;
						vessel.ChangeBg(Constants.EYE_S, false);
//						app.dcils_s_l = eyeDataArray;
						/////////////////////////////////////////////
						mTxtEye_S_Right.setText(eyeDataArray_1);
						mTxtEye_C_Right.setText(eyeDataArray_2);
						mTxtEye_A_Right.setText(eyeDataArray_3);
						refractor_Data(eyeDataArray_1,"S","L");
						refractor_Data(eyeDataArray_2,"C","L");
						refractor_Data(eyeDataArray_3,"A","L");
						
						app.dcils_s_l1=eyeDataArray_1;
						app.dcils_s_l2=eyeDataArray_2;
						app.dcils_s_l3=eyeDataArray_3;
						
						app.OnLeftRMK = true;
					}
				} else if ((eyeCount == 3) || (eyeCount == 5)) {
//					String eyeDataArray_0;
//					String eyeDataArray_1;
//					String eyeDataArray_2;
//					String eyeDataArray_3;
//					String eyeDataArray_4;
					app.dcils_s_l = null;
					app.dcils_s_r = null;
					app.txtCount = Constants.EYE_D;
					app.txtState = Constants.EYE_S;
					vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
					//////////////////////////////////////////////////////////////////////
					eyeDataArray_0 =strArray[1].substring(0, 5);
					eyeDataArray_1 =strArray[1].substring(6, 12);
					eyeDataArray_2 =strArray[1].substring(13, 19);
					if(eyeDataArray_2.equals("+00.00"))
						eyeDataArray_2 = "00.00";
					else if(eyeDataArray_2.equals("-00.00"))
						eyeDataArray_2 = "00.00";
					
					if((strArray[1].substring(21,22).equals(" ")))
						eyeDataArray_3 = strArray[1].substring(23, 24);
					else if((strArray[1].substring(21,22).equals("+")))
						eyeDataArray_3  = strArray[1].substring(22, 24);
					else {
						if((strArray[1].substring(21,22).equals("0")) && (strArray[1].substring(22,23).equals("0")) && (strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3 =  "0";
						else if((strArray[1].substring(21,22).equals("0")) && (strArray[1].substring(22,23).equals("0")) && (!strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(23, 24);
						else if((strArray[1].substring(21,22).equals("0")) && (!strArray[1].substring(22,23).equals("0"))&& (strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(22, 24);
						else if((strArray[1].substring(21,22).equals("0")) && (!strArray[1].substring(22,23).equals("0")) && (!strArray[1].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[1].substring(22, 24);
						else
							eyeDataArray_3  = strArray[1].substring(21, 24);
					}
//						eyeDataArray_3  = strArray[1].substring(21, 24);
					
					if((strArray[1].substring(25,27).equals("  ")))
					    eyeDataArray_4  = "64";
					else
						eyeDataArray_4  = strArray[1].substring(25,27);
					
					mTxtEye_S_Left.setText(eyeDataArray_1);
					mTxtEye_C_Left.setText(eyeDataArray_2);
					mTxtEye_A_Left.setText(eyeDataArray_3);
					mTxt_L.setText("L:" + eyeDataArray_4);
					refractor_Data(eyeDataArray_1,"S","R");
					refractor_Data(eyeDataArray_2,"C","R");
					refractor_Data(eyeDataArray_3,"A","R");
					PD_L = Double.valueOf(eyeDataArray_4).doubleValue();
					app.dcils_s_r1=eyeDataArray_1;
					app.dcils_s_r2=eyeDataArray_2;
					app.dcils_s_r3=eyeDataArray_3;
					///////////////////////////////////////////////////////////////
					eyeDataArray_0 =strArray[2].substring(0, 5);
					eyeDataArray_1 =strArray[2].substring(6, 12);
					eyeDataArray_2 =strArray[2].substring(13, 19);
					if(eyeDataArray_2.equals("+00.00"))
						eyeDataArray_2 = "00.00";
					else if(eyeDataArray_2.equals("-00.00"))
						eyeDataArray_2 = "00.00";
					
					if((strArray[2].substring(21,22).equals(" ")))
						eyeDataArray_3 = strArray[2].substring(23, 24);
					else if((strArray[2].substring(21,22).equals("+")))
						eyeDataArray_3  = strArray[2].substring(22, 24);
					else{
						if((strArray[2].substring(21,22).equals("0")) && (strArray[2].substring(22,23).equals("0")) && (strArray[2].substring(23,24).equals("0")))
							eyeDataArray_3 =  "0";
						else if((strArray[2].substring(21,22).equals("0")) && (strArray[2].substring(22,23).equals("0")) && (!strArray[2].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[2].substring(23, 24);
						else if((strArray[2].substring(21,22).equals("0")) && (!strArray[2].substring(22,23).equals("0"))&& (strArray[2].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[2].substring(22, 24);
						else if((strArray[2].substring(21,22).equals("0")) && (!strArray[2].substring(22,23).equals("0")) && (!strArray[2].substring(23,24).equals("0")))
							eyeDataArray_3  = strArray[2].substring(22, 24);
						else
							eyeDataArray_3  = strArray[2].substring(21, 24);
					}
//						eyeDataArray_3  = strArray[2].substring(21, 24);
					
					if((strArray[2].substring(25,27).equals("  ")))
					    eyeDataArray_4  = "64";
					else
						eyeDataArray_4  = strArray[2].substring(25,27);
					mTxtEye_S_Right.setText(eyeDataArray_1);
					mTxtEye_C_Right.setText(eyeDataArray_2);
					mTxtEye_A_Right.setText(eyeDataArray_3);
					mTxt_R.setText("R:" + eyeDataArray_4);
					refractor_Data(eyeDataArray_1,"S","L");
					refractor_Data(eyeDataArray_2,"C","L");
					refractor_Data(eyeDataArray_3,"A","L");
					PD_R = Double.valueOf(eyeDataArray_4).doubleValue();
					app.dcils_s_l1=eyeDataArray_1;
					app.dcils_s_l2=eyeDataArray_2;
					app.dcils_s_l3=eyeDataArray_3;
					PD = PD_R;
					mTxt_RL_Show.setText("PD:" + PD);
					///////////////////////////////////////////////////////
					String bb1 = mTxt_RL_Show.getText().toString();
					double Txt_RL_Show1 = new Double(
							bb1.substring(bb1.indexOf(":") + 1));
				    app.pd_far=(int)Txt_RL_Show1;
					dispfar_near();
					//////////////////////////////////////////////////////
				    rmk_pd((int)PD);
					app.OnLeftRMK = true;
					app.OnRightRMK = true;
				}

				break;
			case R.id.txt_rl_show:
				app.L_R = 2;
				break;
			case R.id.txt_r:
				app.L_R = 0;
				break;
			case R.id.txt_l:
				app.L_R = 1;
				break;
			case R.id.txt_rignt:
				setPD(-1);
				String bb = mTxt_RL_Show.getText().toString();
				double Txt_RL_Show = new Double(
						bb.substring(bb.indexOf(":") + 1));
				if(app.IsModeFar){
				     app.pd_far=(int)Txt_RL_Show;
				     dispfar_near();
				}
				int tem = (int) (Txt_RL_Show - 50);
				int tempd=(int) Txt_RL_Show;
				if (tem < 0)
					tem = 0;
				if (tem > 30)
					tem = 30;
				if((tempd>=50)&&(tempd<=65))
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP0%x]", tempd-50));
			    else
			    	app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP%2x]", tempd-50));
				break;
			case R.id.txt_left:
				setPD(1);
				String bb1 = mTxt_RL_Show.getText().toString();
				double Txt_RL_Show1 = new Double(
						bb1.substring(bb1.indexOf(":") + 1));
				if(app.IsModeFar){
					app.pd_far=(int)Txt_RL_Show1;
					dispfar_near();
				}
				int tem1 = (int) (Txt_RL_Show1 - 50);
				int tempd1 = (int) Txt_RL_Show1;
				if (tem1 < 0)
					tem1 = 0;
				if (tem1 > 30)
					tem1 = 30;
				if((tempd1>=50)&&(tempd1<=65))
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP0%x]", tempd1-50));
			    else
			    	app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP%2x]", tempd1-50));
				break;
			case R.id.imgbtn_jia:
				vessel.ChangeText(-1);
				break;
			case R.id.imgbtn_jian:
				vessel.ChangeText(1);
				break;
			case R.id.imgbtn_1:
				app.jiushi = true;
				app.er1 = false;
			
				if(app.fwshuj == false){
					_explain.setImageResource(R.drawable.explain_16);
				}
				if (app.czypt == false) {
					vessel.Asettext();
					initanimation();
				}
				break;
			case R.id.imgbtn_2:
				app.er2 = false;
				app.jiushi = false;
				if(app.fwshuj == false){
					_explain.setImageResource(R.drawable.explain_17);
				}
				if (app.czypt == false) {
					vessel.Asettext();
					initanimation();
				}
				break;
			case R.id.txt_title_luoyan:
				vessel.init(true);
				app.OnRightRMK=false;
				app.OnLeftRMK=false;
				app.printCount=0;
				app._ccar =0;
				app._ccal =0;
				app.BluetoothAPI.send_command(Device.TypeBullEye,"[rx0000][lx0000]");
				app.count_fartonear=0;
				app.ackz   = false ;
				app.jiushi = true ;
				app.tonear=false;
				app.z_13 = 0;
				app.ptk = true;
				app.Pfdot = true;
			
				app.Rfgf = true;
				
				app.lj_6 = true;
				
				app.lj_10 = true;
				app.fwshuj = true;
				 ////////////////////////////////////////
				app.Lr = false;
				mSpiEyeS.setSelection(1,true);
				mSpiEyeC.setSelection(0,true);
			    mSpiEyeA.setSelection(1,true);
				mSpiEyeH.setSelection(2,true);
				mSpiEyeV.setSelection(2,true);
				mSpiEyeADD.setSelection(0,true);	
				mTxtBack.setSelection(0);
				app.program0_cnt =0;
				app.program1_cnt =0;
				app.program2_cnt =0;
				app.pdan = 0;
				FragmentManager fm30 = getActivity().getSupportFragmentManager();
				FragmentRight fragmentright30 = (FragmentRight) fm30
						.findFragmentById(R.id.frag_right);
				fragmentright30.mtv.setText(" ");
//				app.Sposition=0;
				app.Cposition=0;
				app.Aposition=1;
				app.ADDposition=0;
				app.Hposition=2;
				app.Vposition=2;
				app.Pposition=1;
				app.pzy = 3;
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_S;
				//app.position = 0;
				app.position = mSpiEyeS.getSelectedItemPosition();
				vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
				lv1.setImageResource(R.drawable.r_1);
				lv2.setImageResource(R.drawable.l_1);
				vessel.ChangeSText();
				//////////////////////////////////////////////
				mTxt_RL_Show.setText("PD: " + "64");
				app.pd_far=64;
				app.pd_near=60;
				////////////////////////////////////////
				String bb3 = mTxt_RL_Show.getText().toString();
				double Txt_RL_Show3 = new Double(
						bb3.substring(bb3.indexOf(":") + 1));
				int tem3 = (int) (Txt_RL_Show3 - 50);
				int tempd3 = (int) Txt_RL_Show3;
				if (tem3 < 0)
					tem3 = 0;
				if (tem3 > 30)
					tem3 = 30;
				if((tempd3>=50)&&(tempd3<=65))
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP0%x]", tempd3-50));
			    else
			    	app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rP%2x]", tempd3-50));
			    /////////////////////////////////////////////////////////////////
				app.BluetoothAPI.send_command(Device.TypeBullEye, "[rR00][lR00]");
				
				FragmentManager fm1 =getActivity().getSupportFragmentManager();
				FragmentRight fragmentRight1=(FragmentRight)fm1.findFragmentById(R.id.frag_right);
				if(fragmentRight1 !=null){
					if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
					      fragmentRight1.mll_e3.callOnClick();
					      wait_ms(120);
					      app.BluetoothAPI.send_command(Device.TypeBullEye,
									Constants.KEY_H1);
					}
					else if(app.chartor.equals("7")){
						  fragmentRight1.mll_h1.callOnClick();
						  wait_ms(120);
					      app.BluetoothAPI.send_command(Device.TypeBullEye,
									Constants.KEY_H1);
					}
					else if(app.chartor.equals("2")){
						  fragmentRight1.mll_e1.callOnClick();
						  wait_ms(120);
					      app.BluetoothAPI.send_command(Device.TypeBullEye,
									Constants.KEY_H1);
					}

				}
				
				_explain.setImageResource(R.drawable.explain_kong);
				wait_mss(100);
				wait_mss(100);
				wait_mss(100);
				
				wait_mss(100);
				wait_mss(100);
				wait_mss(100);
				mSpiEyeS.setSelection(0);
				app.txtCount = Constants.EYE_D;
				app.txtState = Constants.EYE_S;
				app.position = mSpiEyeS.getSelectedItemPosition();
				vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
				lv1.setImageResource(R.drawable.r_1);
				lv2.setImageResource(R.drawable.l_1);
				vessel.ChangeSText();
				break;
			default:
				break;
			}
		}
	};
	
	public void wait_ms(int time) 
	{
		try {Thread.sleep(time);} catch (InterruptedException e) {}
	}
	
	public void CCdual(){
		app.position = mSpiEyeS.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_S;
		vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
		iv_l_r.setImageResource(R.drawable.r_4);
		iv_l_l.setImageResource(R.drawable.l_4);
		vessel.ChangeSText();
		app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU88]");
		app.BluetoothAPI.send_command(Device.TypeBullEye, "[lU88]");
	}
	
	public void chartdual_L(){
		app.position = mSpiEyeS.getSelectedItemPosition();
		app.txtCount = Constants.EYE_L;
		app.txtState = Constants.EYE_S;
		vessel.ChangeBg(Constants.EYE_S, true);
		iv_l_r.setImageResource(R.drawable.r_1);
		iv_l_l.setImageResource(R.drawable.l_2);
		app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00][lUBB]");
		vessel.ChangeSText();
	}
	
    public void chartdual_R(){
    	app.pzy = 1;
		app.position = mSpiEyeS.getSelectedItemPosition();
		app.txtCount = Constants.EYE_R;
		app.txtState = Constants.EYE_S;
		vessel.ChangeBg(Constants.EYE_S, false);
		iv_l_r.setImageResource(R.drawable.r_2);
		iv_l_l.setImageResource(R.drawable.l_1);
		app.BluetoothAPI.send_command(Device.TypeBullEye, "[rUBB][lU00]");
		vessel.ChangeSText();
	}
	
	public void chartdual(){
		app.position = mSpiEyeS.getSelectedItemPosition();
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_S;
		vessel.ChangeBg(Constants.EYE_S, Constants.EYE_S);
		iv_l_r.setImageResource(R.drawable.r_1);
		iv_l_l.setImageResource(R.drawable.l_1);
		app.BluetoothAPI.send_command(Device.TypeBullEye, "[rU00][lU00]");
		vessel.ChangeSText();
	}

	public void rmk_pd(int aa){
		if((aa>=50)&&(aa<=80))
		{
			if((aa>=50)&&(aa<=65))
				app.BluetoothAPI.send_command(Device.TypeBullEye,
					String.format("[rP0%x]", aa-50));
			else
				app.BluetoothAPI.send_command(Device.TypeBullEye,
					String.format("[rP%2x]", aa-50));
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

	public void INVISIBLE() {
			lv_1.setVisibility(View.INVISIBLE);
			lv_2.setVisibility(View.INVISIBLE);
			lv_3.setVisibility(View.INVISIBLE);
			lv_4.setVisibility(View.INVISIBLE);
			lv.setVisibility(View.INVISIBLE);
			_lv1.setVisibility(View.INVISIBLE);
			_lv2.setVisibility(View.INVISIBLE);
			_lv3.setVisibility(View.INVISIBLE);
	}
	
	public void yanc() {
		if (app.Trl == true) {
			lv_1.setVisibility(View.INVISIBLE);
			lv_2.setVisibility(View.INVISIBLE);
			lv_3.setVisibility(View.INVISIBLE);
			lv_4.setVisibility(View.INVISIBLE);
		} else if (app.Trl == false) {
			lv.setVisibility(View.INVISIBLE);
			_lv1.setVisibility(View.INVISIBLE);
			_lv2.setVisibility(View.INVISIBLE);
			_lv3.setVisibility(View.INVISIBLE);
		}
	}

	public int arg;
	public OnItemSelectedListener MySpinnerItemClick = new OnItemSelectedListener() {
		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			if (arg < 6) {
				arg++;
				return;
			}
			switch (parent.getId()) {
			case R.id.spi_eye_c:
				app.position = mSpiEyeC.getSelectedItemPosition();
				app.Cposition =app.position;
				break;
			case R.id.spi_eye_a:
				app.position = mSpiEyeA.getSelectedItemPosition();
				app.Aposition =app.position;
				break;
			case R.id.spi_eye_h:
				app.position = mSpiEyeH.getSelectedItemPosition();
				app.Hposition =app.position;
				break;
			case R.id.spi_eye_v:
				app.position = mSpiEyeV.getSelectedItemPosition();
				app.Vposition =app.position;
				break;
			case R.id.spi_eye_add:
				app.position = mSpiEyeADD.getSelectedItemPosition();
				app.ADDposition =app.position;
				break;
			case R.id.spi_eye_s:
				app.position = mSpiEyeS.getSelectedItemPosition();
				app.Sposition=app.position;
				break;
			case R.id.txt_title_back:
				app.position = mTxtBack.getSelectedItemPosition();
				app.Pposition=app.position;
				
				FragmentManager fm = getActivity().getSupportFragmentManager();
				FragmentRight fragmentright = (FragmentRight) fm
						.findFragmentById(R.id.frag_right);
				switch (app.Pposition) {
				case 1:
					app.pdan = 0;
					app.program0_cnt=1;
					if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					cdc();
					break;
				case 2:
					app.pdan = 1;
					//delArray_CUS1();
					app.program1_cnt=1;
					if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					cdc();
					break;
				case 3:
					app.pdan = 2;
					//delArray_CUS2();
					app.program2_cnt=1;
					if(app.chartor.equals("7")){
						   fragmentright.mll_e6.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("2")){
						   fragmentright.mll_c5.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100")){
						   fragmentright.mll_c1.callOnClick();
						   mTxtEye_S_Left.callOnClick();
					   }
					cdc();
					break;
				case 4:
					app.pdan = 3;
					delArray_CUS3();
					break;
				case 5:
					app.pdan = 4;
					delArray_CUS4();
					break;
				case 6:
					app.pdan = 5;
					delArray_CUS5();
					break;
				case 7:
					app.pdan = 6;
					delArray_CUS6();
					break;
				case 8:
					app.pdan = 7;
					delArray_CUS7();
					break;
				case 9:
					app.pdan = 8;
					delArray_CUS8();
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		}
	};

	@SuppressLint("UseValueOf")
	
	public void reset_lj(){
		app.cdRead_ljr();
		app.cdRead_ljl();
		int lj1 = Integer.parseInt(app.label_ljr);
		int lj2 = Integer.parseInt(app.label_ljl);
		app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rN%04X]", (short)lj1));
		app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lN%04X]", (short)lj2));
	}
	
	public void dispfar_near(){
		if(app.pd_far==80)
		   {
		      app.flag_chgPD=0;
		      app.pd_near=75;
		   }
		   else if(app.pd_far==79)
		   {
			   app.flag_chgPD=0;
		       app.pd_near=74;
		   }
		   else if(app.pd_far==78)
		   {
			   app.flag_chgPD=0;
		       app.pd_near=73;
		    }
		   else if(app.pd_far==77)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=72;
		   }
		   else if(app.pd_far==76)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=71;
		   }
		   else if(app.pd_far==75)
		   {
			   app.flag_chgPD=3;
		        app.pd_near=70;
		   }
		   else if(app.pd_far==74)
		   {
			   app.flag_chgPD=4;
		        app.pd_near=70;
		    }
		   else if(app.pd_far==73)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=69;
		   }
		   else if(app.pd_far==72)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=68;
		   }
		   else if(app.pd_far==71)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=67;
		    }
		   else if(app.pd_far==70)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=66;
		   }
		   else if(app.pd_far==69)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=65;
		   }
		   else if(app.pd_far==68)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=64;
		   }
		   else if(app.pd_far==67)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=63;
		   }
		   else if(app.pd_far==66)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=62;
		   }
		   else if(app.pd_far==65)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=61;
		   }
		   else if(app.pd_far==64)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=60;
		   }
		   else if(app.pd_far==63)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=59;
		   }
		   else if(app.pd_far==62)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=58;
		   }
		   else if(app.pd_far==61)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=57;
		    }
		   else if(app.pd_far==60)
		   {  
			   app.flag_chgPD=0;
		        app.pd_near=56;
		   }
		   else if(app.pd_far==59)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=55;
		   }
		   else if(app.pd_far==58)
		   {
			   app.flag_chgPD=1;
		        app.pd_near=54;
		   }
		   else if(app.pd_far==57)
		   {
			   app.flag_chgPD=2;
		        app.pd_near=54;
		   }
		   else if(app.pd_far==56)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=53;
		    }
		   else if(app.pd_far==55)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=52;
		   }
		   else if(app.pd_far==54)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=51;
		   }
		   else if(app.pd_far==53)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=50;
		   }
		   else if(app.pd_far==52)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=49;
		    }
		   else if(app.pd_far==51)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=48;
		   }
		   else if(app.pd_far==50)
		   {
			   app.flag_chgPD=0;
		        app.pd_near=47;
		   }
	}
	
	
	public void setPD(double pd) {
		String bb = mTxt_RL_Show.getText().toString();
		double pd_v = new Double(
				bb.substring(bb.indexOf(":") + 1));
		if (pd_v == 50 && pd < 0)
			return;
	    if (pd_v == 80 && pd > 0)
	    	return;
		pd_v = pd_v + pd;
		int cd = (int) (pd_v);
		mTxt_RL_Show.setText("PD: " + cd);

	}
	
	public void wait_mss(int time) 
	{
		try {Thread.sleep(time);} catch (InterruptedException e) {}
	}

}
