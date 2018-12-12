package com.dingzhou.eye;

import java.math.BigInteger;

import com.dingzhou.eye.tool.Constants;
import com.dingzhou.eye.tool.MyApp;
import com.dingzhou.eye.ui.MyDialog;
import com.dingzhou.eye.util.Device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AdminuiActivity extends Activity {
	private TextView mTxtEye_rl;
	private TextView mTxtEye_Disk1, mTxtEye_Disk2, mTxtEye_Disk3, mTxtEye_Disk4, mTxtEye_Disk5, mTxtEye_Disk6;
	private TextView mTxtEye_AXS, mTxtEye_Disk6A, mTxtEye_Disk6B, mTxtEye_Disk6C, mTxtEye_PD, mTxtEye_TILT;
	private Button mbt_rl,mbt_init,mbt_load,mbt_save,mbt_test,mbt_add,mbt_minus,mbt_exit,mbt_step1,mbt_step2,mbt_step5,mbt_step10;
	private Button mbt_disk1,mbt_disk2,mbt_disk3,mbt_disk4,mbt_disk5,mbt_disk6;
	private Button mbt_axs,mbt_disk6a,mbt_disk6b,mbt_disk6c,mbt_pd,mbt_tilt;
	private Button mbt_lens4,mbt_lens6,mbt_lens4prev,mbt_lens4next,mbt_lens6prev,mbt_lens6next,mbt_reset;
	private Button mbt_D4show,mbt_D6show;
	private TextView mTxtEye_lens4,mTxtEye_lens6;
    private Context mcontext;        	 
	private MyApp app;
	private int step;
	private int state;
	private int lens4;
	private int lens6;
	public String label_lj = "";
	
	private int adjust_rl;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			setContentView(R.layout.adminui_layout);
			mcontext = this;
			app=(MyApp)this.getApplication();
			step=5;
			state=1;
			adjust_rl=0;
			mbt_rl=(Button)findViewById(R.id.button1);
			mbt_rl.setOnClickListener(Myclick);
			
			mbt_init=(Button)findViewById(R.id.button2);
			mbt_init.setOnClickListener(Myclick);
			
			mbt_load=(Button)findViewById(R.id.button3);
			mbt_load.setOnClickListener(Myclick);
			
			mbt_save=(Button)findViewById(R.id.button4);
			mbt_save.setOnClickListener(Myclick);
			
			mbt_test=(Button)findViewById(R.id.button5);
			
			mbt_exit=(Button)findViewById(R.id.button6);
			mbt_exit.setOnClickListener(Myclick);
			
			mbt_add=(Button)findViewById(R.id.bt_add);
			mbt_add.setOnClickListener(Myclick);
			
			mbt_minus=(Button)findViewById(R.id.bt_minus);
			mbt_minus.setOnClickListener(Myclick);
			
			mbt_step1=(Button)findViewById(R.id.bt_step1);
			mbt_step1.setOnClickListener(Myclick);
			
			mbt_step2=(Button)findViewById(R.id.bt_step2);
			mbt_step2.setOnClickListener(Myclick);
			
			mbt_step5=(Button)findViewById(R.id.bt_step5);
			mbt_step5.setOnClickListener(Myclick);
			
			mbt_step10=(Button)findViewById(R.id.bt_step10);
			mbt_step10.setOnClickListener(Myclick);
			
			mbt_disk1=(Button)findViewById(R.id.bt_DISK1);
			mbt_disk1.setOnClickListener(Myclick);
			
			mbt_disk2=(Button)findViewById(R.id.bt_DISK2);
			mbt_disk2.setOnClickListener(Myclick);
			
			mbt_disk3=(Button)findViewById(R.id.bt_DISK3);
			mbt_disk3.setOnClickListener(Myclick);
			
			mbt_disk4=(Button)findViewById(R.id.bt_DISK4);
			mbt_disk4.setOnClickListener(Myclick);
			
			mbt_disk5=(Button)findViewById(R.id.bt_DISK5);
			mbt_disk5.setOnClickListener(Myclick);
			
			mbt_disk6=(Button)findViewById(R.id.bt_DISK6);
			mbt_disk6.setOnClickListener(Myclick);
			
			mbt_axs=(Button)findViewById(R.id.bt_AXS);
			mbt_axs.setOnClickListener(Myclick);
			
			mbt_disk6a=(Button)findViewById(R.id.bt_DISK6A);
			mbt_disk6a.setOnClickListener(Myclick);
			
			mbt_disk6b=(Button)findViewById(R.id.bt_DISK6B);
			
			mbt_disk6c=(Button)findViewById(R.id.bt_DISK6C);
			mbt_disk6c.setOnClickListener(Myclick);
			
			mbt_pd=(Button)findViewById(R.id.bt_PD);
			mbt_pd.setOnClickListener(Myclick);
			
			mbt_tilt=(Button)findViewById(R.id.bt_TILT);
			mbt_tilt.setOnClickListener(Myclick);
			
			//////////////////////////////////////////////
			mbt_lens4prev=(Button)findViewById(R.id.bt_D4prev);
			mbt_lens4prev.setOnClickListener(Myclick);
			
			mbt_lens4next=(Button)findViewById(R.id.bt_D4next);
			mbt_lens4next.setOnClickListener(Myclick);
			
			mbt_lens6prev=(Button)findViewById(R.id.bt_D6prev);
			mbt_lens6prev.setOnClickListener(Myclick);
			
			mbt_lens6next=(Button)findViewById(R.id.bt_D6next);
			mbt_lens6next.setOnClickListener(Myclick);
			
			mbt_reset=(Button)findViewById(R.id.RESET);
			mbt_reset.setOnClickListener(Myclick);
			
			mbt_D4show=(Button)findViewById(R.id.bt_D4show);
			mbt_D6show=(Button)findViewById(R.id.bt_D6show);
			
			mTxtEye_rl = (TextView)findViewById(R.id.tet);
			mTxtEye_Disk1 = (TextView)findViewById(R.id.txt_DISK1);
			mTxtEye_Disk2 = (TextView)findViewById(R.id.txt_DISK2);
			mTxtEye_Disk3 = (TextView)findViewById(R.id.txt_DISK3);
			mTxtEye_Disk4 = (TextView)findViewById(R.id.txt_DISK4);
			mTxtEye_Disk5 = (TextView)findViewById(R.id.txt_DISK5);
			mTxtEye_Disk6 = (TextView)findViewById(R.id.txt_DISK6);
			
			mTxtEye_AXS = (TextView)findViewById(R.id.txt_AXS);
			mTxtEye_Disk6A = (TextView)findViewById(R.id.txt_DISK6A);
			mTxtEye_Disk6B = (TextView)findViewById(R.id.txt_DISK6B);
			mTxtEye_Disk6C = (TextView)findViewById(R.id.txt_DISK6C);
			mTxtEye_PD = (TextView)findViewById(R.id.txt_PD);
			mTxtEye_TILT = (TextView)findViewById(R.id.txt_TILT);
			
			mTxtEye_lens4 = (TextView)findViewById(R.id.txt_4DISK);
			mTxtEye_lens6 = (TextView)findViewById(R.id.txt_6DISK);
			///////////////////////////////////////////////////////////
			if(app.language_flag==1){
				mTxtEye_rl.setText("R:");
				mbt_disk1.setText("DISK1");
				mbt_disk2.setText("DISK2");
				mbt_disk3.setText("DISK3");
				mbt_disk4.setText("DISK4");
				mbt_disk5.setText("DISK5");
				mbt_disk6.setText("DISK6");
				
				mbt_axs.setText("AXS");
				mbt_disk6a.setText("DISK6A");
				mbt_disk6b.setText("DISK6B");
				mbt_disk6c.setText("DISK6C");
				mbt_pd.setText("TILT");
				mbt_tilt.setText("PD");
				mbt_rl.setText("RIGHT");
				mbt_init.setText("INT");
				mbt_load.setText("LOAD");
				mbt_save.setText("SAVE");
				mbt_test.setText("TEST");
				mbt_exit.setText("EXIT");
				mbt_step1.setText("STEP1");
				mbt_step2.setText("STEP2");
				mbt_step5.setText("STEP5");
				mbt_step10.setText("STEP10");
				mbt_reset.setText("RESET");
				mbt_D4show.setText("LENS 4");
				mbt_D6show.setText("LENS 6");
			}else if(app.language_flag==2){
				mTxtEye_rl.setText("右:");
				mbt_disk1.setText("盘1");
				mbt_disk2.setText("盘2");
				mbt_disk3.setText("盘3");
				mbt_disk4.setText("盘4");
				mbt_disk5.setText("盘5");
				mbt_disk6.setText("盘6");
				
				mbt_axs.setText("轴位");
				mbt_disk6a.setText("棱镜A");
				mbt_disk6b.setText("交叉柱镜");
				mbt_disk6c.setText("棱镜C");
				mbt_pd.setText("集合擎");
				mbt_tilt.setText("瞳距");
				
				mbt_rl.setText("右");
				mbt_init.setText("初始化");
				mbt_load.setText("装载数据");
				mbt_save.setText("保存");
				mbt_test.setText("测试");
				mbt_exit.setText("退出");
				mbt_step1.setText("步长1");
				mbt_step2.setText("步长2");
				mbt_step5.setText("步长5");
				mbt_step10.setText("步长10");
				mbt_reset.setText("归0");
				mbt_D4show.setText("镜片盘 4");
				mbt_D6show.setText("镜片盘 6");
			}
			///////////////////////////////////////////////////////////
			
			mTxtEye_Disk1.setText("0");
			mTxtEye_Disk2.setText("0");
			mTxtEye_Disk3.setText("0");
			mTxtEye_Disk4.setText("0");
			mTxtEye_Disk5.setText("0");
			mTxtEye_Disk6.setText("0");
			mTxtEye_AXS.setText("0");
			mTxtEye_Disk6A.setText("0");
			mTxtEye_Disk6B.setText("0");
			mTxtEye_Disk6C.setText("0");
			mTxtEye_PD.setText("0");
			mTxtEye_TILT.setText("0");
		}
		public OnClickListener Myclick =new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId()) {
				case R.id.button1:
					if(adjust_rl==1){
						adjust_rl=0;
						if(app.language_flag==1){
							mTxtEye_rl.setText("R:");
							mbt_rl.setText("RIGHT");
						}else if(app.language_flag==2){
							mTxtEye_rl.setText("右:");
							mbt_rl.setText("右");
						}
					}
					else if(adjust_rl==0){
						adjust_rl=1;
						if(app.language_flag==1){
							mTxtEye_rl.setText("L:");
							mbt_rl.setText("LEFT");
						}else if(app.language_flag==2){
							mTxtEye_rl.setText("左:");
							mbt_rl.setText("左");
						}
					}
					mTxtEye_Disk1.setText("0");
					mTxtEye_Disk2.setText("0");
					mTxtEye_Disk3.setText("0");
					mTxtEye_Disk4.setText("0");
					mTxtEye_Disk5.setText("0");
					mTxtEye_Disk6.setText("0");
					mTxtEye_AXS.setText("0");
					mTxtEye_Disk6A.setText("0");
					mTxtEye_Disk6B.setText("0");
					mTxtEye_Disk6C.setText("0");
					mTxtEye_PD.setText("0");
					mTxtEye_TILT.setText("0");
				  	break;
				case R.id.button2 :
					switch(adjust_rl){
						case 0:
							app.BluetoothAPI.send_command(Device.TypeBullEye,"<HV>[rR00]");
							break;
						case 1:
							app.BluetoothAPI.send_command(Device.TypeBullEye,"<HV>[lR00]");
							break;
					   default:
							break;
					}
					 break;
			    
				case R.id.button3 :
					String[] strArray = app.BluetoothAPI.StrReceive.split("]");
					short is_disk1 =(short) (Integer.valueOf(strArray[1].substring(strArray[1].length()-4,strArray[1].length()), 16) & 0xffff) ;
					short is_disk2 =(short) (Integer.valueOf(strArray[2].substring(strArray[2].length()-4,strArray[2].length()), 16) & 0xffff) ;
					short is_disk3 =(short) (Integer.valueOf(strArray[3].substring(strArray[3].length()-4,strArray[3].length()), 16) & 0xffff) ;
					short is_disk4 =(short) (Integer.valueOf(strArray[4].substring(strArray[4].length()-4,strArray[4].length()), 16) & 0xffff) ;
					short is_disk5 =(short) (Integer.valueOf(strArray[5].substring(strArray[5].length()-4,strArray[5].length()), 16) & 0xffff) ;
					short is_disk6 =(short) (Integer.valueOf(strArray[6].substring(strArray[6].length()-4,strArray[6].length()), 16) & 0xffff) ;
					short is_disk7 =(short) (Integer.valueOf(strArray[7].substring(strArray[7].length()-4,strArray[7].length()), 16) & 0xffff) ;
					short is_disk8 =(short) (Integer.valueOf(strArray[8].substring(strArray[8].length()-4,strArray[8].length()), 16) & 0xffff) ;
					short is_disk9 =(short) (Integer.valueOf(strArray[9].substring(strArray[9].length()-4,strArray[9].length()), 16) & 0xffff) ;
					short is_disk10 =(short) (Integer.valueOf(strArray[10].substring(strArray[10].length()-4,strArray[10].length()), 16) & 0xffff) ;
					short is_disk11 =(short) (Integer.valueOf(strArray[11].substring(strArray[11].length()-4,strArray[11].length()), 16) & 0xffff) ;
					mTxtEye_Disk1.setText(""+is_disk1);
					mTxtEye_Disk2.setText(""+is_disk2);
					mTxtEye_Disk3.setText(""+is_disk3);
					mTxtEye_Disk4.setText(""+is_disk4);
					mTxtEye_Disk5.setText(""+is_disk5);
					mTxtEye_Disk6.setText(""+is_disk6);
					mTxtEye_AXS.setText(""+is_disk7);
					mTxtEye_Disk6A.setText(""+is_disk8);
					mTxtEye_Disk6C.setText(""+is_disk9);
					mTxtEye_PD.setText(""+is_disk11);
					mTxtEye_TILT.setText(""+is_disk10);
								
					 break;
					 
				case R.id.button4:
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,"[rs][rR00]");
						////////////////////////////////////////////////////////
						String value_transR = mTxtEye_Disk6C.getText().toString();
						int i_transr = Integer.parseInt(value_transR);
					    app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rZ%04X]", (short)i_transr));
						///////////////////////////////////////////////////////
						app.lj_r=mTxtEye_Disk6C.getText().toString();
						app.cdSave_ljr();
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,"[ls][lR00]");
						////////////////////////////////////////////////////////
						String value_transL = mTxtEye_Disk6C.getText().toString();
						int i_transl = Integer.parseInt(value_transL);
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lZ%04X]", (short)i_transl));
						///////////////////////////////////////////////////////
						app.lj_l=mTxtEye_Disk6C.getText().toString();
						app.cdSave_ljl();
						break;
				   default:
						break;
				   }
					break;
				case R.id.button6:
					exit();
					break;
				case R.id.bt_add:
					setvalue(1);
					break;
				case R.id.bt_minus:
					setvalue(-1);
					break;
				case R.id.bt_step1:
					step=1;
					break;
				case R.id.bt_step2:
					step=2;
					break;
				case R.id.bt_step5:
					step=5;
					break;
				case R.id.bt_step10:
					step=10;
					break;
				case R.id.bt_DISK1:
					state=1;
					break;
				case R.id.bt_DISK2:
					state=2;
					break;
				case R.id.bt_DISK3:
					state=3;
					break;
				case R.id.bt_DISK4:
					state=4;
					break;
				case R.id.bt_DISK5:
					state=5;
					break;
				case R.id.bt_DISK6:
					state=6;
					break;
				case R.id.bt_AXS:
					state=7;
					break;
				case R.id.bt_DISK6A:
					state=8;
					break;
				case R.id.bt_DISK6C:
					state=9;
					break;
				case R.id.bt_PD:
					state=10;
					break;
				case R.id.bt_TILT:
					state=11;
					break;
			///////////////////////////////////////
				case R.id.bt_D4prev:
					lens4--;
					if(lens4<0)
						lens4=7;
					mTxtEye_lens4.setText(""+lens4);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rC0%X]", (short)lens4));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lC0%X]", (short)lens4));
						break;
				   default:
						break;
				   }
					break;
				case R.id.bt_D4next:
					lens4++;
					if(lens4>7)
						lens4=0;
					mTxtEye_lens4.setText(""+lens4);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rC0%X]", (short)lens4));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lC0%X]", (short)lens4));
						break;
				   default:
						break;
				   }
					break;
				case R.id.bt_D6prev:
					lens6--;
					if(lens6<0)
						lens6=7;
					mTxtEye_lens6.setText(""+lens6);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rE%X%X]",(short)lens6, (short)lens6));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lE%X%X]",(short)lens6,(short)lens6));
						break;
				   default:
						break;
				   }
					break;
				case R.id.bt_D6next:
					lens6++;
					if(lens6>7)
						lens6=0;
					mTxtEye_lens6.setText(""+lens6);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rE%X%X]",(short)lens6, (short)lens6));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lE%X%X]",(short)lens6,(short)lens6));
						break;
				   default:
						break;
				   }
					break;	
				case R.id.RESET:
					lens4=0;
					lens6=0;
					mTxtEye_lens4.setText(""+lens4);
					mTxtEye_lens6.setText(""+lens6);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rC0%X]", (short)lens4));
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rE%X%X]",(short)lens6, (short)lens6));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lC0%X]", (short)lens4));
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lE%X%X]",(short)lens6,(short)lens6));
						break;
				   default:
						break;
				   }
					break;
			///////////////////////////////////////
			      default:
			    	 break;
				}
				
			}
		};
		
		
		
		@SuppressLint("UseValueOf")
		public void setvalue(int pd) {
			pd = chengeStep(pd);
			switch(state){
			case 1:
					String value_disk1 = mTxtEye_Disk1.getText().toString();
					int i_1 = Integer.parseInt(value_disk1);
					int s_1=i_1+pd;
					mTxtEye_Disk1.setText("" + s_1);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rg%04X]", (short)s_1));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lg%04X]", (short)s_1));
						break;
				   default:
						break;
				   }
					break;
			case 2:
					String value_disk2 = mTxtEye_Disk2.getText().toString();
					int i_2 = Integer.parseInt(value_disk2);
					int s_2=i_2+pd;
					mTxtEye_Disk2.setText("" + s_2);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rh%04X]", (short)s_2));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lh%04X]", (short)s_2));
						break;
				   default:
						break;
				   }
					break;
			case 3:
					String value_disk3 = mTxtEye_Disk3.getText().toString();
					int i_3 = Integer.parseInt(value_disk3);
					int s_3=i_3+pd;
					mTxtEye_Disk3.setText("" + s_3);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[ri%04X]", (short)s_3));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[li%04X]", (short)s_3));
						break;
				   default:
						break;
				   }
					break;
			case 4:
					String value_disk4 = mTxtEye_Disk4.getText().toString();
					int i_4 = Integer.parseInt(value_disk4);
					int s_4=i_4+pd;
					mTxtEye_Disk4.setText("" + s_4);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rj%04X]", (short)s_4));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lj%04X]", (short)s_4));
						break;
				   default:
						break;
				   }
					break;
			case 5:
					String value_disk5 = mTxtEye_Disk5.getText().toString();
					int i_5 = Integer.parseInt(value_disk5);
					int s_5=i_5+pd;
					mTxtEye_Disk5.setText("" + s_5);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rk%04X]", (short)s_5));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lk%04X]", (short)s_5));
						break;
				   default:
						break;
				   }
					break;
			case 6:
					String value_disk6 = mTxtEye_Disk6.getText().toString();
					int i_6 = Integer.parseInt(value_disk6);
					int s_6=i_6+pd;
					mTxtEye_Disk6.setText("" + s_6);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rm%04X]", (short)s_6));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lm%04X]", (short)s_6));
						break;
				   default:
						break;
				   }
					break;
			case 7:
					String value_disk7 = mTxtEye_AXS.getText().toString();
					int i_7 = Integer.parseInt(value_disk7);
					int s_7=i_7+pd;
					mTxtEye_AXS.setText("" + s_7);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rn%04X]", (short)s_7));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[ln%04X]", (short)s_7));
						break;
				   default:
						break;
				   }
					break;
			case 8:
					String value_disk8 = mTxtEye_Disk6A.getText().toString();
					int i_8 = Integer.parseInt(value_disk8);
					int s_8=i_8+pd;
					mTxtEye_Disk6A.setText("" + s_8);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[ro%04X]", (short)s_8));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lo%04X]", (short)s_8));
						break;
				   default:
						break;
				   }
					break;
			case 9:
					String value_disk9 = mTxtEye_Disk6C.getText().toString();
					int i_9 = Integer.parseInt(value_disk9);
					int s_9=i_9+pd;
					mTxtEye_Disk6C.setText("" + s_9);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rp%04X]", (short)s_9));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lp%04X]", (short)s_9));
						break;
				   default:
						break;
				   }
					//app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rp%04X]", (short)s_9));
					break;
//			case 10:
//					String value_disk10 = mTxtEye_PD.getText().toString();
//					int i_10 = Integer.parseInt(value_disk10);
//					int s_10=i_10+pd;
//					mTxtEye_PD.setText("" + s_10);
//					switch(adjust_rl){
//					case 0:
//						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rr%04X]", (short)s_10));
//						break;
//					case 1:
//						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lr%04X]", (short)s_10));
//						break;
//				   default:
//						break;
//				   }
//					break;
			case 11:
					String value_disk11 = mTxtEye_TILT.getText().toString();
					int i_11 = Integer.parseInt(value_disk11);
					int s_11=i_11+pd;
					mTxtEye_TILT.setText("" + s_11);
					switch(adjust_rl){
					case 0:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rq%04X]", (short)s_11));
						break;
					case 1:
						app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[lq%04X]", (short)s_11));
						break;
				   default:
						break;
				   }
					//app.BluetoothAPI.send_command(Device.TypeBullEye,String.format("[rq%04X]", (short)s_11));
					break;			
			default:
				    break;
			}
		}

		public int chengeStep(int num) {
			int xxoo = 0;
			xxoo=num*step;
			return xxoo;
		}
		
		public void exit() {  
		 AdminuiActivity.this.finish();
		}  
					
}
