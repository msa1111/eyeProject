package com.dingzhou.eye;

import com.dingzhou.eye.tool.MyApp;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class SetActivity extends Activity implements OnClickListener {
	private MyApp app;
	private FragmentChart fragmenchart;
	private View fragmentCHARTlayout;

	private FragmentRmk fragmentrmk;
	private View fragmentRMKlayout;
	
	private Fragmentov fragmentov;
	private View fragmentovlayout;
	
	private FragmentVt fragmentvt;
	private View fragmentVTlayout;
	private FragmentManager fragmentManager;
	private TextView m_chart,m_prism,m_rmk,m_lanuage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_set);
		
		initViews();
		fragmentManager = getFragmentManager();
		setTabSelection(0);
	}

	private void initViews() {
		
		fragmentCHARTlayout = findViewById(R.id.message_layout1);
		fragmentCHARTlayout.setOnClickListener(this);
		
		fragmentRMKlayout = findViewById(R.id.contacts_layout1);
		fragmentRMKlayout.setOnClickListener(this);
		
		fragmentovlayout = findViewById(R.id.contacts_layout2);
		fragmentovlayout.setOnClickListener(this);


		fragmentVTlayout = findViewById(R.id.news_layout1);
		fragmentVTlayout.setOnClickListener(this);
		
		m_chart = (TextView)findViewById(R.id.message_text);

		m_prism = (TextView)findViewById(R.id.contacts_text);
		m_rmk = (TextView)findViewById(R.id.contacts_text2);

		m_lanuage = (TextView)findViewById(R.id.news_text);	
		fragmentCHARTlayout.setOnClickListener(this);
		fragmentRMKlayout.setOnClickListener(this);
		fragmentovlayout.setOnClickListener(this);
		fragmentVTlayout.setOnClickListener(this);
	}

	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.message_layout1:
		
			setTabSelection(0);
			break;
		case R.id.contacts_layout1:
			
			setTabSelection(1);
			break;
		case R.id.contacts_layout2:
			
			setTabSelection(2);
			break;
		case R.id.news_layout1:
			
			setTabSelection(3);
			break;
		default:
			break;
		}
	}
	
	private void setTabSelection(int index) {
		 
	     clearSelection();
	     
	     android.app.FragmentTransaction transaction = fragmentManager.beginTransaction(); 
	     
	     hideFragments(transaction);
	     switch (index) {
	     case 0:
	    	
	    	 fragmentCHARTlayout.setBackgroundColor(0xFF696969);
	          if (fragmenchart == null) {
	             
	        	  fragmenchart = new FragmentChart();
	              transaction.add(R.id.content1, fragmenchart);
	          } else {
	            
	              transaction.show(fragmenchart);
	          }
	          break;
	     case 1:
	       
	    	 fragmentRMKlayout.setBackgroundColor(0xFF696969);
	       if (fragmentrmk == null) {
	          
	    	   fragmentrmk = new FragmentRmk();
	          transaction.add(R.id.content1, fragmentrmk);
	       } else {
	         
	          transaction.show(fragmentrmk);
	        }
	        break;
	        
	     case 2:
		      
	    	 fragmentovlayout.setBackgroundColor(0xFF696969);
		       if (fragmentov == null) {
		         
		    	   fragmentov = new Fragmentov();
		          transaction.add(R.id.content1, fragmentov);
		       } else {
		         
		          transaction.show(fragmentov);
		        }
		        break;
	     case 3:
	    	 	
	    	 fragmentVTlayout.setBackgroundColor(0xFF696969);
	         if (fragmentvt == null) {
	           
	        	 fragmentvt = new FragmentVt();
	             transaction.add(R.id.content1, fragmentvt);
	         } else {
	            
	            transaction.show(fragmentvt);
	         }
	         break;
	   }
	  transaction.commit();
	}

	

	private void hideFragments(android.app.FragmentTransaction transaction) {
	      if (fragmenchart != null) {
	          transaction.hide(fragmenchart);
	      }
	      if (fragmentrmk != null) {
	          transaction.hide(fragmentrmk);
	      }
	      if (fragmentov != null) {
	          transaction.hide(fragmentov);
	      }
	      if (fragmentvt != null) {
	          transaction.hide(fragmentvt);
	      }
	}	

	private void clearSelection() {
		fragmentCHARTlayout.setBackgroundColor(0xffffffff);
		fragmentRMKlayout.setBackgroundColor(0xffffffff);
		fragmentovlayout.setBackgroundColor(0xffffffff);
		fragmentVTlayout.setBackgroundColor(0xffffffff);
	}
	
}
