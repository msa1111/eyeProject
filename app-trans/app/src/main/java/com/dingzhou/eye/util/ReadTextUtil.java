package com.dingzhou.eye.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ReadTextUtil {
	/**
	 * 将txt转化为list
	 * @param activity
	 * @param ResourceID
	 * @return
	 */
	public static List<String> getString(Activity activity, int ResourceID) {
		List<String> list = new ArrayList<String>();
		InputStream inputStream = activity.getResources().openRawResource(ResourceID);
		InputStreamReader inputStreamReader = null;
		try {
			inputStreamReader = new InputStreamReader(inputStream, "GBK");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		BufferedReader reader = new BufferedReader(inputStreamReader);
		// StringBuffer sb = new StringBuffer("");
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				list.add(line);
				// sb.append(line);
				// sb.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
