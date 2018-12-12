package com.dingzhou.eye.SelectChange;

import android.widget.ImageView;

import com.dingzhou.eye.R;


public class ImgView {
	private ImageView mImg_Name;

	public ImgView(ImageView _Img_Name) {
		mImg_Name = _Img_Name;
	}

	public void ChangViewState(boolean ImgState) {			
		if (ImgState) {
			mImg_Name.setBackgroundResource(R.color.orange);
		} else {
			mImg_Name.setBackgroundResource(R.color.btn_bg_1);
		}
	}
}
