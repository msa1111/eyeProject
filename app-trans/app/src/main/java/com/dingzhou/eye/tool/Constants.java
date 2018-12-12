package com.dingzhou.eye.tool;

import android.os.Environment;

public class Constants {
	
	public static final String PATH_MENUCARD = Environment.getExternalStorageDirectory().getPath();
	
	public static final String PATH_LOG = PATH_MENUCARD + "/GlassesProjector/Log/";
	
	public static final int CENTER = 0x01;
	public static final int UP = 0x02;
	public static final int RIGHT = 0x03;
	public static final int DOWN = 0x04;
	public static final int LEFT = 0x05;
	
	public static final int IMG_0 = 0x10;
	public static final int IMG_1 = 0x11;
	public static final int IMG_2 = 0x12;
	public static final int IMG_3 = 0x13;
	public static final int IMG_4 = 0x14;
	public static final int IMG_5 = 0x15;
	
	public static final int CONTENT_E = 0x21;
	public static final int CONTENT_C = 0x22;
	public static final int CONTENT_H = 0x23;
	public static final int CONTENT_D = 0x24;
	public static final int CONTENT_S = 0x25;
	public static final int CONTENT_K = 0x26;

	public static final int CHANGE_POINT = 0x31;
	public static final int CHANGE_HORIZONTAL = 0x32;
	public static final int CHANGE_VERTICAL = 0x33;
	
	public static final String BT_STATE_LIST = "zicox_printer_list";
	public static final String BT_STATE = "Printer";


	public static final String KEY_UP = "KEY   33\r";// KEY_SPACE + "3333" +
														// ENTER;// KEY 33\r
	public static final String KEY_DOWN = "KEY   40\r";// KEY_SPACE + "3430" +
														// ENTER;// KEY 40\r
	public static final String KEY_LEFT = "KEY   36\r";// KEY_SPACE + "3336" +
														// ENTER;// KEY 36\r
	public static final String KEY_RIGHT = "KEY   37\r";// KEY_SPACE + "3337" +
														// ENTER;// KEY 37\r
	public static final String KEY_LAMP = "KEY   35\r";// KEY_SPACE + "3335" +
														// ENTER;// KEY 35\r
	
	public static final String KEY_POINT = "KEY   41\r";// KEY_SPACE + "3431" +
														// ENTER;// KEY 41\r
	public static final String KEY_HORIZONTAL = "KEY   39\r";// KEY_SPACE +
																// "3339" +
																// ENTER;// KEY
																// 39\r
	public static final String KEY_rg = "KEY   43\r";//
	public static final String KEY_up = "KEY   UP\r";//
	public static final String KEY_down = "KEY   DN\r";//
	
	public static final String KEY_E1 = "KEY   02\r";// KEY_SPACE + "3032" +
														// ENTER;// KEY 02\r
	public static final String KEY_E2 = "KEY   06\r";// KEY_SPACE + "3036" +
														// ENTER;// KEY 06\r
	public static final String KEY_E3 = "KEY   03\r";// KEY_SPACE + "3033" +
														// ENTER;// KEY 03\r
	public static final String KEY_E4 = "KEY   07\r";// KEY_SPACE + "3037" +
														// ENTER;// KEY 07\r
	public static final String KEY_E5 = "KEY   11\r";// KEY_SPACE + "3131" +
														// ENTER;// KEY 11\r
	public static final String KEY_E6 = "KEY   08\r";// KEY_SPACE + "3038" +
														// ENTER;// KEY 08\r
	public static final String KEY_E7 = "KEY   09\r";// KEY_SPACE + "3039" +
														// ENTER;// KEY 09\r
	public static final String KEY_E8 = "KEY   50\r";// KEY_SPACE + "3530" +
														// ENTER;// KEY 50\r
	
	public static final String KEY_C1 = "KEY   12\r";// KEY_SPACE + "3132" + 
														// ENTER;// KEY 12\r
	public static final String KEY_C2 = "KEY   16\r";// KEY_SPACE + "3136" +
														// ENTER;// KEY 16\r
	public static final String KEY_C3 = "KEY   13\r";// KEY_SPACE + "3133" +
														// ENTER;// KEY 13\r
	public static final String KEY_C4 = "KEY   14\r";// KEY_SPACE + "3134" +
														// ENTER;// KEY 14\r
	public static final String KEY_C5 = "KEY   17\r";// KEY_SPACE + "3137" +
														// ENTER;// KEY 17\r
	public static final String KEY_C6 = "KEY   21\r";// KEY_SPACE + "3231" +
														// ENTER;// KEY 21\r
	public static final String KEY_C7 = "KEY   18\r";// KEY_SPACE + "3138" + 
														// ENTER;// KEY 18\r
	public static final String KEY_C8 = "KEY   51\r";// KEY_SPACE + "3531" +
														// ENTER;// KEY 51\r
	
	public static final String KEY_H1 = "KEY   01\r";// KEY_SPACE + "3132" + ENTER;
	public static final String KEY_H2 = "KEY   22\r";// KEY_SPACE + "3232" +
														// ENTER;// KEY 22\r
	public static final String KEY_H3 = "KEY   26\r";// KEY_SPACE + "3236" +
														// ENTER;// KEY 26\r
	public static final String KEY_H4 = "KEY   23\r";// KEY_SPACE + "3233" +
														// ENTER;// KEY 23\r
	
	public static final String KEY_H5 = "KEY   19\r";// KEY_SPACE + "3139" +
														// ENTER;// KEY 19\r //
														// 蝴蝶同行最后一个大图
	public static final String KEY_H6 = "KEY   04\r";//xugang added 2016/07/21
	
	public static final String KEY_D1 = "KEY   10\r";// KEY_SPACE + "3130" +
														// ENTER;// KEY 10\r
	public static final String KEY_D2 = "KEY   15\r";// KEY_SPACE + "3135" +
														// ENTER;// KEY 15\r
	public static final String KEY_D3 = "KEY   20\r";// KEY_SPACE + "3230" +
														// ENTER;// KEY 20\r
	public static final String KEY_D4 = "KEY   25\r";// KEY_SPACE + "3235" +
														// ENTER;// KEY 25\r
	public static final String KEY_D5 = "KEY   05\r";// KEY_SPACE + "3035" +
														// ENTER;// KEY 05\r
	public static final String KEY_D6 = "KEY   JC\r";// KEY_SPACE + "3139" +
														// ENTER;// KEY 19\r
	public static final String KEY_D7 = "KEY   24\r";// KEY_SPACE + "3234" +
														// ENTER;// KEY 24\r
	public static final String KEY_D8 = "KEY   29\r";// KEY_SPACE + "3239" +
														// ENTER;// KEY 29\r
	public static final String KEY_D9 = "KEY   28\r";// KEY_SPACE + "3238" +
														// ENTER;// KEY 28\r
	public static final String KEY_D10 = "KEY   27\r";// KEY_SPACE + "3237" +
														// ENTER;// KEY 27\r
	public static final String KEY_D11 = "KEY   42\r";// KEY_SPACE + "3432" +
														// ENTER;// KEY 42\r
	public static final String KEY_D12 = "KEY   30\r";// KEY_SPACE + "3330" +
														// ENTER;// KEY 30\r
	
	public static final int EYE_L = 1000;
	public static final int EYE_R = 1001;
	public static final int EYE_D = 1002;

	
	public static final int EYE_S = 0;
	public static final int EYE_C = 1;
	public static final int EYE_C_N = 6;
	public static final int EYE_A = 2;
	public static final int EYE_H = 3;
	public static final int EYE_V = 4;
	public static final int EYE_ADD = 5;

}
