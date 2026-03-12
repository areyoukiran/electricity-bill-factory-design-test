package firstpackage;

import org.apache.commons.lang3.time.DateUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

public class FormatUtils {
	//public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
	public static final String READABLE_DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * A copy of following constants are also available in ebilly.admin.shared.CommonUtil
	 * CommonUtil cannot be used in server side code due to gwt runtime classpath dependency.
	 */
	public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
	public static final String DEFAULT_YEAR_FORMAT = "dd/MM/yy";
	public static final String DEFAULT_DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm:ss a z"; //"dd/MM/yyyy hh:mm:ss a";
	public static final String SYSTEM_DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
	public static final String MONTH_YEAR = "MMM-yyyy";
	public static final String YEAR = "yyyy";
	public static final String MACHINE_DATE_FORMAT = "ddMMyyyy";
	private static final String MACHINE_MONTH_FORMAT = "MMM";
	private static final String MACHINE_YEAR_FORMAT = "yy";

	public static final String  MACHINE_DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm:ss a z";

	private static final SimpleDateFormat sDefaultDateFormat = new SimpleDateFormat(FormatUtils.DEFAULT_DATE_FORMAT);
	private static final SimpleDateFormat sSystemDateFormat = new SimpleDateFormat(FormatUtils.SYSTEM_DATE_TIME_FORMAT);
	private static final SimpleDateFormat sMachineDateFormat = new SimpleDateFormat(MACHINE_DATE_FORMAT);
	private static final SimpleDateFormat sMachineDateTimeFormat = new SimpleDateFormat(MACHINE_DATE_TIME_FORMAT);
	private static final SimpleDateFormat sDefaultYearFormat = new SimpleDateFormat(FormatUtils.DEFAULT_YEAR_FORMAT);

	/**
	 * Regular expression that filters non Ascii characters and non printable characters
	 */
	public static final String REGEX_ASCII_FILTER = "[^a-zA-Z0-9-_' .@]";

	public static String getFormattedDate(Date date) {
		if (date == null) return "";
		return sDefaultDateFormat.format(date);
	}

	public static Date getCurrentDate() {
		return new Date();
	}

	public static String getFormattedCurrentDate() {
		return FormatUtils.getFormattedDate(FormatUtils.getCurrentDate());
	}

	public static Date getDate(String date) {
		if (date == null) return null;
		try {
			return sDefaultDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace(); // to support in both server side and in android.
		}
		return null;
	}
	public static void byteArrayToFile(byte[] bArray,File fileName) {
		try {
			OutputStream out = new FileOutputStream(fileName,false);
			out.write(bArray);
			out.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	/**
	 * Returns the date time in IST zone in the format FormatUtils.SYSTEM_DATE_TIME_FORMAT.
	 * Eg: 27/07/2020 14:30:23
	 *
	 * @return
	 */
	public static String getFormattedCurrentDateTimeInIst() {
		return getFormattedDateTimeInIst(FormatUtils.getCurrentDate());
	}

	public static String getFormattedDateTimeInIstInMachineDateFormat(Date date) {
		if (date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(MACHINE_DATE_TIME_FORMAT);
		sdf.setTimeZone(TimeZone.getTimeZone("IST"));
		return sdf.format(date);
	}
	public static String getFormattedDateInMachineFormat(String date){
		if (date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		Date d = null;
		try {
			d = sdf.parse(date);
			sdf.applyPattern(MACHINE_DATE_FORMAT);
			//String dateformat = sdf.format(date);
			//d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//sdf.applyPattern(MACHINE_DATE_FORMAT);
		return sdf.format(d);
	}
	public static String getFormattedDateInYearFormat(String date){
		if (date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
		Date d = null;
		try {
			d = sdf.parse(date);
			sdf.applyPattern(DEFAULT_YEAR_FORMAT);
			//String dateformat = sdf.format(date);
			//d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//sdf.applyPattern(MACHINE_DATE_FORMAT);
		return sdf.format(d);
	}
	public static String getFormattedDateInDefaultFormat(String date){
		if (date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(MACHINE_DATE_FORMAT);
		Date d = null;
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sdf.applyPattern(DEFAULT_DATE_FORMAT);
		if(d == null){
			return getFormattedDateInMachineFormat(date);
		}
		return sdf.format(d);
	}
	public static String convertToIndianCurrency(String num) {
		BigDecimal bd = new BigDecimal(num);
		long number = bd.longValue();
		long no = bd.longValue();
		int decimal = (int) (bd.remainder(BigDecimal.ONE).doubleValue() * 100);
		int digits_length = String.valueOf(no).length();
		int i = 0;
		ArrayList<String> str = new ArrayList<>();
		HashMap<Integer, String> words = new HashMap<>();
		words.put(0, "Zero");
		words.put(1, "One");
		words.put(2, "Two");
		words.put(3, "Three");
		words.put(4, "Four");
		words.put(5, "Five");
		words.put(6, "Six");
		words.put(7, "Seven");
		words.put(8, "Eight");
		words.put(9, "Nine");
		words.put(10, "Ten");
		words.put(11, "Eleven");
		words.put(12, "Twelve");
		words.put(13, "Thirteen");
		words.put(14, "Fourteen");
		words.put(15, "Fifteen");
		words.put(16, "Sixteen");
		words.put(17, "Seventeen");
		words.put(18, "Eighteen");
		words.put(19, "Nineteen");
		words.put(20, "Twenty");
		words.put(30, "Thirty");
		words.put(40, "Forty");
		words.put(50, "Fifty");
		words.put(60, "Sixty");
		words.put(70, "Seventy");
		words.put(80, "Eighty");
		words.put(90, "Ninety");
		String digits[] = {"", "Hundred", "Thousand", "Lakh", "Crore"};
		while (i < digits_length) {
			int divider = (i == 2) ? 10 : 100;
			number = no % divider;
			no = no / divider;
			i += divider == 10 ? 1 : 2;
			if (number > 0) {
				int counter = str.size();
				String plural = (counter > 0 && number > 9) ? "s" : "";
				String tmp = (number < 21) ? words.get(Integer.valueOf((int) number)) + " " + digits[counter] + plural : words.get(Integer.valueOf((int) Math.floor(number / 10) * 10)) + " " + words.get(Integer.valueOf((int) (number % 10))) + " " + digits[counter] + plural;
				str.add(tmp);
			} else {
				str.add("");
			}
		}

		Collections.reverse(str);
		String Rupees = String.join(" ", str).trim();

		String paise = (decimal) > 0 ? " And Paise " + words.get(Integer.valueOf((int) (decimal - decimal % 10))) + " " + words.get(Integer.valueOf((int) (decimal % 10))) : "";
		return "Rupees " + Rupees + paise + " Only";
	}

	public static String inWords(String value) {
		try {
			double d = Double.parseDouble(value);
			String s = ((int)Math.floor(d))+"";
			StringBuffer b = new StringBuffer();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				switch (c) {
					case '1':
						b.append(" ONE");
						break;
					case '2':
						b.append(" TWO");
						break;
					case '3':
						b.append(" THREE");
						break;
					case '4':
						b.append(" FOUR");
						break;
					case '5':
						b.append(" FIVE");
						break;
					case '6':
						b.append(" SIX");
						break;
					case '7':
						b.append(" SEVEN");
						break;
					case '8':
						b.append(" EIGHT");
						break;
					case '9':
						b.append(" NINE");
						break;
					case '0':
						b.append(" ZERO");
						break;
				}
			}
			return b.toString().trim();
		} catch (Exception e) {}
		return "";
	}
	/**
	 * Returns the date in IST zone in the format FormatUtils.SYSTEM_DATE_TIME_FORMAT.
	 * Eg: 27/07/2020 14:30:23
	 *
	 * @return
	 */
	public static String getFormattedDateTimeInIst(Date date) {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			//c.setTime(new Date(System.currentTimeMillis()+(5*60*60*1000)));
			StringBuffer sb = new StringBuffer();

			// dd/MM/yyyy hh:mm:ss a z
			// Reason for not using SimpleDateFormat is because on each platform (Java and Android)
			// time zone is represented as three letter code or offset or both three letter code and offset.
			// which is unpredictable to parse.
			int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
			int monthOfYear = 1 + c.get(Calendar.MONTH);
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			//int amPm = c.get(Calendar.AM_PM);
			sb.append(dayOfMonth<10?"0"+dayOfMonth:dayOfMonth).append("/");
			sb.append(monthOfYear<10?"0"+monthOfYear:monthOfYear).append("/");
			sb.append(c.get(Calendar.YEAR)).append(" ");
			sb.append(hour<10?"0"+hour:hour).append(":");
			sb.append(minute<10?"0"+minute:minute).append(":");
			sb.append(second<10?"0"+second:second).append(" ");
			//sb.append(amPm==0?"AM":"PM").append(" ").append("IST");
			return sb.toString();

			/*SimpleDateFormat sdf = new SimpleDateFormat(SYSTEM_DATE_TIME_FORMAT);
			sdf.setTimeZone(TimeZone.getTimeZone("IST"));
			return sdf.format(FormatUtils.getCurrentDate());*/
		} catch (Throwable t) {
			//Logger.getLogger("FormatUtils").info("Exception in getFormattedCurrentDateTimeInIst", t);
		}
		return "";
	}

	/**
	 * Prepends 0's before the given number. Number of 
	 * 0's prepended can be speicified in the param numZeros
	 * 
	 * Eg: n =   12, places=3 return value: 012
	 * Eg: n =  230, places=3 return value: 230
	 * @param n
	 * @param places
	 * @return
	 */
	public static String numberPadding(String n, int places) {
		int number = 0;
		try {
			number = Integer.parseInt(n);
		} catch(NumberFormatException nfe) {
		}
		String s = number+"";
		StringBuffer sb = new StringBuffer();
		for (int i = s.length(); i < places; i++) {
			sb.append("0");
		}
		return sb.append(s).toString();
	}

	/**
	 * Pads 0's upto two decimal places. 
	 * Also truncates beyond two decimal places
	 * 
	 * eg: input 100 returns 100.00
	 *     input .21 returns 0.21
	 *     input .7 returns 0.70
	 *     input 12.3212 return 12.32
	 * 
	 * @param d
	 * @return
	 */
	public static String decimalPadding(String d) {
		if (d == null || d.equalsIgnoreCase("null")) return "0.00";
		if (d.trim().isEmpty()) return "0.00";
		
		// Padding zeros to 2 places
		StringBuffer s = new StringBuffer(d.trim());
		int decIndex = (s.indexOf("."));
		if (s.length() == 0) {
			s.append("0.00");
			return s.toString();
		}
		
		if (s.toString().startsWith(".")) {
			s = new StringBuffer("0");
			s.append(d.trim());
			decIndex = s.indexOf(".");
		}
		int expoIndex = (s.indexOf("E"));
		if (decIndex == -1) {
			s.append(".00");
		} else if(expoIndex > 0){
			BigDecimal bd = new BigDecimal(s.toString());
			s = new StringBuffer(bd.toPlainString());
		} else{
			String dec = s.substring(decIndex+1);
			if (dec.length() < 2) {
				for (int i = dec.length(); i < 2; i++ ) {
					s.append("0");
				}
			} else if (dec.length() > 2) {
				s = new StringBuffer(s.substring(0,decIndex+1));
				s.append(dec.substring(0, 2));
			}
		}
		return s.toString();
	}
	
	/**
	 * Given 1000.00 returns 1,000.00
	 * @param d
	 * @return
	 */
	public static String amountFormat(String d) {
		if (d == null) return "";
		d = d.trim();

		boolean isCrores = Boolean.FALSE;
		boolean signed = false;
		if (d.contains("E") || d.length() > 7) {
			double amount = Double.parseDouble(d);
			amount = amount / 10000000;
			d = String.valueOf(amount);
			isCrores = Boolean.TRUE;
		}

		if (Double.parseDouble(d) < 0) {
			signed = true;
			d = d.substring(1); // rip sign character
		}

		StringBuffer fAmt = new StringBuffer();
		if (isCrores) {
			fAmt.append("Cr ");
		}
		if (signed) {
			fAmt.append("-");
		}

		StringBuffer sb = new StringBuffer();
		sb.append(d);

		int decIndex = sb.indexOf(".");
		if (decIndex == -1) decIndex = sb.length();
		int pos = -1;
		for ( int i = decIndex; i > 0; i--) {
			pos++;
			if (pos % 3 == 0 && pos != 0) {
				sb.insert(i, ",");
			}
		}

		fAmt.append(sb);
		return fAmt.toString();
	}

	
	public static String listAsCsv(List<String> list) {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			String li = list.get(i);
			if (li == null) li = "";
			s.append(li);
			if ( i < list.size() -1 ) {
				s.append(",");
			}
		}
		return s.toString();
	}
	
	public static List<String> csvAsList(String csv) {
		if (csv == null || csv.trim().length() == 0) return new ArrayList<String>();
		List<String> s = new ArrayList<String>();
		String[] vs = csv.split(",");
		for (String v : vs) {
			s.add(v);
		}
		return s;
	}
	
	private static int SVC_LENGTH = 13;
	public static List<String> parseAglServices(String services) {
		List<String> l = new ArrayList<String>();
		if (services == null || services.trim().length() == 0) {
			return l;
		}
		services = services.trim();
		if (services.length() % SVC_LENGTH != 0) {
			l.add(services);
			return l;
		}
		for (int i = 0; i+SVC_LENGTH <= services.length(); i += SVC_LENGTH) {
			l.add(services.substring(i,i+SVC_LENGTH));
		}
		return l;
	}
	
	public static String formatAglServicesForExport(String aglServices) {
		int numServices = 11;
		List<String> serviceList = FormatUtils.parseAglServices(aglServices);
		StringBuffer r = new StringBuffer();
		if (serviceList.isEmpty()) return r.toString();
		for (int i = 0; i < numServices; i++) {
			String service = null;
			if (serviceList.size() > i) {
				service = serviceList.get(i);
				if (service != null) service = service.trim();
			}
			if (service == null) {
				r.append("             ");
			} else {
				r.append(service);
			}
			
			if (i < numServices - 1) {
				r.append(":");
			}
		}
		return r.toString();
	}
	
	/**
	 * 
	 * @param sysFormatDate
	 * @return
	 */
	public static String getReadableDateFromSystemDate(String sysFormatDate) {
		SimpleDateFormat machineFormat = new SimpleDateFormat(MACHINE_DATE_FORMAT);
		SimpleDateFormat readableDateFormat = new SimpleDateFormat(READABLE_DATE_FORMAT);
		
		try {
			return readableDateFormat.format(machineFormat.parse(sysFormatDate));
		} catch (Exception e) {}
		return "";
	}

	public static boolean isEmpty(String value) {
		return value == null || value.trim().length() == 0 || value.equals("null");
	}
	public static boolean isEmptyString(String value) {
		return value == null || value.trim().length() == 0 ;
	}

	public static boolean isEmpty(CharSequence value) {
		return value == null || value.toString().trim().length() == 0;
	}

	/**
	 * Return radix 26 number represented in string for the given number.
	 * Eg: Returns
	 *     A for 0
	 *     B for 1
	 *     Z for 25
	 *    AA for 26
	 *    AB for 27 etc.
	 *
	 * @param number
	 * @return
	 */
	public static String toAlphabeticRadix(long number) {
		char[] str = Long.toString(number, 26).toCharArray();
		for (int i = 0; i < str.length; i++) {
			str[i] += str[i] > '9' ? 10 : 49;
		}
		return new String(str).toUpperCase();
	}

	/**
	 * Returns a number for a given alphabet.
	 * Eg:
	 *   0 for 'a'
	 *   1 for 'b'
	 *   25 for 'z'
	 *   0 for 'A'
	 *   0 for '0'
	 *   5 for '5'
	 *
	 * @param alphabet
	 * @return
	 */
	public static long toNumberFromAlphabet(char alphabet) {
		if (alphabet >= '0' && alphabet <= '9') {
			return alphabet - '0';
		}
		if (alphabet >= 'A' && alphabet <= 'Z') {
			return (alphabet - 'A') + 1;
		}
		if (alphabet >= 'a' && alphabet <= 'z') {
			return (alphabet - 'a') + 1;
		}
		return 0;
	}

	/**
	 * Returns a number for the given string. Converts each character in the given alnum
	 * into a number and returns the concatinated number.
	 *
	 * Eg: for 900ABC returns 900012
	 *
	 * @param alnum
	 * @return
	 */
	public static long parseAlphanumericToNumber(String alnum) {
		if (FormatUtils.isEmpty(alnum)) return 0;
		alnum = alnum.trim();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < alnum.length(); i++) {
			sb.append(toNumberFromAlphabet(alnum.charAt(i)));
		}
		return asLong(sb.toString());
	}

	/*public static Date getCurrentDateByFormat(String dateFormat) {
		if (isEmpty(dateFormat)) {
			dateFormat = DEFAULT_DATE_FORMAT;
		}

		Timestamp timestamp = new Timestamp(getCurrentDate().getTime());
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		String dateString = formatter.format(timestamp);
		return formatter.parse(dateString, new ParsePosition(0));
	}*/

	/*public static final Date getCurrentDate() {
		return new Date(System.currentTimeMillis());
	}*/

	/**
	 *
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date addDaysToDate(Date date, int days) {
		return DateUtils.addDays(date, days);
	}

	/**
	 * https://stackoverflow.com/questions/1086123/string-conversion-to-title-case
	 * @param input
	 * @return
	 */
	public static String toTitleCase(String input) {
		StringBuilder titleCase = new StringBuilder(input.length());
		boolean nextTitleCase = true;

		for (char c : input.toCharArray()) {
			if (Character.isSpaceChar(c)) {
				nextTitleCase = true;
			} else if (nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}

			titleCase.append(c);
		}

		return titleCase.toString();
	}

	public static String trim(String value) {
		if (FormatUtils.isEmpty(value)) return null;
		return value.trim();
	}

	public static int asInteger(String intString) {
		if (FormatUtils.isEmpty(intString)) return 0;
		try {
			return Integer.parseInt(intString);
		} catch (NumberFormatException e) {
			//Log.i("Util","NumberFormatException parsing string: "+intString, e);
			return 0;
		}
	}
	public static int asIntegerFromString(String value){
		if (FormatUtils.isEmpty(value)) return 0;
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			try {
				double doubleValue = Double.parseDouble(value);
				return (int) Math.round(doubleValue);
			} catch (NumberFormatException de) {
				return 0;
			}
		}
	}

	public static long asLong(String longString) {
		if (FormatUtils.isEmpty(longString)) return 0;
		try {
			return Long.parseLong(longString);
		} catch (NumberFormatException e) {
			//Log.i("Util","NumberFormatException parsing string: "+longString, e);
			return 0;
		}
	}

	public static double asDouble(String doubleString) {
		if (FormatUtils.isEmpty(doubleString)) return 0;
		try {
			return Double.parseDouble(doubleString);
		} catch (NumberFormatException e) {
			//Log.i("Util","NumberFormatException parsing string: "+longString, e);
			return 0;
		}
	}

	/**
	 * WARNING: THIS IS THE HEART OF DATA EXPORT AND IMPORT INTO DEVICES. ANY CHANGE IN THIS METHOD HAS
	 * TO BE THOROUGHLY TESTED BEFORE RELEASE.
	 *
	 * @param out
	 * @param fieldName
	 * @param fieldValue
	 * @param fProps
	 */
	public static void formatFieldText(StringBuffer out, String fieldName,
									   String fieldValue, FormatProps fProps) {
		if (fProps == null) {
			throw new NullPointerException("FormatProps missing for fieldName: "+fieldName);
		}
		if (fieldValue == null || fieldValue.trim().length() == 0) {
			fieldValue = "";
		}
		String replaceAllRegExp = fProps.replaceAllRegEx;
		if (replaceAllRegExp != null) {
			fieldValue = fieldValue.replaceAll(replaceAllRegExp,"");
		}
		boolean isNumberField = fProps.isNumberField();
		boolean isLeftPad = fProps.isLeftPaddingRequired();
		boolean isDateField = fProps.isDateField();
		boolean isDecimalField = fProps.isDecimalField();
		boolean outputBlankIfEmpty = fProps.isExportBlankIfEmpty();
		int fieldLength = fProps.fieldLenght;
		char paddingChar = fProps.getPaddingCharacter();

		if (outputBlankIfEmpty && fieldValue.trim().length() == 0) {
			fieldValue = "";
		} else if (isDateField) {
			fieldValue = FormatUtils.getExportFormatDateFromSystemDate(fieldValue);
		} else if (isDecimalField) {
			fieldValue = FormatUtils.decimalPadding(fieldValue);
		} else if (!outputBlankIfEmpty && fieldValue.trim().length() == 0 && isNumberField) {
			fieldValue = "0";
		}

		if (fieldLength < fieldValue.length()) {
			fieldValue = fieldValue.substring( (fieldValue.length() - fieldLength) ,fieldValue.length());
		}

		/*if (fieldLength < fieldValue.length()) {
			throw new IllegalArgumentException("Field value greater than allowed lenght: "+fieldLength+
					", FieldName: "+fieldName+", FieldValue: "+fieldValue);
		}*/

		String sign = "";
		if (isNumberField) {
			try {
				long number = Long.parseLong(fieldValue);
				if (number < 0) {
					sign = "-";
					fieldValue = "" + Math.abs(number);
				}
			} catch(Throwable t) {}
		}

		if (isLeftPad) {
			if (!FormatUtils.isEmpty(sign)) {

				out.append(sign).append(pad( (fieldLength-fieldValue.length())-1, paddingChar)).append(fieldValue);
			} else {
				out.append(pad( fieldLength-fieldValue.length(), paddingChar)).append(fieldValue);
			}
		} else {
			out.append(fieldValue).append(
					pad( fieldLength-fieldValue.length() , paddingChar));
		}
		// Trim chars if excess fieldLenght
		out.setLength(fProps.fieldLenght);
	}

	private static String pad(int numSpaces, char paddingChar) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < numSpaces; i++) {
			sb.append(paddingChar);
		}
		return sb.toString();
	}

	public static String getExportFormatDateFromSystemDate(String sysFormatDate) {
		SimpleDateFormat machineFormat = new SimpleDateFormat(MACHINE_DATE_FORMAT);
		SimpleDateFormat readableDateFormat = new SimpleDateFormat(ServiceColumns.EXPORT_DATE_FORMAT);
		try {
			return readableDateFormat.format(machineFormat.parse(sysFormatDate));
		} catch (Exception e) {}
		return "";
	}

	/**
	 * Returns elapsed time in human readable text.
	 * Eg: 1 hour
	 *     8 hours
	 *    15 minutes
	 *    just now
	 *
	 * @param sinceDate
	 * @return
	 */
	public static String getElapsedTimeSinceMilliSeconds(Date sinceDate) {
		long timeInMilliSeconds = Math.abs(System.currentTimeMillis() - sinceDate.getTime());
		return String.valueOf(timeInMilliSeconds);
	}

	public static String getElapsedTimeSince(Date sinceDate) {
		long timeInMilliSeconds = Math.abs(System.currentTimeMillis() - sinceDate.getTime());
		long seconds = timeInMilliSeconds / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		StringBuffer sb = new StringBuffer();
		if (days > 0) {
			sb.append(days).append(" days ");
		}
		if (hours > 0) {
			sb.append(hours%24);
			sb.append("h ");
		}
		if (minutes > 0) {
			sb.append(minutes%60);
			sb.append("m ");
		}
		if (seconds > 0) {
			sb.append(seconds%60);
			sb.append("s ");
		} else {
			sb.append("just now");
		}
		return sb.toString();
	}

	/**
	 * Returns date by truncating the time value for the given date
	 *
	 * @param date
	 * @return
	 */
	public static Date truncTime(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	/**
	 * Returns the beginning day of current month.
	 *
	 * @return
	 */
	public static Date getBeginningDateOfMonth() {
		/*Calendar c = Calendar.getInstance();
		c.setTime(FormatUtils.getCurrentDate());
		return FormatUtils.truncTime(FormatUtils.addDaysToDate(FormatUtils.getCurrentDate(), -1 * c.get(Calendar.DAY_OF_MONTH)));*/
		return getBeginningDateOf(FormatUtils.getCurrentDate());
	}
	/**
	 * Returns the beginning day of current month.
	 *
	 * @return
	 */
	public static Date getDaysBackDateOfMonth(int daysBack) {
		return FormatUtils.truncTime(FormatUtils.addDaysToDate(FormatUtils.getCurrentDate(),-1*daysBack));
		//return getBeginningDateOf(FormatUtils.getCurrentDate());
	}

	/**
	 * Returns the beginning day of month for the givenDate.
	 *
	 * @param givenDate
	 * @return
	 */
	public static Date getBeginningDateOf(Date givenDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(givenDate);
		return FormatUtils.truncTime(FormatUtils.addDaysToDate(FormatUtils.getCurrentDate(),
				-1 * ( c.get(Calendar.DAY_OF_MONTH) - 1) ));
	}

	//[[Begin of FUNCTIONS REFACTORED FROM ebilly.device.util.Util class]]
	public static String getCurrentDateInReadableFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat(READABLE_DATE_FORMAT);
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String getCurrentDateInDefaultFormat() {
		SimpleDateFormat sdf = sDefaultDateFormat;
		return sdf.format(FormatUtils.getCurrentDate());
	}
	public static boolean isFutureDate(String rdate){
		boolean isFuturedate = false;
		SimpleDateFormat sdf = sDefaultDateFormat;
		try {
			Date date = sdf.parse(rdate);
			Date currentDate = sdf.parse(sdf.format(new Date())); // Parse current date in the same format for accurate comparison
			if(date.after(currentDate)){
				isFuturedate = true;
			}
		}catch(Exception e){
		}
		return isFuturedate;

	}
	public static String getCurrentDateInSystemDateFormat() {
		SimpleDateFormat sdf = sSystemDateFormat;
		//return sdf.format(new Date(System.currentTimeMillis()));
		return sdf.format(FormatUtils.getCurrentDate());
	}
	public static String getCurrentDateInMachineFormat() {
		SimpleDateFormat sdf = sMachineDateFormat;
		//return sdf.format(new Date(System.currentTimeMillis()));
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String getCurrentDateTimeInMachineFormat() {
		SimpleDateFormat sdf = sMachineDateTimeFormat;
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String getFormattedDateInMachineFormat(Date date) {
		SimpleDateFormat sdf = sMachineDateFormat;
		return sdf.format(date);
	}
	public static String getCurrentTimeInSimpleFormat(){
		return new SimpleDateFormat("HH:mm").format(new Date().getTime());
	}

	public static String getCurrentTimeInMachineFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat(ServiceColumns.MACHINE_TIME_FORMAT);
		//return sdf.format(new Date(System.currentTimeMillis()));
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String getFormattedTimeInMachineFormat(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(ServiceColumns.MACHINE_TIME_FORMAT);
		return sdf.format(date);
	}


	public static String getFileNameTimeStamp() {
		SimpleDateFormat sdf = new SimpleDateFormat(MACHINE_DATE_FORMAT+"HHmmss");
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String getFileNamePrefixTimeStamp() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'-'MM'-'dd'-'HH'-'mm'-'ss");
		return sdf.format(FormatUtils.getCurrentDate());
	}

	public static String addDaysAndFormatDaysMonth(String dateString, int days) {
		SimpleDateFormat sdf = sDefaultDateFormat;
		try {
			Date date = sdf.parse(dateString);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			Date newDate = cal.getTime();
			SimpleDateFormat daysMonthSdf = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
			return daysMonthSdf.format(newDate);
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to add days to date: "+dateString, e);
			e.printStackTrace();
		}
		return dateString;
	}

	public static List<String> HOLIDAYS = new ArrayList<String>(Arrays.asList(
			//2020
			"19/08/2022","31/08/2022",
			"03/10/2022","05/10/2022","24/10/2022"
	));

	/**
	 * Returns a next work day if it happens that given date is a holiday.
	 * Refer the holidays list in Util.HOLIDAYS
	 * @param date
	 * @return
	 */
	public static String adjustDateToWorkingDay(String date) {
		String dateAfterHolidays = date;
		int index = HOLIDAYS.indexOf(date);
		if(index >= 0){
			dateAfterHolidays = FormatUtils.addDaysAndFormatDaysMonth(date,1);
			for(int i = index+1; i < 5; i++) {
				if(!dateAfterHolidays.equals(HOLIDAYS.get(i))) break;
				dateAfterHolidays = FormatUtils.addDaysAndFormatDaysMonth(dateAfterHolidays,1);
			}
		}
		//check this is sunday or not
		int sundayWeek = Calendar.SUNDAY;
		Calendar cal = Calendar.getInstance();
		Date presentDate = FormatUtils.asDefaultDate(dateAfterHolidays);
		cal.setTime(presentDate);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek == sundayWeek){
			dateAfterHolidays = FormatUtils.addDaysAndFormatDaysMonth(dateAfterHolidays,1);
		}

		return dateAfterHolidays;
	}

	/**
	 * Rounds the decimal part at 2nd decimal place
	 * eg: 12.39999999999 returns 12.40
	 * eg: 12.37888888888 returns 12.38
	 */
	public static double roundDec2(double r) {
		int sign = 1;
		if (r < 0) sign = -1*sign;
		return ((int)((r + sign*0.005)*100))/100.0;
	}

	/**
	 * Rounds the decimal part at 2nd decimal place
	 * eg: 12.39999999999 returns 12.40
	 * eg: 12.37888888888 returns 12.38
	 */
	public static double roundDec4(double r) {
		int sign = 1;
		if (r < 0) sign = -1*sign;
		return (((int)((r + sign*0.00005)*10000))/10000.0);
	}

	/**
	 * Rounds the decimal part at 2nd decimal place
	 * eg: 12.39999999999 returns 12.40
	 * eg: 12.37888888888 returns 12.38
	 */
	public static String roundDec2(String r) {
		if (r == null) return null;
		String pValue = r.trim();
		boolean isPrefixedWithCr = false;
		if (pValue.startsWith("Cr")) {
			pValue = pValue.substring("Cr".length());
			isPrefixedWithCr = true;
		}
		double d = Double.parseDouble(pValue);
		int sign = 1;
		if (d < 0) sign = -1*sign;
		String rounded = "" + (((int)((d + sign*0.005)*100))/100.0);
		if (isPrefixedWithCr) {
			return "Cr "+rounded;
		} else {
			return rounded;
		}
	}

	public static double sigma(String[] items) {
		double sigma = 0;
		for(String i : items) {
			try {
				//sigma += Long.parseLong(i);
				sigma += Double.parseDouble(i);
			}catch(Exception e) {}
		}
		return sigma;
	}

	public static int deltaMonths(String dateString1, String dateString2) {

		SimpleDateFormat sdf = sDefaultDateFormat;
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);

			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			if (date1.before(date2)) {
				c1.setTime(date1);
				c2.setTime(date2);
			} else {
				c1.setTime(date2);
				c2.setTime(date1);
			}

			int month1 = c1.get(Calendar.MONTH) + 1;
			int month2 = c2.get(Calendar.MONTH) + 1;

			int year1 = c1.get(Calendar.YEAR);
			int year2 = c2.get(Calendar.YEAR);
			int deltaYears = year2 - year1;
			if (deltaYears == 0) {
				return Math.abs(month1 - month2);
			} else if (deltaYears == 1) {
				return (12 - month1) + (month2);
			} else {
				return (12 - month1) + ((deltaYears-1)*12) + (month2);
			}

			/*long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			double deltaMonths = ((double)deltaMillies)/(30*24*60*60*1000.0);
			int returnValue = (int)Math.round(deltaMonths);
			if (returnValue == 0) { // In case of days less than 30 then count as one month.
				returnValue = (int)Math.ceil(Math.abs(deltaMonths));
			} else {
				//TODO: FOR THIS CASE UNIT TESTS ARE NOT MODIFIED.

				// OBSERVATION: ON ANALOGICS CALENDAR MONTHS ARE CONSIDERED.
				// SO DISCARDING THE FRACTIONS IN MONTHS.
				// DATE: 2017Feb27
				//returnValue = (int)Math.round(Math.abs(deltaMonths));
			}
			return returnValue;*/
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaMonths for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
		}
		return 0;
	}

	public static int deltaDefaultFormatMonths(String dateString1, String dateString2) {

		SimpleDateFormat sdf = sDefaultDateFormat;
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);

			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			if (date1.before(date2)) {
				c1.setTime(date1);
				c2.setTime(date2);
			} else {
				c1.setTime(date2);
				c2.setTime(date1);
			}

			int month1 = c1.get(Calendar.MONTH) + 1;
			int month2 = c2.get(Calendar.MONTH) + 1;

			int year1 = c1.get(Calendar.YEAR);
			int year2 = c2.get(Calendar.YEAR);
			int deltaYears = year2 - year1;
			if (deltaYears == 0) {
				return Math.abs(month1 - month2);
			} else if (deltaYears == 1) {
				return (12 - month1) + (month2);
			} else {
				return (12 - month1) + ((deltaYears-1)*12) + (month2);
			}

			/*long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			double deltaMonths = ((double)deltaMillies)/(30*24*60*60*1000.0);
			int returnValue = (int)Math.round(deltaMonths);
			if (returnValue == 0) { // In case of days less than 30 then count as one month.
				returnValue = (int)Math.ceil(Math.abs(deltaMonths));
			} else {
				//TODO: FOR THIS CASE UNIT TESTS ARE NOT MODIFIED.

				// OBSERVATION: ON ANALOGICS CALENDAR MONTHS ARE CONSIDERED.
				// SO DISCARDING THE FRACTIONS IN MONTHS.
				// DATE: 2017Feb27
				//returnValue = (int)Math.round(Math.abs(deltaMonths));
			}
			return returnValue;*/
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaMonths for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * Returns delta days between two date strings. Date is expected in the format Utils.MACHINE_DATE_FORMAT.
	 *
	 * @param dateString1
	 * @param dateString2
	 * @return
	 */
	public static int deltaDays(String dateString1, String dateString2) {
		return Math.abs(deltaDaysDirectional(dateString1, dateString2));
	}
	public static int getMonthByDate(String dateString1){
		SimpleDateFormat sdf = sMachineDateFormat;
		if (FormatUtils.isEmpty(dateString1)) return 0;
		try {
			Date date = sdf.parse(dateString1);
			Calendar cal = Calendar.getInstance(); cal.setTime(date);
			return 1+cal.get(Calendar.MONTH);
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaDaysDirectional for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
			return 0;
		}
	}

	public static double diffInDaysDirectional(String dateString1, String dateString2) {
		SimpleDateFormat sdf = sDefaultDateFormat;
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			//long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			long deltaMillies = date1.getTime() - date2.getTime();
			double deltaDays = ((double)deltaMillies)/(24*60*60*1000.0);
			return (deltaDays); // truncating fractions deliberately. Do not round!!
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int deltaDaysDirectional(String dateString1, String dateString2) {
		SimpleDateFormat sdf = sDefaultDateFormat;
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			//long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			long deltaMillies = date1.getTime() - date2.getTime();
			double deltaDays = ((double)deltaMillies)/(24*60*60*1000.0);
			return (int)Math.ceil(deltaDays); // truncating fractions deliberately. Do not round!!
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaDaysDirectional for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
			return 0;
		}
	}
	public static int deltaMachineDaysDirectional(String dateString1, String dateString2) {
		SimpleDateFormat sdf = sMachineDateFormat;
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			//long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			long deltaMillies = date1.getTime() - date2.getTime();
			double deltaDays = ((double)deltaMillies)/(24*60*60*1000.0);
			return (int)Math.ceil(deltaDays); // truncating fractions deliberately. Do not round!!
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaDaysDirectional for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
			return 0;
		}
	}

	public static String getReadableMonth(String date) {
		SimpleDateFormat sdf = sDefaultDateFormat;
		SimpleDateFormat monthFormat = new SimpleDateFormat(MACHINE_MONTH_FORMAT);

		try {
			return monthFormat.format(sdf.parse(date));
		} catch (Exception e) {}
		return "";
	}

	public static String getReadableYear(String date) {
		return FormatUtils.getReadableYear(date, MACHINE_YEAR_FORMAT);
	}

	public static String getReadableYear(String date, String format) {
		SimpleDateFormat sdf = sDefaultDateFormat;
		SimpleDateFormat yearFormat = new SimpleDateFormat(format);

		try {
			return yearFormat.format(sdf.parse(date));
		} catch (Exception e) {}
		return "";
	}

	/**
	 * Returns Date value for the given string in the format Util.MACHINE_DATE_FORMAT
	 * @param date
	 * @return
	 */
	public static Date asDefaultDate(String date) {
		if (FormatUtils.isEmpty(date)) return null;
		SimpleDateFormat sdf = sDefaultDateFormat;
		try {
			return sdf.parse(date);
		} catch (ParseException e) { }
		return null;
	}
	/**
	 * Returns Date value for the given string in the format Util.MACHINE_DATE_FORMAT
	 * @param date
	 * @return
	 */
	public static Date asDefaultFormatDate(String date) {
		if (FormatUtils.isEmpty(date)) return null;
		SimpleDateFormat sdf = sDefaultDateFormat;
		try {
			return sdf.parse(date);
		} catch (ParseException e) { }
		return null;
	}
	/**
	 * Returns Date value for the given string in the format Util.MACHINE_DATE_FORMAT
	 * @param date
	 * @return
	 */
	public static Date asMachineFormatDate(String date) {
		if (FormatUtils.isEmpty(date)) return null;
		SimpleDateFormat sdf = sMachineDateFormat;
		try {
			return sdf.parse(date);
		} catch (ParseException e) { }
		return null;
	}
	/**
	 * Returns Date and Time value for the given string in the format Util.MACHINE_DATE_TIME_FORMAT
	 * @param date
	 * @return
	 */
	public static Date asDateTime(String date) {
		if (FormatUtils.isEmpty(date)) return null;
		SimpleDateFormat sdf = sMachineDateTimeFormat;
		try {
			return sdf.parse(date);
		} catch (ParseException e) { }
		return null;
	}

	/**
	 * Returns true if thisDate is between beginDate and endDate not inclusive.
	 *
	 * @param thisDate
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	public static boolean isDateBetweenDates(String thisDate, String beginDate, String endDate) {
		Date thisDt = FormatUtils.asMachineFormatDate(thisDate);
		Date beginDt = FormatUtils.asMachineFormatDate(beginDate);
		Date endDt = FormatUtils.asMachineFormatDate(endDate);
		return beginDt.before(thisDt) && endDt.after(thisDt);
	}

	/**
	 * Returns the financial year beginning date for the given dateString.
	 *
	 * @param dateString in the format FormatUtils.MACHINE_DATE_FORMAT
	 * @return String representation of date value in the format FormatUtils.MACHINE_DATE_FORMAT
	 */
	public static String financialYearBeginDate(String dateString) {
		String year = FormatUtils.getReadableYear(dateString, "yyyy");
		return "0104"+year;
	}
	/**
	 * Returns the financial year beginning date for the given dateString.
	 *
	 * @param dateString in the format FormatUtils.MACHINE_DATE_FORMAT
	 * @return String representation of date value in the format FormatUtils.MACHINE_DATE_FORMAT
	 */
	public static String financialYearBeginDateInMachine(String dateString) {
		String year = FormatUtils.getReadableYear(dateString, "yyyy");
		return "01/04/"+year;
	}

	/**
	 * Returns the financial year end date for the given dateString.
	 *
	 * @param dateString in the format FormatUtils.MACHINE_DATE_FORMAT
	 * @return String representation of date value in the format FormatUtils.MACHINE_DATE_FORMAT
	 */
	public static String financialYearEndDate(String dateString) {
		String year = FormatUtils.getReadableYear(dateString, "yyyy");
		return "31/03/"+year;
	}

	public static int ensurePostiveOrZeroInt(int value) {
		return value < 0 ? 0 : value;
	}

	public static double ensurePostiveOrZeroDouble(double value) {
		return value < 0 ? 0 : value;
	}
//1KW=1HP*0.75
	public static double convertHpToWatts(double hpValue) {
		return hpValue * .75;
	}

	public static double convertWattsToHP(double wattValue) {
		return wattValue/ .75;
	}

	/**
	 * changes dateTime date string in fromTimeZone into toTimeZone date string.
	 * Expects dateTime string in the format Util.MACHINE_DATE_TIME_FORMAT
	 *
	 * @param dateTime string in the format Util.MACHINE_DATE_TIME_FORMAT
	 * @param fromTimeZone
	 * @param toTimeZone
	 * @return
	 */
	public static Date changeTimeZone(String dateTime, String fromTimeZone, String toTimeZone) {
		SimpleDateFormat sourceFormat = new SimpleDateFormat(MACHINE_DATE_TIME_FORMAT);
		sourceFormat.setTimeZone(TimeZone.getTimeZone(fromTimeZone));
		Date parsed = null;
		try {
			parsed = sourceFormat.parse(dateTime);
		} catch (ParseException e) {
			//Log.i("Util", "Exception in changeTimeZone parsing dateTime: "+dateTime, e);
			e.printStackTrace();
		}
		if (parsed == null) {
			return null;
		}

		TimeZone tz = TimeZone.getTimeZone(toTimeZone);
		SimpleDateFormat destFormat = new SimpleDateFormat(MACHINE_DATE_TIME_FORMAT);
		destFormat.setTimeZone(tz);

		String result = destFormat.format(parsed);
		try {
			return destFormat.parse(result);
		} catch (ParseException e) {
			//Log.i("Util", "Exception in changeTimeZone parsing to destination zone, dateTime: "+result, e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns delta days between two date strings. Date is expected in the format FormatUtils.SYSTEM_DATE_TIME_FORMAT.
	 *
	 * @param dateString1
	 * @param dateString2
	 * @return
	 */
	public static int deltaSeconds(String dateString1, String dateString2) {
		SimpleDateFormat sdf = new SimpleDateFormat(FormatUtils.SYSTEM_DATE_TIME_FORMAT);
		if (FormatUtils.isEmpty(dateString1) || FormatUtils.isEmpty(dateString2)) return 0;
		try {
			//sdf.setTimeZone(Util.extractTimeZone(dateString1));
			Date date1 = sdf.parse(dateString1);
			//sdf.setTimeZone(Util.extractTimeZone(dateString2));
			Date date2 = sdf.parse(dateString2);
			long deltaMillies = Math.abs(date1.getTime() - date2.getTime());
			double deltaSeconds = ((double)deltaMillies)/(1000.0);
			return (int)Math.ceil(deltaSeconds); // truncating fractions deliberately. Do not round!!
		} catch (Exception e) {
			//throw new IllegalArgumentException(
			//Log.i("EbillyUtil","Unable to find deltaDays for date1: "+dateString1+
			//		", date2: "+dateString2, e);
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * Expects a date string in the format Util.MACHINE_DATE_TIME_FORMAT
	 * @param dateTime
	 * @return
	 */
	public static TimeZone extractTimeZone(String dateTime) {
		//eg: dd/MM/yyyy hh:mm:ss a z => 26 chars
		if (FormatUtils.isEmpty(dateTime)) return TimeZone.getDefault();
		dateTime = dateTime.trim();
		if (dateTime.length() != 26) return TimeZone.getDefault();
		String tzCode = dateTime.substring(26-3, 26);
		return TimeZone.getTimeZone(tzCode);
	}

	/**
	 * Expects dateTime in FormatUtils.SYSTEM_DATE_TIME_FORMAT and returns a string in the format
	 * Util.MACHINE_DATE_FORMAT.
	 *
	 * @param dateTime
	 * @return
	 */
	public static String trimTimeFromDateTime(String dateTime) {
		//eg: 06/06/2020 06:55:20 => 19 chars
		if (FormatUtils.isEmpty(dateTime)) return "";
		dateTime = dateTime.trim();
		if (dateTime.length() != 19) return dateTime;
		dateTime = dateTime.replaceAll("/","");
		String dateTrim = dateTime.substring(0, 8);
		return dateTrim;
	}

	/**
	 * Expects dateTime in FormatUtils.SYSTEM_DATE_TIME_FORMAT a
	 *
	 * @param dateTime
	 * @return
	 */
	public static String trimTimeFromDefaultDateTime(String dateTime) {
		//eg: 06/06/2020 06:55:20 => 19 chars
		if (FormatUtils.isEmpty(dateTime)) return "";
		dateTime = dateTime.trim();
		if (dateTime.length() != 19) return dateTime;
		//dateTime = dateTime.replaceAll("/","");
		String dateTrim = dateTime.substring(0, 10);
		return dateTrim;
	}

	public static long computeDeltaSecs(Date fromDate, Date toDate) {
		if (fromDate == null || toDate == null) return 0l;
		long dayMillies = 1 * 24 * 60 * 60 * 1000;
		// we add dayMillies to include the complete toDate day.
		long delta = (toDate.getTime()+dayMillies) - fromDate.getTime();
		return delta/1000;
	}

	public static String getCurrentDateTimeInMacihneFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat(MACHINE_DATE_TIME_FORMAT);
		//return sdf.format(new Date(System.currentTimeMillis()));
		return sdf.format(FormatUtils.getCurrentDate());
	}
	//[[End of FUNCTIONS REFACTORED FROM ebilly.device.util.Util class]]

	/**
	 * Returns the month key for the given date in calendar.
	 *
	 * @param cal
	 * @return String representing the Year and Month. Eg: "2020-7"
	 */
	public static String createMonthKey(Calendar cal) {
		return cal.get(Calendar.YEAR) + "-" + (1+cal.get(Calendar.MONTH));
	}
	/**
	 * Returns the month key for the given date in calendar.
	 *
	 * @param cal
	 * @return String representing the Year and Month. Eg: "2020-7"
	 */
	public static String createMmKey(Calendar cal) {
		String year = ""+cal.get(Calendar.YEAR);
		int monthkey = (1+cal.get(Calendar.MONTH));
		String mon =""+monthkey;
		if(monthkey <10)
			mon = "0"+monthkey;
		String yearmon = year.substring(2)+mon;
		return yearmon;
	}



	public static String getCurrentYearMmKey(){
		String currentDate = FormatUtils.getFormattedCurrentDate();
		Calendar c = Calendar.getInstance();
		c.setTime(FormatUtils.getDate(currentDate));
		return FormatUtils.createMmKey(c);
	}

	public static int getMonthValue(String date){
		int month = 1;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(asDefaultDate(date));
			month = 1+cal.get(Calendar.MONTH);
		} catch (Exception e) {

		}
		return month;
	}
	public static int getNumberOfDays(int month,int year){
		Calendar cal = Calendar.getInstance();
		// Note: 0-based months
		cal.set(year, month-1, 1);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static int getYearValue(String date){
		int year = 1;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(asDefaultDate(date));
			year = cal.get(Calendar.YEAR);
		} catch (Exception e) {

		}
		return year;
	}

	/**
	 *
	 * @param monthKey in the format of "yyyy-M"
	 * @return
	 */
	public static Date getDateFromMonthKey(String monthKey) {
		if (FormatUtils.isEmpty(monthKey)) return null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M");
		try {
			return sdf.parse(monthKey.trim());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns the month key for the given date
	 *
	 * @param date
	 * @return String representing the Year and Month. Eg: "2020-7"
	 */
	public static String createMonthKey(Date date) {
		Calendar cal = Calendar.getInstance(); cal.setTime(date);
		return createMonthKey(cal);
	}

	/**
	 *
	 * @return
	 */
	public static String replaceNonAlphaNumericCharacters(String value) {
		if (FormatUtils.isEmpty(value)) return value;
		return value.replaceAll("[^A-Za-z0-9]","");
	}

	/**
	 *
	 * @param value
	 * @return
	 */
	public static boolean isValidDecimal(String value) {
		if (isEmpty(value)) return true;
		// More than one dot
		if (value.indexOf(".", value.indexOf(".") + 1) != -1) return false;
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	/**
	 *
	 * @param value
	 * @return
	 */
	public static boolean isValidNegativeDecimal(String value) {
		if (isEmpty(value)) return true;
		// More than one dot
		if (value.indexOf(".", value.indexOf(".") + 1) != -1) return false;
		if (value.indexOf("-") > 0)
			return false;
		if(value.indexOf("-") == 0){
			if(value.length() == 1)
				return true;
			value = value.substring(1,value.length());
		}
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 *  Returns only fractional part of the given double.
	 *  Eg: Returns 0.23 for the given 7294.23
	 *      Returns 0.489 for the given 0.489
	 *      Returns 0.4 for the given 54.4
	 *
	 * @param value
	 * @return
	 */
	public static double discardDecimalValue(double value) {
		int decimal = (int)value;
		return FormatUtils.roundDec2(value - decimal);
	}

	/**
	 * Returns true if the difference between endDateTime and beginDateTime > elapsedSeconds
	 *
	 * @param beginDateTime
	 * @param endDateTime
	 * @param elapsedSeconds
	 * @return
	 */
	public static boolean isElapsedMoreThanSeconds(Date beginDateTime, Date endDateTime, long elapsedSeconds) {
		if (beginDateTime == null || endDateTime == null) return false;
		long deltaMillies = endDateTime.getTime() - beginDateTime.getTime();
		double deltaSeconds = ((double)deltaMillies)/(1*1000.0);
		return deltaSeconds > elapsedSeconds;
	}

	/**
	 * Returns true if manySeconds are elapsed since beginDateTime.
	 *
	 * @param beginDateTime
	 * @param manySeconds
	 * @return
	 */
	public static boolean isElapsedMoreThanSeconds(Date beginDateTime, long manySeconds) {
		return FormatUtils.isElapsedMoreThanSeconds(beginDateTime, FormatUtils.getCurrentDate(), manySeconds);
	}

	/**
	 *
	 * @return long current time in millis since epoch.
	 */
	public static long currentTimeMillis() {
		return System.currentTimeMillis();
	}

	/**
	 * Returns if s1.equals(s2) guarding Null values.
	 *
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean areEqual(String s1, String s2) {
		if (s1 == null && s2 == null)  return true;
		if (s1 != null) {
			return s1.equals(s2);
		} else {
			return false;
		}
	}
}
