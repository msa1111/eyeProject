package com.dingzhou.eye.SelectChange;

import android.graphics.Color;
import android.widget.TextView;

import com.dingzhou.eye.R;


public class TxtView {
	public TextView mTxt_Name;


	public void SetTxtView(TextView _Txt_Name) {
		mTxt_Name = _Txt_Name;
	}

	
	public void ChangeViewState(boolean TxtState) {
		if (TxtState) {
			mTxt_Name.setBackgroundResource(R.color.yellow);
			mTxt_Name.setTextColor(Color.BLACK);
		} else {
			mTxt_Name.setBackgroundResource(R.drawable.eye_layout_center);
			mTxt_Name.setTextColor(Color.WHITE);
		}
	}

	
	public void SetChangeText(String strings) {
		mTxt_Name.setText(strings);
	}
}
