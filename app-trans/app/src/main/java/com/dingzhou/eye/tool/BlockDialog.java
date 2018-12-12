package com.dingzhou.eye.tool;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class BlockDialog extends Dialog
{
	private int 	 _dialogResult;  
	private Handler _handler ;  
	private Context _context;
	public int a = -1;
	
	public BlockDialog(Activity context)
	{
		super(context);
		_context = context;
		_dialogResult=0;
		setOwnerActivity(context);  
		requestWindowFeature(Window.FEATURE_NO_TITLE);       
		onCreate();  
	}

	private void onCreate() 
	{
		LinearLayout layout2=new LinearLayout(_context); 
		setContentView(layout2);  
	}
	
	public int getDialogResult()  
    {  
    	return _dialogResult;  
    } 

	public void setDialogResult(int dialogResult)  
    {  
		this._dialogResult = dialogResult;  
    } 

	
	public void endDialog(int result)  
	{  
	    dismiss();  
	    setDialogResult(result);  
	    Message m = _handler.obtainMessage();  
	    _handler.sendMessage(m);  
    }
	    
	public void close()
	{
	    dismiss();  
	    setDialogResult(1);  
	    Message m = _handler.obtainMessage();  
	    _handler.sendMessage(m);  
	}
	public int show_dialog()
	{
		_handler = new Handler() {  
        	public void handleMessage(Message mesg) {  
            	throw new RuntimeException();  
            }  
        };  
        
        
        super.show();  
        Window window = this.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes(); 
        lp.dimAmount =0f;
        window.setLayout(0, 0);
        window.setAttributes(lp);
        this.setCanceledOnTouchOutside(false);
        try 
        {
            Looper.getMainLooper();
            Looper.loop();  
        }  
        catch(RuntimeException e2)  
        {  
        }  
        return _dialogResult; 
	}
		
}
