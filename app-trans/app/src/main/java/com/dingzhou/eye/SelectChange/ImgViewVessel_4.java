package com.dingzhou.eye.SelectChange;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.FragmentRight;
import com.dingzhou.eye.R;

public class ImgViewVessel_4 extends ImgViewVessel {
	private static ImgViewVessel_4 vessel_4;
	private MyApp app;
	private List<ImgView> list;
	private FragmentRight mActivity;
	public int count = 0;
	private ImgUtil imgUtil;



	public static ImgViewVessel_4 getInstance(FragmentRight _activity) {
		if (vessel_4 == null) {
			synchronized (ImgViewVessel_4.class) {
				if (vessel_4 == null) {
					vessel_4 = new ImgViewVessel_4(_activity);
				}
			}
		}
		
		return vessel_4;
	}

	private ImgViewVessel_4(FragmentRight _activity) {
		super(_activity);
		
		mActivity = _activity;
		list = new ArrayList<ImgView>();
		app = (MyApp) mActivity.getActivity().getApplication();
		
		app.cdReadl();
		if(app.chartor.equals("7"))
		{
			list.add(new ImgView(mActivity.img_img_4_1_c1));
			list.add(new ImgView(mActivity.img_img_4_1_c2));
			list.add(new ImgView(mActivity.img_img_4_1_c3));
			list.add(new ImgView(mActivity.img_img_4_1_c4));
	
			list.add(new ImgView(mActivity.img_img_4_2_c1));
			list.add(new ImgView(mActivity.img_img_4_2_c2));
			list.add(new ImgView(mActivity.img_img_4_2_c3));
			list.add(new ImgView(mActivity.img_img_4_2_c4));
	
			list.add(new ImgView(mActivity.img_img_4_3_c1));
			list.add(new ImgView(mActivity.img_img_4_3_c2));
			list.add(new ImgView(mActivity.img_img_4_3_c3));
			list.add(new ImgView(mActivity.img_img_4_3_c4));	
		}
		else if(app.chartor.equals("2")|| app.chartor.equals("3")|| app.chartor.equals("4") || app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			list.add(new ImgView(mActivity.img_img_5_1_c1));
			list.add(new ImgView(mActivity.img_img_5_1_c2));
			list.add(new ImgView(mActivity.img_img_5_1_c3));
			list.add(new ImgView(mActivity.img_img_5_1_c4));
			list.add(new ImgView(mActivity.img_img_5_1_c5));
			
			list.add(new ImgView(mActivity.img_img_5_2_c1));
			list.add(new ImgView(mActivity.img_img_5_2_c2));
			list.add(new ImgView(mActivity.img_img_5_2_c3));
			list.add(new ImgView(mActivity.img_img_5_2_c4));
			list.add(new ImgView(mActivity.img_img_5_2_c5));
			
			list.add(new ImgView(mActivity.img_img_5_3_c1));
			list.add(new ImgView(mActivity.img_img_5_3_c2));
			list.add(new ImgView(mActivity.img_img_5_3_c3));
			list.add(new ImgView(mActivity.img_img_5_3_c4));
			list.add(new ImgView(mActivity.img_img_5_3_c5));
		}
		imgUtil = new ImgUtil(_activity);
	}

	@Override
	public void change(int Orientation) {
		switch (app.change) {
		case Constants.CHANGE_POINT:
			ChangePoint(Orientation);
			break;
		case Constants.CHANGE_HORIZONTAL:
			ChangeHorizontaL(Orientation);
			break;
		case Constants.CHANGE_VERTICAL:
			ChangeVertical(Orientation);
			break;

		default:
			break;
		}
	}


	@Override
	public void init(boolean state) {
		
		count = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).ChangViewState(false);
		}
		if(app.chartor.equals("7"))
		{
			if (!state) {
				switch (app.change) {
				case Constants.CHANGE_POINT:
					ChangePoint(3);
					break;
				case Constants.CHANGE_HORIZONTAL:
					ChangeHorizontaL(4);
					break;
				case Constants.CHANGE_VERTICAL:
					ChangeVertical(3);
					break;

				default:
					break;
				}
			}
		}
		else if(app.chartor.equals("2"))
		{
			if (!state) {
				switch (app.change) {
				case Constants.CHANGE_POINT:
					ChangePoint(4);
					break;
				case Constants.CHANGE_HORIZONTAL:
					ChangeHorizontaL(5);
					break;
				case Constants.CHANGE_VERTICAL:
					ChangeVertical(1);
					break;

				default:
					break;
				}
			}	
		}
		else if(app.chartor.equals("3"))
		{
			if (!state) {
				switch (app.change) {
				case Constants.CHANGE_POINT:
					ChangePoint(4);
					break;
				case Constants.CHANGE_HORIZONTAL:
					ChangeHorizontaL(5);
					break;
				case Constants.CHANGE_VERTICAL:
					ChangeVertical(1);
					break;

				default:
					break;
				}
			}	
		}
		else if(app.chartor.equals("4"))
		{
			if (!state) {
				switch (app.change) {
				case Constants.CHANGE_POINT:
					ChangePoint(4);
					break;
				case Constants.CHANGE_HORIZONTAL:
					ChangeHorizontaL(5);
					break;
				case Constants.CHANGE_VERTICAL:
					ChangeVertical(1);
					break;

				default:
					break;
				}
			}	
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			if (!state) {
				switch (app.change) {
				case Constants.CHANGE_POINT:
					ChangePoint(4);
					break;
				case Constants.CHANGE_HORIZONTAL:
					ChangeHorizontaL(5);
					break;
				case Constants.CHANGE_VERTICAL:
					ChangeVertical(1);
					break;

				default:
					break;
				}
			}	
		}
		
	}

	@Override
	public void ChangePoint(int i) {
		
		count += i;
		if(app.chartor.equals("7"))
		{
			if (count == -1 && app.dao == Constants.LEFT) {
				count = 3;
			} else if (count == 3 && app.dao == Constants.LEFT) {
				count = 7;
			} else if (count == 4 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == 7 && app.dao == Constants.LEFT) {
				count = 11;
			} else if (count == 8 && app.dao == Constants.RIGHT) {
				count = 4;
			} else if (count == 12 && app.dao == Constants.RIGHT) {
				count = 8;
			}
			count = isKeyP(count);
			if (app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C5) || app.keyDown.equals(Constants.KEY_H3)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("2"))
		{
			if (count == -1 && app.dao == Constants.LEFT) {
				count = 4;
			} else if (count == 4 && app.dao == Constants.LEFT) {
				count = 9;
			} else if (count == 9 && app.dao == Constants.LEFT) {
				count = 14;
			}else if (count == 5 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == 10 && app.dao == Constants.RIGHT) {
				count = 5;
			} else if (count == 15 && app.dao == Constants.RIGHT) {
				count = 10;
			}
			count = isKeyP_acp8b(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("3"))
		{
			if (count == -1 && app.dao == Constants.LEFT) {
				count = 4;
			} else if (count == 4 && app.dao == Constants.LEFT) {
				count = 9;
			} else if (count == 9 && app.dao == Constants.LEFT) {
				count = 14;
			}else if (count == 5 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == 10 && app.dao == Constants.RIGHT) {
				count = 5;
			} else if (count == 15 && app.dao == Constants.RIGHT) {
				count = 10;
			}
			count = isKeyP_acp8c(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("4"))
		{
			if (count == -1 && app.dao == Constants.LEFT) {
				count = 4;
			} else if (count == 4 && app.dao == Constants.LEFT) {
				count = 9;
			} else if (count == 9 && app.dao == Constants.LEFT) {
				count = 14;
			}else if (count == 5 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == 10 && app.dao == Constants.RIGHT) {
				count = 5;
			} else if (count == 15 && app.dao == Constants.RIGHT) {
				count = 10;
			}
			count = isKeyP_acp8g(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			if (count == -1 && app.dao == Constants.LEFT) {
				count = 4;
			} else if (count == 4 && app.dao == Constants.LEFT) {
				count = 9;
			} else if (count == 9 && app.dao == Constants.LEFT) {
				count = 14;
			}else if (count == 5 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == 10 && app.dao == Constants.RIGHT) {
				count = 5;
			} else if (count == 15 && app.dao == Constants.RIGHT) {
				count = 10;
			}
			count = isKeyP_acp8(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		
		for (int j = 0; j < list.size(); j++) {
			list.get(j).ChangViewState(false);
			if (count == j) {
				list.get(j).ChangViewState(true);
			}
		}

	}

	private int isKeyP(int count) {
		if (0 <= count && count <= 11) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count - 12;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
					app.keyDown = Constants.KEY_E5;
					if (count == -1) {
						return count = 5;
					} else if (count == -2 || count == -3 ) { 
						return count = 4;
					} else if ( count == -4) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "1.2", "", R.drawable.e_bottom, R.drawable.e_right,
								R.drawable.e_top, R.drawable.e_left, "1.5", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, "2.0");
						app.keyDown = Constants.KEY_E8;
						return count - 12;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
						app.keyDown = Constants.KEY_E6;
						return count + 12;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count + 12;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 12;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, "0.3", "", R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,
							"0.4");
					app.keyDown = Constants.KEY_C5;
					if (count == -1) {
						return count = 5;
					} else if (count == -2 || count == -3 ) { 
						return count = 4;
					} else if (count == -4) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right, "1.2", "", R.drawable.c_right_top, R.drawable.c_right,
								R.drawable.c_left_top, R.drawable.c_bottom, "1.5", "", R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, "2.0");
						app.keyDown = Constants.KEY_C8;
						return count - 12;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
								R.drawable.c_right, "0.7");
						app.keyDown = Constants.KEY_C6;
						return count + 12;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 12;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H3;
					if (count == -1) {
						return count = 5;
					} else if (count == -2 || count == -3) {
						return count = 4;
					} else if ( count == -4) {
						return count = 3;
					}
				}
			}
		}
		return count;
	}
	///////////////////////////////////////////////////////////////////////////
	private int isKeyP_acp8b(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"0.9", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"1.2", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_right_bottom, "0.2", "", R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_left_top,
								R.drawable.c_right_top, R.drawable.c_top,"0.3", "", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top,  R.drawable.c_left_bottom, "0.4");
						app.keyDown = Constants.KEY_H6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_right_bottom, R.drawable.c_right, "1.0", "", R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_left_top,
								R.drawable.c_right, R.drawable.c_left_bottom,"1.2", "", R.drawable.c_right_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left, "1.5");
						app.keyDown = Constants.KEY_H5;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_D10)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_4, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"0.9", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_4, R.drawable.s_9, R.drawable.s_3, "0.2", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_4, "0.4");
						app.keyDown = Constants.KEY_E1;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			}
		}
		return count;
	}
	///////////////////////////////////////////////////////////////
	private int isKeyP_acp8c(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "100", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "  80");
					app.keyDown = Constants.KEY_E3;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "20", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"15", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "10");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
					app.keyDown = Constants.KEY_E4;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_4, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}
		else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
					app.keyDown = Constants.KEY_E5;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "20", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "15", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
					app.keyDown = Constants.KEY_E7;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			}
		}
		return count;
	}
	
	private int isKeyP_acp8g(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "200", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "150");
					app.keyDown = Constants.KEY_E3;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left,  R.drawable.c_bottom, "20", "", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right_top, 
								R.drawable.c_right, "15", "", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_left_top, "10");
						app.keyDown = Constants.KEY_H4;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
					app.keyDown = Constants.KEY_E1;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "20", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"15", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		}
	 else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////
	private int isKeyP_acp8(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
								R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b",  R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, "1.0", "\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_left, "1.2", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.5");
						app.keyDown = Constants.KEY_H4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 15;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "0.10", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "0.15");
					app.keyDown = Constants.KEY_E1;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "1.0", "\b\b\b\b\b", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"1.2", "\b\b\b\b\b", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "1.5");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
						}	
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "\b\b\b\b\b", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17, "1.2", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_bottom, "1.0", "\b\b\b\b\b", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top,
									R.drawable.c_right_top, R.drawable.c_right, "1.2", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left_top, "1.5");
						}
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil. Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
						    imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
							
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_E7;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4 || count == -5) {
						return count = 3;
					}
				}
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////

	@Override
	public void ChangeHorizontaL(int i) {
		
		if(app.chartor.equals("7"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				return;
			}
			count += i;
			Log.d("adas", count + " ");

			count = isKeyH(count);

			if (app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C5) || app.keyDown.equals(Constants.KEY_H3)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}

			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(1).ChangViewState(true);
					list.get(2).ChangViewState(true);
					list.get(3).ChangViewState(true);
				}
				if (count == 4) {
					list.get(4).ChangViewState(true);
					list.get(5).ChangViewState(true);
					list.get(6).ChangViewState(true);
					list.get(7).ChangViewState(true);
				}
				if (count == 8) {
					list.get(8).ChangViewState(true);
					list.get(9).ChangViewState(true);
					list.get(10).ChangViewState(true);
					list.get(11).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("2"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				return;
			}
			count += i;
			Log.d("adas", count + " ");

			count = isKeyH_acp8b(count);

			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}

			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(1).ChangViewState(true);
					list.get(2).ChangViewState(true);
					list.get(3).ChangViewState(true);
					list.get(4).ChangViewState(true);
				}
				if (count == 5) {
					list.get(5).ChangViewState(true);
					list.get(6).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(8).ChangViewState(true);
					list.get(9).ChangViewState(true);
				}
				if (count == 10) {
					list.get(10).ChangViewState(true);
					list.get(11).ChangViewState(true);
					list.get(12).ChangViewState(true);
					list.get(13).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("3"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				return;
			}
			count += i;
			Log.d("adas", count + " ");

			count = isKeyH_acp8c(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(1).ChangViewState(true);
					list.get(2).ChangViewState(true);
					list.get(3).ChangViewState(true);
					list.get(4).ChangViewState(true);
				}
				if (count == 5) {
					list.get(5).ChangViewState(true);
					list.get(6).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(8).ChangViewState(true);
					list.get(9).ChangViewState(true);
				}
				if (count == 10) {
					list.get(10).ChangViewState(true);
					list.get(11).ChangViewState(true);
					list.get(12).ChangViewState(true);
					list.get(13).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("4"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				return;
			}
			count += i;
			Log.d("adas", count + " ");

			count = isKeyH_acp8g(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(1).ChangViewState(true);
					list.get(2).ChangViewState(true);
					list.get(3).ChangViewState(true);
					list.get(4).ChangViewState(true);
				}
				if (count == 5) {
					list.get(5).ChangViewState(true);
					list.get(6).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(8).ChangViewState(true);
					list.get(9).ChangViewState(true);
				}
				if (count == 10) {
					list.get(10).ChangViewState(true);
					list.get(11).ChangViewState(true);
					list.get(12).ChangViewState(true);
					list.get(13).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				return;
			}
			count += i;
			Log.d("adas", count + " ");

			count = isKeyH_acp8(count);

			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}

			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(1).ChangViewState(true);
					list.get(2).ChangViewState(true);
					list.get(3).ChangViewState(true);
					list.get(4).ChangViewState(true);
				}
				if (count == 5) {
					list.get(5).ChangViewState(true);
					list.get(6).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(8).ChangViewState(true);
					list.get(9).ChangViewState(true);
				}
				if (count == 10) {
					list.get(10).ChangViewState(true);
					list.get(11).ChangViewState(true);
					list.get(12).ChangViewState(true);
					list.get(13).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		
	}

	private int isKeyH(int count) {
		if (0 <= count && count <= 11) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count - 12;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
					app.keyDown = Constants.KEY_E5;
					if (count == -4) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "1.2", "", R.drawable.e_bottom, R.drawable.e_right,
								R.drawable.e_top, R.drawable.e_left, "1.5", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, "2.0");
						app.keyDown = Constants.KEY_E8;
						return count - 12;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
						app.keyDown = Constants.KEY_E6;
						return count + 12;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count + 12;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 12;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, "0.3", "", R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,
							"0.4");
					app.keyDown = Constants.KEY_C5;
					if (count == -1) {
						return count = 5;
					} else if (count == -2) {
						return count = 4;
					} else if (count == -3 || count == -4) {
						return count = 3;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						imgUtil.Img_4_init("", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right, "1.2", "", R.drawable.c_right_top, R.drawable.c_right,
								R.drawable.c_left_top, R.drawable.c_bottom, "1.5", "", R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, "2.0");
						app.keyDown = Constants.KEY_C8;
						return count - 12;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
								R.drawable.c_right, "0.7");
						app.keyDown = Constants.KEY_C6;
						return count + 12;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 12;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 12 || count == 13 || count == 14 || count == 15) {
						return count - 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H3;
					return count = 3;
				}
			}
		}
		return count;
	}
	/////////////////////////////////////////////////////////////////////////////////
	private int isKeyH_acp8b(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"0.9", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"1.2", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_right_bottom, "0.2", "", R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_left_top,
								R.drawable.c_right_top, R.drawable.c_top,"0.3", "", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top,  R.drawable.c_left_bottom, "0.4");
						app.keyDown = Constants.KEY_H6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_right_bottom, R.drawable.c_right, "1.0", "", R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_left_top,
								R.drawable.c_right, R.drawable.c_left_bottom,"1.2", "", R.drawable.c_right_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left, "1.5");
						app.keyDown = Constants.KEY_H5;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_D10)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
					return count = 3;
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_4, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"0.9", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_4, R.drawable.s_9, R.drawable.s_3, "0.2", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_4, "0.4");
						app.keyDown = Constants.KEY_E1;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			}
		}
		return count;	
	}
	////////////////////////////////////////////////////////////////////
	private int isKeyH_acp8c(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "100", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "  80");
					app.keyDown = Constants.KEY_E3;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "20", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"15", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "10");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
					app.keyDown = Constants.KEY_E4;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_4, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}
		else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
					app.keyDown = Constants.KEY_E5;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "20", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "15", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
					app.keyDown = Constants.KEY_E7;
					return count = 3;
				}
			}
		}
		return count;
	}
	
	private int isKeyH_acp8g(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "200", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "150");
					app.keyDown = Constants.KEY_E3;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left,  R.drawable.c_bottom, "20", "", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right_top, 
								R.drawable.c_right, "15", "", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_left_top, "10");
						app.keyDown = Constants.KEY_H4;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
					app.keyDown = Constants.KEY_E1;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "20", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"15", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		}
	 else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
					return count = 3;
				}
			}
		}
		return count;
	}
    //////////////////////////////////////////////////////////////////
	private int isKeyH_acp8(int count) {
		if (0 <= count && count <= 14) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
								R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 15;
					}
				}
			}  else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b",  R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, "1.0", "\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_left, "1.2", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.5");
						app.keyDown = Constants.KEY_H4;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "0.10", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "0.15");
					app.keyDown = Constants.KEY_E1;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						return count + 15;
					}
				}
			}  else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "1.0", "\b\b\b\b\b", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"1.2", "\b\b\b\b\b", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "1.5");
						app.keyDown = Constants.KEY_H2;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count + 15;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")) {
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count - 15;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
					return count = 3;
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
						app.keyDown = Constants.KEY_C6;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
						}
						app.keyDown = Constants.KEY_E5;
						return count + 15;
					}
				}
			}  else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "\b\b\b\b\b", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17, "1.2", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_bottom, "1.0", "\b\b\b\b\b", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top,
									R.drawable.c_right_top, R.drawable.c_right, "1.2", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left_top, "1.5");
						}
						app.keyDown = Constants.KEY_H3;
						return count - 15;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count + 15;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 || count == -2 || count == -1) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
						    imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
						app.keyDown = Constants.KEY_C6;
						return count + 15;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 15 || count == 16 || count == 17 || count == 18 || count == 19) {
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_E7;
					return count = 3;
				}
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////////
	@Override
	public void ChangeVertical(int i) {
		
		if(app.chartor.equals("7"))
		{
			count += i;
		    
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
			if (count == 4) {
				count = 0;
			}
			if (count == -1) {
				count = 3;
			}
		 }	
         count = isKeyV(count);
         
         if (app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C5) || app.keyDown.equals(Constants.KEY_H3)) {
        	 mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
        	 ImgViewVessel_3.getInstance(mActivity).count = 0;
        	 mActivity.vessel.change(count);
        	 return;
         }
         
         for (int j = 0; j < list.size(); j++) {
        	 list.get(j).ChangViewState(false);
        	 if (count == 0) {
        		 list.get(0).ChangViewState(true);
        		 list.get(4).ChangViewState(true);
        		 list.get(8).ChangViewState(true);
        	 }
        	 if (count == 1) {
        		 list.get(1).ChangViewState(true);
        		 list.get(5).ChangViewState(true);
        		 list.get(9).ChangViewState(true);
        	 }
        	 if (count == 2) {
        		 list.get(2).ChangViewState(true);
        		 list.get(6).ChangViewState(true);
        		 list.get(10).ChangViewState(true);
        	 }
        	 if (count == 3) {
        		 list.get(3).ChangViewState(true);
        		 list.get(7).ChangViewState(true);
        		 list.get(11).ChangViewState(true);
        	 }
          }	
		}
		else if(app.chartor.equals("2"))
		{
			count += i;

			if (count == 3) {
				count = 0;
			}
			if (count == -1) {
				count = 2;
			}
			/////////////////////////////////////////////////
			count = isKeyV_acp8b(count);		
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			/////////////////////////////////////////////////
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(5).ChangViewState(true);
					list.get(10).ChangViewState(true);
				}
				if (count == 1) {
					list.get(2).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(12).ChangViewState(true);
				}
				if (count == 2) {
					list.get(4).ChangViewState(true);
					list.get(9).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("3"))
		{
			count += i;

			if (count == 3) {
				count = 0;
			}
			if (count == -1) {
				count = 2;
			}
			/////////////////////////////////////////////////
			count = isKeyV_acp8c(count);		
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			/////////////////////////////////////////////////
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(5).ChangViewState(true);
					list.get(10).ChangViewState(true);
				}
				if (count == 1) {
					list.get(2).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(12).ChangViewState(true);
				}
				if (count == 2) {
					list.get(4).ChangViewState(true);
					list.get(9).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("4"))
		{
			count += i;

			if (count == 3) {
				count = 0;
			}
			if (count == -1) {
				count = 2;
			}
			/////////////////////////////////////////////////
			count = isKeyV_acp8g(count);		
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			/////////////////////////////////////////////////
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(5).ChangViewState(true);
					list.get(10).ChangViewState(true);
				}
				if (count == 1) {
					list.get(2).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(12).ChangViewState(true);
				}
				if (count == 2) {
					list.get(4).ChangViewState(true);
					list.get(9).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			count += i;

			if (count == 3) {
				count = 0;
			}
			if (count == -1) {
				count = 2;
			}
			/////////////////////////////////////////////////
			count = isKeyV_acp8(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_E1) || app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			/////////////////////////////////////////////////
			for (int j = 0; j < list.size(); j++) {
				list.get(j).ChangViewState(false);
				if (count == 0) {
					list.get(0).ChangViewState(true);
					list.get(5).ChangViewState(true);
					list.get(10).ChangViewState(true);
				}
				if (count == 1) {
					list.get(2).ChangViewState(true);
					list.get(7).ChangViewState(true);
					list.get(12).ChangViewState(true);
				}
				if (count == 2) {
					list.get(4).ChangViewState(true);
					list.get(9).ChangViewState(true);
					list.get(14).ChangViewState(true);
				}
			}
		}
	}
	
	private int isKeyV(int count) {
	
		if (0 == count || count == 1 || count == 2 || count == 3) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count - 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
					app.keyDown = Constants.KEY_E5;
					if (count == -1) {
						return count = 1;
					}
					else
						return count = 0;
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
			
					
				if (app.dao == Constants.DOWN) {
				
						if (count == 4 || count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "1.2", "", R.drawable.e_bottom, R.drawable.e_right,
								R.drawable.e_top, R.drawable.e_left, "1.5", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, "2.0");
						app.keyDown = Constants.KEY_E8;
						return count - 4;
					}
				} else {
					
					if (count == -4 || count == -3 || count == -2 || count == -1 ) {
						imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
						app.keyDown = Constants.KEY_E6;
						return count + 4;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						return count - 4;
					}
				} else  {
					if (count == -4 || count == -3 || count == -2 || count == -1 )  {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_E7;
						return count + 4;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, "0.3", "", R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,
							"0.4");
					app.keyDown = Constants.KEY_C5;
					if (count == -1) {
						return count = 1;
					}
					else
						return count = 0;
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_init("", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right, "1.2", "", R.drawable.c_right_top, R.drawable.c_right,
								R.drawable.c_left_top, R.drawable.c_bottom, "1.5", "", R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, "2.0");
						app.keyDown = Constants.KEY_C8;
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1 ) {
						imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
								R.drawable.c_right, "0.7");
						app.keyDown = Constants.KEY_C6;
						return count + 4;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C8)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						return count - 4;
					}
				} else {
					if (count == -4 || count == -3 || count == -2 || count == -1 )  {
						imgUtil.Img_4_init("", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.8", "", R.drawable.c_left, R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right_top, "0.9", "", R.drawable.c_right_bottom, R.drawable.c_left_bottom, R.drawable.c_top, R.drawable.c_left, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 4;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 4 || count == 5 || count == 6 || count == 7) {
						return count - 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H3;
					if (count == -1) {
						return count = 1;
					}
					else
						return count = 0;
				}
			}
		}
		return count;
	  }
	
	////////////////////////////////////////////////////////////////
	private int isKeyV_acp8b(int count) {
		if (0 == count || count == 1 || count == 2) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"0.9", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ){
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"0.6", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 5;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"1.2", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						app.keyDown = Constants.KEY_H3;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						app.keyDown = Constants.KEY_C2;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"0.9", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "1.0");
						app.keyDown = Constants.KEY_C6;
						return count + 5;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ){
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_right_bottom, "0.2", "", R.drawable.c_bottom, R.drawable.c_right, R.drawable.c_left_top,
								R.drawable.c_right_top, R.drawable.c_top,"0.3", "", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top,  R.drawable.c_left_bottom, "0.4");
						app.keyDown = Constants.KEY_H6;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, R.drawable.c_right_bottom, R.drawable.c_right, "1.0", "", R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_left_top,
								R.drawable.c_right, R.drawable.c_left_bottom,"1.2", "", R.drawable.c_right_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left, "1.5");
						app.keyDown = Constants.KEY_H5;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_right, R.drawable.c_right_bottom, R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_left, "0.5", "", R.drawable.c_top, R.drawable.c_left_top, R.drawable.c_bottom,
								R.drawable.c_right_top, R.drawable.c_right,"0.6", "", R.drawable.c_right_top, R.drawable.c_left, R.drawable.c_left_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						app.keyDown = Constants.KEY_E7;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left_top, R.drawable.c_right, R.drawable.c_left, "0.8", "", R.drawable.c_right, R.drawable.c_right_top, R.drawable.c_top,
								R.drawable.c_left_bottom, R.drawable.c_bottom,"0.9", "", R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right, R.drawable.c_left_top,  R.drawable.c_right_bottom, "1.0");
						app.keyDown = Constants.KEY_C4;
						return count + 5;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_D10)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_4, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"0.9", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C1;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_4, R.drawable.s_9, R.drawable.s_3, "0.2", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_4, "0.4");
						app.keyDown = Constants.KEY_E1;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ){
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_4, R.drawable.s_9,"0.6", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_E4;
						return count + 5;
					}
				}
			}
		}
		return count;	
	  }
	
	private int isKeyV_acp8c(int count) {
		if (0 == count || count == 1 || count == 2) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "100", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "  80");
					app.keyDown = Constants.KEY_E3;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "20", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, R.drawable.e_left,"15", "", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,  R.drawable.e_bottom, "10");
						app.keyDown = Constants.KEY_C7;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 )  {
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "40", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top,
								R.drawable.e_left, R.drawable.e_right,"30", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_bottom, "25");
						app.keyDown = Constants.KEY_C3;
						return count + 5;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count - 5;
					}
				} else  {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
					app.keyDown = Constants.KEY_E4;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_4, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else  {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "40", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_4, R.drawable.s_8,"30", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "25");
						app.keyDown = Constants.KEY_C5;
						return count + 5;
					}
				}
			}
		}
		else  if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
					app.keyDown = Constants.KEY_E5;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "20", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "15", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "40", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"30", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "25");
						app.keyDown = Constants.KEY_C6;
						return count + 5;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				}else {
						imgUtil.Change(Constants.IMG_3);
						imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
						app.keyDown = Constants.KEY_E7;
						if(count == -3) {
						    return count = 1;
						}else if((count == -4 )||( count == -5)) {
							return count = 0;
						}					
				}
			}
		}
		return count;
	  }
	
	
	private int isKeyV_acp8g(int count) {
		if (0 == count || count == 1 || count == 2) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "200", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "150");
					app.keyDown = Constants.KEY_E3;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 )  {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left,  R.drawable.c_bottom, "20", "", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_right_top, 
								R.drawable.c_right, "15", "", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top, R.drawable.c_left_top, "10");
						app.keyDown = Constants.KEY_H4;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "60", "", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_right_top, 
								R.drawable.c_right, "50", "", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_bottom, "40");
						app.keyDown = Constants.KEY_C3;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom,  R.drawable.c_left, "30", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, 
								R.drawable.c_top, "25", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top, R.drawable.c_right, "20");
						app.keyDown = Constants.KEY_C7;
						return count + 5;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
					app.keyDown = Constants.KEY_E1;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "20", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"15", "", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "10");
						app.keyDown = Constants.KEY_H2;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "60", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"50", "", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "40");
						app.keyDown = Constants.KEY_C1;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "30", "", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"25", "", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "20");
						app.keyDown = Constants.KEY_C5;
						return count + 5;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count - 5;
					}
				} else{
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ){
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
						app.keyDown = Constants.KEY_E5;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "20", "", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17,"15", "", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "10");
						app.keyDown = Constants.KEY_H3;
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 )  {
						imgUtil.Img_4_ACP8init("", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "60", "", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"50", "", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "40");
						app.keyDown = Constants.KEY_C2;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else{
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "30", "", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10,"25", "", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16,  R.drawable.s_11, "20");
						app.keyDown = Constants.KEY_C6;
						return count + 5;
					}
				}
			}
		}
	 else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						return count - 5;
					}
				} else{
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			}
		}
		return count;
	  }
	
	//////////////////////////////////////////////////////////////
	private int isKeyV_acp8(int count) {
		if (0 == count || count == 1 || count == 2) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7 ) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, "0.10", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_right, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
								R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b",  R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, "1.0", "\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_left, "1.2", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.5");
						app.keyDown = Constants.KEY_H4;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3 ) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_right, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left, "0.5", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left,
								R.drawable.e_right, "0.6", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_left,R.drawable.e_right, R.drawable.e_bottom, "0.7");
						app.keyDown = Constants.KEY_C3;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.8", "\b\b\b\b\b", R.drawable.e_right,  R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top,
								R.drawable.e_left, "0.9", "\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "1.0");
						app.keyDown = Constants.KEY_C7;
						return count + 5;
					}
				}
			}
		}else  if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "0.10", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "0.15");
					app.keyDown = Constants.KEY_E1;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, "1.0", "\b\b\b\b\b", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_9, R.drawable.s_5,"1.2", "\b\b\b\b\b", R.drawable.s_3, R.drawable.s_9, R.drawable.s_8, R.drawable.s_2,  R.drawable.s_6, "1.5");
						app.keyDown = Constants.KEY_H2;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "0.5", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_9,"0.6", "\b\b\b\b\b", R.drawable.s_6, R.drawable.s_9, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "0.7");
						app.keyDown = Constants.KEY_C1;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_9, R.drawable.s_8, R.drawable.s_6, R.drawable.s_5, R.drawable.s_3, "0.8", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_5, R.drawable.s_9,
								R.drawable.s_6, R.drawable.s_8,"0.9", "\b\b\b\b\b", R.drawable.s_5, R.drawable.s_6, R.drawable.s_3, R.drawable.s_8,  R.drawable.s_9, "1.0");
						app.keyDown = Constants.KEY_C5;
						return count + 5;
					}
				}
			}
		}else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
						    imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count - 5;
					}
				} else {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
						app.keyDown = Constants.KEY_C6;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
						}
						app.keyDown = Constants.KEY_E5;
						return count + 5;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C6)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.e_right, R.drawable.s_16, R.drawable.s_15, R.drawable.s_21, "1.0", "\b\b\b\b\b", R.drawable.s_20, R.drawable.s_11, R.drawable.e_right,
								R.drawable.s_21, R.drawable.s_17, "1.2", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_14, R.drawable.s_21, R.drawable.s_12,  R.drawable.s_11, "1.5");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left_bottom, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_bottom, "1.0", "\b\b\b\b\b", R.drawable.c_left, R.drawable.c_bottom, R.drawable.c_top,
									R.drawable.c_right_top, R.drawable.c_right, "1.2", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_top,  R.drawable.c_left_top, "1.5");
						}
						app.keyDown = Constants.KEY_H3;
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_14, R.drawable.c_right, R.drawable.s_10, R.drawable.e_right, R.drawable.s_13, "0.5", "\b\b\b\b\b", R.drawable.s_22, R.drawable.s_20, R.drawable.s_17,
								R.drawable.s_14, R.drawable.s_21,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.s_12, R.drawable.s_15, R.drawable.s_11,  R.drawable.s_16, "0.7");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_left, R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_bottom, R.drawable.c_right, "0.5", "\b\b\b\b\b", R.drawable.c_top, R.drawable.c_left, R.drawable.c_bottom,
									R.drawable.c_right_top, R.drawable.c_right,"0.6", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_left, R.drawable.c_top, R.drawable.c_right_bottom,  R.drawable.c_bottom, "0.7");
						}
						app.keyDown = Constants.KEY_C2;
						return count + 5;
					}
				}
			}else if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						return count - 5;
					}
				} else {
					if (count == -5 || count == -4 || count == -3) {
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_20, R.drawable.s_17, R.drawable.e_right, R.drawable.s_18, R.drawable.s_15, "0.8", "\b\b\b\b\b", R.drawable.s_21, R.drawable.s_13, R.drawable.s_22,
								R.drawable.s_20, R.drawable.s_10, "0.9", "\b\b\b\b\b", R.drawable.s_13, R.drawable.s_10, R.drawable.s_12, R.drawable.s_16, R.drawable.s_11, "1.0");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_left_bottom, R.drawable.c_left, "0.8", "\b\b\b\b\b", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_top, "0.9", "\b\b\b\b\b", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_top,  R.drawable.c_right, "1.0");
						}
						app.keyDown = Constants.KEY_C6;
						return count + 5;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 5 || count == 6 || count == 7) {
						return count - 5;
					}		
				} else {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_E7;
					if (count == -3) {
					    return count = 1;
					}else if (count == -4 || count == -5) {
						return count = 0;
					}
				}
			}
		}
		return count;
	  }
	//////////////////////////////////////////////////////////////
}


