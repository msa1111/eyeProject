package com.dingzhou.eye;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dingzhou.eye.SelectChange.ImgUtil;
import com.dingzhou.eye.SelectChange.ImgViewVessel;
import com.dingzhou.eye.SelectChange.ImgViewVessel_2;
import com.dingzhou.eye.SelectChange.ImgViewVessel_3;
import com.dingzhou.eye.SelectChange.ImgViewVessel_4;
import com.dingzhou.eye.tool.BtAPI;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.tool.BtAPI.DeviceState;
import com.dingzhou.eye.util.Device;
import com.dingzhou.eye.R;


public class FragmentRight extends Fragment {
	private ImageView e_1;
	private ImageView e_2;
	private ImageView e_3;
	private ImageView e_4;
	private ImageView e_5;
	private ImageView e_6;
	private ImageView e_7;
	private ImageView e_8;
	private ImageView c_1;
	private ImageView c_2;
	private ImageView c_3;
	private ImageView c_4;
	private ImageView c_5;
	private ImageView c_6;
	private ImageView c_7;
	private ImageView c_8;
	private ImageView h_1;
	private ImageView h_2;
	private ImageView h_3;
	private ImageView h_4;
	
	private ImageView z_4;
	private ImageView z_8;
	private ImageView z_9;
	private ImageView z_12;
	private ImageView z_13;
	


	public TextView mtv;
	private Context mContext;

	public LinearLayout mll_e1;
	public LinearLayout mll_e2;
	public LinearLayout mll_e3;
	public LinearLayout mll_e4;
	public LinearLayout mll_e5;
	public LinearLayout mll_e6;
	public LinearLayout mll_e7;
	public LinearLayout mll_e8;

	public LinearLayout mll_c1;
	public LinearLayout mll_c2;
	public LinearLayout mll_c3;
	public LinearLayout mll_c4;
	public LinearLayout mll_c5;
	public LinearLayout mll_c6;
	public LinearLayout mll_c7;
	public LinearLayout mll_c8;

	public LinearLayout mll_h1;
	public LinearLayout mll_h2;
	public LinearLayout mll_h3;
	public LinearLayout mll_h4;

	public LinearLayout mll_z1;
	public LinearLayout mll_z2;
	public LinearLayout mll_z3;
	public LinearLayout mll_z4;
	public LinearLayout mll_z5;
	public LinearLayout mll_z6;
	public LinearLayout mll_z7;
	public LinearLayout mll_z8;
	public LinearLayout mll_z9;
	public LinearLayout mll_z10;
	public LinearLayout mll_z11;
	public LinearLayout mll_z12;
	public LinearLayout mll_z13;
	public LinearLayout mll_z14;
	public LinearLayout mll_z15;
	
	private ImageButton mIb_kz1;
	private ImageButton mIb_kz2;
	private ImageButton mIb_kz3;
	private ImageButton mIb_kz4;
	private ImageButton mIb_kz5;
	
	private Button mBtnUp;
	private Button mBtnLeft;
	private Button mBtnDown;
	private Button mBtnRight;
	
	public ImageView mImg_view;
	public LinearLayout mImg_1;
	public LinearLayout mImg_2;
	public LinearLayout mImg_3;
	public LinearLayout mImg_4;
	public LinearLayout mImg_5;
	
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
	
		public TextView txt_img_5_1_l;
		public ImageView img_img_5_1_c1;
		public ImageView img_img_5_1_c2;
		public ImageView img_img_5_1_c3;
		public ImageView img_img_5_1_c4;
		public ImageView img_img_5_1_c5;
		public TextView txt_img_5_1_r;
		public TextView txt_img_5_2_l;
		public ImageView img_img_5_2_c1;
		public ImageView img_img_5_2_c2;
		public ImageView img_img_5_2_c3;
		public ImageView img_img_5_2_c4;
		public ImageView img_img_5_2_c5;
		public TextView txt_img_5_2_r;
		public TextView txt_img_5_3_l;
		public ImageView img_img_5_3_c1;
		public ImageView img_img_5_3_c2;
		public ImageView img_img_5_3_c3;
		public ImageView img_img_5_3_c4;
		public ImageView img_img_5_3_c5;
		public TextView txt_img_5_3_r;
	private MyApp app;
	private ImgUtil imgUtil;
	public ImgViewVessel vessel;
	protected FragmentRight mActivity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_right, null);
		app = (MyApp) getActivity().getApplication();
		mContext = getActivity();
		imgUtil = new ImgUtil(this);
		mActivity = this;
		app.cdReadl();
		init(view);
		choice();
		return view;
	}

	private void choice(){
		if(app.chartor.equals("7"))
		{
			e_1.setImageResource(R.drawable.e_1);
			e_2.setImageResource(R.drawable.e_2);
			e_3.setImageResource(R.drawable.e_3);
			e_4.setImageResource(R.drawable.e_4);
			e_5.setImageResource(R.drawable.e_5);
			e_6.setImageResource(R.drawable.e_6);
			e_8.setImageResource(R.drawable.e_8);
			e_7.setImageResource(R.drawable.e_7);
			c_1.setImageResource(R.drawable.c_1);
			c_2.setImageResource(R.drawable.c_2);
			c_3.setImageResource(R.drawable.c_3);
			c_4.setImageResource(R.drawable.c_4);
			c_5.setImageResource(R.drawable.c_5);
			c_6.setImageResource(R.drawable.c_6);
			c_7.setImageResource(R.drawable.c_7);
			c_8.setImageResource(R.drawable.c_8);
			h_1.setImageResource(R.drawable.h_1);
			h_2.setImageResource(R.drawable.h_2);
			h_3.setImageResource(R.drawable.h_3);
			h_4.setImageResource(R.drawable.h_4);
			z_4.setImageResource(R.drawable.z_4);
			z_12.setImageResource(R.drawable.z_12);
			z_13.setImageResource(R.drawable.z_13);
			z_8.setImageResource(R.drawable.z_8);
			z_9.setImageResource(R.drawable.z_9);
			
		}
		else if(app.chartor.equals("8")||app.chartor.equals("6"))
		{
			e_1.setImageResource(R.drawable.acp_8_e_1);
			e_2.setImageResource(R.drawable.acp_8_c_3);
			e_3.setImageResource(R.drawable.acp_8_k_1);
			e_4.setImageResource(R.drawable.acp_8_h_2);
			e_5.setImageResource(R.drawable.acp_8_e_2);
			e_6.setImageResource(R.drawable.acp_8_s_2);
			e_7.setImageResource(R.drawable.acp_8_k_2);
			e_8.setImageResource(R.drawable.acp_8_h_3);
			c_1.setImageResource(R.drawable.acp_8_e_6);
			c_2.setImageResource(R.drawable.acp_8_s_3);
			c_3.setImageResource(R.drawable.acp_8_k_3);
			c_4.setImageResource(R.drawable.acp_8_h_4);
			c_5.setImageResource(R.drawable.acp_8_e_7);
			c_6.setImageResource(R.drawable.acp_8_s_4);
			c_7.setImageResource(R.drawable.acp_8_k_4);
			c_8.setImageResource(R.drawable.btn_ce_r_b);
			h_1.setImageResource(R.drawable.acp_8_e_8);
			h_2.setImageResource(R.drawable.acp_8_s_5);
			h_3.setImageResource(R.drawable.acp_8_k_5);
			h_4.setImageResource(R.drawable.acp_8_k_6);
			z_4.setImageResource(R.drawable.z_4);
			z_12.setImageResource(R.drawable.z_12);
			z_13.setImageResource(R.drawable.z_13);
			z_8.setImageResource(R.drawable.z_8);
			z_9.setImageResource(R.drawable.z_9);
			
		}
		else if(app.chartor.equals("100"))
		{
			e_1.setImageResource(R.drawable.acp_8_e_1);
			e_2.setImageResource(R.drawable.acp_8_c_3);
			e_3.setImageResource(R.drawable.acp_100c_1);
			e_4.setImageResource(R.drawable.acp_8_h_2);
			e_5.setImageResource(R.drawable.acp_8_e_2);
			e_6.setImageResource(R.drawable.acp_8_s_2);
			e_7.setImageResource(R.drawable.acp_100c_2);
			e_8.setImageResource(R.drawable.acp_8_h_3);
			c_1.setImageResource(R.drawable.acp_8_e_6);
			c_2.setImageResource(R.drawable.acp_8_s_3);
			c_3.setImageResource(R.drawable.acp_100c_3);
			c_4.setImageResource(R.drawable.acp_8_h_4);
			c_5.setImageResource(R.drawable.acp_8_e_7);
			c_6.setImageResource(R.drawable.acp_8_s_4);
			c_7.setImageResource(R.drawable.acp_100c_4);
			c_8.setImageResource(R.drawable.btn_ce_r_b);
			h_1.setImageResource(R.drawable.acp_8_e_8);
			h_2.setImageResource(R.drawable.acp_8_s_5);
			h_3.setImageResource(R.drawable.acp_100c_5);
			h_4.setImageResource(R.drawable.acp_100c_6);
			z_4.setImageResource(R.drawable.z_4);
			z_12.setImageResource(R.drawable.z_12);
			z_13.setImageResource(R.drawable.z_13);
			z_8.setImageResource(R.drawable.z_8);
			z_9.setImageResource(R.drawable.z_9);
		}
		else if(app.chartor.equals("2"))
		{
			e_1.setImageResource(R.drawable.acp_8_b_e1);
			e_2.setImageResource(R.drawable.acp_8_b_k1);
			e_3.setImageResource(R.drawable.acp_8_b_c1);
			e_4.setImageResource(R.drawable.acp_8_b_h1);
			e_5.setImageResource(R.drawable.acp_8_b_e2);
			e_6.setImageResource(R.drawable.acp_8_b_k2);
			e_7.setImageResource(R.drawable.acp_8_b_c2);
			e_8.setImageResource(R.drawable.acp_8_b_h2);
			c_1.setImageResource(R.drawable.acp_8_b_e3);
			c_2.setImageResource(R.drawable.acp_8_b_k3);
			c_3.setImageResource(R.drawable.acp_8_b_c3);
			c_4.setImageResource(R.drawable.acp_8_b_h3);
			c_5.setImageResource(R.drawable.acp_8_b_e4);
			c_6.setImageResource(R.drawable.acp_8_b_k4);
			c_7.setImageResource(R.drawable.acp_8_b_c4);
			c_8.setImageResource(R.drawable.acp_8_b_s1);
			h_1.setImageResource(R.drawable.acp_8_b_e5);
			h_2.setImageResource(R.drawable.acp_8_b_k5);
			h_3.setImageResource(R.drawable.acp_8_b_s3);
			h_4.setImageResource(R.drawable.acp_8_b_s2);
			z_4.setImageResource(R.drawable.explain_kong);
			z_12.setImageResource(R.drawable.z_12);
			z_13.setImageResource(R.drawable.z_13);
			z_8.setImageResource(R.drawable.explain_kong);
			z_9.setImageResource(R.drawable.z_9);
		}
	}
	
	
	private void init(View view) {
		
		e_1 = (ImageView) view.findViewById(R.id.e_1);
		e_2 = (ImageView) view.findViewById(R.id.e_2);
		e_3 = (ImageView) view.findViewById(R.id.e_3);
		e_4 = (ImageView) view.findViewById(R.id.e_4);
		e_5 = (ImageView) view.findViewById(R.id.e_5);
		e_6 = (ImageView) view.findViewById(R.id.e_6);
		e_7 = (ImageView) view.findViewById(R.id.e_7);
		e_8 = (ImageView) view.findViewById(R.id.e_8);
		c_1 = (ImageView) view.findViewById(R.id.c_1);
		c_2 = (ImageView) view.findViewById(R.id.c_2);
		c_3 = (ImageView) view.findViewById(R.id.c_3);
		c_4 = (ImageView) view.findViewById(R.id.c_4);
		c_5 = (ImageView) view.findViewById(R.id.c_5);
		c_6 = (ImageView) view.findViewById(R.id.c_6);
		c_7 = (ImageView) view.findViewById(R.id.c_7);
		c_8 = (ImageView) view.findViewById(R.id.c_8);
		h_1= (ImageView) view.findViewById(R.id.h_1);
		h_2= (ImageView) view.findViewById(R.id.h_2);
		h_3= (ImageView) view.findViewById(R.id.h_3);
		h_4= (ImageView) view.findViewById(R.id.h_4);
		
		z_4= (ImageView) view.findViewById(R.id.z_4);
		z_8= (ImageView) view.findViewById(R.id.z_8);
		z_9= (ImageView) view.findViewById(R.id.z_9);
		z_12= (ImageView) view.findViewById(R.id.z_12);
		z_13= (ImageView) view.findViewById(R.id.z_13);
		

		
		mtv = (TextView) view.findViewById(R.id.TTV);
		mll_e1 = (LinearLayout) view.findViewById(R.id.ll_e1);
		mll_e1.setOnClickListener(MyClick);
		mll_e2 = (LinearLayout) view.findViewById(R.id.ll_e2);
		mll_e2.setOnClickListener(MyClick);
		mll_e3 = (LinearLayout) view.findViewById(R.id.ll_e3);
		mll_e3.setOnClickListener(MyClick);
		mll_e4 = (LinearLayout) view.findViewById(R.id.ll_e4);
		mll_e4.setOnClickListener(MyClick);
		mll_e5 = (LinearLayout) view.findViewById(R.id.ll_e5);
		mll_e5.setOnClickListener(MyClick);
		mll_e6 = (LinearLayout) view.findViewById(R.id.ll_e6);
		mll_e6.setOnClickListener(MyClick);
		mll_e7 = (LinearLayout) view.findViewById(R.id.ll_e7);
		mll_e7.setOnClickListener(MyClick);
		mll_e8 = (LinearLayout) view.findViewById(R.id.ll_e8);
		mll_e8.setOnClickListener(MyClick);
	
		mll_c1 = (LinearLayout) view.findViewById(R.id.ll_c1);
		mll_c1.setOnClickListener(MyClick);
		mll_c2 = (LinearLayout) view.findViewById(R.id.ll_c2);
		mll_c2.setOnClickListener(MyClick);
		mll_c3 = (LinearLayout) view.findViewById(R.id.ll_c3);
		mll_c3.setOnClickListener(MyClick);
		mll_c4 = (LinearLayout) view.findViewById(R.id.ll_c4);
		mll_c4.setOnClickListener(MyClick);
		mll_c5 = (LinearLayout) view.findViewById(R.id.ll_c5);
		mll_c5.setOnClickListener(MyClick);
		mll_c6 = (LinearLayout) view.findViewById(R.id.ll_c6);
		mll_c6.setOnClickListener(MyClick);
		mll_c7 = (LinearLayout) view.findViewById(R.id.ll_c7);
		mll_c7.setOnClickListener(MyClick);
		mll_c8 = (LinearLayout) view.findViewById(R.id.ll_c8);
		mll_c8.setOnClickListener(MyClick);
	
		mll_h1 = (LinearLayout) view.findViewById(R.id.ll_h1);
		mll_h1.setOnClickListener(MyClick);
		mll_h2 = (LinearLayout) view.findViewById(R.id.ll_h2);
		mll_h2.setOnClickListener(MyClick);
		mll_h3 = (LinearLayout) view.findViewById(R.id.ll_h3);
		mll_h3.setOnClickListener(MyClick);
		mll_h4 = (LinearLayout) view.findViewById(R.id.ll_h4);
		mll_h4.setOnClickListener(MyClick);

		
		mll_z1 = (LinearLayout) view.findViewById(R.id.ll_z1);
		mll_z1.setOnClickListener(MyClick);
		mll_z2 = (LinearLayout) view.findViewById(R.id.ll_z2);
		mll_z2.setOnClickListener(MyClick);
		mll_z3 = (LinearLayout) view.findViewById(R.id.ll_z3);
		mll_z3.setOnClickListener(MyClick);
		mll_z4 = (LinearLayout) view.findViewById(R.id.ll_z4);
		mll_z4.setOnClickListener(MyClick);
		mll_z5 = (LinearLayout) view.findViewById(R.id.ll_z5);
		mll_z5.setOnClickListener(MyClick);
		mll_z6 = (LinearLayout) view.findViewById(R.id.ll_z6);
		mll_z6.setOnClickListener(MyClick);
		mll_z7 = (LinearLayout) view.findViewById(R.id.ll_z7);
		mll_z7.setOnClickListener(MyClick);
		mll_z8 = (LinearLayout) view.findViewById(R.id.ll_z8);
		mll_z8.setOnClickListener(MyClick);
		mll_z9 = (LinearLayout) view.findViewById(R.id.ll_z9);
		mll_z9.setOnClickListener(MyClick);
		mll_z10 = (LinearLayout) view.findViewById(R.id.ll_z10);
		mll_z10.setOnClickListener(MyClick);
		mll_z11 = (LinearLayout) view.findViewById(R.id.ll_z11);
		mll_z11.setOnClickListener(MyClick);
		mll_z12 = (LinearLayout) view.findViewById(R.id.ll_z12);
		mll_z12.setOnClickListener(MyClick);
		mll_z13 = (LinearLayout) view.findViewById(R.id.ll_z13);
		mll_z13.setOnClickListener(MyClick);
		
		mll_z14 = (LinearLayout) view.findViewById(R.id.ll_z14);
		mll_z14.setOnClickListener(MyClick);
		
		mll_z15 = (LinearLayout) view.findViewById(R.id.ll_z15);
		mll_z15.setOnClickListener(MyClick);
		
		mIb_kz1 = (ImageButton) view.findViewById(R.id.img_kz_1);
		mIb_kz1.setOnClickListener(MyClick);
		mIb_kz2 = (ImageButton) view.findViewById(R.id.img_kz_2);
		mIb_kz2.setOnClickListener(MyClick);
		mIb_kz3 = (ImageButton) view.findViewById(R.id.img_kz_3);
		mIb_kz3.setOnClickListener(MyClick);
		mIb_kz4 = (ImageButton) view.findViewById(R.id.img_kz_4);
		mIb_kz4.setOnClickListener(MyClick);
		mIb_kz5 = (ImageButton) view.findViewById(R.id.img_kz_5);
		mIb_kz5.setOnClickListener(MyClick);
	
		mImg_view = (ImageView) view.findViewById(R.id.img_mian_0);
		mImg_1 = (LinearLayout) view.findViewById(R.id.img_1_mian);
		mImg_2 = (LinearLayout) view.findViewById(R.id.img_2_mian);
		mImg_3 = (LinearLayout) view.findViewById(R.id.img_3_mian);
		mImg_4 = (LinearLayout) view.findViewById(R.id.img_4_mian);
		mImg_5 = (LinearLayout) view.findViewById(R.id.img_5_mian);
		
		txt_img_1_l = (TextView) view.findViewById(R.id.txt_img_1_l);
		img_img_1_c = (ImageView) view.findViewById(R.id.img_img_1_c);
		txt_img_1_r = (TextView) view.findViewById(R.id.txt_img_1_r);
		
		txt_img_2_1_l = (TextView) view.findViewById(R.id.txt_img_2_1_l);
		img_img_2_1_c1 = (ImageView) view.findViewById(R.id.img_img_2_1_c1);
		img_img_2_1_c2 = (ImageView) view.findViewById(R.id.img_img_2_1_c2);
		txt_img_2_1_r = (TextView) view.findViewById(R.id.txt_img_2_1_r);
		
		txt_img_3_1_l = (TextView) view.findViewById(R.id.txt_img_3_1_l);
		img_img_3_1_c1 = (ImageView) view.findViewById(R.id.img_img_3_1_c1);
		img_img_3_1_c2 = (ImageView) view.findViewById(R.id.img_img_3_1_c2);
		img_img_3_1_c3 = (ImageView) view.findViewById(R.id.img_img_3_1_c3);
		txt_img_3_1_r = (TextView) view.findViewById(R.id.txt_img_3_1_r);

		txt_img_3_2_l = (TextView) view.findViewById(R.id.txt_img_3_2_l);
		img_img_3_2_c1 = (ImageView) view.findViewById(R.id.img_img_3_2_c1);
		img_img_3_2_c2 = (ImageView) view.findViewById(R.id.img_img_3_2_c2);
		img_img_3_2_c3 = (ImageView) view.findViewById(R.id.img_img_3_2_c3);
		txt_img_3_2_r = (TextView) view.findViewById(R.id.txt_img_3_2_r);
		
		txt_img_4_1_l = (TextView) view.findViewById(R.id.txt_img_4_1_l);
		img_img_4_1_c1 = (ImageView) view.findViewById(R.id.img_img_4_1_c1);
		img_img_4_1_c2 = (ImageView) view.findViewById(R.id.img_img_4_1_c2);
		img_img_4_1_c3 = (ImageView) view.findViewById(R.id.img_img_4_1_c3);
		img_img_4_1_c4 = (ImageView) view.findViewById(R.id.img_img_4_1_c4);
		txt_img_4_1_r = (TextView) view.findViewById(R.id.txt_img_4_1_r);

		txt_img_4_2_l = (TextView) view.findViewById(R.id.txt_img_4_2_l);
		img_img_4_2_c1 = (ImageView) view.findViewById(R.id.img_img_4_2_c1);
		img_img_4_2_c2 = (ImageView) view.findViewById(R.id.img_img_4_2_c2);
		img_img_4_2_c3 = (ImageView) view.findViewById(R.id.img_img_4_2_c3);
		img_img_4_2_c4 = (ImageView) view.findViewById(R.id.img_img_4_2_c4);
		txt_img_4_2_r = (TextView) view.findViewById(R.id.txt_img_4_2_r);

		txt_img_4_3_l = (TextView) view.findViewById(R.id.txt_img_4_3_l);
		img_img_4_3_c1 = (ImageView) view.findViewById(R.id.img_img_4_3_c1);
		img_img_4_3_c2 = (ImageView) view.findViewById(R.id.img_img_4_3_c2);
		img_img_4_3_c3 = (ImageView) view.findViewById(R.id.img_img_4_3_c3);
		img_img_4_3_c4 = (ImageView) view.findViewById(R.id.img_img_4_3_c4);
		txt_img_4_3_r = (TextView) view.findViewById(R.id.txt_img_4_3_r);
		
		
				if(app.chartor.equals("7"))
				{
					txt_img_4_1_l = (TextView) view.findViewById(R.id.txt_img_4_1_l);
					img_img_4_1_c1 = (ImageView) view.findViewById(R.id.img_img_4_1_c1);
					img_img_4_1_c2 = (ImageView) view.findViewById(R.id.img_img_4_1_c2);
					img_img_4_1_c3 = (ImageView) view.findViewById(R.id.img_img_4_1_c3);
					img_img_4_1_c4 = (ImageView) view.findViewById(R.id.img_img_4_1_c4);
					txt_img_4_1_r = (TextView) view.findViewById(R.id.txt_img_4_1_r);
			
					txt_img_4_2_l = (TextView) view.findViewById(R.id.txt_img_4_2_l);
					img_img_4_2_c1 = (ImageView) view.findViewById(R.id.img_img_4_2_c1);
					img_img_4_2_c2 = (ImageView) view.findViewById(R.id.img_img_4_2_c2);
					img_img_4_2_c3 = (ImageView) view.findViewById(R.id.img_img_4_2_c3);
					img_img_4_2_c4 = (ImageView) view.findViewById(R.id.img_img_4_2_c4);
					txt_img_4_2_r = (TextView) view.findViewById(R.id.txt_img_4_2_r);
			
					txt_img_4_3_l = (TextView) view.findViewById(R.id.txt_img_4_3_l);
					img_img_4_3_c1 = (ImageView) view.findViewById(R.id.img_img_4_3_c1);
					img_img_4_3_c2 = (ImageView) view.findViewById(R.id.img_img_4_3_c2);
					img_img_4_3_c3 = (ImageView) view.findViewById(R.id.img_img_4_3_c3);
					img_img_4_3_c4 = (ImageView) view.findViewById(R.id.img_img_4_3_c4);
					txt_img_4_3_r = (TextView) view.findViewById(R.id.txt_img_4_3_r);
					
				}
				else if(app.chartor.equals("2") ||app.chartor.equals("6") ||app.chartor.equals("8") || app.chartor.equals("100"))
				{
					txt_img_5_1_l = (TextView) view.findViewById(R.id.txt_img_5_1_l);
					img_img_5_1_c1 = (ImageView)view. findViewById(R.id.img_img_5_1_c1);
					img_img_5_1_c2 = (ImageView) view.findViewById(R.id.img_img_5_1_c2);
					img_img_5_1_c3 = (ImageView) view.findViewById(R.id.img_img_5_1_c3);
					img_img_5_1_c4 = (ImageView) view.findViewById(R.id.img_img_5_1_c4);
					img_img_5_1_c5 = (ImageView) view.findViewById(R.id.img_img_5_1_c5);
					txt_img_5_1_r = (TextView) view.findViewById(R.id.txt_img_5_1_r);

					txt_img_5_2_l = (TextView) view.findViewById(R.id.txt_img_5_2_l);
					img_img_5_2_c1 = (ImageView) view.findViewById(R.id.img_img_5_2_c1);
					img_img_5_2_c2 = (ImageView)view. findViewById(R.id.img_img_5_2_c2);
					img_img_5_2_c3 = (ImageView)view. findViewById(R.id.img_img_5_2_c3);
					img_img_5_2_c4 = (ImageView)view. findViewById(R.id.img_img_5_2_c4);
					img_img_5_2_c5 = (ImageView) view.findViewById(R.id.img_img_5_2_c5);
					txt_img_5_2_r = (TextView) view.findViewById(R.id.txt_img_5_2_r);

					txt_img_5_3_l = (TextView) view.findViewById(R.id.txt_img_5_3_l);
					img_img_5_3_c1 = (ImageView)view.findViewById(R.id.img_img_5_3_c1);
					img_img_5_3_c2 = (ImageView)view.findViewById(R.id.img_img_5_3_c2);
					img_img_5_3_c3 = (ImageView)view.findViewById(R.id.img_img_5_3_c3);
					img_img_5_3_c4 = (ImageView)view.findViewById(R.id.img_img_5_3_c4);
					img_img_5_3_c5 = (ImageView) view.findViewById(R.id.img_img_5_3_c5);
					txt_img_5_3_r = (TextView) view.findViewById(R.id.txt_img_5_3_r);
					
				}
		
		
		mBtnUp = (Button) view.findViewById(R.id.btn_up);
		mBtnUp.setOnClickListener(MyItemClick);
		mBtnLeft = (Button) view.findViewById(R.id.btn_left);
		mBtnLeft.setOnClickListener(MyItemClick);
		mBtnDown = (Button) view.findViewById(R.id.config_view);
		mBtnDown.setOnClickListener(MyItemClick);
		mBtnRight = (Button) view.findViewById(R.id.btn_right);
		mBtnRight.setOnClickListener(MyItemClick);

	}

    
	public void bothopen() {
		FragmentManager fm1 = getActivity().getSupportFragmentManager();
		FragmentLeft fragmentleftc = (FragmentLeft) fm1
				.findFragmentById(R.id.frag_left);
		if (app.txtCount == Constants.EYE_L) {
			if (fragmentleftc != null)
				fragmentleftc.chartdual_L();
		}else if(app.txtCount == Constants.EYE_R){
			if (fragmentleftc != null)
				fragmentleftc.chartdual_R();
	    }else if(app.txtCount == Constants.EYE_D){
			if (fragmentleftc != null){
				app.pzy = 3;
				fragmentleftc.chartdual();
			}
		}
	}
	
	public void yinc(){
		FragmentManager fm_2 = getActivity().getSupportFragmentManager();
		FragmentLeft fragmentLeft2 = (FragmentLeft) fm_2.findFragmentById(R.id.frag_left);
		if (fragmentLeft2 != null)
		if(app.Trl == true){
			fragmentLeft2.lv_1.setVisibility(View.INVISIBLE);
			fragmentLeft2.lv_2.setVisibility(View.INVISIBLE);
			fragmentLeft2.lv_3.setVisibility(View.INVISIBLE);
			fragmentLeft2.lv_4.setVisibility(View.INVISIBLE);
			}else if (app.Trl == false){			
			fragmentLeft2.lv.setVisibility(View.INVISIBLE);
			fragmentLeft2._lv1.setVisibility(View.INVISIBLE);
			fragmentLeft2._lv2.setVisibility(View.INVISIBLE);
			fragmentLeft2._lv3.setVisibility(View.INVISIBLE);
			}
	}

	
	private OnClickListener MyClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			app.change = 0;
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
			switch (v.getId()) {
			case R.id.ll_e1:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;

				app.Lr = false;
				app._cfll = true;
				app.Lr = false;
				yinc();
				if(app.chartor.equals("7"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;

					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E1;

					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_bottom,
							R.drawable.e_right, "0.1");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,Constants.KEY_E1);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_H1;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_right,
							R.drawable.e_right, "0.05");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H1);
					bothopen();
					app._cfll = false;
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E3;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E3);
					bothopen();
					app._cfll = false;	
				}
				break;
			case R.id.ll_e2:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				if(app.chartor.equals("7"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E2;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left,
							"0.12");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E2);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_K;
					app.keyDown = Constants.KEY_E2;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E2); 
					bothopen();
					app._cfll = false;							
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_E1;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "0.10", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E1); 
					bothopen();
					app._cfll = false;		
				}
				break;
			case R.id.ll_e3:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				if(app.chartor.equals("7"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E3;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_right,
							R.drawable.e_bottom, "0.15");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E3);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H6;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_right_bottom, "0.2", "", R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_left_top,
							R.drawable.c_right_top, R.drawable.c_top,"0.3", "", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top,  R.drawable.c_left_bottom, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H6);
					bothopen();
					app._cfll = false;					
				}
	
				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H1;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.s_14, R.drawable.s_14, "0.05");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H1);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H1;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_right, "0.05");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H1);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_e4:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				
				if(app.chartor.equals("7"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;

					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E4;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_right,
							R.drawable.e_left, R.drawable.e_top, "0.20", "",
							R.drawable.e_top, R.drawable.e_bottom,
							R.drawable.e_left, "0.25");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E4);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_C5;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly,
							R.drawable.ship, "0.1");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C5);
					bothopen();
					app._cfll = false;
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;

					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H6;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "0.1");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H6);
					bothopen();
					app._cfll = false;	
				}
				break;
			case R.id.ll_e5:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;

					app.keyDown = Constants.KEY_E5;
					app.c_e_h = Constants.CONTENT_E;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left,
							R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom,
							R.drawable.e_top, R.drawable.e_right, "0.4");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E5);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if(app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E3;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E3); 
					bothopen();
					app._cfll = false;							
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;

					app.keyDown = Constants.KEY_E6;
					app.c_e_h = Constants.CONTENT_E;

					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("",R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
							R.drawable.e_top, "0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E6);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.keyDown = Constants.KEY_E6;
					app.c_e_h = Constants.CONTENT_E;
//					imgUtil.Change(Constants.IMG_3);
//					imgUtil.Img_3_init("0.3", R.drawable.e_top, R.drawable.e_left,
//							R.drawable.e_bottom, "4.5", "0.4", R.drawable.e_bottom,
//							R.drawable.e_top, R.drawable.e_right, "4.6");
//					vessel = ImgViewVessel_3.getInstance(mActivity);
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("",R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
							R.drawable.e_top, "0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E6);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_e6:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E6;
					imgUtil.Change(Constants.IMG_4); 
					imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left,
							R.drawable.e_top, R.drawable.e_bottom, "0.5", "",
							R.drawable.e_right, R.drawable.e_bottom,
							R.drawable.e_left, R.drawable.e_top, "0.6", "",
							R.drawable.e_top, R.drawable.e_right,
							R.drawable.e_bottom, R.drawable.e_left, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E6);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_K;
					app.keyDown = Constants.KEY_E5;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E5);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_E4;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
							R.drawable.s_8, R.drawable.s_6,"0.3", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E4);
					bothopen();
					app._cfll = false;
				}
				
				break;
			case R.id.ll_e7:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E7;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.e_bottom,
							R.drawable.e_right, R.drawable.e_top,
							R.drawable.e_left, "0.8", "", R.drawable.e_bottom,
							R.drawable.e_left, R.drawable.e_right,
							R.drawable.e_top, "0.9", "",
							R.drawable.e_left, R.drawable.e_bottom,
							R.drawable.e_top, R.drawable.e_right, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E7);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_E7;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
							R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E7);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_E2;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E2);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_E2;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E2);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_e8:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E8;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.e_right, R.drawable.e_top,
							R.drawable.e_bottom, R.drawable.e_left, "1.2", "",
							R.drawable.e_bottom, R.drawable.e_right,
							R.drawable.e_top, R.drawable.e_left, "1.5", "",
							R.drawable.e_left, R.drawable.e_right,
							R.drawable.e_top, R.drawable.e_bottom, "2.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E8);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H2;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H2);
					bothopen();
					app._cfll = false;
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_E7;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E7);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_c1:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C1;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_bottom,
							R.drawable.c_left, "0.1");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C1);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_E6;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
							R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E6);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_C3;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
							R.drawable.e_right, "0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C3);
					bothopen();
					app._cfll = false;	
				}
				
				break;
			case R.id.ll_c2:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C2;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right,
							R.drawable.c_top, "0.12");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C2);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_K;
					app.keyDown = Constants.KEY_C2;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
							R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C2);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_C1;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
							R.drawable.s_8, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C1);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_c3:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C3;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right_top,
							R.drawable.c_left_bottom, "0.15");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C3);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C4;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
							R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C4);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_E5;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E5);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_E5;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
							R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E5);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_c4:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C4;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_left_top,
							R.drawable.c_right_bottom, R.drawable.c_right, "0.20",
							"", R.drawable.c_bottom, R.drawable.c_left,
							R.drawable.c_top, "0.25");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C4);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_D10 ;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D10);
					bothopen();
					app._cfll = false;
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_C4 ;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C4);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_c5:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C5;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_right_bottom,
							R.drawable.c_bottom, R.drawable.c_left, "0.3", "",
							R.drawable.c_left_bottom, R.drawable.c_right_top,
							R.drawable.c_top, "0.4");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C5);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_C3;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
							R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C3);
					bothopen();
					app._cfll = false;					
				}
	
				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_C7;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
							R.drawable.e_left, "0.9", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C7);
					bothopen();
					app._cfll = false;	
				}
				break;
			case R.id.ll_c6:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C6;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.c_left_bottom,
							R.drawable.c_left_top, R.drawable.c_right_bottom,
							R.drawable.c_top, "0.5", "",
							R.drawable.c_left_top,
							R.drawable.c_right_bottom,
							R.drawable.c_right, 
							R.drawable.c_bottom, "0.6", "", R.drawable.c_left,
							R.drawable.c_right_top, R.drawable.c_right_bottom,
							R.drawable.c_right, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C6);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_K;
					app.keyDown = Constants.KEY_C6;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
							R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C6);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_C5;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
							R.drawable.s_6, R.drawable.s_8,"0.9", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C5);
					bothopen();
					app._cfll = false;
				}
				
				break;
			case R.id.ll_c7:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C7;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.c_left,
							R.drawable.c_bottom, R.drawable.c_left,
							R.drawable.c_top, "0.8", "", R.drawable.c_left,
							R.drawable.c_left_top, R.drawable.c_right_bottom,
							R.drawable.c_right_top, "0.9", "",
							R.drawable.c_right_bottom, R.drawable.c_left_bottom,
							R.drawable.c_top, R.drawable.c_left, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C7);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H5;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_right_bottom, R.drawable.c_right, "1.0", "", R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_left_top,
							R.drawable.c_right, R.drawable.c_left_bottom,"1.2", "", R.drawable.c_right_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H5);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C2;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
							R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C2);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C2;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
							R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C2);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_c8:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C8;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.c_bottom,
							R.drawable.c_left, R.drawable.c_top,
							R.drawable.c_right, "1.2", "",
							R.drawable.c_right_top, R.drawable.c_right,
							R.drawable.c_left_top, R.drawable.c_bottom, "1.5",
							"", R.drawable.c_left_bottom, R.drawable.c_top,
							R.drawable.c_right_bottom, R.drawable.c_left_top, "2.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C8);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_E1;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_4, R.drawable.s_9, R.drawable.s_3, "0.2", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
							R.drawable.s_8, R.drawable.s_6,"0.3", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_4, "0.4");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E1);
					bothopen();
					app._cfll = false;					
				}

				break;
			case R.id.ll_h1:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H1;
					img_img_1_c.setBackgroundResource(R.color.btn_bg_1);
					imgUtil.Change(Constants.IMG_1);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H1); 
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_C7;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
							R.drawable.e_top, R.drawable.e_left,"0.9", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C7);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_E;
					app.keyDown = Constants.KEY_H4;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("",  R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, "1.0", "", R.drawable.e_right, R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom,
							R.drawable.e_left, "1.2", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H4);
					bothopen();
					app._cfll = false;	
				}
				break;
			case R.id.ll_h2:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H2;
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly,
							R.drawable.ship, "0.1");
					vessel = ImgViewVessel_2.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H2);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_K;
					app.keyDown = Constants.KEY_H3;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
							R.drawable.s_21, R.drawable.s_17,"1.2", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H3);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_H2;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "1.0", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
							R.drawable.s_9, R.drawable.s_5,"1.2", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H2);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_h3:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H3;
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane,
							R.drawable.car, "0.2", "", R.drawable.umbrella,
							R.drawable.butterfly, R.drawable.ship, "0.4");
					vessel = ImgViewVessel_3.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H3);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_C1;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_4, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
							R.drawable.s_4, R.drawable.s_8,"0.9", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C1);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C6;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
							R.drawable.s_20, R.drawable.s_10, "0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C6);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_C6;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
							R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_C6);
					bothopen();
					app._cfll = false;
				}
				break;
			case R.id.ll_h4:
				app.chartcount =0;
				app.dotcount=0;
				app.vercount=0;
				app.dao =0;
				app.z_13 = 0;
				app.Pfdot = true;
				app.Rfgf = true;
				app.lj_6 = true;
				app.lj_10 = true;
				app.a_L = true;
				app.a_R = true;
				app.c_L = true;
				app.c_R = true;
				app.fwshuj = true;
				yinc();
				//bothopen();
				if(app.chartor.equals("7"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_H;
					app.keyDown = Constants.KEY_H4;
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.butterfly,
							R.drawable.umbrella, R.drawable.plane, R.drawable.fish,
							"0.6", "", R.drawable.ship, R.drawable.plane,
							R.drawable.car, R.drawable.butterfly, "0.8", "",
							R.drawable.butterfly, R.drawable.car, R.drawable.ship,
							R.drawable.plane, "1.0");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H4);
					bothopen();
					app._cfll = false;
				}
				else if(app.chartor.equals("2"))
				{
					if (app._cfll == false) 
						app._cfll = true;
					app.Lr = false;
					app.c_e_h = Constants.CONTENT_S;
					app.keyDown = Constants.KEY_E4;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
							R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_E4);
					bothopen();
					app._cfll = false;					
				}

				else if(app.chartor.equals("6")||app.chartor.equals("8"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H3;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
							R.drawable.s_21, R.drawable.s_17, "1.2", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H3);
					bothopen();
					app._cfll = false;	
				}
				else if(app.chartor.equals("100"))
				{
					if (app._cfll == false)
						app._cfll = true;
					app.Lr = false;
//					bothopen();
					app.c_e_h = Constants.CONTENT_C;
					app.keyDown = Constants.KEY_H3;
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_bottom, "1.0", "\b\b\b\b\b", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top,
							R.drawable.c_right_top, R.drawable.c_right, "1.2", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left_top, "1.5");
					vessel = ImgViewVessel_4.getInstance(mActivity);
					vessel.init(true);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_H3);
					bothopen();
					app._cfll = false;	
				}
				break;
			case R.id.ll_z9:
				// 点击左边 右边控件选中
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					
					app.Lr = false;
					app.L_R = 3;
					app.z_13 = 16;
					FragmentManager fm_3 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft3 = (FragmentLeft) fm_3
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft3 != null)
						fragmentLeft3.cd_2.callOnClick();
					fragmentLeft3.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentLeft3.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					app.keyDown = Constants.KEY_H5;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_h_5);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
					wait_ms(120);
					app.BluetoothAPI.send_command(Device.TypeBullEye,Constants.KEY_H5);
					app._cfll = false;
				 }
				break;
			case R.id.ll_z10:
				
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.kzp = 0;
					app.ptk = true;
					app.z_13 = 0;
					FragmentManager fm = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft = (FragmentLeft) fm
							.findFragmentById(R.id.frag_left);
					if (fragmentleft != null)
						mImg_view.setBackgroundResource(R.drawable.d_o_6_1);
					fragmentleft.mTxtEye_S_Left.callOnClick();
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D1);
					app._cfll = false;
				}
				break;
			case R.id.ll_z11:
				
				if (app._cfll == false) {
					app.Rfgf =false;
					app.Pfdot=true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					
					app.Lr = false;
					app.z_13 = 8;
					app.L_R = 3;
					FragmentManager fm_11 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft11 = (FragmentLeft) fm_11
							.findFragmentById(R.id.frag_left);
					if (fragmentleft11 != null)
						fragmentleft11.cd_2.callOnClick();
					fragmentleft11.iv_l_l.setImageResource(R.drawable.iv_6);
					fragmentleft11.iv_l_r.setImageResource(R.drawable.iv_5);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_6_2);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D2);
					app._cfll = false;
				}
				break;
			case R.id.ll_z12:
				
				if (app._cfll == false) {
					app.Pfdot = false;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					
					app.Lr = false;
					app.z_13 = 0;
					app.L_R = 3;
					FragmentManager fm_4 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft4 = (FragmentLeft) fm_4
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft4 != null)
						fragmentLeft4.cd_2.callOnClick();
					fragmentLeft4.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentLeft4.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_6_3);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D3);
					app._cfll = false;
				}
				break;
			case R.id.ll_z13:
				
				if (app._cfll == false) {
					app.Rfgf = false;
					app.Pfdot = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					
					app.Lr = false;
					app.z_13 = 1;
					app.L_R = 3;
					FragmentManager fm_5 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft5 = (FragmentLeft) fm_5
							.findFragmentById(R.id.frag_left);
					if (fragmentleft5 != null)
						fragmentleft5.cd_3.callOnClick();
					fragmentleft5.iv_l_l.setImageResource(R.drawable.iv_6);
					fragmentleft5.iv_l_r.setImageResource(R.drawable.iv_5);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_6_4);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU77][lU77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D4);
					app._cfll = false;
				}
				break;
			case R.id.ll_z7:
				
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					
					app.fwshuj = false;
					app.z_13 = 11;
					////////////
					app.Lr = true;
					app._cfll = true;
					app.kzp = 0;
					app.ptk = false;
					app.L_R = 0;
					if (app.pzy == 3) {
						app.pzy = 5;
					}
					FragmentManager fm_2 = getActivity().getSupportFragmentManager();
					FragmentLeft fragmentLeft2 = (FragmentLeft) fm_2.findFragmentById(R.id.frag_left);
					if (fragmentLeft2 != null){
					
						mImg_view.setBackgroundResource(R.drawable.d_o_6_5);
					}
					if(app.Trl == false){
						fragmentLeft2.mTxtEye_A_Left.callOnClick();
					}else if (app.Trl == true){

						fragmentLeft2.mTxtEye_A_Right.callOnClick();
					}
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D5);
					app._cfll = false;
				}
				break;
			case R.id.ll_z8:
				 if(app.chartor.equals("2")){
						
					}else{
				
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					
					app.Lr = false;
					app.L_R = 3;
					app.kzp = 0;
					app.ptk = true;
					if (app.pzy == 3) {
						app.pzy = 5;
					}
					app.z_13 = 3;
					FragmentManager fm_12 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft12 = (FragmentLeft) fm_12
							.findFragmentById(R.id.frag_left);
					if (fragmentleft12 != null)
						mImg_view.setBackgroundResource(R.drawable.d_o_6_6);
					fragmentleft12.CCdual();
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D6);
					app._cfll = false;
				}
		      }
				break;
			case R.id.ll_z1:
				
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.kzp = 0;
					app.z_13 = 0;
					app.ptk = true;
					if (app.pzy == 3) {
						app.pzy = 5;
					}
					FragmentManager fm_1 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft1 = (FragmentLeft) fm_1
							.findFragmentById(R.id.frag_left);
					if (fragmentleft1 != null)
						mImg_view.setBackgroundResource(R.drawable.d_o_7_1);
					if(app.txtCount == Constants.EYE_R)
						   fragmentleft1.mTxtEye_A_Right.callOnClick();
					else
					       fragmentleft1.mTxtEye_A_Left.callOnClick();
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D7);
					app._cfll = false;
				}
				break;
			case R.id.ll_z2:
				if (app._cfll == false) {
					app.Pfdot = false;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.z_13 = 2;
					app.L_R = 3;
					FragmentManager fm_9 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft9 = (FragmentLeft) fm_9
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft9 != null)
						fragmentLeft9.cd_1.callOnClick();
					fragmentLeft9.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentLeft9.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_7_2);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D8);
					app._cfll = false;
				}
				break;
			case R.id.ll_z3:
				if (app._cfll == false) {
					app.Pfdot = false;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.pzy = 3;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.z_13 = 5;       
					app.L_R = 3;
					FragmentManager fm_7 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft7 = (FragmentLeft) fm_7
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft7 != null)
						fragmentLeft7.cd_3.callOnClick();
					fragmentLeft7.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentLeft7.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_7_3);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,Constants.KEY_D9);
					app._cfll = false;
				}
				break;
			case R.id.ll_z4:
			 if(app.chartor.equals("2")){
					
				}else{
				if (app._cfll == false) {
					app.Pfdot = false;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.z_13 = 4;
					app.L_R = 3;
					FragmentManager fm_6 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft6 = (FragmentLeft) fm_6
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft6 != null)
						fragmentLeft6.cd_3.callOnClick();
					fragmentLeft6.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentLeft6.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_7_4);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");		
					app.BluetoothAPI.send_command(Device.TypeBullEye,Constants.KEY_D10);
					app._cfll = false;
				 }
				}
				break;
			case R.id.ll_z5:
				if (app._cfll == false) {
					app.Pfdot = true;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.z_13 = 6;
					app.L_R = 3;
					FragmentManager fm_8 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentLeft8 = (FragmentLeft) fm_8
							.findFragmentById(R.id.frag_left);
					if (fragmentLeft8 != null)
						fragmentLeft8.cd_3.callOnClick();
					fragmentLeft8.iv_l_l.setImageResource(R.drawable.l_1);
					fragmentLeft8.iv_l_r.setImageResource(R.drawable.iv_7);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_7_5);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rU55][lU00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][lE77]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D11);
					app._cfll = false;
				}
				app.BluetoothAPI.send_command(Device.TypeBullEye,"KEY   42\r[rU55][lU00]");
				
				break;
			case R.id.ll_z6:
				if (app._cfll == false) {
					app.Pfdot = false;
					app.Rfgf = true;
					app.lj_6 = true;
					app.lj_10 = true;
					app.a_L = true;
					app.a_R = true;
					app.c_L = true;
					app.c_R = true;
					app.fwshuj = true;
					yinc();
					app.Lr = false;
					app._cfll = true;
					app.Lr = false;
					app.z_13 = 7;
					app.L_R = 3;
					FragmentManager fm_10 = getActivity()
							.getSupportFragmentManager();
					FragmentLeft fragmentleft10 = (FragmentLeft) fm_10
							.findFragmentById(R.id.frag_left);
					if (fragmentleft10 != null)
						fragmentleft10.cd_2.callOnClick();
					fragmentleft10.iv_l_l.setImageResource(R.drawable.iv_3);
					fragmentleft10.iv_l_r.setImageResource(R.drawable.iv_4);
					app.c_e_h = Constants.CONTENT_D;
					imgUtil.Change(Constants.IMG_0);
					mImg_view.setBackgroundResource(R.drawable.d_o_7_6);
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rUAA][lUAA]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE00][lE00]");
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							Constants.KEY_D12);
					app._cfll = false;
				}
				break;
			case R.id.img_kz_1:
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_rg);
				break;
				
			case R.id.ll_z14:
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_up);
				break;
				
		   case R.id.ll_z15:
			   app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_down);
				break;
			case R.id.img_kz_2:
				
				app.chartcount =1;
				app.dotcount++;
			if(app.dotcount%2 ==1){
				if (app._cfll == false)
					app._cfll = true;
				app.change = Constants.CHANGE_POINT;
				if (app.keyDown != null && app.keyDown.equals(Constants.KEY_H1)) {
					img_img_1_c.setBackgroundResource(R.color.orange);
				}
				app.dao = 0;
				if (vessel != null) {
					vessel.init(false);
				}
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_POINT);
				app._cfll = false;
			}else{
				app.dao = 0;
				app.dotcount=0;
				app.vercount=0;
				if (vessel != null) {
					vessel.init(true);
				}
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_POINT);
				app._cfll = false;
			}
				break;
			case R.id.img_kz_3:
				
				app.chartcount =2;
				app.vercount++;
			if((app.dotcount==0) && (app.dao==0) && (app.vercount==1)){
				if (app._cfll == false)
					app._cfll = true;
				app.change = Constants.CHANGE_VERTICAL;
				app.dao = 0;
				if (vessel != null) {
					vessel.init(false);
				}
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_RIGHT);
				app._cfll = false;
			}
				break;
			case R.id.img_kz_4:
				app.chartcount =3;
				app.dotcount=0;
				app.vercount=0;
				if (app._cfll == false)
					app._cfll = true;
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_HORIZONTAL);
				app.change = Constants.CHANGE_HORIZONTAL;
				if (vessel != null) {
					vessel.init(false);
				}
				app._cfll = false;
				break;
				
			case R.id.img_kz_5:
				if (app._cfll == false)
					app._cfll = true;
				app.BluetoothAPI.send_command(Device.TypeBullEye, Constants.KEY_LAMP);
				if (vessel != null) {
					vessel.init(false);
				}
				app._cfll = false;
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

	private OnClickListener MyItemClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_up:
				
			if(app.chartcount !=0)
			{
				app.dao = Constants.UP;
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_UP);
				switch (app.state) {
				case Constants.IMG_2:
					vessel.change(-2);
					break;
				case Constants.IMG_3:
					vessel.change(-3);
					break;
				case Constants.IMG_4:
					vessel.change(-4);
					break;
				case Constants.IMG_5:
					vessel.change(-5);
					break;
				}
			}
				break;
			case R.id.btn_right:
			if((app.chartcount ==1) || (app.chartcount ==2)|| (app.chartcount==3))
			{
				app.dao = Constants.RIGHT;
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_RIGHT);
				switch (app.state) {
				case Constants.IMG_2:
					vessel.change(1);
					break;
				case Constants.IMG_3:
					vessel.change(1);
					break;
				case Constants.IMG_4:
					vessel.change(1);
					break;
				case Constants.IMG_5:
					vessel.change(1);
					break;
				}
			}
				break;
			case R.id.config_view:
			if(app.chartcount !=0)
			{
				if(app.chartor.equals("7"))
				{
					if (app.keyDown.equals(Constants.KEY_H1)) {
						imgUtil.Change(Constants.IMG_2);
						imgUtil.Img_2_init("0.1", R.drawable.butterfly,
								R.drawable.ship, "4.0");
						app.keyDown = Constants.KEY_H2;
						// //////////////////////////////////////////////
						app.dao = Constants.DOWN;
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								Constants.KEY_DOWN);
						// /////////////////////////////////////////////
						vessel = ImgViewVessel_2.getInstance(mActivity);
						ImgViewVessel_2.getInstance(mActivity).count = 0;
						if (app.change == Constants.CHANGE_HORIZONTAL) {
							vessel.change(0);
						} else if (app.change == Constants.CHANGE_POINT) {
							vessel.change(1);
						}
						return;
					}
				}
				app.dao = Constants.DOWN;
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_DOWN);
				switch (app.state) {
				case Constants.IMG_2:
					vessel.change(2);
					break;
				case Constants.IMG_3:
					vessel.change(3);
					break;
				case Constants.IMG_4:
					vessel.change(4);
					break;
				case Constants.IMG_5:
					vessel.change(5);
					break;
				}
			}
				break;

			case R.id.btn_left:
			if((app.chartcount ==1) || (app.chartcount ==2)|| (app.chartcount ==3))
			{
				app.dao = Constants.LEFT;
				app.BluetoothAPI.send_command(Device.TypeBullEye,
						Constants.KEY_LEFT);
				switch (app.state) {
				case Constants.IMG_2:
					vessel.change(-1);
					break;
				case Constants.IMG_3:
					vessel.change(-1);
					break;
				case Constants.IMG_4:
					vessel.change(-1);
					break;
				case Constants.IMG_5:
					vessel.change(-1);
					break;
					
				}
			}
				break;
			default:
				break;
			}
		}

	};
}
