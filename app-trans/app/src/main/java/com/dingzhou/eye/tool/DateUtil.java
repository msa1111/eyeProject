package com.dingzhou.eye.tool;

import android.annotation.SuppressLint;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
@SuppressLint("SimpleDateFormat")
public class DateUtil {

	public static Date date = null;

	public static DateFormat dateFormat = null;

	public static Calendar calendar = null;


	public static Date parseDate(String dateStr, String format) {
		try {
			dateFormat = new SimpleDateFormat(format);
			if ((!dateStr.equals("")) && (dateStr.length() < format.length())) {
				dateStr += format.substring(dateStr.length()).replaceAll("[YyMmDdHhSs]", "0");
			}
			date = (Date) dateFormat.parse(dateStr);
		} catch (Exception e) {
		}
		return date;
	}


	public static Date parseDate(String dateStr) {
		return parseDate(dateStr, "yyyy/MM/dd");
	}

	static long getD_Value(Date startDate, Date endDate) {
		long temp = endDate.getTime() - startDate.getTime();
		long mins = temp / 1000 / 60;
		return mins;
	}


	public static Date parseCompleteDate(String dateStr) {
		return parseDate(dateStr, "yyyy-MM-dd HH:mm:ss");
	}


	public static String parseCompleteDate2(String dateStr) {
		String result = "";
		try {
			dateFormat = new SimpleDateFormat("HH:mm:ss");
			result = dateFormat.format(parseDate(dateStr, "yyyy-MM-dd HH:mm:ss"));
		} catch (Exception e) {
		}
		return result;
	}


	public static Date parseCompleteDate1(String dateStr) {
		return parseDate(dateStr, "yyyy/MM/dd HH:mm:ss");
	}


	public static String format(Date date, String format) {
		String result = "";
		try {
			if (date != null) {
				dateFormat = new SimpleDateFormat(format);
				result = dateFormat.format(date);
			}
		} catch (Exception e) {
		}
		return result;
	}


	public static String format(Date date) {
		return format(date, "yyyy/MM/dd");
	}


	public static int getYear(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}


	public static int getMonth(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}


	public static int getDay(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}


	public static String getYMD() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(now);
		// calendar = Calendar.getInstance();
		// return calendar.get(Calendar.YEAR) + "-"
		// + (calendar.get(Calendar.MONTH) + 1) + "-"
		// + calendar.get(Calendar.DAY_OF_MONTH);
	}


	public static int getHour(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}


	public static int getMinute(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}


	public static int getSecond(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}


	public static long getMillis(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}


	public static String getDate(Date date) {
		return format(date, "yyyy/MM/dd");
	}


	public static Date getDate(String dateString) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.parse(dateString);
	}
	

	public static Date getDate2(String dateString) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return df.parse(dateString);
	}


	public static String getDate1(Date date) {
		return format(date, "yyyy-MM-dd");
	}


	public static String getTime(Date date) {
		return format(date, "HH:mm:ss");
	}


	public static String getDateTime(Date date) {
		return format(date, "yyyy/MM/dd HH:mm:ss");
	}


	public static String getDateTime1(Date date) {
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}


	public static String getDateTime2(Date date) {
		return format(date, "yyyyMMddHHmmss");
	}


	public static String getDateTime3(Date date) {
		return format(date, "yyMMdd");
	}


	public static Date addDate(Date date, int day) {
		calendar = Calendar.getInstance();
		long millis = getMillis(date) + ((long) day) * 24 * 3600 * 1000;
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}


	public static Date diffDate(Date date, int day) {
		calendar = Calendar.getInstance();
		long millis = getMillis(date) - ((long) day) * 24 * 3600 * 1000;
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}


	public static String getMonthBegin(String strdate) {
		date = parseDate(strdate);
		return format(date, "yyyy-MM") + "-01";
	}


	public static String getMonthEnd(String strdate) {
		date = parseDate(getMonthBegin(strdate));
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return formatDate(calendar.getTime());
	}


	public static String formatDate(Date date) {
		return formatDateByFormat(date, "yyyy-MM-dd");
	}


	public static String formatDateByFormat(Date date, String format) {
		String result = "";
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}


	public static String getFormatNowTime() {
		Date date = new Date();
		return getDateTime1(date);

	}


	public static String getFormatFileTime() {
		Date date = new Date();

		return getDateTime2(date);

	}


	public static Date getDate(int count) {
		Calendar d = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		int day = d.get(Calendar.DAY_OF_MONTH);
		d.set(year, month, day + count);
		Date date = d.getTime();
		return date;
	}


	public static String transformDateFormat(String dateString) {
		if (!(dateString != null && !dateString.equals(""))) {
			return "";
		}
		String[] partArr = dateString.split(" |-|/");
		for (int i = 1; i < 3; i++) {
			if (partArr[i].length() == 1) {
				partArr[i] = "0" + partArr[i];
			}
		}
		return partArr[0] + "-" + partArr[1] + "-" + partArr[2] + " " + partArr[3];
	}


	public static String transformDateFormat1(String dateString) {
		if (!(dateString != null && !dateString.equals(""))) {
			return "";
		}
		Date date = parseDate(dateString, "yyyyMMddHHmmss");
		return getDateTime1(date);
	}


	public static String getSpecialDateStrStart(int type) {
		Calendar d = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		int day = d.get(Calendar.DAY_OF_MONTH);
		int whatDay = d.get(Calendar.DAY_OF_WEEK);
		if (whatDay == 1) {
			whatDay = 7;
		} else {
			whatDay--;
		}

		switch (type) {
		case 0:

			break;
		case 1:
			d.set(year, month, day - 1);
			break;
		case 2:
			d.set(year, month, day - (whatDay - 1));
			break;
		case 3:
			d.set(year, month, day - (whatDay - 1) - 7);
			break;
		}

		Date date = d.getTime();
		return getDate1(date) + " 00:00:00";
	}


	public static String getSpecialDateStrEnd(int type) {
		Calendar d = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		int day = d.get(Calendar.DAY_OF_MONTH);
		int whatDay = d.get(Calendar.DAY_OF_WEEK);
		if (whatDay == 1) {
			whatDay = 7;
		} else {
			whatDay--;
		}

		switch (type) {
		case 0:
			break;
		case 1:
			d.set(year, month, day - 1);
			break;
		case 2:
			d.set(year, month, day + (7 - whatDay));
			break;
		case 3:
			d.set(year, month, day - (whatDay));
			break;
		}

		Date date = d.getTime();
		return getDate1(date) + " 23:59:59";
	}
}
