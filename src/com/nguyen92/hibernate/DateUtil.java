package com.nguyen92.hibernate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	// The date formatter
    // - dd:   day in month (number)
    // - MM:   month in year (number)
    // - yyyy: year
    //
    // See this link for details: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html

	private static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	
	// read a date user input string and parse/convert into a Date object
	public static Date parseDate(String dateString) throws ParseException {
		Date parsedDate = formatter.parse(dateString);
		
		return parsedDate;
	}
	
	
	// Read a Date object and convert to a String
	public static String formatDate(Date parsedDate) {
		String result = null;
		
		if (parsedDate != null) {
			result = formatter.format(parsedDate);
		}
		
		return result;
	}
}

