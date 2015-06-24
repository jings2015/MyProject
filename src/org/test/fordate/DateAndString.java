package org.test.fordate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndString {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//DateתString
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		//StringתDate
		Date date2 = null;
		try {
			date2 = sdf.parse(str);
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
