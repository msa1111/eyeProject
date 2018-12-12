package com.dingzhou.eye.SelectChange;

import java.util.ArrayList;
import java.util.List;
import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.FragmentRight;
import com.dingzhou.eye.R;

public class ImgViewVessel_2 extends ImgViewVessel {
	private static ImgViewVessel_2 vessel_2;
	private MyApp app;
	private List<ImgView> list;
	private FragmentRight mActivity;
	public int count = 0;
	private ImgUtil imgUtil;

	public static ImgViewVessel_2 getInstance(FragmentRight _activity) {
		if (vessel_2 == null) {
			synchronized (ImgViewVessel_2.class) {
				if (vessel_2 == null) {
					vessel_2 = new ImgViewVessel_2(_activity);
				}
			}
		}
		return vessel_2;
	}

	private ImgViewVessel_2(FragmentRight _activity) {
		super(_activity);
		// TODO Auto-generated constructor stub
		mActivity = _activity;
		list = new ArrayList<ImgView>();
		list.add(new ImgView(mActivity.img_img_2_1_c1));
		list.add(new ImgView(mActivity.img_img_2_1_c2));
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
		// TODO Auto-generated method stub
		count = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).ChangViewState(false);
		}
		if (!state) {
			switch (app.change) {
			case Constants.CHANGE_POINT:
				ChangePoint(1);
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
		if(app.chartor.equals("7"))
		{
			if (count == 2 && app.dao == Constants.RIGHT) {
				count = 0;
			} else if (count == -1 && app.dao == Constants.LEFT) {
				count = 1;
			}

			count = isKeyP(count);
			if (app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_C4) || app.keyDown.equals(Constants.KEY_H3)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("2"))
		{
			count = isKeyP_acp8b(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("3"))
		{
			count = isKeyP_acp8c(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("4"))
		{
			count = isKeyP_acp8g(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8") || app.chartor.equals("100"))
		{
			count = isKeyP_acp8(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
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
		if (0 <= count && count <= 1) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
						app.keyDown = Constants.KEY_E2;
						return count - 2;
					}
				} else {
					return count + 2;
				}
			} else if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
						app.keyDown = Constants.KEY_E3;
						return count - 2;
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.e_bottom, R.drawable.e_right, "0.1");
						app.keyDown = Constants.KEY_E1;
						return count + 2;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Change(Constants.IMG_3);
						imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
						app.keyDown = Constants.KEY_E4;
						if (count == 2) {
							return count = 0;
						} else if (count == 3) {
							return count = 2;
						}
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
						app.keyDown = Constants.KEY_E2;
						return count + 2;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
						app.keyDown = Constants.KEY_C2;
						return count - 2;
					}
				} else {
					return count + 2;
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
						app.keyDown = Constants.KEY_C3;
						return count - 2;
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.c_bottom, R.drawable.c_left, "0.1");
						app.keyDown = Constants.KEY_C1;
						return count + 2;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Change(Constants.IMG_3);
						imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
						app.keyDown = Constants.KEY_C4;
						if (count == 2) {
							return count = 0; 
						} else if (count == 3) {
							return count = 2;
						}
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
						app.keyDown = Constants.KEY_C2;
						return count + 2;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H3;
					if (count == 2) {
						return count = 0;
					} else if (count == 3) {
						return count = 2;
					}
				} else {
					imgUtil.Change(Constants.IMG_1);
					mActivity.img_img_1_c.setBackgroundResource(R.color.orange);
					app.keyDown = Constants.KEY_H1;
				}
			}
		}
		return count;
	}
    
	private int isKeyP_acp8b(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
        if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
						return count = 2;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
				    return count = 2;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyP_acp8c(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
        if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
						return count = 2;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
					app.keyDown = Constants.KEY_E7;
				    return count = 2;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyP_acp8g(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
        if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
						return count = 2;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
				    return count = 2;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyP_acp8(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
        if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
						return count = 2;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_E7;
				    return count = 2;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	@Override
	public void ChangeHorizontaL(int i) {
		// TODO Auto-generated method stub
		count += i;
		if(app.chartor.equals("7"))
		{
			count = isKeyH(count);
			if (app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_C4) || app.keyDown.equals(Constants.KEY_H3)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}

			mActivity.img_img_2_1_c1.setBackgroundResource(R.color.orange);
			mActivity.img_img_2_1_c2.setBackgroundResource(R.color.orange);
		}
		else if(app.chartor.equals("2"))
		{
			count = isKeyH_acp8b(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
			mActivity.img_img_2_1_c1.setBackgroundResource(R.color.orange);	
		}
		
		else if(app.chartor.equals("3"))
		{
			count = isKeyH_acp8c(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			mActivity.img_img_2_1_c1.setBackgroundResource(R.color.orange);	
		}
		else if(app.chartor.equals("4"))
		{
			count = isKeyH_acp8g(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
			mActivity.img_img_2_1_c1.setBackgroundResource(R.color.orange);	
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
		{
			count = isKeyH_acp8(count);
			if (app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}

			mActivity.img_img_2_1_c1.setBackgroundResource(R.color.orange);	
		}
	}

	private int isKeyH(int count) {
		if (0 == count) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_E) {
			if (app.keyDown.equals(Constants.KEY_E1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
						app.keyDown = Constants.KEY_E2;
						return count = 0;
					}
				} else {
					return count = 0;
				}
			} else if (app.keyDown.equals(Constants.KEY_E2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
						app.keyDown = Constants.KEY_E3;
						return count = 0;
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.e_bottom, R.drawable.e_right, "0.1");
						app.keyDown = Constants.KEY_E1;
						return count = 0;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_E3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
					app.keyDown = Constants.KEY_E4;
					return count = 0;
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
						app.keyDown = Constants.KEY_E2;
						return count + 2;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_C1)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
						app.keyDown = Constants.KEY_C2;
						return count - 2;
					}
				} else {
					return count + 2;
				}
			} else if (app.keyDown.equals(Constants.KEY_C2)) {
				if (app.dao == Constants.DOWN) {
					if (count == 2 || count == 3) {
						imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
						app.keyDown = Constants.KEY_C3;
						return count - 2;
					}
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.c_bottom, R.drawable.c_left, "0.1");
						app.keyDown = Constants.KEY_C1;
						return count + 2;
					}
				}
			} else if (app.keyDown.equals(Constants.KEY_C3)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
					app.keyDown = Constants.KEY_C4;
					return count = 0;
				} else {
					if (count == -2 || count == -1) {
						imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
						app.keyDown = Constants.KEY_C2;
						return count + 2;
					}
				}
			}
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H2)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H3;
					return count = 0;
				} else {
					imgUtil.Change(Constants.IMG_1);
					mActivity.img_img_1_c.setBackgroundResource(R.color.orange);
					app.keyDown = Constants.KEY_H1;
				}
			}
		}
		return count;
	}
	
	private int isKeyH_acp8b(int count) {
		if (0 == count) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
						return count = 0;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
				    return count = 0;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyH_acp8c(int count) {
		if (0 == count) {
			return count;
		}
		 if (app.c_e_h == Constants.CONTENT_K) {
				if (app.keyDown.equals(Constants.KEY_H1)) {
					if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_3);
						imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
						app.keyDown = Constants.KEY_E2;
							return count = 0;
					} else {
						return count = 0;
					}
				} 
			} else if (app.c_e_h == Constants.CONTENT_H) {
				if (app.keyDown.equals(Constants.KEY_H6)) {
					if (app.dao == Constants.DOWN) {
						imgUtil.Change(Constants.IMG_3);
						imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
						app.keyDown = Constants.KEY_E7;
					    return count = 0;
					} else {
						return count = 0;
					}
				}
			}
			return count;
	}
	
	private int isKeyH_acp8g(int count) {
		if (0 == count) {
			return count;
		}
		if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
						return count = 0;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
				    return count = 0;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyH_acp8(int count) {
		if (0 == count) {
			return count;
		}
	  if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
					//if (count == 2) {
						return count = 0;
				} else {
					return count =0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship,  "0.4");
					app.keyDown = Constants.KEY_E7;
				    return count = 0;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}

	@Override
	public void ChangeVertical(int i) {
		// TODO Auto-generated method stub
		count += i;
		if(app.chartor.equals("7"))
		{
			if (app.dao == Constants.LEFT || app.dao == Constants.RIGHT) {
				if (count == 2) {
					count = 0;
				}
				if (count == -1) {
					count = 1;
				}
			}
			count = isKeyV(count);
			if (app.keyDown.equals(Constants.KEY_E4) || app.keyDown.equals(Constants.KEY_C4) || app.keyDown.equals(Constants.KEY_H3)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("2"))
		{
			count += i;
			count = isKeyV_acp8b(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_H2)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}	
		}
		else if(app.chartor.equals("3"))
		{
			count += i;
			count = isKeyV_acp8c(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("4"))
		{
			count += i;
			count = isKeyV_acp8g(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
				mActivity.vessel = ImgViewVessel_3.getInstance(mActivity);
				ImgViewVessel_3.getInstance(mActivity).count = 0;
				mActivity.vessel.change(count);
				return;
			}
		}
		else if(app.chartor.equals("6")||app.chartor.equals("8")||app.chartor.equals("100"))
		{
			count += i;
			count = isKeyV_acp8(count);
			if ( app.keyDown.equals(Constants.KEY_E2) || app.keyDown.equals(Constants.KEY_E7)) {
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
	
	private int isKeyV(int count) {
			if (0 == count || count == 1) {
				return count;
			}
			if (app.c_e_h == Constants.CONTENT_E) {
				if (app.keyDown.equals(Constants.KEY_E1)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count == 3){
							imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
							app.keyDown = Constants.KEY_E2;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3 ) {
								return count = 1;
							}
						}
					} else {
						return count = 0;
					}
				} else if (app.keyDown.equals(Constants.KEY_E2)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count ==3){
							imgUtil.Img_2_init("", R.drawable.e_right, R.drawable.e_bottom, "0.15");
							app.keyDown = Constants.KEY_E3;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3 ) {
								return count = 1;
							}
						}
					} else {
						if (count == -1 || count == -2) {
							imgUtil.Img_2_init("", R.drawable.e_bottom, R.drawable.e_right, "0.1");
							app.keyDown = Constants.KEY_E1;
							if (count == -1) {    
								return count = 1;
							} else if (count == -2) {
								return count = 0;
							}
						}
					}
				} 
				else if (app.keyDown.equals(Constants.KEY_E3)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count ==3){
							imgUtil.Change(Constants.IMG_3);
							imgUtil.Img_3_init("", R.drawable.e_right, R.drawable.e_left, R.drawable.e_top, "0.20", "", R.drawable.e_top, R.drawable.e_bottom, R.drawable.e_left, "0.25");
							app.keyDown = Constants.KEY_E4;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3 ) {
								return count = 1;
							}
						}
					} else {
						if (count == -1 || count == -2) {
							imgUtil.Img_2_init("", R.drawable.e_top, R.drawable.e_left, "0.12");
							app.keyDown = Constants.KEY_E2;
							if (count == -1) {   
								return count = 1;
							} else if (count == -2) {
								return count = 0;
							}
						}
					}
				} 
			}else  if (app.c_e_h == Constants.CONTENT_C) {
				if (app.keyDown.equals(Constants.KEY_C1)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count == 3) {
							imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
							app.keyDown = Constants.KEY_C2;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3 ) {
								return count = 1;
							}
						}
					} else {
						return count = 0;
					}
				} else if (app.keyDown.equals(Constants.KEY_C2)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count == 3){
							imgUtil.Img_2_init("", R.drawable.c_right_top, R.drawable.c_left_bottom, "0.15");
							app.keyDown = Constants.KEY_C3;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3) {
								return count = 1;
							}
						}
					} else {
						if (count == -1 || count == -2 ) {
							imgUtil.Img_2_init("", R.drawable.c_bottom, R.drawable.c_left, "0.1");
							app.keyDown = Constants.KEY_C1;
							if (count == -1) {    
								return count = 1;
							} else if (count == -2) {
								return count = 0;
							}
						}
					}
				}else if (app.keyDown.equals(Constants.KEY_C3)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count ==3){
							imgUtil.Change(Constants.IMG_3);
							imgUtil.Img_3_init("", R.drawable.c_left_top, R.drawable.c_right_bottom, R.drawable.c_right, "0.20", "", R.drawable.c_bottom, R.drawable.c_left, R.drawable.c_top, "0.25");
							app.keyDown = Constants.KEY_C4;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3 ) {
								return count = 1;
							}
						}
					} else {
						if (count == -1 || count == -2) {
							imgUtil.Img_2_init("", R.drawable.c_right, R.drawable.c_top, "0.12");
							app.keyDown = Constants.KEY_C2;
							if (count == -1) {   
								return count = 1;
							} else if (count == -2) {
								return count = 0;
							}
						}
					}
				} 
			} else if (app.c_e_h == Constants.CONTENT_H) {
				if (app.keyDown.equals(Constants.KEY_H2)) {
					if (app.dao == Constants.DOWN) {
						if (count == 2|| count == 3){
							imgUtil.Change(Constants.IMG_3);
							imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
							app.keyDown = Constants.KEY_H3;
							if (count == 2) {    
								return count = 0;
							} else if (count == 3) {
								return count = 1;
							}
						}
					} else {
						imgUtil.Change(Constants.IMG_1);
						mActivity.img_img_1_c.setBackgroundResource(R.color.orange);
						app.keyDown = Constants.KEY_H1;
					}
				}
			}
			return count;
		  }
	
	private int isKeyV_acp8b(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
		if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					app.keyDown = Constants.KEY_E2;
					return count = 1;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_C5)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_H2;
					return count = 1;
				} else {
					return count = 0;
				}
			}
		}
		return count;
        
	}
	
	private int isKeyV_acp8c(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
		if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
						return count = 1;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "80", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "60");
					app.keyDown = Constants.KEY_E7;
				    return count = 1;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	
	private int isKeyV_acp8g(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
		if (app.c_e_h == Constants.CONTENT_K) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "200", "", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "150");
					app.keyDown = Constants.KEY_E2;
						return count = 1;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("", R.drawable.fish, R.drawable.plane, R.drawable.car, "100", "", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "  50");
					app.keyDown = Constants.KEY_E7;
				    return count = 1;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
	
	private int isKeyV_acp8(int count) {
		if (0 <= count && count <= 1) {
			return count=0;
		}
        if (app.c_e_h == Constants.CONTENT_C) {
			if (app.keyDown.equals(Constants.KEY_H1)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					if(app.chartor.equals("6")||app.chartor.equals("8"))
						imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.s_13, R.drawable.s_19, R.drawable.s_16, "0.10", "\b\b\b\b\b", R.drawable.s_12, R.drawable.s_11, R.drawable.s_10, "0.15");
					else if(app.chartor.equals("100"))
						imgUtil.Img_3_init("", R.drawable.c_top, R.drawable.c_left, R.drawable.c_right_bottom, "0.10", "", R.drawable.c_left_bottom, R.drawable.c_bottom, R.drawable.c_right, "0.15");
					app.keyDown = Constants.KEY_E2;
						return count = 1;
				} else {
					return count = 0;
				}
			} 
		} else if (app.c_e_h == Constants.CONTENT_H) {
			if (app.keyDown.equals(Constants.KEY_H6)) {
				if (app.dao == Constants.DOWN) {
					imgUtil.Change(Constants.IMG_3);
					imgUtil.Img_3_init("\b\b\b\b\b", R.drawable.fish, R.drawable.plane, R.drawable.car, "0.2", "\b\b\b\b\b", R.drawable.umbrella, R.drawable.butterfly, R.drawable.ship, "0.4");
					app.keyDown = Constants.KEY_E7;
				    return count = 1;
				} else {
					return count = 0;
				}
			}
		}
		return count;
	}
}


