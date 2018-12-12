package com.dingzhou.eye.SelectChange;

import android.view.View;

import com.dingzhou.eye.FragmentRight;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;


public class ImgUtil {

	private FragmentRight mActivity;
	private MyApp app;

	public ImgUtil(FragmentRight _activity) {
		mActivity = _activity;
		app = (MyApp) mActivity.getActivity().getApplication();
		app.cdReadl();
	}


	public void Change(int ImMState) {
		switch (ImMState) {
		case Constants.IMG_0:
			app.state = Constants.IMG_0;
			mActivity.mImg_view.setVisibility(View.VISIBLE);
			mActivity.mImg_1.setVisibility(View.GONE);
			mActivity.mImg_2.setVisibility(View.GONE);
			mActivity.mImg_3.setVisibility(View.GONE);
			mActivity.mImg_4.setVisibility(View.GONE);
			mActivity.mImg_5.setVisibility(View.GONE);
			break;
		case Constants.IMG_1:
			app.state = Constants.IMG_1;
			mActivity.mImg_view.setVisibility(View.GONE);
			mActivity.mImg_1.setVisibility(View.VISIBLE);
			mActivity.mImg_2.setVisibility(View.GONE);
			mActivity.mImg_3.setVisibility(View.GONE);
			mActivity.mImg_4.setVisibility(View.GONE);
			mActivity.mImg_5.setVisibility(View.GONE);
			break;
		case Constants.IMG_2:
			app.state = Constants.IMG_2;
			mActivity.mImg_view.setVisibility(View.GONE);
			mActivity.mImg_1.setVisibility(View.GONE);
			mActivity.mImg_2.setVisibility(View.VISIBLE);
			mActivity.mImg_3.setVisibility(View.GONE);
			mActivity.mImg_4.setVisibility(View.GONE);
			mActivity.mImg_5.setVisibility(View.GONE);
			break;
		case Constants.IMG_3:
			app.state = Constants.IMG_3;
			mActivity.mImg_view.setVisibility(View.GONE);
			mActivity.mImg_1.setVisibility(View.GONE);
			mActivity.mImg_2.setVisibility(View.GONE);
			mActivity.mImg_3.setVisibility(View.VISIBLE);
			mActivity.mImg_4.setVisibility(View.GONE);
			mActivity.mImg_5.setVisibility(View.GONE);
			break;
		case Constants.IMG_4:
			app.state = Constants.IMG_4;
			mActivity.mImg_view.setVisibility(View.GONE);
			mActivity.mImg_1.setVisibility(View.GONE);
			mActivity.mImg_2.setVisibility(View.GONE);
			mActivity.mImg_3.setVisibility(View.GONE);
			mActivity.mImg_4.setVisibility(View.VISIBLE);
			mActivity.mImg_5.setVisibility(View.GONE);
			break;
		case Constants.IMG_5:
			app.state = Constants.IMG_5;
			mActivity.mImg_view.setVisibility(View.GONE);
			mActivity.mImg_1.setVisibility(View.GONE);
			mActivity.mImg_2.setVisibility(View.GONE);
			mActivity.mImg_3.setVisibility(View.GONE);
			mActivity.mImg_4.setVisibility(View.GONE);
			mActivity.mImg_5.setVisibility(View.VISIBLE);
			break;

		default:
			break;
		}
	}
	
	public void Img_1_init(String l, int c1,String r) {
		mActivity.txt_img_2_1_l.setText(l);
		mActivity.img_img_2_1_c1.setImageResource(c1);
	}

	public void Img_2_init(String l, int c1, int c2, String r) {
		if(app.chartor.equals("7"))
		{
			mActivity.txt_img_2_1_l.setText(l);
			mActivity.img_img_2_1_c1.setImageResource(c1);
			mActivity.img_img_2_1_c2.setImageResource(c2);	
			mActivity.txt_img_2_1_r.setText(r);
		}
		else if(app.chartor.equals("2")||app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100")) 
		{
			mActivity.txt_img_2_1_l.setText(l);
			mActivity.img_img_2_1_c1.setImageResource(c1);
			mActivity.txt_img_2_1_r.setText(r);
		}
	}

	public void Img_3_init(String t_l, int t_c1, int t_c2, int t_c3, String t_r, String b_l, int b_c1, int b_c2, int b_c3, String b_r) {
		mActivity.txt_img_3_1_l.setText(t_l);
		mActivity.img_img_3_1_c1.setImageResource(t_c1);
		mActivity.img_img_3_1_c2.setImageResource(t_c2);
		mActivity.img_img_3_1_c3.setImageResource(t_c3);
		mActivity.txt_img_3_1_r.setText(t_r);

		mActivity.txt_img_3_2_l.setText(b_l);
		mActivity.img_img_3_2_c1.setImageResource(b_c1);
		mActivity.img_img_3_2_c2.setImageResource(b_c2);
		mActivity.img_img_3_2_c3.setImageResource(b_c3);
		mActivity.txt_img_3_2_r.setText(b_r);
	}

	public void Img_4_init(String t_l, int t_c1, int t_c2, int t_c3, int t_c4, String t_r, String c_l, int c_c1, int c_c2, int c_c3, int c_c4, String c_r, String b_l, int b_c1, int b_c2, int b_c3,
			int b_c4, String b_r) {
		mActivity.txt_img_4_1_l.setText(t_l);
		mActivity.img_img_4_1_c1.setImageResource(t_c1);
		mActivity.img_img_4_1_c2.setImageResource(t_c2);
		mActivity.img_img_4_1_c3.setImageResource(t_c3);
		mActivity.img_img_4_1_c4.setImageResource(t_c4);
		mActivity.txt_img_4_1_r.setText(t_r);

		mActivity.txt_img_4_2_l.setText(c_l);
		mActivity.img_img_4_2_c1.setImageResource(c_c1);
		mActivity.img_img_4_2_c2.setImageResource(c_c2);
		mActivity.img_img_4_2_c3.setImageResource(c_c3);
		mActivity.img_img_4_2_c4.setImageResource(c_c4);
		mActivity.txt_img_4_2_r.setText(c_r);

		mActivity.txt_img_4_3_l.setText(b_l);
		mActivity.img_img_4_3_c1.setImageResource(b_c1);
		mActivity.img_img_4_3_c2.setImageResource(b_c2);
		mActivity.img_img_4_3_c3.setImageResource(b_c3);
		mActivity.img_img_4_3_c4.setImageResource(b_c4);
		mActivity.txt_img_4_3_r.setText(b_r);
	}
	
	public void Img_4_ACP8init(String t_l, int t_c1, int t_c2, int t_c3, int t_c4, int t_c5, String t_r, String c_l, int c_c1, int c_c2, int c_c3, int c_c4, int c_c5, String c_r, String b_l, int b_c1, int b_c2, int b_c3,
			int b_c4, int b_c5, String b_r) {
		mActivity.txt_img_5_1_l.setText(t_l);
		mActivity.img_img_5_1_c1.setImageResource(t_c1);
		mActivity.img_img_5_1_c2.setImageResource(t_c2);
		mActivity.img_img_5_1_c3.setImageResource(t_c3);
		mActivity.img_img_5_1_c4.setImageResource(t_c4);
		mActivity.img_img_5_1_c5.setImageResource(t_c5);
		mActivity.txt_img_5_1_r.setText(t_r);

		mActivity.txt_img_5_2_l.setText(c_l);
		mActivity.img_img_5_2_c1.setImageResource(c_c1);
		mActivity.img_img_5_2_c2.setImageResource(c_c2);
		mActivity.img_img_5_2_c3.setImageResource(c_c3);
		mActivity.img_img_5_2_c4.setImageResource(c_c4);
		mActivity.img_img_5_2_c5.setImageResource(c_c5);
		mActivity.txt_img_5_2_r.setText(c_r);

		mActivity.txt_img_5_3_l.setText(b_l);
		mActivity.img_img_5_3_c1.setImageResource(b_c1);
		mActivity.img_img_5_3_c2.setImageResource(b_c2);
		mActivity.img_img_5_3_c3.setImageResource(b_c3);
		mActivity.img_img_5_3_c4.setImageResource(b_c4);
		mActivity.img_img_5_3_c5.setImageResource(b_c5);
		mActivity.txt_img_5_3_r.setText(b_r);
	}
	
	

}
