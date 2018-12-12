package com.dingzhou.eye.tool;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.impl.client.TunnelRefusedException;

import android.R.bool;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class MyApp extends Application {
	public static final String Channel = null;
	
	private List<Activity> activities = new ArrayList<Activity>();
	public String name;
	public boolean IsModeFar = true;
	public boolean tonear;
	public String ssd ="0";
    public  String[] dcils_s_l;
    public  String[] dcils_s_r;
    public  String dcils_s_l1;
    public  String dcils_s_l2;
    public  String dcils_s_l3;
    public  String dcils_s_r1;
    public  String dcils_s_r2;
    public  String dcils_s_r3;
    public  int index_l;
    public  int index_r;
    ///////////////////////////////////////
    public  String s_r_fartonear;
    public  String s_l_fartonear;
    public  String c_r_fartonear;
    public  String c_l_fartonear;
    public  String a_r_fartonear;
    public  String a_l_fartonear;
    public  String h_r_fartonear;
    public  String h_l_fartonear;
    public  String v_r_fartonear;
    public  String v_l_fartonear;
    public  String add_r_fartonear;
    public  String add_l_fartonear;
    ///////////////////////////////////////
    
    public String lj_r = "0";
    public String lj_l = "0";
    public  boolean OnLeftRMK =false;
    public  boolean OnRightRMK=false;
    public  boolean OnLeftFARtoNEAR =false;
    public  boolean OnRightFARtoNEAR=false;
	public  boolean _cfll = false;
	
	public int count_fartonear;
	
	public boolean Trl = false;
	
	public boolean Lr = false;
	
	public int L_R=2;
	
    public int z_13 = 0;
    public int flag_chgPD=0;
    public int pd_far=64;
    public int pd_near=60;
	public boolean xzhi = false;
	
	public int state = 0;
	
	public int change = 0;
	public int dotcount = 0;
	public int vercount = 0;
	
	public int c_e_h = 0;
	
	public int dao = 0;
	
	public String keyDown = null;
	
	public String chartor = "7";
	public String language ="C";
	public int language_flag= 2;
	public String label_ljr = "";
	public String label_ljl = "";
	
	public int txtState = 0;
	
	
	public int txtCount = 0;
	public int chartcount = 0;
	
	public BtAPI BluetoothAPI;
	public int printCount = 0;
	
	
	public boolean cxyg = false;
	
	
	public boolean add = false;

	public static int kj;
	public int program0_cnt;
	public int program1_cnt;
	public int program2_cnt;
	
	public int pdan = 0;
	
	
	public int _ccar;
	
	
	public int _ccal;
	
	
	public int _set_cr;
	public int _set_cl;
	
	public int open = 0;
		
	public boolean Pfdot = true;
	
	public boolean Rfgf = true;
	
	public boolean lj_6 = true;
	
	public boolean lj_10 = true;
	
	//////////////////--------------------------------------------
	
	
	
	
	public boolean a_L = true;
	public boolean a_R = true;
	public boolean c_L = true;
	public boolean c_R = true;
	
	public boolean er1 = true;
	public boolean er2 = true;
	
	public int baoc = -1;
	
	public int pzy = 5;
	
	public int kzp = 5;
	
	public boolean  ptk = true;
	
	public boolean ackz = false;
	
	public boolean czypt = true;
	
	public boolean jiushi = true;
	
	public boolean xzj = true;
	
	public boolean jies = true;
	public int position;
	public int Sposition;
	public int Cposition;
	public int Aposition;
	public int ADDposition;
	public int Hposition;
	public int Vposition;
	public int Pposition;
	
	
	public boolean fwshuj = true;
	
	
	public boolean entirepd = true;
	public int BullEye_R_S = 214;
	public int BullEye_L_S = 214;
	public int BullEye_R_C = 35;
	public int BullEye_L_C = 35;
	public int BullEye_L_A = 0;
	public int BullEye_R_A = 0;
	public int BullEye_L_ADD = 0;
	public int BullEye_R_ADD = 0;
	
	public int BullEye_R_S2 = 214;
	public int BullEye_L_S2 = 214;
	public int BullEye_R_C2 = 35;
	public int BullEye_L_C2 = 35;
	public int BullEye_L_A2 = 0;
	public int BullEye_R_A2 = 0;
	public int BullEye_L_ADD2 = 0;
	public int BullEye_R_ADD2 = 0;
	
	
	public static ArrayList<String> shu1 = new ArrayList<String>();
	public static ArrayList<String> STANDARD = new ArrayList<String>();
	public static ArrayList<String> CUSTOM1 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM2 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM3 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM4 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM5 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM6 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM7 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM8 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM9 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM10 = new ArrayList<String>();
	public static ArrayList<String> CUSTOM11 = new ArrayList<String>();
	
	@Override
	public void onCreate() {
		super.onCreate();
		try {
			CrashHandler.getInstance().init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
		BluetoothAPI = BtAPI.getInstance(activity);
	}
	
	public static String _id;

	@Override
	public void onTerminate() {
		super.onTerminate();
		for (Activity activity : activities) {
			BluetoothAPI.close();
			activity.finish();
		}
		System.exit(0);
	}
	
	public void cdReadl() {
		SharedPreferences sharedPreferences =getSharedPreferences("set",
			Activity.MODE_PRIVATE);
		chartor = sharedPreferences.getString("label", "");
	}
	
	public void cdReadlang() {
		SharedPreferences sharedPreferences =getSharedPreferences("lang", Activity.MODE_PRIVATE);
		language = sharedPreferences.getString("label", "");
	}
	
	public void cdRead_ljr() {
		SharedPreferences sharedPreferences = getSharedPreferences("ljdatar",
				Activity.MODE_PRIVATE);
//		SharedPreferences sharedPreferences = getSharedPreferences("ljdata",
//				Context.MODE_PRIVATE);
		label_ljr = sharedPreferences.getString("lj_r", "");
	}
	
	public void cdRead_ljl() {
		SharedPreferences sharedPreferences = getSharedPreferences("ljdatal",
				Activity.MODE_PRIVATE);
//		SharedPreferences sharedPreferences = getSharedPreferences("ljdata",
//				Context.MODE_PRIVATE);
		label_ljl = sharedPreferences.getString("lj_l", "");
	}
	
	public void cdSave_ljr() {
	SharedPreferences mySharedPreferences =
			getSharedPreferences("ljdatar", Activity.MODE_PRIVATE);
	SharedPreferences.Editor editor = mySharedPreferences.edit();
	editor.putString("lj_r", lj_r);
	editor.clear();
	editor.commit();
}	
	
	public void cdSave_ljl() {
		SharedPreferences mySharedPreferences =
				getSharedPreferences("ljdatal", Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = mySharedPreferences.edit();
		editor.putString("lj_l", lj_l);
		editor.clear();
		editor.commit();
	}	
}
