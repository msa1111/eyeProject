package com.dingzhou.eye.SelectChange;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.util.Device;
import com.dingzhou.eye.util.ReadTextUtil;
import com.dingzhou.eye.R;
import com.dingzhou.eye.FragmentLeft;

public class TxtEye {
	private List<String> list_S;
	private List<String> list_SS;
	private List<String> list_C;
	private List<String> list_A;
	private List<String> list_H;
	private List<String> list_V;
	private List<String> list_Add;
	private List<TxtView> list_mTV;

	public int count;

	public int IndexFarS = 0;
	public int IndexFarC = 0;
	public int IndexFarA = 0;
	public int IndexFarH = 0;
	public int IndexFarV = 0;
	public int IndexFarADD = 0;
	public int IndexNearS = 0;
	public int IndexNearC = 0;
	public int IndexNearA = 0;
	public int IndexNearH = 0;
	public int IndexNearV = 0;
	public int IndexNearADD = 0;
	public int indexss;
	public TxtView ttv;
	public int CCAR;
	public int CCAL;
	String b = null;
	private String hFlag = "I";
	private String vFlag = "U";
	private MyApp app;
	private String _ROrL;
	public String a;
	public int indexS, indexC, indexA, indexH, indexV, indexADD;

	public TxtEye(Activity _activity, List<TextView> eyes, String ROrL) {

		list_mTV = new ArrayList<TxtView>();
		for (int i = 0; i < eyes.size(); i++) {
			list_mTV.add(new TxtView());
			list_mTV.get(i).SetTxtView(eyes.get(i));
		}

		_ROrL = ROrL;
		if (_ROrL.equals("L"))
			vFlag = "U";
		else
			vFlag = "D";
		list_SS = ReadTextUtil.getString(_activity, R.raw.ss);
		list_S = ReadTextUtil.getString(_activity, R.raw.s);
		list_C = ReadTextUtil.getString(_activity, R.raw.c);
		list_A = ReadTextUtil.getString(_activity, R.raw.a);
		list_H = ReadTextUtil.getString(_activity, R.raw.h);
		list_V = ReadTextUtil.getString(_activity, R.raw.v);
		list_Add = ReadTextUtil.getString(_activity, R.raw.add);
		app = (MyApp) _activity.getApplication();
		app.position = 0;
		app.txtCount = Constants.EYE_D;
		app.txtState = Constants.EYE_S;
	}

	public void init(int eye) {
		ChangeBg(eye);
		list_mTV.get(Constants.EYE_S).SetChangeText(setList(list_S, 214));
		list_mTV.get(Constants.EYE_C).SetChangeText(setList(list_C, 39));
		list_mTV.get(Constants.EYE_A).SetChangeText(setList(list_A, 180));
		list_mTV.get(Constants.EYE_H).SetChangeText(setList(list_H, 0));
		list_mTV.get(Constants.EYE_V).SetChangeText(setList(list_V, 0));
		list_mTV.get(Constants.EYE_ADD).SetChangeText(setList(list_Add, 0));
		////////////////////////////////////////////////////////////
        IndexFarS = 0;
		IndexFarC = 0;
		IndexFarA = 0;
		IndexFarH = 0;
		IndexFarV = 0;
		IndexFarADD = 0;
		IndexNearS = 0;
		IndexNearC = 0;
		IndexNearA = 0;
		IndexNearH = 0;
		IndexNearV = 0;
		IndexNearADD = 0;
		////////////////////////////////////////////////////////////
	}

	public void ChangeBg(int eye) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list_mTV.size(); i++) {
			list_mTV.get(i).ChangeViewState(false);
		}
		if (eye == 11) {
			return;
		}
		list_mTV.get(eye).ChangeViewState(true);
	};

	///////////////////////////////////////////////////////////////
	public void disp_near(){
	  int temp_pd_far;
	  temp_pd_far=app.pd_far;
		if (temp_pd_far == 80) {
			app.pd_near=75;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0701][rP19]");
		}
		if (temp_pd_far == 79) {
			app.pd_near=74;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu06E8][rP18]");
		}
		if (temp_pd_far == 78) {
			app.pd_near=73;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu06D1][rP17]");
		}
		if (temp_pd_far == 77) {
			app.pd_near=72;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu06BA][rP16]");
		}
		if (temp_pd_far == 76) {
			app.pd_near=71;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu06A1][rP15]");
		}
		if (temp_pd_far == 75) {
			app.pd_near=70;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu068A][rP14]");
		}
		if (temp_pd_far == 74) {
			app.pd_near=70;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu068A][rP14]");
		}
		if (temp_pd_far == 73) {
			app.pd_near=69;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0671][rP13]");
		}
		if (temp_pd_far == 72) {
			app.pd_near=68;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu065A][rP12]");
		}
		if (temp_pd_far == 71) {
			app.pd_near=67;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0643][rP11]");
		}
		if (temp_pd_far == 70) {
			app.pd_near=66;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu062A][rP10]");
		}
		if (temp_pd_far == 69) {
			app.pd_near=65;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0613][rP0F]");
		}
		if (temp_pd_far == 68) {
			app.pd_near=64;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu05FA][rP0E]");
		}
		if (temp_pd_far == 67) {
			app.pd_near=63;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu05E3][rP0D]");
		}
		if (temp_pd_far == 66) {
			app.pd_near=62;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu05CC][rP0C]");
		}
		if (temp_pd_far == 65) {
			app.pd_near=61;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu05B3][rP0B]");
		}
		if (temp_pd_far == 64) {
			app.pd_near=60;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu059C][rP0A]");
		}
		if (temp_pd_far == 63) {
			app.pd_near=59;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0583][rP09]");
		}
		if (temp_pd_far == 62) {
			app.pd_near=58;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu056C][rP08]");
		}
		if (temp_pd_far == 61) {
			app.pd_near=57;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0553][rP07]");
		}
		if (temp_pd_far == 60) {
			app.pd_near=56;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu053C][rP06]");
		}
		if (temp_pd_far == 59) {
			app.pd_near=55;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0525][rP05]");
		}
		if (temp_pd_far == 58) {
			app.pd_near=54;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu050C][rP04]");
		}
		if (temp_pd_far == 57) {
			app.pd_near=54;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu050C][rP04]");
		}
		if (temp_pd_far == 56) {
			app.pd_near=53;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu04F5][rP03]");
		}
		if (temp_pd_far == 55) {
			app.pd_near=52;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu04DC][rP02]");
		}
		if (temp_pd_far == 54) {
			app.pd_near=51;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu04C5][rP01]");
		}
		if (temp_pd_far == 53) {
			app.pd_near=50;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu04AC][rP00]");
		}
		if (temp_pd_far == 52) {
			app.pd_near=49;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0495]");
		}
		if (temp_pd_far == 51) {
			app.pd_near=48;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu047E]");
		}
		if (temp_pd_far == 50) {
			app.pd_near=47;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[lu0465]");
		}
	}
	
    public void disp_far(){
    	if ((app.pd_near==77)||(app.pd_near==76)||(app.pd_near==75)) {
			app.pd_far=80;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP1E][lu0000]");
		}
		if (app.pd_near== 74) {
			app.pd_far=79;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP1D][lu0000]");
		}
		if (app.pd_near == 73) {
			app.pd_far=78;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP1C][lu0000]");
		}
		if (app.pd_near== 72) {
			app.pd_far=77;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP1B][lu0000]");
		}
		if (app.pd_near== 71) {
			app.pd_far=76;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP1A][lu0000]");
		}
		if (app.pd_near== 70) {
			if(app.flag_chgPD==3)
		       {
					app.pd_far=75;
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP19][lu0000]");
		       	}
		       	else if(app.flag_chgPD==4)
		       	{
		       		app.pd_far=74;
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP18][lu0000]");
		       	}
		}
		if (app.pd_near== 69) {
			app.pd_far=73;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP17][lu0000]");
		}
		if (app.pd_near== 68) {
			app.pd_far=72;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP16][lu0000]");
		}
		if (app.pd_near== 67) {
			app.pd_far=71;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP15][lu0000]");
		}
		if (app.pd_near== 66) {
			app.pd_far=70;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP14][lu0000]");
		}
		if (app.pd_near== 65) {
			app.pd_far=69;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP13][lu0000]");
		}
		if (app.pd_near== 64) {
			app.pd_far=68;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP12][lu0000]");
		}
		if (app.pd_near== 63) {
			app.pd_far=67;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP11][lu0000]");
		}
		if (app.pd_near== 62) {
			app.pd_far=66;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP10][lu0000]");
		}
		if (app.pd_near== 61) {
			app.pd_far=65;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0F][lu0000]");
		}
		if (app.pd_near== 60) {
			app.pd_far=64;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0E][lu0000]");
		}
		if (app.pd_near== 59) {
			app.pd_far=63;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0D][lu0000]");
		}
		if (app.pd_near== 58) {
			app.pd_far=62;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0C][lu0000]");
		}
		if (app.pd_near== 57) {
			app.pd_far=61;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0B][lu0000]");
		}
		if (app.pd_near== 56) {
			app.pd_far=60;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP0A][lu0000]");
		}
		if (app.pd_near== 55) {
			app.pd_far=59;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP09][lu0000]");
		}
		if (app.pd_near== 54) {
			 if(app.flag_chgPD==1)
		       {
				    app.pd_far=58;
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP08][lu0000]");
		       }
		       else if(app.flag_chgPD==2)
		       {
		    	    app.pd_far=57;
					app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP07][lu0000]");
		       }
		}
		if (app.pd_near== 53) {
			app.pd_far=56;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP06][lu0000]");
		}
		if (app.pd_near== 52) {
			app.pd_far=55;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP05][lu0000]");
		}
		if (app.pd_near== 51) {
			app.pd_far=54;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP04][lu0000]");
		}
		if (app.pd_near== 50) {
			app.pd_far=53;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP03][lu0000]");
		}
		if (app.pd_near== 49) {
			app.pd_far=52;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP02][lu0000]");
		}
		if (app.pd_near== 48) {
			app.pd_far=51;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP01][lu0000]");
		}
		if ((app.pd_near==47)||(app.pd_near==46)||(app.pd_near==45)) {
			app.pd_far=50;
			app.BluetoothAPI.send_command(Device.TypeBullEye, "[rP00][lu0000]                             ");
		}
	}
	///////////////////////////////////////////////////////////
	public void SetSText(int num) {
		int indexS;
		////////////////////////////////////////
		if (app.IsModeFar){			
			indexS = IndexFarS;
			indexC = IndexFarC;
			indexA = IndexFarA;
			if (app.OnRightRMK) {
				int r = -1;
				if (_ROrL == "R") {
					r = get_index_by_value(list_S, app.dcils_s_r1);
					if (r >= 0)
						indexS = r-214;
					r = get_index_by_value(list_C, app.dcils_s_r2);
					if (r >= 0)
						indexC = r-39;
					r = get_index_by_value(list_A, app.dcils_s_r3);
					if (r >= 0)
						indexA = r;
					app.OnRightRMK = false;
				} 
			}
			if (app.OnLeftRMK) {
				int r = -1;
				if (_ROrL == "L") {
					r = get_index_by_value(list_S, app.dcils_s_l1);
					if (r >= 0)
						indexS = r-214;
					r = get_index_by_value(list_C, app.dcils_s_l2);
					if (r >= 0)
						indexC = r-39;
					r = get_index_by_value(list_A, app.dcils_s_l3);
					if (r >= 0)
						indexA = r;
					app.OnLeftRMK = false;
				}
			}
			indexS += num;
			if (indexS < -214)
				indexS = -214;
			else if (indexS > 232)
				indexS = 232;
			list_mTV.get(Constants.EYE_S).SetChangeText(
					setList(list_S, indexS + 214));
			IndexFarS = indexS;
			IndexFarC = indexC;
			IndexFarA = indexA;
		}else{
			indexS = IndexNearS;
			indexC = IndexNearC;
			indexA = IndexNearA;
		    ///////////////////////////////////////////////////////////
			if (app.OnRightFARtoNEAR) {
				int r = -1;
				if (_ROrL == "R") {
					r = get_index_by_value(list_S, app.s_r_fartonear);
					if (r >= 0)
						indexS = r-214;
					r = get_index_by_value(list_C, app.c_r_fartonear);
					if (r >= 0)
						indexC = r-39;
					r = get_index_by_value(list_A, app.a_r_fartonear);
					if (r >= 0)
						indexA = r;
					app.OnRightFARtoNEAR = false;
				} 
			}

			if (app.OnLeftFARtoNEAR) {
				int r = -1;
				if (_ROrL == "L") {
					r = get_index_by_value(list_S, app.s_l_fartonear);
					if (r >= 0)
						indexS = r-214;
					r = get_index_by_value(list_C, app.c_l_fartonear);
					if (r >= 0)
						indexC = r-39;
					r = get_index_by_value(list_A, app.a_l_fartonear);
					if (r >= 0)
						indexA = r;
					app.OnLeftFARtoNEAR = false;
				}
			}
			///////////////////////////////////////////////////////////
			indexS += num;
			if (indexS < -214)
				indexS = -214;
			else if (indexS > 232)
				indexS = 232;
			list_mTV.get(Constants.EYE_S).SetChangeText(
					setList(list_S, indexS + 214));
			IndexNearS = indexS;
			IndexNearC = indexC;
			IndexNearA = indexA;
		}
		if (app.IsModeFar)
	        disp_far();
	}
	
	//////////////////////////////////////////////////////
	public void SetXText(int num) {
		int  Hcount;
		
		int Squ;
		int PolarCount;
		int temprangle;
		int rangle;
		int temp;
		////////////////////////////////////////
		if (app.IsModeFar){	
			    indexH = IndexFarH;
			    indexV = IndexFarV;
			    
				indexH += num;
				if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)
					indexH -=num;
				if(indexH > 0)
					hFlag = "I ";
				else if(indexH < 0)
					hFlag = "O ";
				else 
					hFlag = " ";
				Squ=indexH*indexH+indexV*indexV;
			    PolarCount=(int)Math.round(Math.sqrt(Squ));
			    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
			    if (_ROrL.equals("R")) {
			    	if(indexH>0)
			    	{
			    		if(indexV>0)
			    			rangle=360-temprangle;
			    		else if(indexV<0)
			    			rangle=temprangle;
			    		else
			    			rangle=0;
			    		if(rangle==360)
			    			rangle=0;	
			    	}
			    	else if(indexH<0)
			    	{
			    		if(indexV>0)
			    			rangle=180+temprangle;
			    		else if(indexV<0)
			    			rangle=180-temprangle;
			    		else
			    			rangle=180;
			    	}
			    	else
			    	{
			    		if(indexV>0)
			    			rangle=270;
			    		else if(indexV<0)
			    			rangle=90;
			    		else
			    			rangle=0;	
			    	}
			    	//////////////////////////////////////////////////////////
			    	if((rangle==0)||(rangle==90))
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
			    		}
			    	}
			    	else if((rangle > 0)&&(rangle < 90))
			    	{
			    		 if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
			    		}	
			    	}
			    	else if((rangle > 270)&&(rangle < 360))
			    	{
			    		if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
			    		}	
			    	}
			    	else if((rangle > 90)&&(rangle < 180))
			    	{
			    		if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
			    		}	
			    	}
			    	else if((rangle > 180)&&(rangle < 270))
			    	{
			    		if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
			    		}	
			    	}
			    	else if(rangle == 180)
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
			    		}	
			    	}
			    	else if(rangle == 270)
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
			    		}	
			    	}
			    	//////////////////////////////////////////////////////////
			    }
			    else if (_ROrL.equals("L")) {
			    	if(indexH>0)
			    	{
			    		if(indexV>0)
			    			rangle=180-temprangle;
			    		else if(indexV<0)
			    			rangle=180+temprangle;
			    		else
			    			rangle=180;
			    	}
			    	else if(indexH<0)
			    	{
			    		if(indexV>0)
			    			rangle=temprangle;
			    		else if(indexV<0)
			    			rangle=360-temprangle;
			    		else
			    			rangle=0;
			    		if(rangle==360)
			    			rangle=0;	
			    	}
			    	else
			    	{
			    		if(indexV>0)
			    			rangle=90;
			    		else if(indexV<0)
			    			rangle=270;
			    		else
			    			rangle=0;	
			    	}
			    	if((rangle==0)||(rangle==90))
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
			    		}
			    	}
			    	else if((rangle > 0)&&(rangle < 90))
			    	{
			    		if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
			    		}	
			    	}
			    	else if((rangle > 270)&&(rangle < 360))
			    	{
			    	   if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
			    		}	
			    	}
			    	else if((rangle > 90)&&(rangle < 180))
			    	{
			    	   if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
			    		}	
			    	}
			    	else if((rangle > 180)&&(rangle < 270))
			    	{
			    		if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
			    		}	
			    	}
			    	else if(rangle == 180)
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
			    		}	
			    	}
			    	else if(rangle == 270)
			    	{
			    		if(PolarCount==0)
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
			    		else if((PolarCount>=1)&&(PolarCount<=200))
			    		{
			    			temp=PolarCount-PolarCount/10;
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
			    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
			    		}	
			    	}
			    }	
				////////////////////////////////////////////////////////////////////////////////////////////////////  
				if(indexH < 0)
					Hcount= -indexH;
				else
					Hcount=  indexH;
				if (indexH == 0)
					list_mTV.get(Constants.EYE_H).SetChangeText(setList_HV(list_H, 	Hcount));
				else
					list_mTV.get(Constants.EYE_H).SetChangeText(hFlag + setList_HV(list_H, Hcount));
			/////////////////////////////////////////////////////////////
				IndexFarH = indexH;
				IndexFarV = indexV;
			
		}else{
			//////////////////////////////////////////////////////////////
			indexH = IndexNearH;
			indexV = IndexNearV;
		    
			indexH += num;
			if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)
				indexH -=num;
			if(indexH > 0)
				hFlag = "I ";
			else if(indexH < 0)
				hFlag = "O ";
			else 
				hFlag = " ";
			Squ=indexH*indexH+indexV*indexV;
		    PolarCount=(int)Math.round(Math.sqrt(Squ));
		    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
		    if (_ROrL.equals("R")) {
		    	if(indexH>0)
		    	{
		    		if(indexV>0)
		    			rangle=360-temprangle;
		    		else if(indexV<0)
		    			rangle=temprangle;
		    		else
		    			rangle=0;
		    		if(rangle==360)
		    			rangle=0;	
		    	}
		    	else if(indexH<0)
		    	{
		    		if(indexV>0)
		    			rangle=180+temprangle;
		    		else if(indexV<0)
		    			rangle=180-temprangle;
		    		else
		    			rangle=180;
		    	}
		    	else
		    	{
		    		if(indexV>0)
		    			rangle=270;
		    		else if(indexV<0)
		    			rangle=90;
		    		else
		    			rangle=0;	
		    	}
		    	if((rangle==0)||(rangle==90))
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}
		    	}
		    	else if((rangle > 0)&&(rangle < 90))
		    	{
		    		 if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 270)&&(rangle < 360))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
		    		}	
		    	}
		    	else if((rangle > 90)&&(rangle < 180))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 180)&&(rangle < 270))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 180)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 270)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
		    		}	
		    	}
		    }
		    else if (_ROrL.equals("L")) {
		    	if(indexH>0)
		    	{
		    		if(indexV>0)
		    			rangle=180-temprangle;
		    		else if(indexV<0)
		    			rangle=180+temprangle;
		    		else
		    			rangle=180;
		    	}
		    	else if(indexH<0)
		    	{
		    		if(indexV>0)
		    			rangle=temprangle;
		    		else if(indexV<0)
		    			rangle=360-temprangle;
		    		else
		    			rangle=0;
		    		if(rangle==360)
		    			rangle=0;	
		    	}
		    	else
		    	{
		    		if(indexV>0)
		    			rangle=90;
		    		else if(indexV<0)
		    			rangle=270;
		    		else
		    			rangle=0;	
		    	}
		    	if((rangle==0)||(rangle==90))
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}
		    	}
		    	else if((rangle > 0)&&(rangle < 90))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 270)&&(rangle < 360))
		    	{
		    	   if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
		    		}	
		    	}
		    	else if((rangle > 90)&&(rangle < 180))
		    	{
		    	   if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 180)&&(rangle < 270))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 180)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 270)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
		    		}	
		    	}
		    }	
			////////////////////////////////////////////////////////////////////////////////////////////////////  
			if(indexH < 0)
				Hcount= -indexH;
			else
				Hcount=  indexH;
			if (indexH == 0)
				list_mTV.get(Constants.EYE_H).SetChangeText(setList_HV(list_H, 	Hcount));//H有关的数据
			else
				list_mTV.get(Constants.EYE_H).SetChangeText(hFlag + setList_HV(list_H, Hcount));
		/////////////////////////////////////////////////////////////
			IndexNearH = indexH;
			IndexNearV = indexV;
			//////////////////////////////////////////////////////////////
	
		}
		if (app.IsModeFar)
	        disp_far();
	}
	//////////////////////////////////////////////////////
	
	
//////////////////////////////////////////////////////
public void SetYText(int num) {
int  Vcount;

int Squ;
int PolarCount;
int temprangle;
int rangle;
int temp;
////////////////////////////////////////
if (app.IsModeFar){	
	indexH = IndexFarH;
	indexV = IndexFarV;
	
	indexV += num;
	if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)
		indexV -=num;
	if (_ROrL.equals("L")) {
		if (indexV >0 )
			vFlag = "U ";
		else if (indexV <0 )
			vFlag = "D ";
		else
			vFlag = " ";
	} else if (_ROrL.equals("R")) {
		if (indexV >0 )
			vFlag = "D ";
		else if (indexV <0 )
			vFlag = "U ";
		else
			vFlag = " ";
	}
	Squ=indexH*indexH+indexV*indexV;
    PolarCount=(int)Math.round(Math.sqrt(Squ));
    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
   
    if (_ROrL.equals("R")) {
    	if(indexH>0)
    	{
    		if(indexV>0)
    			rangle=360-temprangle;
    		else if(indexV<0)
    			rangle=temprangle;
    		else
    			rangle=0;
    		if(rangle==360)
    			rangle=0;	
    	}
    	else if(indexH<0)
    	{
    		if(indexV>0)
    			rangle=180+temprangle;
    		else if(indexV<0)
    			rangle=180-temprangle;
    		else
    			rangle=180;
    	}
    	else
    	{
    		if(indexV>0)
    			rangle=270;
    		else if(indexV<0)
    			rangle=90;
    		else
    			rangle=0;	
    	}
    	//////////////////////////////////////////////////////////
    	if((rangle==0)||(rangle==90))
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}
    	}
    	else if((rangle > 0)&&(rangle < 90))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 270)&&(rangle < 360))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
    		}	
    	}
    	else if((rangle > 90)&&(rangle < 180))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 180)&&(rangle < 270))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 180)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 270)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
    		}	
    	}
    	//////////////////////////////////////////////////////////
    }
    else if (_ROrL.equals("L")) {
    	if(indexH>0)
    	{
    		if(indexV>0)
    			rangle=180-temprangle;
    		else if(indexV<0)
    			rangle=180+temprangle;
    		else
    			rangle=180;	
    	}
    	else if(indexH<0)
    	{
    		if(indexV>0)
    			rangle=temprangle;
    		else if(indexV<0)
    			rangle=360-temprangle;
    		else
    			rangle=0;
    		if(rangle==360)
    			rangle=0;
    	}
    	else
    	{
    		if(indexV>0)
    			rangle=90;
    		else if(indexV<0)
    			rangle=270;
    		else
    			rangle=0;	
    	}
    	if((rangle==0)||(rangle==90))
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}
    	}
    	else if((rangle > 0)&&(rangle < 90))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 270)&&(rangle < 360))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
    		}	
    	}
    	else if((rangle > 90)&&(rangle < 180))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 180)&&(rangle < 270))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 180)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 270)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
    		}	
    	}
    }
	/////////////////////////////////////////////////////////////////////////////////////
	if(indexV< 0)
		Vcount= -indexV;
	else
		Vcount=  indexV;
	if (indexV == 0)
		list_mTV.get(Constants.EYE_V).SetChangeText(setList_HV(list_V, 	Vcount));
	else
		list_mTV.get(Constants.EYE_V).SetChangeText(vFlag + setList_HV(list_V, Vcount));

	IndexFarH = indexH;
	IndexFarV = indexV;

}else{
	indexH = IndexNearH;
	indexV = IndexNearV;
	
	indexV += num;
	if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)
		indexV -=num;
	if (_ROrL.equals("L")) {
		if (indexV >0 )
			vFlag = "U ";
		else if (indexV <0 )
			vFlag = "D ";
		else
			vFlag = " ";
	} else if (_ROrL.equals("R")) {
		if (indexV >0 )
			vFlag = "D ";
		else if (indexV <0 )
			vFlag = "U ";
		else
			vFlag = " ";
	}
	Squ=indexH*indexH+indexV*indexV;
    PolarCount=(int)Math.round(Math.sqrt(Squ));
    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
  
    if (_ROrL.equals("R")) {
    	if(indexH>0)
    	{
    		if(indexV>0)
    			rangle=360-temprangle;
    		else if(indexV<0)
    			rangle=temprangle;
    		else
    			rangle=0;
    		if(rangle==360)
    			rangle=0;	
    	}
    	else if(indexH<0)
    	{
    		if(indexV>0)
    			rangle=180+temprangle;
    		else if(indexV<0)
    			rangle=180-temprangle;
    		else
    			rangle=180;
    	}
    	else
    	{
    		if(indexV>0)
    			rangle=270;
    		else if(indexV<0)
    			rangle=90;
    		else
    			rangle=0;	
    	}
    	
    	if((rangle==0)||(rangle==90))
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}
    	}
    	else if((rangle > 0)&&(rangle < 90))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 270)&&(rangle < 360))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
    		}	
    	}
    	else if((rangle > 90)&&(rangle < 180))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 180)&&(rangle < 270))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 180)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 270)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
    		}	
    	}
    	//////////////////////////////////////////////////////////
    }
    else if (_ROrL.equals("L")) {
    	if(indexH>0)
    	{
    		if(indexV>0)
    			rangle=180-temprangle;
    		else if(indexV<0)
    			rangle=180+temprangle;
    		else
    			rangle=180;	
    	}
    	else if(indexH<0)
    	{
    		if(indexV>0)
    			rangle=temprangle;
    		else if(indexV<0)
    			rangle=360-temprangle;
    		else
    			rangle=0;
    		if(rangle==360)
    			rangle=0;
    	}
    	else
    	{
    		if(indexV>0)
    			rangle=90;
    		else if(indexV<0)
    			rangle=270;
    		else
    			rangle=0;	
    	}
    	if((rangle==0)||(rangle==90))
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}
    	}
    	else if((rangle > 0)&&(rangle < 90))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 270)&&(rangle < 360))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
    		}	
    	}
    	else if((rangle > 90)&&(rangle < 180))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if((rangle > 180)&&(rangle < 270))
    	{
    		if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 180)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
    		}	
    	}
    	else if(rangle == 270)
    	{
    		if(PolarCount==0)
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
    		else if((PolarCount>=1)&&(PolarCount<=200))
    		{
    			temp=PolarCount-PolarCount/10;
    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
    		}	
    	}
    }
	/////////////////////////////////////////////////////////////////////////////////////
	if(indexV< 0)
		Vcount= -indexV;
	else
		Vcount=  indexV;
	if (indexV == 0)
		list_mTV.get(Constants.EYE_V).SetChangeText(setList_HV(list_V, 	Vcount));
	else
		list_mTV.get(Constants.EYE_V).SetChangeText(vFlag + setList_HV(list_V, Vcount));


	IndexNearH = indexH;
	IndexNearV = indexV;
//////////////////////////////////////////////////////////////
}
	if (app.IsModeFar)
		disp_far();
}
//////////////////////////////////////////////////////

	public void SetADDText(int num) {
		int indexS, indexADD;
		int add_temp;
		//////////////////////////////////////
		if (app.IsModeFar){
			indexADD = IndexFarADD;
			indexS = IndexFarS;
		}else{
			indexADD = IndexNearADD;
			indexS = IndexNearS;
		}
		indexADD += num;
		if (indexADD < 0)
			indexADD = 0;
		if (indexADD >= list_Add.size() - 1) {
			indexADD = list_Add.size() - 1;
		}
		add_temp = -indexADD * 2 + indexS;
		list_mTV.get(Constants.EYE_ADD).SetChangeText(
				setList_ADD(list_Add, indexADD));
		setList_ADD1(list_S, add_temp + 214);
		if (app.IsModeFar)
	        disp_near();
	}


	
	public void Set_1() {
			/////////////////////////////////////////////////////////////////////
			if(app.txtState == Constants.EYE_A){
				if (app.jiushi == true) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rx%04X]", (short) (app._ccar+0)));
				}
				if (app.jiushi == false) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rx%04X]", (short) (app._ccar +180)));
				}
			  }else if(app.txtState == Constants.EYE_C){
				  if (app.jiushi == true) {
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format("[rx%04X]", (short) (app._ccar+0)));
					}
					if (app.jiushi == false) {
						app.BluetoothAPI.send_command(Device.TypeBullEye,
								String.format("[rx%04X]", (short) (app._ccar +180)));
					}
			  }
			/////////////////////////////////////////////////////////////////////
		}

		public void Set_2() {
		//////////////////////////////////////////////////////////////////////////
			if(app.txtState == Constants.EYE_A){
				if (app.jiushi == true) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[lx%04X]", (short) (app._ccal+0)));
				}
				if (app.jiushi == false) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[lx%04X]", (short) (app._ccal +180)));
				}
			}else if(app.txtState == Constants.EYE_C){
				if (app.jiushi == true) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[lx%04X]", (short) (app._ccal+0)));
				}
				if (app.jiushi == false) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[lx%04X]", (short) (app._ccal +180)));
				}
			}
			//////////////////////////////////////////////////////////////////////
		}


	@SuppressWarnings("unused")
	public void SetText(int num) {

		int Squ;
		int PolarCount;
		int temprangle;
		int rangle;
		int temp;
		if (app.IsModeFar) {
			indexS = IndexFarS;
			indexC = IndexFarC;
			indexA = IndexFarA;
			indexH = IndexFarH;
			indexV = IndexFarV;
			indexADD = IndexFarADD;
		} else {
			indexS = IndexNearS;
			indexC = IndexNearC;
			indexA = IndexNearA;
			indexH = IndexNearH;
			indexV = IndexNearV;
			indexADD = IndexNearADD;
		}

		if (app.OnRightRMK) {
			int r = -1;
//			String[] strArray = null;
//			if (_ROrL == "R") {
//				strArray = app.dcils_s_r;
//				r = get_index_by_value(list_S, strArray[1]);
//				if (r >= 0)
//					indexS = r-214;//r-109
//				r = get_index_by_value(list_C, strArray[2]);
//				if (r >= 0)
//					indexC = r-39;
//				r = get_index_by_value(list_A, strArray[3]);
//				if (r >= 0)
//					indexA = r;
//				app.OnRightRMK = false;
//			} 
			if (_ROrL == "R") {
				r = get_index_by_value(list_S, app.dcils_s_r1);
				if (r >= 0)
					indexS = r-214;
				r = get_index_by_value(list_C, app.dcils_s_r2);
				if (r >= 0)
					indexC = r-39;
				r = get_index_by_value(list_A, app.dcils_s_r3);
				if (r >= 0)
					indexA = r;
				app.OnRightRMK = false;
			} 
		}
		
		if (app.OnLeftRMK) {
			int r = -1;
//			String[] strArray = null;
//			if (_ROrL == "L") {
//				strArray = app.dcils_s_l;
//				r = get_index_by_value(list_S, strArray[1]);
//				if (r >= 0)
//					indexS = r-214;
//				r = get_index_by_value(list_C, strArray[2]);
//				if (r >= 0)
//					indexC = r-39;
//				r = get_index_by_value(list_A, strArray[3]);
//				if (r >= 0)
//					indexA = r;
//				app.OnLeftRMK = false;
//			}
			if (_ROrL == "L") {
				r = get_index_by_value(list_S, app.dcils_s_l1);
				if (r >= 0)
					indexS = r-214;
				r = get_index_by_value(list_C, app.dcils_s_l2);
				if (r >= 0)
					indexC = r-39;
				r = get_index_by_value(list_A, app.dcils_s_l3);
				if (r >= 0)
					indexA = r;
				app.OnLeftRMK = false;
			}
		}
		///////////////////////////////////////////////////////////
		if (app.OnRightFARtoNEAR) {
			int r = -1;
			if (_ROrL == "R") {
				r = get_index_by_value(list_S, app.s_r_fartonear);
				if (r >= 0)
					indexS = r-214;//r-109
				r = get_index_by_value(list_C, app.c_r_fartonear);
				if (r >= 0)
					indexC = r-39;
				r = get_index_by_value(list_A, app.a_r_fartonear);
				if (r >= 0)
					indexA = r;
				app.OnRightFARtoNEAR = false;
			} 
		}
		
		if (app.OnLeftFARtoNEAR) {
			int r = -1;
			if (_ROrL == "L") {
				r = get_index_by_value(list_S, app.s_l_fartonear);
				if (r >= 0)
					indexS = r-214;
				r = get_index_by_value(list_C, app.c_l_fartonear);
				if (r >= 0)
					indexC = r-39;
				r = get_index_by_value(list_A, app.a_l_fartonear);
				if (r >= 0)
					indexA = r;
				app.OnLeftFARtoNEAR = false;
			}
		}
		///////////////////////////////////////////////////////////

		switch (app.txtState) {
		case Constants.EYE_S:
			indexS += num;
			if (indexS < -214)
				indexS = -214;
			else if (indexS > 232)
				indexS = 232;
			list_mTV.get(Constants.EYE_S).SetChangeText(
					setList(list_S, indexS + 214));
			
			if (app.entirepd == true) {
				if (app.txtCount == 1000) {
					app.BullEye_L_S = indexS + 214;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_S = indexS + 214;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_S = indexS + 214;
					app.BullEye_R_S = indexS + 214;
				}
			}else if (app.entirepd == false){
				if (app.txtCount == 1000) {
					app.BullEye_L_S2 = indexS + 214;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_S2 = indexS + 214;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_S2 = indexS + 214;
					app.BullEye_R_S2 = indexS + 214;
				}
			}
			break;
		case Constants.EYE_C:
			indexC += num;
			if (app.position < 4) {
				if (indexC < 0)
					indexC = 0;
				else if (indexC > 39)
					indexC = 39;
			} else {
				if (indexC < -39)
					indexC = -39;
				else if (indexC > 0)
					indexC = 0;
			}
			list_mTV.get(Constants.EYE_C).SetChangeText(
					setList(list_C, indexC + 39));
			if (app.entirepd == true) {
				if (app.txtCount == 1000) {
					app.BullEye_L_C = indexC + 39;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_C = indexC + 39;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_C = indexC + 39;
					app.BullEye_R_C = indexC + 39;
				}
			} else if (app.entirepd == false) {
				if (app.txtCount == 1000) {
					app.BullEye_L_C2 = indexC + 39;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_C2 = indexC + 39;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_C2 = indexC + 39;
					app.BullEye_R_C2 = indexC + 39;
				}
			}
			if (app.Lr == true) {
				String a = setList(list_C, indexC + 39);
				if (!a.equals(b)) {
					if (a.equals("+09.50") || a.equals("+09.00")
							|| a.equals("+08.50") || a.equals("+08.00")
							|| a.equals("+07.50") || a.equals("+07.00")
							|| a.equals("+06.50") || a.equals("+06.00")
							|| a.equals("+05.50") || a.equals("+05.00")
							|| a.equals("+04.50") || a.equals("+04.00")
							|| a.equals("+03.50") || a.equals("+03.00")
							|| a.equals("+02.50") || a.equals("+02.00")
							|| a.equals("+01.50") || a.equals("+01.00")
							|| a.equals("+00.50") || a.equals("00.00")
							|| a.equals("-00.50") || a.equals("-01.00")
							|| a.equals("-01.50") || a.equals("-02.00")
							|| a.equals("-02.00") || a.equals("-02.50")
							|| a.equals("-03.00") || a.equals("-03.50")
							|| a.equals("-04.00") || a.equals("-04.50")
							|| a.equals("-05.00") || a.equals("-05.50")
							|| a.equals("-06.00") || a.equals("-06.50")
							|| a.equals("-07.00") || a.equals("-07.50")
							|| a.equals("-08.00") || a.equals("-08.50")
							|| a.equals("-09.00") || a.equals("-09.50")) {
						indexS -= 2*num;
						if (indexS < -214)
							indexS = -214;
						else if (indexS > 232)
							indexS = 232;
						
						list_mTV.get(Constants.EYE_S).SetChangeText(
								setListCS(list_S, indexS + 214));
						
						b = a;
					}
				}
			}
			break;
		case Constants.EYE_A:
			indexA += num;
			if (indexA <=0){
				indexA = 180 + indexA;
			}
			if (indexA >= list_A.size())
				indexA = indexA - list_A.size()+1;
			list_mTV.get(Constants.EYE_A)
					.SetChangeText(setList(list_A, indexA));
			if (_ROrL.equals("R")){
				String a = setList(list_A, indexA);
				int k = Integer.parseInt(a);
				CCAR = k * 2;
				app._ccar = CCAR;
			}else if(_ROrL.equals("L")){
				String a = setList(list_A, indexA);
				int k = Integer.parseInt(a);
				CCAL = k* 2;
				app._ccal = CCAL;
			}
			if (app.entirepd == true) {
				if (app.txtCount == 1000) {
					app.BullEye_L_A = indexA;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_A = indexA;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_A = indexA;
					app.BullEye_R_A = indexA;
				}
			} else if (app.entirepd == false) {
				if (app.txtCount == 1000) {
					app.BullEye_L_A2 = indexA;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_A2 = indexA;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_A2 = indexA;
					app.BullEye_R_A2 = indexA;
				}
			}
			if (app.fwshuj == false) {
				if (_ROrL.equals("R")) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[rx%04X]", (short) (CCAR)));
				}
				if (_ROrL.equals("L")) {
					app.BluetoothAPI.send_command(Device.TypeBullEye,
							String.format("[lx%04X]", (short) (CCAL)));
				}
			}


			break;
///////////////////////////////////////////////////////////////////////////////////
		case Constants.EYE_H:
		    int  Hcount;
		    //////////////////////////////////////////////
			indexH += num;
			if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)//20161014 added
				indexH -=num;
			if(indexH > 0)
				hFlag = "I ";
			else if(indexH < 0)
				hFlag = "O ";
			else 
				hFlag = " ";
			Squ=indexH*indexH+indexV*indexV;
		    PolarCount=(int)Math.round(Math.sqrt(Squ));
		    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
		    if (_ROrL.equals("R")) {
		    	if(indexH>0)
		    	{
		    		if(indexV>0)
		    			rangle=360-temprangle;
		    		else if(indexV<0)
		    			rangle=temprangle;
		    		else
		    			rangle=0;
		    		if(rangle==360)
		    			rangle=0;	
		    	}
		    	else if(indexH<0)
		    	{
		    		if(indexV>0)
		    			rangle=180+temprangle;
		    		else if(indexV<0)
		    			rangle=180-temprangle;
		    		else
		    			rangle=180;
		    	}
		    	else
		    	{
		    		if(indexV>0)
		    			rangle=270;
		    		else if(indexV<0)
		    			rangle=90;
		    		else
		    			rangle=0;	
		    	}
		    	if((rangle==0)||(rangle==90))
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}
		    	}
		    	else if((rangle > 0)&&(rangle < 90))
		    	{
		    		 if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 270)&&(rangle < 360))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
		    		}	
		    	}
		    	else if((rangle > 90)&&(rangle < 180))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 180)&&(rangle < 270))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 180)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 270)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
		    		}	
		    	}
		    	//////////////////////////////////////////////////////////
		    }
		    else if (_ROrL.equals("L")) {
		    	if(indexH>0)
		    	{
		    		if(indexV>0)
		    			rangle=180-temprangle;
		    		else if(indexV<0)
		    			rangle=180+temprangle;
		    		else
		    			rangle=180;
		    	}
		    	else if(indexH<0)
		    	{
		    		if(indexV>0)
		    			rangle=temprangle;
		    		else if(indexV<0)
		    			rangle=360-temprangle;
		    		else
		    			rangle=0;
		    		if(rangle==360)
		    			rangle=0;	
		    	}
		    	else
		    	{
		    		if(indexV>0)
		    			rangle=90;
		    		else if(indexV<0)
		    			rangle=270;
		    		else
		    			rangle=0;	
		    	}
		    	if((rangle==0)||(rangle==90))
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}
		    	}
		    	else if((rangle > 0)&&(rangle < 90))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 270)&&(rangle < 360))
		    	{
		    	   if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
		    		}	
		    	}
		    	else if((rangle > 90)&&(rangle < 180))
		    	{
		    	   if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if((rangle > 180)&&(rangle < 270))
		    	{
		    		if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 180)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
		    		}	
		    	}
		    	else if(rangle == 270)
		    	{
		    		if(PolarCount==0)
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
		    		else if((PolarCount>=1)&&(PolarCount<=200))
		    		{
		    			temp=PolarCount-PolarCount/10;
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
		    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
		    		}	
		    	}
		    }	
			////////////////////////////////////////////////////////////////////////////////////////////////////  
			if(indexH < 0)
				Hcount= -indexH;
			else
				Hcount=  indexH;
			if (indexH == 0)
				list_mTV.get(Constants.EYE_H).SetChangeText(setList_HV(list_H, 	Hcount));
			else
				list_mTV.get(Constants.EYE_H).SetChangeText(hFlag + setList_HV(list_H, Hcount));
		break;
	case Constants.EYE_V:
		 int  Vcount;
		indexV += num;
		if(Math.sqrt((indexH)*(indexH)+(indexV)*(indexV))>200)
			indexV -=num;
		if (_ROrL.equals("L")) {
			if (indexV >0 )
				vFlag = "U ";
			else if (indexV <0 )
				vFlag = "D ";
			else
				vFlag = " ";
		} else if (_ROrL.equals("R")) {
			if (indexV >0 )
				vFlag = "D ";
			else if (indexV <0 )
				vFlag = "U ";
			else
				vFlag = " ";
		}
		Squ=indexH*indexH+indexV*indexV;
	    PolarCount=(int)Math.round(Math.sqrt(Squ));
	    temprangle=(int)Math.round(((Math.atan2(Math.abs(indexV), Math.abs(indexH)))*180)/3.1415926);
	    if (_ROrL.equals("R")) {
	    	if(indexH>0)
	    	{
	    		if(indexV>0)
	    			rangle=360-temprangle;
	    		else if(indexV<0)
	    			rangle=temprangle;
	    		else
	    			rangle=0;
	    		if(rangle==360)
	    			rangle=0;	
	    	}
	    	else if(indexH<0)
	    	{
	    		if(indexV>0)
	    			rangle=180+temprangle;
	    		else if(indexV<0)
	    			rangle=180-temprangle;
	    		else
	    			rangle=180;
	    	}
	    	else
	    	{
	    		if(indexV>0)
	    			rangle=270;
	    		else if(indexV<0)
	    			rangle=90;
	    		else
	    			rangle=0;	
	    	}
	    	if((rangle==0)||(rangle==90))
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
	    		}
	    	}
	    	else if((rangle > 0)&&(rangle < 90))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
	    		}	
	    	}
	    	else if((rangle > 270)&&(rangle < 360))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp+2*(360-rangle))));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp-2*(360-rangle))));
	    		}	
	    	}
	    	else if((rangle > 90)&&(rangle < 180))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
	    		}	
	    	}
	    	else if((rangle > 180)&&(rangle < 270))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*rangle)));
	    		}	
	    	}
	    	else if(rangle == 180)
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(360-temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(360-temp+2*rangle)));
	    		}	
	    	}
	    	else if(rangle == 270)
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77][rc0000][rb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[rE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rc%04X]", (short)(temp-2*(rangle))));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rb%04X]", (short)(temp+2*(rangle))));
	    		}	
	    	}
	    }
	    else if (_ROrL.equals("L")) {
	    	if(indexH>0)
	    	{
	    		if(indexV>0)
	    			rangle=180-temprangle;
	    		else if(indexV<0)
	    			rangle=180+temprangle;
	    		else
	    			rangle=180;	
	    	}
	    	else if(indexH<0)
	    	{
	    		if(indexV>0)
	    			rangle=temprangle;
	    		else if(indexV<0)
	    			rangle=360-temprangle;
	    		else
	    			rangle=0;
	    		if(rangle==360)
	    			rangle=0;
	    	}
	    	else
	    	{
	    		if(indexV>0)
	    			rangle=90;
	    		else if(indexV<0)
	    			rangle=270;
	    		else
	    			rangle=0;	
	    	}
	    	if((rangle==0)||(rangle==90))
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
	    		}
	    	}
	    	else if((rangle > 0)&&(rangle < 90))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
	    		}	
	    	}
	    	else if((rangle > 270)&&(rangle < 360))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp+2*(360-rangle))));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp-2*(360-rangle))));
	    		}	
	    	}
	    	else if((rangle > 90)&&(rangle < 180))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
	    		}	
	    	}
	    	else if((rangle > 180)&&(rangle < 270))
	    	{
	    		if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*rangle)));
	    		}	
	    	}
	    	else if(rangle == 180)
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(360-temp-2*rangle)));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(360-temp+2*rangle)));
	    		}	
	    	}
	    	else if(rangle == 270)
	    	{
	    		if(PolarCount==0)
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77][lc0000][lb0000]");
	    		else if((PolarCount>=1)&&(PolarCount<=200))
	    		{
	    			temp=PolarCount-PolarCount/10;
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,"[lE77]");
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lc%04X]", (short)(temp-2*(rangle))));
	    			app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lb%04X]", (short)(temp+2*(rangle))));
	    		}	
	    	}
	    }
		/////////////////////////////////////////////////////////////////////////////////////
		if(indexV< 0)
			Vcount= -indexV;
		else
			Vcount=  indexV;
		if (indexV == 0)
			list_mTV.get(Constants.EYE_V).SetChangeText(setList_HV(list_V, 	Vcount));//H有关的数据
		else
			list_mTV.get(Constants.EYE_V).SetChangeText(vFlag + setList_HV(list_V, Vcount));
		    break;
		case Constants.EYE_ADD:
			int add_temp;
			indexADD += num;
			if (indexADD < 0)
				indexADD = 0;
			if (indexADD >= list_Add.size() - 1) {
				indexADD = list_Add.size() - 1;
			}
			add_temp = -indexADD * 2 + indexS;
			list_mTV.get(Constants.EYE_ADD).SetChangeText(
					setList_ADD(list_Add, indexADD));
			setList_ADD1(list_S, add_temp + 214);
			if (app.entirepd == true) {
				if (app.txtCount == 1000) {
					app.BullEye_L_ADD = indexADD;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_ADD = indexADD;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_ADD = indexADD;
					app.BullEye_R_ADD = indexADD;
				}
			} else if (app.entirepd == false) {
				if (app.txtCount == 1000) {
					app.BullEye_L_ADD2 = indexADD;
				}
				if (app.txtCount == 1001) {
					app.BullEye_R_ADD2 = indexADD;
				}
				if (app.txtCount == 1002) {
					app.BullEye_L_ADD2 = indexADD;
					app.BullEye_R_ADD2 = indexADD;
				}
			}
			break;

		default:
			break;
		}
		if (app.IsModeFar) {
			IndexFarS = indexS;
			IndexFarC = indexC;
			IndexFarA = indexA;
			IndexFarH = indexH;
			IndexFarV = indexV;
			IndexFarADD = indexADD;
		} else {
			IndexNearS = indexS;
			IndexNearC = indexC;
			IndexNearA = indexA;
			IndexNearH = indexH;
			IndexNearV = indexV;
			IndexNearADD = indexADD;
		}
	}
    
	private String setListCS(List<String> list, int count) {

		String[] temp = null;
		temp = list.get(count).split(",");
		String xx = temp[0];
		String cmdR = temp[1].substring(0, 6);
		String cmdL = temp[2].substring(0, 6);
		String cmd;
		if (_ROrL.equals("L")){
			cmd = cmdL+"[lE11]";
		}
		else{
			cmd = cmdR+"[rE11]";
		}
		if (xx.equals("pass")) {
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			if (app.BluetoothAPI != null)
				app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
			count++;
			temp = list.get(count).split(",");
			xx = temp[0];
			cmdR = temp[1];
			cmdL = temp[2];
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			if (app.BluetoothAPI != null)
				app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
			return xx;
		}
		if (app.BluetoothAPI != null) {
			app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
		}
		return xx;
	}
	
	private String setList(List<String> list, int count) {

		String[] temp = null;
		temp = list.get(count).split(","); 
		String xx = temp[0];
		String cmdR = temp[1];
		String cmdL = temp[2];
		String cmd;
		if (_ROrL.equals("L")){
			cmd = cmdL;
		}
		else{
			cmd = cmdR;
		}
		if (xx.equals("pass")) {
			
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			if (app.BluetoothAPI != null)
				app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
			count++;
			temp = list.get(count).split(",");
			xx = temp[0];
			cmdR = temp[1];
			cmdL = temp[2];
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			if (app.BluetoothAPI != null)
				app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
			return xx;
		}
		// 蓝牙发送的
		if (app.BluetoothAPI != null) {
			app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
		}
		return xx;
	}

	private String setList_ADD(List<String> list, int count) {
		
		String[] temp = null;
	
		temp = list.get(count).split(","); 
		String xx = temp[0];
		return xx;
	}

	private String setList_ADD1(List<String> list, int count) {
		
		String[] temp = null;
		
		temp = list.get(count).split(","); 
		String xx = temp[0];
		String cmdR = temp[1];
		String cmdL = temp[2];
		String cmd;
		if (_ROrL.equals("L"))
			cmd = cmdL;
		else
			cmd = cmdR;
		
		if (app.BluetoothAPI != null) {
			app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
		}
		return xx;
	}

	private String setList_HV(List<String> list, int count) {
		
		String[] temp = null;
		
		temp = list.get(count).split(","); 
		String xx = temp[0];
		String cmdR = temp[1];
		String cmdL = temp[2];
		String cmd;
		if (_ROrL.equals("L"))
			cmd = cmdL;
		else
			cmd = cmdR;
		if (xx.equals("pass")) {
			
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			
			count++;
			temp = list.get(count).split(",");
			xx = temp[0];
			cmdR = temp[1];
			cmdL = temp[2];
			if (_ROrL.equals("L"))
				cmd = cmdL;
			else
				cmd = cmdR;
			// if (app.BluetoothAPI !=
			// null)app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
			return xx;
		}
		// 蓝牙发送的
		if (app.BluetoothAPI != null) {
			// app.BluetoothAPI.send_command(Device.TypeBullEye, cmd);
		}
		return xx;
	}

	private int get_index_by_value(List<String> list, String value) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).toString().split(",")[0].equals(value))
				return i;
		}
		return -1;
	}

	public int get_index_by_value_l(String option, String value) {
		value = app.dcils_s_l[1];
		List<String> list = null;
		if (option == "S") {
			list = list_S;
		}

		for (int i = 0; i < list.size(); i++) {
			String[] strArray = list.get(i).split(",");
			if (strArray[0].equals(value))
				return i;

		}

		return -1;
	}

	public int get_index_by_value_r(String option, String value) {
		value = app.dcils_s_r[1];
		List<String> list = null;
		if (option == "S") {
			list = list_S;
		}

		for (int i = 0; i < list.size(); i++) {
			String[] strArray = list.get(i).split(",");
			if (strArray[0].equals(value))
				return i;
		}

		return -1;
	}
}
