package com.dingzhou.eye.SelectChange;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.TextView;

import com.dingzhou.eye.FragmentLeft;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;

@SuppressLint("NewApi")
public class TxtViewVessel {

	private static TxtViewVessel vessel;
	private MyApp app;
	private List<TextView> mList_Eye_L;
	private List<TextView> mList_Eye_R;
	private FragmentLeft mActivity;
	private TxtEye eye_l;
	private TxtEye eye_r;
	

	public static TxtViewVessel getInstance(FragmentLeft _activity) {
		if (vessel == null) {
			synchronized (TxtViewVessel.class) {
				if (vessel == null) {
					vessel = new TxtViewVessel(_activity);
				}
			}
		}
		return vessel;
	}

	private TxtViewVessel(FragmentLeft _activity) {
		// TODO Auto-generated constructor stub
		mActivity = _activity;
		mList_Eye_L = new ArrayList<TextView>();
		mList_Eye_L.add(mActivity.mTxtEye_S_Left);
		mList_Eye_L.add(mActivity.mTxtEye_C_Left);
		mList_Eye_L.add(mActivity.mTxtEye_A_Left);
		mList_Eye_L.add(mActivity.mTxtEye_H_Left);
		mList_Eye_L.add(mActivity.mTxtEye_V_Left);
		mList_Eye_L.add(mActivity.mTxtEye_ADD_Left);
		eye_l = new TxtEye(_activity.getActivity(), mList_Eye_L,"R");

		mList_Eye_R = new ArrayList<TextView>();
		mList_Eye_R.add(mActivity.mTxtEye_S_Right);
		mList_Eye_R.add(mActivity.mTxtEye_C_Right);
		mList_Eye_R.add(mActivity.mTxtEye_A_Right);
		mList_Eye_R.add(mActivity.mTxtEye_H_Right);
		mList_Eye_R.add(mActivity.mTxtEye_V_Right);
		mList_Eye_R.add(mActivity.mTxtEye_ADD_Right);
		
		eye_r = new TxtEye(_activity.getActivity(), mList_Eye_R,"L");

		app = (MyApp) mActivity.getActivity().getApplication();
	}


	public void init(boolean state) {
		eye_r.init(Constants.EYE_S);
		eye_l.init(Constants.EYE_S);
	}

	public void ChangeBg(int eyeL, int eyeR) {
		// TODO Auto-generated method stub
		eye_r.ChangeBg(eyeR);
		eye_l.ChangeBg(eyeL);
	};

	public void ChangeBg(int eye, boolean falg) {
		// TODO Auto-generated method stub
		if (falg) {
			eye_l.ChangeBg(eye);
			eye_r.ChangeBg(11);
		} else {
			eye_l.ChangeBg(11);
			eye_r.ChangeBg(eye);
		}
	};

	public void ChangeText(int num) {
		num = chengeSpi(num);
		if (app.txtCount == Constants.EYE_R) {
			eye_r.SetText(num);
		} else if (app.txtCount == Constants.EYE_L) {
			eye_l.SetText(num);
		} else if (app.txtCount == Constants.EYE_D) {
			eye_l.SetText(num);
			eye_r.SetText(num);
		}
	}
	
	public void ChangeSText() {
		if (app.txtCount == Constants.EYE_R) {
			eye_r.SetSText(0);
		} else if (app.txtCount == Constants.EYE_L) {
			eye_l.SetSText(0);
		} else if (app.txtCount == Constants.EYE_D) {
			eye_l.SetSText(0);
			eye_r.SetSText(0);
		}
	}
	public void ChangeADDText() {
		if (app.txtCount == Constants.EYE_R) {
			eye_r.SetADDText(0);
		} else if (app.txtCount == Constants.EYE_L) {
			eye_l.SetADDText(0);
		} else if (app.txtCount == Constants.EYE_D) {
			eye_l.SetADDText(0);
			eye_r.SetADDText(0);
		}
	}
	
	public void ChangeXText() {
		if (app.txtCount == Constants.EYE_R) {
			eye_r.SetXText(0);
		} else if (app.txtCount == Constants.EYE_L) {
			eye_l.SetXText(0);
		} else if (app.txtCount == Constants.EYE_D) {
			eye_l.SetXText(0);
			eye_r.SetXText(0);
		}
	}
	
	public void ChangeYText() {
		if (app.txtCount == Constants.EYE_R) {
			eye_r.SetYText(0);
		} else if (app.txtCount == Constants.EYE_L) {
			eye_l.SetYText(0);
		} else if (app.txtCount == Constants.EYE_D) {
			eye_l.SetYText(0);
			eye_r.SetYText(0);
		}
	}
	
	public void Asettext(){
		if (app.txtCount == Constants.EYE_R) {
			eye_l.Set_2();
			
		} 
		if (app.txtCount == Constants.EYE_L) {
			eye_r.Set_1();
			
		}
	}
	
	public int chengeSpi(int num) {
		int xxoo = 0;
		switch (app.txtState) {
		case Constants.EYE_S:
			switch (app.Sposition) {
			case 0:
				xxoo=2*num;
				break;
			case 1:
				xxoo=4*num;
				break;
			case 2:
				xxoo=8*num;
				break;
			case 3:
				xxoo=16*num;
				break;
			case 4:
				xxoo=24*num;
				break;
//			case 5:
//				xxoo=1*num;
//				break;
			default:
				break;
			}
			break;
		case Constants.EYE_C:
			switch (app.Cposition) {
			case 0:
				xxoo=1*num;
				break;
			case 1:
				xxoo=2*num;
				break;
			case 2:
				xxoo=4*num;
				break;
			case 3:
				xxoo=8*num;
				break;
//			case 4:
//				xxoo=1*num;
//				break;
//			case 5:
//				xxoo=2*num;
//				break;
//			case 6:
//				xxoo=4*num;
//				break;
//			case 7:
//				xxoo=8*num;
//				break;
			default:
				break;
			}
			break;
		case Constants.EYE_A:
			switch (app.Aposition) {
			case 0:
				xxoo=1*num;
				break;
			case 1:
				xxoo=5*num;
				break;
			case 2:
				xxoo=15*num;
				break;
			case 3:
				xxoo=30*num;
				break;
			case 4:
				xxoo=45*num;
				break;

			default:
				break;
			}
			break;
		case Constants.EYE_H:
			switch (app.Hposition) {
			case 0:
				xxoo=-1*num;
				break;
			case 1:
				xxoo=-2*num;
				break;
			case 2:
				xxoo=-5*num;
				break;
			case 3:
				xxoo=-10*num;
				break;
			case 4:
				xxoo=-20*num;
				break;

			default:
				break;
			}
			break;
		case Constants.EYE_V:
			switch (app.Vposition) {
			case 0:
				xxoo=-1*num;
				break;
			case 1:
				xxoo=-2*num;
				break;
			case 2:
				xxoo=-5*num;
				break;
			case 3:
				xxoo=-10*num;
				break;
			case 4:
				xxoo=-20*num;
				break;

			default:
				break;
			}
			break;
		case Constants.EYE_ADD:
			switch (app.ADDposition) {
			case 0:
				xxoo=-1*num;
				break;
			case 1:
				xxoo=-2*num;
				break;
			case 2:
				xxoo=-4*num;
				break;
			default:
				break;
			}
			break;

		default:
			break;
		}
		return xxoo;
	}

}
