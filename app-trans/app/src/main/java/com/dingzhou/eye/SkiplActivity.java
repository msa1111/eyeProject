package com.dingzhou.eye;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class SkiplActivity extends Activity implements OnClickListener {
	private FragmentR fragmentR;
	private View fragmentRlayout;

	private FragmentBIN fragmentBIN;
	private View fragmentBINlayout;
	
	private FragmentL fragmentL;
	private View fragmentLlayout;
	private FragmentManager fragmentManager;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.leftskip_layout);
		
		initViews();
		fragmentManager = getFragmentManager();
		
		setTabSelection(1);		
	}
	
	private void initViews() {
		
		fragmentRlayout = findViewById(R.id.message_layout);
		fragmentRlayout.setOnClickListener(this);
		
		fragmentBINlayout = findViewById(R.id.contacts_layout);
		fragmentBINlayout.setOnClickListener(this);
		
		fragmentLlayout = findViewById(R.id.news_layout);
		fragmentLlayout.setOnClickListener(this);
		
		fragmentRlayout.setOnClickListener(this);
		fragmentBINlayout.setOnClickListener(this);
		fragmentLlayout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
	     case R.id.message_layout:
	        
	         setTabSelection(0);
	         break;
	     case R.id.contacts_layout:
	        
	         setTabSelection(1);
	         break;
	     case R.id.news_layout:
	         
	         setTabSelection(2);
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
	    	 fragmentRlayout.setBackgroundColor(0xFF696969);
	 
	          if (fragmentR == null) {
	             
	        	  fragmentR = new FragmentR();
	              transaction.add(R.id.content, fragmentR);
	          } else {
	              
	              transaction.show(fragmentR);
	          }
	          break;
	     case 1:
	       
	    	 fragmentBINlayout.setBackgroundColor(0xFF696969);
	       if (fragmentBIN == null) {
	         
	    	   fragmentBIN = new FragmentBIN();
	          transaction.add(R.id.content, fragmentBIN);
	       } else {
	        
	          transaction.show(fragmentBIN);
	        }
	        break;
	     case 2:
	       
	    	 fragmentLlayout.setBackgroundColor(0xFF696969);
	         if (fragmentL == null) {
	            
	        	 fragmentL = new FragmentL();
	             transaction.add(R.id.content, fragmentL);
	         } else {
	           
	            transaction.show(fragmentL);
	         }
	         break;
	   }
	  transaction.commit();
	}
	

	private void hideFragments(android.app.FragmentTransaction transaction) {
	      if (fragmentR != null) {
	          transaction.hide(fragmentR);
	      }
	      if (fragmentBIN != null) {
	          transaction.hide(fragmentBIN);
	      }
	      if (fragmentL != null) {
	          transaction.hide(fragmentL);
	      }
	       
	}
	

	private void clearSelection() {
		fragmentRlayout.setBackgroundColor(0xffffffff);
		fragmentBINlayout.setBackgroundColor(0xffffffff);
		fragmentLlayout.setBackgroundColor(0xffffffff);
	}
	
}
