package javapractise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date.toString());
		
		//If date is required in specific format
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh::mm::ss");
		sdf.format(date);
		System.out.println("In required date format "+sdf.format(date));
		
		//Using calendar objects
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh::mm::ss");
		System.out.println("Using the Calendar objects "+sdf1.format(cal.getTime()));
		System.out.println("Methods in Calendar "+Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
	}

}
