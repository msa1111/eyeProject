package com.dingzhou.eye.SelectChange;

import com.dingzhou.eye.FragmentRight;
import com.dingzhou.eye.tool.MyApp;

public abstract class ImgViewVessel {

	private MyApp app;


	public abstract void init(boolean state);

	public ImgViewVessel(FragmentRight activity) {
	}
	

	public abstract void change(int Orientation);


	public abstract void ChangePoint(int i);


	public abstract void ChangeHorizontaL(int i);

	
	public abstract void ChangeVertical(int i);
}
