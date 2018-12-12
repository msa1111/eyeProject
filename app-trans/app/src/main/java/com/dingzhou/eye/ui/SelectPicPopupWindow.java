package com.dingzhou.eye.ui;

import com.dingzhou.eye.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class SelectPicPopupWindow extends PopupWindow {

	private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8;
	private View mMenuView;

	public SelectPicPopupWindow(Activity context, OnClickListener itemsOnClick) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.alert_dialog, null);

		btn_1=(Button) mMenuView.findViewById(R.id.btn_set_1);
		btn_1.setOnClickListener(itemsOnClick);
		btn_2=(Button) mMenuView.findViewById(R.id.btn_set_2);
		btn_2.setOnClickListener(itemsOnClick);
		btn_3=(Button) mMenuView.findViewById(R.id.btn_set_3);
		btn_3.setOnClickListener(itemsOnClick);
		btn_4=(Button) mMenuView.findViewById(R.id.btn_set_4);
		btn_4.setOnClickListener(itemsOnClick);
//		btn_5=(Button) mMenuView.findViewById(R.id.btn_set_5);
//		btn_5.setOnClickListener(itemsOnClick);
		btn_6=(Button) mMenuView.findViewById(R.id.btn_set_6);
		btn_6.setOnClickListener(itemsOnClick);
		btn_7=(Button) mMenuView.findViewById(R.id.btn_set_7);
		btn_7.setOnClickListener(itemsOnClick);
		btn_8=(Button) mMenuView.findViewById(R.id.btn_set_8);
		btn_8.setOnClickListener(itemsOnClick);
		
		
		//
		this.setContentView(mMenuView);
		//
		this.setWidth(LayoutParams.MATCH_PARENT);
		//
		this.setHeight(LayoutParams.WRAP_CONTENT);
		//
		this.setFocusable(true);
		//
		this.setAnimationStyle(R.style.AnimBottom);
		//
		ColorDrawable dw = new ColorDrawable(0x00000000);//0x00000000
		//
		this.setBackgroundDrawable(dw);
		//
		mMenuView.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				int width = mMenuView.findViewById(R.id.pop_layout).getWidth();
				int x = (int) event.getX();
				if (event.getAction() == MotionEvent.ACTION_UP) {
					if (x > width) {
						dismiss();
					}
				}
				return true;
			}
		});
	}
}
