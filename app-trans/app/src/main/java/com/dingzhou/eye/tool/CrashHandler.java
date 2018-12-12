package com.dingzhou.eye.tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;

/**
 *
 */
public class CrashHandler implements UncaughtExceptionHandler {

	private UncaughtExceptionHandler mDefaultExceptionHandler;
	/**  */
	private static CrashHandler sInstance;

	/**
	 *
	 */

	public static CrashHandler getInstance() {
		if (sInstance == null) {
			synchronized (CrashHandler.class) {
				if (sInstance == null) {
					sInstance = new CrashHandler();
				}
			}
		}
		return sInstance;
	}

	private CrashHandler() {
	}

	//
	public void init() {

		mDefaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();

		Thread.setDefaultUncaughtExceptionHandler(this);

	}


	@Override
	public void uncaughtException(Thread thread, Throwable ex) {
		outputException(thread, ex);
		if (mDefaultExceptionHandler != null) {
			mDefaultExceptionHandler.uncaughtException(thread, ex);
		}
	}


	private void outputException(Thread thread, Throwable Throwed) {
		try {
			File dir = new File(Constants.PATH_LOG);
			if (!dir.exists()) {
				dir.mkdirs();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fos = new FileOutputStream(Constants.PATH_LOG + DateUtil.getFormatFileTime() + ".log");
			fos.write(formatStackTrace(Throwed).getBytes());
			fos.close();
		} catch (Throwable ex) {
		}
	}

	/***
	 *
	 */
	public String formatStackTrace(Throwable throwable) {
		if (throwable == null)
			return "";
		String rtn = throwable.getStackTrace().toString();
		try {
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			throwable.printStackTrace(printWriter);
			printWriter.flush();
			writer.flush();
			rtn = writer.toString();
			printWriter.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception ex) {
		}
		return rtn;
	}
}
