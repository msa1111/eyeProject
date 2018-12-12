package com.dingzhou.eye;

import java.util.ArrayList;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class cxhygActivity extends Activity {
	public LinearLayout exit;
	public LinearLayout del;
	public LinearLayout save;
	private LinearLayout ll_add;
	private TextView tv1;
	private TextView tv;
	private LinearLayout left_D;
	private LinearLayout left_1;
	private LinearLayout left_2;
	private LinearLayout left_3;
	private LinearLayout left_4;
	private LinearLayout left_5;
	private LinearLayout right_6;
	private LinearLayout right_7;
	private LinearLayout right_8;
	private LinearLayout right_9;
	private LinearLayout right_10;
	private LinearLayout right_11;
	private LinearLayout mll_e1;
	private LinearLayout mll_e2;
	private LinearLayout mll_e3;
	private LinearLayout mll_e4;
	private LinearLayout mll_e5;
	private LinearLayout mll_e6;
	private LinearLayout mll_e7;
	private LinearLayout mll_e8;
	private LinearLayout mll_c1;
	private LinearLayout mll_c2;
	private LinearLayout mll_c3;
	private LinearLayout mll_c4;
	private LinearLayout mll_c5;
	private LinearLayout mll_c6;
	private LinearLayout mll_c7;
	private LinearLayout mll_c8;
	private LinearLayout mll_h1;
	private LinearLayout mll_h2;
	private LinearLayout mll_h3;
	private LinearLayout mll_h4;
	private LinearLayout mll_z1;
	private LinearLayout mll_z2;
	private LinearLayout mll_z3;
	private LinearLayout mll_z4;
	private LinearLayout mll_z5;
	private LinearLayout mll_z6;
	private LinearLayout mll_z7;
	private LinearLayout mll_z8;
	private LinearLayout mll_z9;
	private LinearLayout mll_z10;
	private LinearLayout mll_z11;
	private LinearLayout mll_z12;
	private LinearLayout mll_z13;
	public static ImageView lv_x;
	public static LinearLayout mImg_1;
	public static LinearLayout mImg_2;
	public static LinearLayout mImg_3;
	public static LinearLayout mImg_4;
	public TextView txt_img_1_l;
	public ImageView img_img_1_c;
	public TextView txt_img_1_r;
	public TextView txt_img_2_1_l;
	public ImageView img_img_2_1_c1;
	public ImageView img_img_2_1_c2;
	public TextView txt_img_2_1_r;
	public TextView txt_img_3_1_l;
	public ImageView img_img_3_1_c1;
	public ImageView img_img_3_1_c2;
	public ImageView img_img_3_1_c3;
	public TextView txt_img_3_1_r;
	public TextView txt_img_3_2_l;
	public ImageView img_img_3_2_c1;
	public ImageView img_img_3_2_c2;
	public ImageView img_img_3_2_c3;
	public TextView txt_img_3_2_r;
	public TextView txt_img_4_1_l;
	public ImageView img_img_4_1_c1;
	public ImageView img_img_4_1_c2;
	public ImageView img_img_4_1_c3;
	public ImageView img_img_4_1_c4;
	public TextView txt_img_4_1_r;
	public TextView txt_img_4_2_l;
	public ImageView img_img_4_2_c1;
	public ImageView img_img_4_2_c2;
	public ImageView img_img_4_2_c3;
	public ImageView img_img_4_2_c4;
	public TextView txt_img_4_2_r;
	public TextView txt_img_4_3_l;
	public ImageView img_img_4_3_c1;
	public ImageView img_img_4_3_c2;
	public ImageView img_img_4_3_c3;
	public ImageView img_img_4_3_c4;
	public TextView txt_img_4_3_r;
	private Context _context;
	public MyApp app;
	SharedPreferences mySharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.cxhyg_layout);
		app = new MyApp();
		init();
		shujkj();
	}

	private void init() {
		mll_e1 = (LinearLayout) findViewById(R.id.ll_e1);
		mll_e1.setOnClickListener(MyClick);
		mll_e2 = (LinearLayout) findViewById(R.id.ll_e2);
		mll_e2.setOnClickListener(MyClick);
		mll_e3 = (LinearLayout) findViewById(R.id.ll_e3);
		mll_e3.setOnClickListener(MyClick);
		mll_e4 = (LinearLayout) findViewById(R.id.ll_e4);
		mll_e4.setOnClickListener(MyClick);
		mll_e5 = (LinearLayout) findViewById(R.id.ll_e5);
		mll_e5.setOnClickListener(MyClick);
		mll_e6 = (LinearLayout) findViewById(R.id.ll_e6);
		mll_e6.setOnClickListener(MyClick);
		mll_e7 = (LinearLayout) findViewById(R.id.ll_e7);
		mll_e7.setOnClickListener(MyClick);
		mll_e8 = (LinearLayout) findViewById(R.id.ll_e8);
		mll_e8.setOnClickListener(MyClick);
		
		mll_c1 = (LinearLayout) findViewById(R.id.ll_c1);
		mll_c1.setOnClickListener(MyClick);
		mll_c2 = (LinearLayout) findViewById(R.id.ll_c2);
		mll_c2.setOnClickListener(MyClick);
		mll_c3 = (LinearLayout) findViewById(R.id.ll_c3);
		mll_c3.setOnClickListener(MyClick);
		mll_c4 = (LinearLayout) findViewById(R.id.ll_c4);
		mll_c4.setOnClickListener(MyClick);
		mll_c5 = (LinearLayout) findViewById(R.id.ll_c5);
		mll_c5.setOnClickListener(MyClick);
		mll_c6 = (LinearLayout) findViewById(R.id.ll_c6);
		mll_c6.setOnClickListener(MyClick);
		mll_c7 = (LinearLayout) findViewById(R.id.ll_c7);
		mll_c7.setOnClickListener(MyClick);
		mll_c8 = (LinearLayout) findViewById(R.id.ll_c8);
		mll_c8.setOnClickListener(MyClick);
		
		mll_h1 = (LinearLayout) findViewById(R.id.ll_h1);
		mll_h1.setOnClickListener(MyClick);
		mll_h2 = (LinearLayout) findViewById(R.id.ll_h2);
		mll_h2.setOnClickListener(MyClick);
		mll_h3 = (LinearLayout) findViewById(R.id.ll_h3);
		mll_h3.setOnClickListener(MyClick);
		mll_h4 = (LinearLayout) findViewById(R.id.ll_h4);
		mll_h4.setOnClickListener(MyClick);

		mll_z1 = (LinearLayout) findViewById(R.id.ll_z1);
		mll_z1.setOnClickListener(MyClick);
		mll_z2 = (LinearLayout) findViewById(R.id.ll_z2);
		mll_z2.setOnClickListener(MyClick);
		mll_z3 = (LinearLayout) findViewById(R.id.ll_z3);
		mll_z3.setOnClickListener(MyClick);
		mll_z4 = (LinearLayout) findViewById(R.id.ll_z4);
		mll_z4.setOnClickListener(MyClick);
		mll_z5 = (LinearLayout) findViewById(R.id.ll_z5);
		mll_z5.setOnClickListener(MyClick);
		mll_z6 = (LinearLayout) findViewById(R.id.ll_z6);
		mll_z6.setOnClickListener(MyClick);
		mll_z7 = (LinearLayout) findViewById(R.id.ll_z7);
		mll_z7.setOnClickListener(MyClick);
		mll_z8 = (LinearLayout) findViewById(R.id.ll_z8);
		mll_z8.setOnClickListener(MyClick);
		mll_z9 = (LinearLayout) findViewById(R.id.ll_z9);
		mll_z9.setOnClickListener(MyClick);
		mll_z10 = (LinearLayout) findViewById(R.id.ll_z10);
		mll_z10.setOnClickListener(MyClick);
		mll_z11 = (LinearLayout) findViewById(R.id.ll_z11);
		mll_z11.setOnClickListener(MyClick);
		mll_z12 = (LinearLayout) findViewById(R.id.ll_z12);
		mll_z12.setOnClickListener(MyClick);
		mll_z13 = (LinearLayout) findViewById(R.id.ll_z13);
		mll_z13.setOnClickListener(MyClick);
		

		lv_x = (ImageView) findViewById(R.id.Lvx);
		mImg_1 = (LinearLayout) findViewById(R.id.img_1_mian);
		mImg_2 = (LinearLayout) findViewById(R.id.img_2_mian);
		mImg_3 = (LinearLayout) findViewById(R.id.img_3_mian);
		mImg_4 = (LinearLayout) findViewById(R.id.img_4_mian);
		
		txt_img_1_l = (TextView) findViewById(R.id.txt_img_1_l);
		img_img_1_c = (ImageView) findViewById(R.id.img_img_1_c);
		txt_img_1_r = (TextView) findViewById(R.id.txt_img_1_r);
		
		txt_img_2_1_l = (TextView) findViewById(R.id.txt_img_2_1_l);
		img_img_2_1_c1 = (ImageView) findViewById(R.id.img_img_2_1_c1);
		img_img_2_1_c2 = (ImageView) findViewById(R.id.img_img_2_1_c2);
		txt_img_2_1_r = (TextView) findViewById(R.id.txt_img_2_1_r);
		
		txt_img_3_1_l = (TextView) findViewById(R.id.txt_img_3_1_l);
		img_img_3_1_c1 = (ImageView) findViewById(R.id.img_img_3_1_c1);
		img_img_3_1_c2 = (ImageView) findViewById(R.id.img_img_3_1_c2);
		img_img_3_1_c3 = (ImageView) findViewById(R.id.img_img_3_1_c3);
		txt_img_3_1_r = (TextView) findViewById(R.id.txt_img_3_1_r);

		txt_img_3_2_l = (TextView) findViewById(R.id.txt_img_3_2_l);
		img_img_3_2_c1 = (ImageView) findViewById(R.id.img_img_3_2_c1);
		img_img_3_2_c2 = (ImageView) findViewById(R.id.img_img_3_2_c2);
		img_img_3_2_c3 = (ImageView) findViewById(R.id.img_img_3_2_c3);
		txt_img_3_2_r = (TextView) findViewById(R.id.txt_img_3_2_r);
		
		txt_img_4_1_l = (TextView) findViewById(R.id.txt_img_4_1_l);
		img_img_4_1_c1 = (ImageView) findViewById(R.id.img_img_4_1_c1);
		img_img_4_1_c2 = (ImageView) findViewById(R.id.img_img_4_1_c2);
		img_img_4_1_c3 = (ImageView) findViewById(R.id.img_img_4_1_c3);
		img_img_4_1_c4 = (ImageView) findViewById(R.id.img_img_4_1_c4);
		txt_img_4_1_r = (TextView) findViewById(R.id.txt_img_4_1_r);

		txt_img_4_2_l = (TextView) findViewById(R.id.txt_img_4_2_l);
		img_img_4_2_c1 = (ImageView) findViewById(R.id.img_img_4_2_c1);
		img_img_4_2_c2 = (ImageView) findViewById(R.id.img_img_4_2_c2);
		img_img_4_2_c3 = (ImageView) findViewById(R.id.img_img_4_2_c3);
		img_img_4_2_c4 = (ImageView) findViewById(R.id.img_img_4_2_c4);
		txt_img_4_2_r = (TextView) findViewById(R.id.txt_img_4_2_r);

		txt_img_4_3_l = (TextView) findViewById(R.id.txt_img_4_3_l);
		img_img_4_3_c1 = (ImageView) findViewById(R.id.img_img_4_3_c1);
		img_img_4_3_c2 = (ImageView) findViewById(R.id.img_img_4_3_c2);
		img_img_4_3_c3 = (ImageView) findViewById(R.id.img_img_4_3_c3);
		img_img_4_3_c4 = (ImageView) findViewById(R.id.img_img_4_3_c4);
		txt_img_4_3_r = (TextView) findViewById(R.id.txt_img_4_3_r);

		left_D = (LinearLayout) findViewById(R.id.LL_d);
		left_D.setOnClickListener(MyClick);
		left_1 = (LinearLayout) findViewById(R.id.LL_1);
		left_1.setOnClickListener(MyClick);
		left_2 = (LinearLayout) findViewById(R.id.LL_2);
		left_2.setOnClickListener(MyClick);
		left_3 = (LinearLayout) findViewById(R.id.LL_3);
		left_3.setOnClickListener(MyClick);
		left_4 = (LinearLayout) findViewById(R.id.LL_4);
		left_4.setOnClickListener(MyClick);
		left_5 = (LinearLayout) findViewById(R.id.LL_5);
		left_5.setOnClickListener(MyClick);
		
		right_6 = (LinearLayout) findViewById(R.id.LL_6);
		right_6.setOnClickListener(MyClick);
		right_7 = (LinearLayout) findViewById(R.id.LL_7);
		right_7.setOnClickListener(MyClick);
		right_8 = (LinearLayout) findViewById(R.id.LL_8);
		right_8.setOnClickListener(MyClick);
		right_9 = (LinearLayout) findViewById(R.id.LL_9);
		right_9.setOnClickListener(MyClick);
		right_10 = (LinearLayout) findViewById(R.id.LL_10);
		right_10.setOnClickListener(MyClick);
		right_11 = (LinearLayout) findViewById(R.id.LL_11);
		right_11.setOnClickListener(MyClick);
		tv = (TextView) findViewById(R.id.tetV);
		tv1 = (TextView) findViewById(R.id.tetV1);
		ll_add = (LinearLayout) findViewById(R.id.LL_ADD);
		ll_add.setOnClickListener(MyClick);
		save = (LinearLayout) findViewById(R.id.SAVE);
		save.setOnClickListener(MyClick);
		del = (LinearLayout) findViewById(R.id.DEL);
		del.setOnClickListener(MyClick);
		exit = (LinearLayout) findViewById(R.id.EXIT);
		exit.setOnClickListener(MyClick);
	}

	private OnClickListener MyClick = new OnClickListener() {

		@SuppressWarnings("static-access")
		@Override
		public void onClick(View v) {
		

			switch (v.getId()) {
			case R.id.ll_e1:
				app.kj = 1;
				Change(Constants.IMG_2);
                Img_2_init("", R.drawable.e_bottom,R.drawable.e_right, "0.1");

				break;
			case R.id.ll_e2:
				app.kj = 2;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.e_top, R.drawable.e_left,
						"0.12");
				break;
			case R.id.ll_e3:
				app.kj = 3;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.e_right,
						R.drawable.e_bottom, "0.15");
				break;
			case R.id.ll_e4:
				app.kj = 4;
				Change(Constants.IMG_3);			
				Img_3_init("", R.drawable.e_right,
						R.drawable.e_left, R.drawable.e_top, "0.20", "",
						R.drawable.e_top, R.drawable.e_bottom,
						R.drawable.e_left, "0.25");
				break;
			case R.id.ll_e5:
				app.kj = 5;
				Change(Constants.IMG_3);
				Img_3_init("", R.drawable.e_top, R.drawable.e_left,
						R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom,
						R.drawable.e_top, R.drawable.e_right, "0.4");
				break;
			case R.id.ll_e6:
				app.kj = 6;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.e_top, R.drawable.e_left,
						R.drawable.e_top, R.drawable.e_bottom, "0.5", "",
						R.drawable.e_right, R.drawable.e_bottom,
						R.drawable.e_left, R.drawable.e_top, "0.6", "",
						R.drawable.e_top, R.drawable.e_right,
						R.drawable.e_bottom, R.drawable.e_left, "0.7");
				break;
			case R.id.ll_e7:
				app.kj = 7;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.e_bottom,
						R.drawable.e_right, R.drawable.e_top,
						R.drawable.e_left, "0.8", "", R.drawable.e_bottom,
						R.drawable.e_left, R.drawable.e_right,
						R.drawable.e_top, "0.9", "",
						R.drawable.e_left, R.drawable.e_bottom,
						R.drawable.e_top, R.drawable.e_right, "1.0");
				break;
			case R.id.ll_e8:
				app.kj = 8;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.e_right, R.drawable.e_top,
						R.drawable.e_bottom, R.drawable.e_left, "1.2", "",
						R.drawable.e_bottom, R.drawable.e_right,
						R.drawable.e_top, R.drawable.e_left, "1.5", "",
						R.drawable.e_left, R.drawable.e_right,
						R.drawable.e_top, R.drawable.e_bottom, "2.0");
				break;
			case R.id.ll_c1:
				app.kj = 9;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.c_bottom,
						R.drawable.c_left, "0.1");
				break;
			case R.id.ll_c2:
				app.kj = 10;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.c_right,
						R.drawable.c_top, "0.12");
				break;
			case R.id.ll_c3:
				app.kj = 11;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.c_right_top,
						R.drawable.c_left_bottom, "0.15");
				break;
			case R.id.ll_c4:
				app.kj = 12;
				Change(Constants.IMG_3);
				Img_3_init("", R.drawable.c_left_top,
						R.drawable.c_right_bottom, R.drawable.c_right, "0.20",
						"", R.drawable.c_bottom, R.drawable.c_left,
						R.drawable.c_top, "0.25");
				break;
			case R.id.ll_c5:
				app.kj = 13;
				Change(Constants.IMG_3);
				Img_3_init("", R.drawable.c_right_bottom,
						R.drawable.c_bottom, R.drawable.c_left, "0.3", "",
						R.drawable.c_left_bottom, R.drawable.c_right_top,
						R.drawable.c_top, "0.4");
				break;
			case R.id.ll_c6:
				app.kj = 14;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.c_left_bottom,
						R.drawable.c_left_top, R.drawable.c_right_bottom,
						R.drawable.c_top, "0.5", "",
						R.drawable.c_left_top,
						R.drawable.c_right_bottom,
						R.drawable.c_right, 
						R.drawable.c_bottom, "0.6", "", R.drawable.c_left,
						R.drawable.c_right_top, R.drawable.c_right_bottom,
						R.drawable.c_right, "0.7");
				break;
			case R.id.ll_c7:
				app.kj = 15;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.c_left,
						R.drawable.c_bottom, R.drawable.c_left,
						R.drawable.c_top, "0.8", "", R.drawable.c_left,
						R.drawable.c_left_top, R.drawable.c_right_bottom,
						R.drawable.c_right_top, "0.9", "",
						R.drawable.c_right_bottom, R.drawable.c_left_bottom,
						R.drawable.c_top, R.drawable.c_left, "1.0");
				break;
			case R.id.ll_c8:
				app.kj = 16;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.c_bottom,
						R.drawable.c_left, R.drawable.c_top,
						R.drawable.c_right, "1.2", "",
						R.drawable.c_right_top, R.drawable.c_right,
						R.drawable.c_left_top, R.drawable.c_bottom, "1.5",
						"", R.drawable.c_left_bottom, R.drawable.c_top,
						R.drawable.c_right_bottom, R.drawable.c_left_top, "2.0");
				break;
			case R.id.ll_h1:
				app.kj = 17;
				Change(Constants.IMG_1);
				break;
			case R.id.ll_h2:
				app.kj = 18;
				Change(Constants.IMG_2);
				Img_2_init("", R.drawable.butterfly,
						R.drawable.ship, "0.1");
				break;
			case R.id.ll_h3:
				app.kj = 19;
				Change(Constants.IMG_3);
				Img_3_init("", R.drawable.fish, R.drawable.plane,
						R.drawable.car, "0.2", "", R.drawable.umbrella,
						R.drawable.butterfly, R.drawable.ship, "0.4");
				break;
			case R.id.ll_h4:
				app.kj = 20;
				Change(Constants.IMG_4);
				Img_4_init("", R.drawable.butterfly,
						R.drawable.umbrella, R.drawable.plane, R.drawable.fish,
						"0.6", "", R.drawable.ship, R.drawable.plane,
						R.drawable.car, R.drawable.butterfly, "0.8", "",
						R.drawable.butterfly, R.drawable.car, R.drawable.ship,
						R.drawable.plane, "1.0");
				break;
			case R.id.ll_z1:
				app.kj = 21;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_1);
				break;
			case R.id.ll_z2:
				app.kj = 22;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_2);
				break;
			case R.id.ll_z3:
				app.kj = 23;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_3);
				break;
			case R.id.ll_z4:
				app.kj = 24;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_4);
				break;
			case R.id.ll_z5:
				app.kj = 25;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_5);
				break;
			case R.id.ll_z6:
				app.kj = 26;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_7_6);
				break;
			case R.id.ll_z8:
				app.kj = 27;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_6);
				break;
			case R.id.ll_z7:
				app.kj = 28;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_5);
				break;
			case R.id.ll_z9:
				app.kj = 29;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_h_5);
				break;
			case R.id.ll_z10:
				app.kj = 30;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_1);
				break;
			case R.id.ll_z11:
				app.kj = 31;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_2);
				break;
			case R.id.ll_z12:
				app.kj = 32;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_3);
				break;
			case R.id.ll_z13:
				app.kj = 33;
				Change(Constants.IMG_0);
				lv_x.setBackgroundResource(R.drawable.d_o_6_4);
				break;
			case R.id.LL_d:
				break;
			case R.id.LL_1:

				break;
			case R.id.LL_2:

				break;
			case R.id.LL_3:
				app.pdan = 3;
				app.baoc = 3;
				tv.setText("CUSTOM1");
				tv1.setText(app.CUSTOM3.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_4:
				app.pdan = 4;
				app.baoc = 4;
				tv.setText("CUSTOM2");
				tv1.setText(app.CUSTOM4.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_5:
				app.pdan = 5;
				app.baoc = 5;
				tv.setText("CUSTOM3");
				tv1.setText(app.CUSTOM5.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_6:
				app.pdan = 6;
				app.baoc = 6;
				tv.setText("CUSTOM4");
				tv1.setText(app.CUSTOM6.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_7:
				app.pdan = 7;
				app.baoc = 7;
				tv.setText("CUSTOM5");
				tv1.setText(app.CUSTOM7.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_8:
				app.pdan = 8;
				app.baoc = 8;
				tv.setText("CUSTOM6");
				tv1.setText(app.CUSTOM8.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_9:
				app.pdan = 9;
				app.baoc = 9;
				tv.setText("CUSTOM7");
				tv1.setText(app.CUSTOM9.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_10:
				app.pdan = 10;
				app.baoc = 10;
				tv.setText("CUSTOM8");
				tv1.setText(app.CUSTOM10.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_11:
				app.pdan = 11;
				app.baoc = 11;
				tv.setText("CUSTOM9");
				tv1.setText(app.CUSTOM11.size() + "/50");
				app.add = false;
				break;
			case R.id.LL_ADD:
				if (app.baoc == 0) {
					app.STANDARD.add(app.kj + "");
					tv1.setText(app.STANDARD.size() + "/50");
					app.add = true;
				} else if (app.baoc == 1) {
					app.CUSTOM1.add(app.kj + "");
					tv1.setText(app.CUSTOM1.size() + "/50");
					app.add = true;
				} else if (app.baoc == 2) {
					app.CUSTOM2.add(app.kj + "");
					tv1.setText(app.CUSTOM2.size() + "/50");
					app.add = true;
				} else if (app.baoc == 3) {
					app.CUSTOM3.add(app.kj + "");
					tv1.setText(app.CUSTOM3.size() + "/50");
					app.add = true;
				} else if (app.baoc == 4) {
					app.CUSTOM4.add(app.kj + "");
					tv1.setText(app.CUSTOM4.size() + "/50");
					app.add = true;
				} else if (app.baoc == 5) {
					app.CUSTOM5.add(app.kj + "");
					tv1.setText(app.CUSTOM5.size() + "/50");
					app.add = true;
				} else if (app.baoc == 6) {
					app.CUSTOM6.add(app.kj + "");
					tv1.setText(app.CUSTOM6.size() + "/50");
					app.add = true;
				} else if (app.baoc == 7) {
					app.CUSTOM7.add(app.kj + "");
					tv1.setText(app.CUSTOM7.size() + "/50");
					app.add = true;
				} else if (app.baoc == 8) {
					app.CUSTOM8.add(app.kj + "");
					tv1.setText(app.CUSTOM8.size() + "/50");
					app.add = true;
				} else if (app.baoc == 9) {
					app.CUSTOM9.add(app.kj + "");
					tv1.setText(app.CUSTOM9.size() + "/50");
					app.add = true;
				} else if (app.baoc == 10) {
					app.CUSTOM10.add(app.kj + "");
					tv1.setText(app.CUSTOM10.size() + "/50");
					app.add = true;
				} else if (app.baoc == 11) {
					app.CUSTOM11.add(app.kj + "");
					tv1.setText(app.CUSTOM11.size() + "/50");
					app.add = true;
				} else {
					Toast.makeText(cxhygActivity.this, "请选择存储方式",
							Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.SAVE:
				if (app.add == false) {
					Toast.makeText(cxhygActivity.this, "请先添加数据后再保存",
							Toast.LENGTH_SHORT).show();
					return;
				} else {
					if (app.pdan == 0) {
						saveArray_STA();
					} else if (app.pdan == 1) {
						saveArray_CUS1();
					} else if (app.pdan == 2){
						saveArray_CUS2();
					}else if (app.pdan == 3){
						saveArray_CUS3();
					}else if (app.pdan == 4){
						saveArray_CUS4();
					}else if (app.pdan == 5){
						saveArray_CUS5();
					}else if (app.pdan == 6){
						saveArray_CUS6();
					}else if (app.pdan == 7){
						saveArray_CUS7();
					}else if (app.pdan == 8){
						saveArray_CUS8();
					}else if (app.pdan == 9){
						saveArray_CUS9();
					}else if (app.pdan == 10){
						saveArray_CUS10();
					}else if (app.pdan == 11){
						saveArray_CUS11();
					}
					Toast.makeText(cxhygActivity.this, "数据保存成功",
							Toast.LENGTH_SHORT).show();

				}
				break;
			case R.id.DEL:
				
				if (app.pdan >= 0) {
					del(app.shu1.get(app.pdan));
					Toast.makeText(cxhygActivity.this, "数据删除成功",
							Toast.LENGTH_SHORT).show();

				} else if (app.add == false) {
					Toast.makeText(cxhygActivity.this, "当前没有数据",
							Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.EXIT:
				cxhygActivity.this.finish();
				break;
			default:
				break;
			}
		}
	};

	public void shujkj() {
		app.shu1.add("Primary");
		app.shu1.add("Medium");
		app.shu1.add("Senior");
		app.shu1.add("CUSTOM1");
		app.shu1.add("CUSTOM2");
		app.shu1.add("CUSTOM3");
		app.shu1.add("CUSTOM4");
		app.shu1.add("CUSTOM5");
		app.shu1.add("CUSTOM6");
		app.shu1.add("CUSTOM7");
		app.shu1.add("CUSTOM8");
		app.shu1.add("CUSTOM9");
	}

	
	public void del(String shu) {
		mySharedPreferences = getSharedPreferences(shu, MODE_PRIVATE);

		SharedPreferences.Editor editor = mySharedPreferences.edit();

		editor.remove("optometry");

		editor.commit();

		if (app.pdan == 0)
			app.STANDARD.clear();
		tv1.setText(app.STANDARD.size() + "/50");
		if (app.pdan == 1)
			app.CUSTOM1.clear();
		tv1.setText(app.CUSTOM1.size() + "/50");
		if (app.pdan == 2)
			app.CUSTOM2.clear();
		tv1.setText(app.CUSTOM2.size() + "/50");
		if (app.pdan == 3)
			app.CUSTOM3.clear();
		tv1.setText(app.CUSTOM3.size() + "/50");
		if (app.pdan == 4)
			app.CUSTOM4.clear();
		tv1.setText(app.CUSTOM4.size() + "/50");
		if (app.pdan == 5)
			app.CUSTOM5.clear();
		tv1.setText(app.CUSTOM5.size() + "/50");
		if (app.pdan == 6)
			app.CUSTOM6.clear();
		tv1.setText(app.CUSTOM6.size() + "/50");
		if (app.pdan == 7)
			app.CUSTOM7.clear();
		tv1.setText(app.CUSTOM7.size() + "/50");
		if (app.pdan == 8)
			app.CUSTOM8.clear();
		tv1.setText(app.CUSTOM8.size() + "/50");
		if (app.pdan == 9)
			app.CUSTOM9.clear();
		tv1.setText(app.CUSTOM9.size() + "/50");
		if (app.pdan == 10)
			app.CUSTOM10.clear();
		tv1.setText(app.CUSTOM10.size() + "/50");
		if (app.pdan == 11)
			app.CUSTOM11.clear();
		tv1.setText(app.CUSTOM11.size() + "/50");
	}

	public void saveArray_STA() {
		mySharedPreferences = getSharedPreferences("STANDARD",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.STANDARD.size()); /* sKey is an array */
		for (int i = 0; i < app.STANDARD.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.STANDARD.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS2() {
		mySharedPreferences = getSharedPreferences("CUSTOM2",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM2.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM2.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM2.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS3() {
		mySharedPreferences = getSharedPreferences("CUSTOM3",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM3.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM3.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM3.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS4() {
		mySharedPreferences = getSharedPreferences("CUSTOM4",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM4.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM4.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM4.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS5() {
		mySharedPreferences = getSharedPreferences("CUSTOM5",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM5.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM5.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM5.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS6() {
		mySharedPreferences = getSharedPreferences("CUSTOM6",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM6.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM6.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM6.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS7() {
		mySharedPreferences = getSharedPreferences("CUSTOM7",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM7.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM7.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM7.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS8() {
		mySharedPreferences = getSharedPreferences("CUSTOM8",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM8.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM8.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM8.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS9() {
		mySharedPreferences = getSharedPreferences("CUSTOM9",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM9.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM9.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM9.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS10() {
		mySharedPreferences = getSharedPreferences("CUSTOM10",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM10.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM10.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM10.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS11() {
		mySharedPreferences = getSharedPreferences("CUSTOM11",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM11.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM11.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM11.get(i));
		}
		editor.commit();
	}

	public void saveArray_CUS1() {
		mySharedPreferences = getSharedPreferences("CUSTOM1",
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putInt("optometry", app.CUSTOM1.size()); /* sKey is an array */
		for (int i = 0; i < app.CUSTOM1.size(); i++) {
			editor.remove("optometry_" + i);
			editor.putString("optometry_" + i, app.CUSTOM1.get(i));
		}
		editor.commit();
	}

	public void Change(int ImMState) {
		switch (ImMState) {
		case Constants.IMG_0:
			app.state = Constants.IMG_0;
			lv_x.setVisibility(View.VISIBLE);
			mImg_1.setVisibility(View.GONE);
			mImg_2.setVisibility(View.GONE);
			mImg_3.setVisibility(View.GONE);
			mImg_4.setVisibility(View.GONE);
			break;
		case Constants.IMG_1:
			app.state = Constants.IMG_1;
			lv_x.setVisibility(View.GONE);
			mImg_1.setVisibility(View.VISIBLE);
			mImg_2.setVisibility(View.GONE);
			mImg_3.setVisibility(View.GONE);
			mImg_4.setVisibility(View.GONE);
			break;
		case Constants.IMG_2:
			app.state = Constants.IMG_2;
			lv_x.setVisibility(View.GONE);
			mImg_1.setVisibility(View.GONE);
			mImg_2.setVisibility(View.VISIBLE);
			mImg_3.setVisibility(View.GONE);
			mImg_4.setVisibility(View.GONE);
			break;
		case Constants.IMG_3:
			app.state = Constants.IMG_3;
			lv_x.setVisibility(View.GONE);
			mImg_1.setVisibility(View.GONE);
			mImg_2.setVisibility(View.GONE);
			mImg_3.setVisibility(View.VISIBLE);
			mImg_4.setVisibility(View.GONE);
			break;
		case Constants.IMG_4:
			app.state = Constants.IMG_4;
			lv_x.setVisibility(View.GONE);
			mImg_1.setVisibility(View.GONE);
			mImg_2.setVisibility(View.GONE);
			mImg_3.setVisibility(View.GONE);
			mImg_4.setVisibility(View.VISIBLE);
			break;

		default:
			break;
		}
	}

	public void Img_1_init(String l, int c1, String r) {
		txt_img_2_1_l.setText(l);
		img_img_2_1_c1.setImageResource(c1);
	}

	public void Img_2_init(String l, int c1, int c2, String r) {
		txt_img_2_1_l.setText(l);
		img_img_2_1_c1.setImageResource(c1);
		img_img_2_1_c2.setImageResource(c2);
		txt_img_2_1_r.setText(r);
	}
	


	public void Img_3_init(String t_l, int t_c1, int t_c2, int t_c3,
			String t_r, String b_l, int b_c1, int b_c2, int b_c3, String b_r) {
		txt_img_3_1_l.setText(t_l);
		img_img_3_1_c1.setImageResource(t_c1);
		img_img_3_1_c2.setImageResource(t_c2);
		img_img_3_1_c3.setImageResource(t_c3);
		txt_img_3_1_r.setText(t_r);

		txt_img_3_2_l.setText(b_l);
		img_img_3_2_c1.setImageResource(b_c1);
		img_img_3_2_c2.setImageResource(b_c2);
		img_img_3_2_c3.setImageResource(b_c3);
		txt_img_3_2_r.setText(b_r);
	}

	public void Img_4_init(String t_l, int t_c1, int t_c2, int t_c3, int t_c4,
			String t_r, String c_l, int c_c1, int c_c2, int c_c3, int c_c4,
			String c_r, String b_l, int b_c1, int b_c2, int b_c3, int b_c4,
			String b_r) {
		txt_img_4_1_l.setText(t_l);
		img_img_4_1_c1.setImageResource(t_c1);
		img_img_4_1_c2.setImageResource(t_c2);
		img_img_4_1_c3.setImageResource(t_c3);
		img_img_4_1_c4.setImageResource(t_c4);
		txt_img_4_1_r.setText(t_r);

		txt_img_4_2_l.setText(c_l);
		img_img_4_2_c1.setImageResource(c_c1);
		img_img_4_2_c2.setImageResource(c_c2);
		img_img_4_2_c3.setImageResource(c_c3);
		img_img_4_2_c4.setImageResource(c_c4);
		txt_img_4_2_r.setText(c_r);

		txt_img_4_3_l.setText(b_l);
		img_img_4_3_c1.setImageResource(b_c1);
		img_img_4_3_c2.setImageResource(b_c2);
		img_img_4_3_c3.setImageResource(b_c3);
		img_img_4_3_c4.setImageResource(b_c4);
		txt_img_4_3_r.setText(b_r);
	}

}
