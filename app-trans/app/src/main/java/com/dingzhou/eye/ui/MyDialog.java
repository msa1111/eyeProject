package com.dingzhou.eye.ui;
import android.app.ProgressDialog;
import android.content.Context;
public class MyDialog 
{
	static ProgressDialog progressDialog;
	public static void showProgress(Context context, String title, String message) {
		if (progressDialog == null) {
			progressDialog = new ProgressDialog(context);
			progressDialog.setCanceledOnTouchOutside(false);
		} else {
			progressDialog.dismiss();
			progressDialog = null;
			progressDialog = new ProgressDialog(context);
			progressDialog.setCanceledOnTouchOutside(false);
		}
		progressDialog.setTitle(title);
		progressDialog.setMessage(message);
		//progressDialog.setCancelable(false);//xugang 20161019 changed
		progressDialog.show();
		//progressDialog.getWindow().setLayout(300, 200);
		
	}

	public static void dismissProgress() {
		if (progressDialog != null) {
			progressDialog.dismiss();
		}
	}

}
