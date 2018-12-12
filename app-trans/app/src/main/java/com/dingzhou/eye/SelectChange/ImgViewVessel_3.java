package com.dingzhou.eye.SelectChange;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.FragmentRight;
import com.dingzhou.eye.R;

public class ImgViewVessel_3 extends ImgViewVessel {
	private static ImgViewVessel_3 vessel_3;
	private MyApp app;
	private List<ImgView> list;
	private FragmentRight mActivity;
	public int count = 0;
	private ImgUtil imgUtil;

	public static ImgViewVessel_3 getInstance(FragmentRight _activity) {
		if (vessel_3 == null) {
			synchronized (ImgViewVessel_3.class) {
				if (vessel_3 == null) {
					vessel_3 = new ImgViewVessel_3(_activity);
				}
			}
		}
		return vessel_3;
	}

	private ImgViewVessel_3(FragmentRight _activity) {
		super(_activity);
		// TODO Auto-generated constructor stub
		mActivity = _activity;

		list = new ArrayList<ImgView>();
		list.add(new ImgView(mActivity.img_img_3_1_c1));
		list.add(new ImgView(mActivity.img_img_3_1_c2));
		list.add(new ImgView(mActivity.img_img_3_1_c3));

		list.add(new ImgView(mActivity.img_img_3_2_c1));
		list.add(new ImgView(mActivity.img_img_3_2_c2));
		list.add(new ImgView(mActivity.img_img_3_2_c3));

		app = (MyApp) mActivity.getActivity().getApplication();
		app.cdReadl();
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
		if (!state) {
			switch (app.change) {
			case Constants.CHANGE_POINT:
				ChangePoint(2);
				break;
			case Constants.CHANGE_HORIZONTAL:
				ChangeHorizontaL(0);
				break;
			case Constants.CHANGE_VERTICAL:
				ChangeVertical(1);
				break;

			default:
				break;
			}
		}

	}

	@Override
	public void ChangePoint(int i) {
		// TODO Auto-generated method stub
		count += i;
		if (count == -1 && app.dao == Constants.LEFT) {
			count = 2;
		} else if (count == 3 && app.dao == Constants.RIGHT) {
			count = 0;
		} else if (count == 2 && app.dao == Constants.LEFT) {
			count = 5;
		} else if (count == 6 && app.dao == Constants.RIGHT) {
			count = 3;
		}
	
		if(app.chartor.equals("7"))
		{
			count = isKeyP(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_C3) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C6) || app.keyDown.equals(Constants.KEY_H4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("2"))
		{
			count = isKeyP_acp8b(count);
			if (app.keyDown.equals(Constants.KEY_H1)||app.keyDown.equals(Constants.KEY_C5)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_D10)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("3"))
		{
			count = isKeyP_acp8c(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C1) || app.keyDown.equals(Constants.KEY_C2) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("4"))
		{
			count = isKeyP_acp8g(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			count = isKeyP_acp8(count);
			if ( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
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
		if (0 <= count && count <= 5) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count - 6;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -1 || count == -2) {   
						return count = 1;
					} else if (count == -3 ) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
							R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
					app.keyDown = Constants.KEY_E6;
					if (count == 6) {
						return count = 0; 
					} else if (count == 7) {
						return count = 2;
					} else if (count == 8) {
						return count = 3;
					}
				} else {
					if (count == -1 || count == -2 || count == -3) {
						imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
						app.keyDown = Constants.KEY_E4;
						return count + 6;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, "0.3", "", R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,
								"0.4");
						app.keyDown = Constants.KEY_C5;
						return count - 6;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
					app.keyDown = Constants.KEY_C3;
					if (count == -1 || count == -2) { 
						return count = 1;
					} else if (count == -3) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
							R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
							R.drawable.c_right, "0.7");    
					app.keyDown = Constants.KEY_C6;
					if (count == 6) {
						return count = 0;
					} else if (count == 7) {
						return count = 2;
					} else if (count == 8) {
						return count = 3;
					}
				} else {
					if (count == -1 || count == -2 || count == -3) {
						imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
						app.keyDown = Constants.KEY_C4;
						return count + 6;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "", R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_H4;
					if (count == 6) {
						return count = 0;   
					} else if (count == 7) {
						return count = 2;
					} else if (count == 8) {
						return count = 3;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_H2;
					if (count == -1 || count == -2) {
						return count = 1;
					} else if (count == -3) {   
						return count = 0;
					}
				}
			}
		}
		return count;
	}
    
	//////////////////////////////////////////////////////////////////
	private int isKeyP_acp8b(int count) {
		if (0 <= count && count <= 5) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				}
				else {
				if (count == -3 || count ==-2 || count == -1 ) {
					return count + 3;
				}
			}

			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						app.keyDown = Constants.KEY_E5;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} 
				else {
				imgUtil.Change(Constants.IMG_2);
				imgUtil.Img_2_init("", R.drawable.e_right,R.drawable.e_right, "0.05");
				app.keyDown = Constants.KEY_H1;
				return count = 0;
			}

			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_D10 ;
					if (count == 6) {
						return count = 2;
					} else if (count == 7) {
						return count = 3;
					} else if (count == 8) {
						return count = 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly,R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_C5;
					return count = 0;
				}
			}
		}
		return count;
	}
	
	//////////////////////////////////////////////////////////////////
	private int isKeyP_acp8c(int count) {
		if (0 <= count && count <= 5) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} 
				else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}

			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
						app.keyDown = Constants.KEY_E4;
						return count -6;
					}
				}
				else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}
			} 
			else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
						app.keyDown = Constants.KEY_E1;
						return count + 6;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
						app.keyDown = Constants.KEY_E5;
						return count -6;
					}
				} 
				else if (app.dao == Constants.UP) {
				imgUtil.Change(Constants.IMG_2);
				imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
				app.keyDown = Constants.KEY_H1;
				return count = 0;
			}

			} 
			else if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
						app.keyDown = Constants.KEY_E2;
						return count + 6;
					}
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "40", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "30", "",R.drawable.car, R.drawable.butterfly, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					if (count == 6) {
						return count = 2;
					} else if (count == 7) {
						return count = 3;
					} else if (count == 8) {
						return count = 4;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "100");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			}
		}
		return count;
	}
	
	///////////////////////////////////////////////////////////////////
	private int isKeyP_acp8g(int count) {
		if (0 <= count && count <= 5) {
			return count;
		}
	  
		if (app.c_e_h == Constants.CONTENT_C) {
			 if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				}else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}
				
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			 if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				}else if (app.dao == Constants.UP){
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}
				
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
					app.keyDown = Constants.KEY_E5;
					if (count == 6) {
						return count = 2;
					} else if (count == 7) {
						return count = 3;
					} else if (count == 8) {
						return count = 4;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.s_12, R.drawable.s_12, "400");
					app.keyDown = Constants.KEY_H1;
					return count = 0;
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "30", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "25", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					if (count == 6) {
						return count = 2;
					} else if (count == 7) {
						return count = 3;
					} else if (count == 8) {
						return count = 4;
					}
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "200");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////////
	private int isKeyP_acp8(int count) {
		if (0 <= count && count <= 5) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
								R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} else {
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} else {
					if (count == -3 || count ==-2 || count == -1 ) {
						return count + 3;
					}
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Change(Constants.IMG_5);
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
						}
						
						app.keyDown = Constants.KEY_E5;
						if (count == 6) {
							return count = 2;
						} else if (count == 7) {
							return count = 3;
						} else if (count == 8) {
							return count = 4;
						}
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.s_14, R.drawable.s_14, "0.05");
					else if(app.chartor.equals("100"))
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_right, "0.05");
					app.keyDown = Constants.KEY_H1;
				    return count = 0;
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "\b\b\b\b\b",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "\b\b\b\b\b", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_C4;
					if (count == 6) {
						return count = 2;
					} else if (count == 7) {
						return count = 3;
					} else if (count == 8) {
						return count = 4;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.butterfly, R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////////
	@Override
	public void ChangeHorizontaL(int i) {
		// TODO Auto-generated method stub
		if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
			return;
		}
		count += i;
		if(app.chartor.equals("7"))
		{
			count = isKeyH(count);
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_C3) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C6) || app.keyDown.equals(Constants.KEY_H4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("2"))
		{
			count = isKeyH_acp8b(count);
			if (app.keyDown.equals(Constants.KEY_H1)||app.keyDown.equals(Constants.KEY_C5)){
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_D10)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("3"))
		{
			count = isKeyH_acp8c(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C1) || app.keyDown.equals(Constants.KEY_C2) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("4"))
		{
			count = isKeyH_acp8g(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			count = isKeyH_acp8(count);
			if ( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		for (int j = 0; j < list.size(); j++) {
			list.get(j).ChangViewState(false);
			if (count == 0) {
				list.get(0).ChangViewState(true);
				list.get(1).ChangViewState(true);
				list.get(2).ChangViewState(true);
			}
			if (count == 3) {
				list.get(3).ChangViewState(true);
				list.get(4).ChangViewState(true);
				list.get(5).ChangViewState(true);
			}
		}
	}

	private int isKeyH(int count) {
		if (0 == count || count == 3) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count - 6;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -3) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
							R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
					app.keyDown = Constants.KEY_E6;
					return count = 0;
				} else {
					if (count == -1 || count == -2 || count == -3) {
						imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
						app.keyDown = Constants.KEY_E4;
						return count + 6;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 || count == 7 || count == 8) {
						imgUtil.Img_3_init("", R.drawable.c_right_bottom, R.drawable.c_bottom, R.drawable.c_left, "0.3", "", R.drawable.c_left_bottom, R.drawable.c_right_top, R.drawable.c_top,
								"0.4");
						app.keyDown = Constants.KEY_C5;
						return count - 6;
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
					app.keyDown = Constants.KEY_C3;
					if (count == -3) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
							R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
							R.drawable.c_right, "0.7");
					app.keyDown = Constants.KEY_C6;
					return count = 0;
				} else {
					if (count == -1 || count == -2 || count == -3) {
						imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
						app.keyDown = Constants.KEY_C4;
						return count + 6;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_4);
					imgUtil.Img_4_init("", R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "", R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_H4;
					return count = 0;
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_H2;
					if (count == -1) {
						return count = 1;
					} else if (count == -3 || count == -2) {
						return count = 0;
					}
				}
			}
		}
		return count;
	}
    
	///////////////////////////////////////////////////////////////////////////
	private int isKeyH_acp8b(int count) {
		if (0 == count || count == 3) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
							R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
					app.keyDown = Constants.KEY_E6;
					return count = 0;
				}
				else {
				return count = 0;
			}
//				else {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.e_right,R.drawable.e_right, "0.05");
//					app.keyDown = Constants.KEY_H1;
//					if (count == -3) {
//						return count = 0;
//					}
//				} 
			  }
			} else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
					app.keyDown = Constants.KEY_E5;
					return count = 0;
				} 
				else {
				imgUtil.Change(Constants.IMG_2);
				imgUtil.Img_2_init("", R.drawable.e_right,R.drawable.e_right, "0.05");
				app.keyDown = Constants.KEY_H1;
				if (count == -3) {
					return count = 0;
				}
			}
//				else {
//					return count = 0;
//				}
			 }
			} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_D10;
					return count = 0;
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly,R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_C5;
					if (count == -3) {
						return count = 0;
					}
				}
			}
		}
		return count;
	}
	
	
	private int isKeyH_acp8c(int count) {
		if (0 == count || count == 3) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						return count = 0;

				}
				else if (app.dao == Constants.UP) {
					if (count == -3 ) {
						return count =0;
					}
				}
//				else {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
//					app.keyDown = Constants.KEY_H1;
//					if (count == -3) {
//						return count = 0;
//					}
//				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6 ) {
						imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
						app.keyDown = Constants.KEY_E4;
						return count -6;
					}
				}
				else if (app.dao == Constants.UP){
					if (count == -3 ) {
						return count =0;
					}
				}
			} 
			else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						return count = 0;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -3) {
						imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
						app.keyDown = Constants.KEY_E1;
						return count + 6;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6) {
						imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
						app.keyDown = Constants.KEY_E5;
						return count -6;
					}
				}
				else if (app.dao == Constants.UP){
				imgUtil.Change(Constants.IMG_2);
				imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
				app.keyDown = Constants.KEY_H1;
				if (count == -3) {
					return count = 0;
				}
			}
//				else {
//					if (count == -3) {
//						return count=0;
//					}
//				}
			} 
			else if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 6) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						return count = 0;
					}
				} else if (app.dao == Constants.UP){
					if (count == -3 ) {
						imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
						app.keyDown = Constants.KEY_E2;
						return count + 6;
					}
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "40", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "30", "",R.drawable.car, R.drawable.butterfly, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					return count = 0;
				} else if (app.dao == Constants.UP){
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "100");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyH_acp8g(int count) {
		if (0 == count || count == 3) {
			return count;
		}
	  
		if (app.c_e_h == Constants.CONTENT_C) {
			 if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						return count = 0;
				}else if (app.dao == Constants.UP){
					return count = 0;
				}
				
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			 if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						return count = 0;
				}else if (app.dao == Constants.UP){
					    return count = 0;
				}
				
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
					app.keyDown = Constants.KEY_E5;
					return count = 0;
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.s_12, R.drawable.s_12, "400");
					app.keyDown = Constants.KEY_H1;
					return count = 0;
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "30", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "25", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					return count = 0;
				} else if (app.dao == Constants.UP) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "200");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			}
		}
		return count;
	}
	/////////////////////////////////////////////////////////////////////////
	private int isKeyH_acp8(int count) {
		if (0 == count || count == 3) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
							R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
					app.keyDown = Constants.KEY_E6;
					return count = 0;
				} else {
						return count = 0;
					}
				}
			} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					if(app.chartor.equals("6")||app.chartor.equals("8")){
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
					}else if(app.chartor.equals("100")){
						imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
								R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
					}
					app.keyDown = Constants.KEY_E5;
					return count = 0;
				} else {
					imgUtil.Change(Constants.IMG_2);
					if(app.chartor.equals("6")||app.chartor.equals("8")){
						imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.s_14, R.drawable.s_14, "0.05");
					}else if(app.chartor.equals("100")){
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_right, "0.05");
					}
					app.keyDown = Constants.KEY_H1;
					if (count == -3) {
						return count = 0;
					}
				}
			 }
			} else if (app.c_e_h == Constants.CONTENT_S) {
				if (app.keyDown.equals(Constants.KEY_E1)) {
					if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						return count = 0;
					} else {
						return count = 0;
					}
				}
			}else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "\b\b\b\b\b",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "\b\b\b\b\b", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_C4;
					return count = 0;
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.butterfly, R.drawable.butterfly, "0.1");
					app.keyDown = Constants.KEY_H6;
					if (count == -3) {
						return count = 0;
					}
				}
			}
		}
		return count;
	}
	/////////////////////////////////////////////////////////////////////////
	@Override
	public void ChangeVertical(int i) {
		// TODO Auto-generated method stub
		count += i;
		//////////////////////////////////////////////////////
		if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
			if (count == 2) {
				count = 0;
			}
			if (count == -1) {
				count = 1;
			}
		}
		if(app.chartor.equals("7"))
		{
			count = isKeyV(count);
			//////////////////////////////////////////////////////////////////////////////////////////
			if (app.keyDown.equals(Constants.KEY_E3) || app.keyDown.equals(Constants.KEY_C3) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}//由2行3列向1行2列转变时
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C6) || app.keyDown.equals(Constants.KEY_H4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}//由2行3列向3行4列转变时
			///////////////////////////////////////////////////
		}
		else if(app.chartor.equals("2"))
		{
			count = isKeyV_acp8b(count);
			if (app.keyDown.equals(Constants.KEY_H1)||app.keyDown.equals(Constants.KEY_C5)){
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_D10)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("3"))
		{
			count = isKeyV_acp8c(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_C1) || app.keyDown.equals(Constants.KEY_C2) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("4"))
		{
			count = isKeyV_acp8g(count);
			if( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100") )
		{
			count = isKeyV_acp8(count);
			if ( app.keyDown.equals(Constants.KEY_H1) || app.keyDown.equals(Constants.KEY_H6)) {
				mActivity.vessel = ImgViewVessel_2.getInstance(mActivity);
				ImgViewVessel_2.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			if (app.keyDown.equals(Constants.KEY_E6) || app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_E5) || app.keyDown.equals(Constants.KEY_C4)) {
				mActivity.vessel = ImgViewVessel_4.getInstance(mActivity);
				ImgViewVessel_4.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		for (int j = 0; j < list.size(); j++) {
			list.get(j).ChangViewState(false);
			if (count == 0) {
				list.get(0).ChangViewState(true);
				list.get(3).ChangViewState(true);

			}
			if (count == 1) {
				list.get(2).ChangViewState(true);
				list.get(5).ChangViewState(true);
			}
		}
	}
	
	private int isKeyV(int count) {
	//Log.d("long",String.format("is keyv count : %d",count));
		if (0 == count || count == 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					//Log.d("long", "down ");
					if (count == 3|| count == 4) {
						imgUtil.Img_3_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_bottom, "0.3", "", R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "0.4");
						app.keyDown = Constants.KEY_E5;
						if (count == 3) {    //xugang20160526
							return count = 0;
						} else if (count == 4 ) {
							return count = 1;
						}
					}
				} else {
					//Log.d("long", "up ");
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
					app.keyDown = Constants.KEY_E3;
					if (count == -2) {    //xugang20160526
						return count = 1;
					} else if (count == -3 ) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E5)) {
				//Log.d("long", String.format("e7 button dao:%d",app.dao));
					
				if (app.dao == Constants.DOWN) {
					if (count == 3|| count ==4) {
						imgUtil.Change(Constants.IMG_4);
						imgUtil.Img_4_init("", R.drawable.e_top, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, "0.5", "", R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_top, "0.6", "", R.drawable.e_top, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_left, "0.7");
						app.keyDown = Constants.KEY_E6;
						if (count == 3) {    //xugang20160526
							return count = 0;
						} else if (count == 4) {
							return count = 3;
						}
					}
				} else {
					if (count == -2 || count == -3 ) {
						imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
						app.keyDown = Constants.KEY_E4;
						if (count == -2) {    //xugang20160526
							return count = 1;
						} else if (count == -3) {
							return count = 0;
						}
					}
				}
			} 
		}else  if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3|| count == 4) {
						imgUtil.Img_4_init("", R.drawable.e_bottom, R.drawable.e_right, R.drawable.e_top, R.drawable.e_left, "0.8", "", R.drawable.e_bottom, R.drawable.e_left,
								R.drawable.e_right, R.drawable.e_top, "0.9", "", R.drawable.e_left, R.drawable.e_bottom, R.drawable.e_top, R.drawable.e_right, "1.0");
						app.keyDown = Constants.KEY_C5;
						if (count == 3) {    //xugang20160526
							return count = 0;
						} else if (count == 4 ) {
							return count = 1;
						}
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
					app.keyDown = Constants.KEY_C3;
					if (count == -2) {    //xugang20160526
						return count = 1;
					} else if (count == -3 ) {
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3|| count == 4) {
						imgUtil.Change(Constants.IMG_4);
						imgUtil.Img_4_init("", R.drawable.c_left_bottom, R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_top, "0.5", "", R.drawable.c_left_top,
								R.drawable.c_right_bottom, R.drawable.c_right, R.drawable.c_bottom, "0.6", "", R.drawable.c_left, R.drawable.c_right_top, R.drawable.c_right_bottom,
								R.drawable.c_right, "0.7");
						app.keyDown = Constants.KEY_C6;
						if (count == 3) {    //xugang20160526
							return count = 0;
						} else if (count == 4) {
							return count = 3;
						}
					}
				} else {
					if (count == -3 || count == -2 ) {
						imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
						app.keyDown = Constants.KEY_C4;
						if (count == -2) {    //xugang20160526
							return count = 1;
						} else if (count == -3) {
							return count = 0;
						}
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3|| count == 4) {
						imgUtil.Change(Constants.IMG_4);
						imgUtil.Img_4_init("", R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "", R.drawable.ship, R.drawable.plane, R.drawable.car,
								R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship, R.drawable.plane, "1.0");
						app.keyDown = Constants.KEY_H4;
						if (count == 3) {    //xugang20160526
							return count = 0;
						} else if (count == 4) {
							return count = 3;
						}
					}
				} else {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_H2;
					if (count == -2) {    //xugang20160526
						return count = 1;
					} else if (count == -3 ) {
						return count = 0;
					}   
				}
			}
		}
		return count;
	  }
	
	//////////////////////////////////////////////////////////////
	private int isKeyV_acp8b(int count) {
		if (0 == count && count == 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "0.2", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"0.3", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count - 2;
					}
				}
				else {
				if (count == -3 || count ==-2) {
					return count + 3;
				}
			}
//				else if (app.dao == Constants.UP) {
//					if (count == -3 || count ==-2) {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.e_right,
//							R.drawable.e_right, "0.05");
//					app.keyDown = Constants.KEY_H1;
//				    return count = 0;
//				  }
//				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						app.keyDown = Constants.KEY_E5;
						return count - 2;
					}
				} 
				else  {
				if (count == -3 || count ==-2) {
				imgUtil.Change(Constants.IMG_2);
				imgUtil.Img_2_init("", R.drawable.e_right,
						R.drawable.e_right, "0.05");
				app.keyDown = Constants.KEY_H1;
			    return count = 0;
			  }
			}
//				else {
//					if (count == -3 || count ==-2) {
//						return count + 3;
//					}
//				}
			} 
		}  else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_D10;
					return count - 2;
				   }
				} else {
					if (count == -3 || count ==-2) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("", R.drawable.butterfly,
							R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_C5;
					return count = 0;
				}
			  }
			}
		}
		return count;
	  }
	////////////////////////////////////////////////////////////////////
	private int isKeyV_acp8c(int count) {
		if (0 == count && count == 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_right, "70", "", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom,
								R.drawable.e_right, R.drawable.e_top,"60", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right,  R.drawable.e_left, "50");
						app.keyDown = Constants.KEY_E6;
						return count - 2;
					}
				} else {
					if (count == -3 || count ==-2){
						return count +3;
					}
//				if (count == -3 || count ==-2) {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
//					app.keyDown = Constants.KEY_H1;
//						return count = 0;
//				  }
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Img_3_init("", R.drawable.s_5, R.drawable.s_9, R.drawable.s_2, "100", "", R.drawable.s_8, R.drawable.s_6, R.drawable.s_3, "  80");
						app.keyDown = Constants.KEY_E4;
						return count -3;
					}
				} else {
					if (count == -3 || count ==-2){
						return count +3;
					}
				}
			} 
			else if (app.keyDown.equals(Constants.KEY_E4)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ){
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_8, R.drawable.s_2, R.drawable.s_6, R.drawable.s_3, R.drawable.s_5, "70", "", R.drawable.s_2, R.drawable.s_6, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_4,"60", "", R.drawable.s_6, R.drawable.s_4, R.drawable.s_5, R.drawable.s_2,  R.drawable.s_3, "50");
						app.keyDown = Constants.KEY_C1;
						return count - 2;
					}
				} else {
					if (count == -3 || count ==-2) {
						imgUtil.Img_3_init("", R.drawable.s_2, R.drawable.s_3, R.drawable.s_5, "200", "", R.drawable.s_6, R.drawable.s_8, R.drawable.s_9, "150");
						app.keyDown = Constants.KEY_E1;
						return count +3;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ){
						imgUtil.Img_3_init("", R.drawable.s_10, R.drawable.s_14, R.drawable.s_15, "100", "", R.drawable.s_23, R.drawable.s_24, R.drawable.s_11, "  80");
						app.keyDown = Constants.KEY_E5;
						return count -3;
					}
				}
//				else{
//					if (count == -3 || count ==-2) {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
//					app.keyDown = Constants.KEY_H1;
//						return count = 0;
//				  }
//				}
				else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
						imgUtil.Change(Constants.IMG_2);
						imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_right, "400");
						app.keyDown = Constants.KEY_H1;
					return count = 0;
				}
			  }
			} 
			else if (app.keyDown.equals(Constants.KEY_E5)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ){
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "70", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"60", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "50");
						app.keyDown = Constants.KEY_C2;
						return count - 2;
					}
				} else {
					if (count == -3 || count ==-2) {
						imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
						app.keyDown = Constants.KEY_E2;
						return count +3;
					}
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ){
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "40", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "30", "",R.drawable.car, R.drawable.butterfly, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					return count-2;
				  }
				} 
//				else {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "100");
//					app.keyDown = Constants.KEY_H6;
//					return count = 0;
//				}
				
				else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
						imgUtil.Change(Constants.IMG_2);
						imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "100");
						app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			  }
				
			}
		}
		return count;
	  }
	
	private int isKeyV_acp8g(int count) {
		if (0 == count && count == 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_C) {
			 if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("",R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top,  R.drawable.c_left, "100", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left, R.drawable.c_left_bottom, 
								R.drawable.c_right, "  80", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top, R.drawable.c_left, "  70");
						app.keyDown = Constants.KEY_E6;
						return count - 2;
					}
				}else{
					if (count == -3 || count ==-2){
						return count +3;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			 if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 )  {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "100", "", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"  80", "", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "  70");
						app.keyDown = Constants.KEY_E4;
						return count - 2;
					}
				}else {
					if (count == -3 || count ==-2){
						return count +3;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 )  {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "100", "", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
							R.drawable.s_21, R.drawable.s_13,"  80", "", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "  70");
					app.keyDown = Constants.KEY_E5;
					return count - 2;
					}
				} 
//				else {
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.s_12, R.drawable.s_12, "400");
//					app.keyDown = Constants.KEY_H1;
//					return count = 0;
//				}
				else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
						imgUtil.Change(Constants.IMG_2);
						imgUtil.Img_2_init("", R.drawable.s_12, R.drawable.s_12, "400");
						app.keyDown = Constants.KEY_H1;
					return count = 0;
				}
			  }
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 )  {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "30", "",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "25", "", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "20");
					app.keyDown = Constants.KEY_C4 ;
					return count - 2;
				  }
				} 
//				else{
//					imgUtil.Change(Constants.IMG_2);
//					imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "200");
//					app.keyDown = Constants.KEY_H6;
//					return count = 0;
//				}
				
				else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
						imgUtil.Change(Constants.IMG_2);
						imgUtil.Img_2_init("", R.drawable.butterfly, R.drawable.butterfly, "200");
						app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			  }
			}
		}
		return count;
	  }
	///////////////////////////////////////////////////////////////
	private int isKeyV_acp8(int count) {
		if (0 == count && count == 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_top, R.drawable.e_bottom,  R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_left, R.drawable.e_right, R.drawable.e_bottom, R.drawable.e_right, 
								R.drawable.e_top, "0.3", "\b\b\b\b\b", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, R.drawable.e_right, R.drawable.e_left, "0.4");
						app.keyDown = Constants.KEY_E6;
						return count - 2;
					}
				}else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
						return count + 3;
					}
				}
			} 
		}else if (app.c_e_h == Constants.CONTENT_S) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_6, R.drawable.s_5, R.drawable.s_8, R.drawable.s_9, R.drawable.s_3, "0.2", "\b\b\b\b\b", R.drawable.s_2, R.drawable.s_9, R.drawable.s_3,
								R.drawable.s_8, R.drawable.s_6,"0.3", "\b\b\b\b\b", R.drawable.s_9, R.drawable.s_3, R.drawable.s_5, R.drawable.s_6,  R.drawable.s_8, "0.4");
						app.keyDown = Constants.KEY_E4;
						return count - 2;
					}
				} else {
					if (count == -3 || count ==-2) {
						return count + 3;
					}
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
						imgUtil.Change(Constants.IMG_5);
						if(app.chartor.equals("6")||app.chartor.equals("8")){
							imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.s_22, R.drawable.s_11, R.drawable.s_20, R.drawable.c_right, R.drawable.e_right, "0.2", "\b\b\b\b\b", R.drawable.e_right, R.drawable.s_14, R.drawable.s_16,
								R.drawable.s_21, R.drawable.s_13,"0.3", "\b\b\b\b\b", R.drawable.s_17, R.drawable.s_15, R.drawable.s_19, R.drawable.s_12,  R.drawable.s_10, "0.4");
						}else if(app.chartor.equals("100")){
							imgUtil.Img_4_ACP8init("", R.drawable.c_bottom, R.drawable.c_right_top, R.drawable.c_right, R.drawable.c_top, R.drawable.c_left, "0.2", "", R.drawable.c_top, R.drawable.c_right_bottom, R.drawable.c_left,
									R.drawable.c_left_bottom, R.drawable.c_right,"0.3", "", R.drawable.c_right, R.drawable.c_bottom, R.drawable.c_left_top, R.drawable.c_top,  R.drawable.c_left, "0.4");
						}
						app.keyDown = Constants.KEY_E5;
						return count - 2;
					}
				} else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
					imgUtil.Change(Constants.IMG_2);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.s_14, R.drawable.s_14, "0.05");
					else if(app.chartor.equals("100"))
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_right, "0.05");
					app.keyDown = Constants.KEY_H1;
				    return count = 0;
				  }
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_E7)) {
				if (app.dao == Constants.DOWN) {
					if (count == 3 || count == 4 ) {
					imgUtil.Change(Constants.IMG_5);
					imgUtil.Img_4_ACP8init("\b\b\b\b\b", R.drawable.ship,R.drawable.butterfly, R.drawable.umbrella, R.drawable.plane, R.drawable.fish, "0.6", "\b\b\b\b\b",R.drawable.fish, R.drawable.ship, R.drawable.plane, R.drawable.car,
							R.drawable.butterfly, "0.8", "\b\b\b\b\b", R.drawable.butterfly, R.drawable.car, R.drawable.ship,R.drawable.fish, R.drawable.plane, "1.0");
					app.keyDown = Constants.KEY_C4;
					return count - 2;
				   }
				} else if (app.dao == Constants.UP) {
					if (count == -3 || count ==-2) {
					imgUtil.Change(Constants.IMG_2);
					imgUtil.Img_2_init("\b\b\b\b\b", R.drawable.butterfly, R.drawable.ship, "0.1");
					app.keyDown = Constants.KEY_H6;
					return count = 0;
				}
			  }
			}
		}
		return count;
	  }

}

