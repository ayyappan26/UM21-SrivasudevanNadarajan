package com.um21.dateformat;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) 
	{
		Date date = new Date();  
		SimpleDateFormat dt1= new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		SimpleDateFormat dt2= new SimpleDateFormat("dd/M/yy K:mm a");
		SimpleDateFormat dt3= new SimpleDateFormat("K:mm:ss a");
		SimpleDateFormat dt4= new SimpleDateFormat("MMM d, yyyy K:mm:ss a");
		SimpleDateFormat dt5= new SimpleDateFormat("K:mm a");
		SimpleDateFormat dt6= new SimpleDateFormat("K:mm:ss a");
		SimpleDateFormat dt7= new SimpleDateFormat("K:mm:ss a z");
		SimpleDateFormat dt8= new SimpleDateFormat("dd/M/yy K:mm a");
		SimpleDateFormat dt9= new SimpleDateFormat("MMM d, yyyy K:mm a");
		SimpleDateFormat dt10= new SimpleDateFormat("MMMMMM d, yyyy K:mm:ss a z");
		System.out.println(dt1.format(date));
		System.out.println(dt2.format(date));
		System.out.println(dt3.format(date));
		System.out.println(dt4.format(date));
		System.out.println(dt5.format(date));
		System.out.println(dt6.format(date));
		System.out.println(dt7.format(date));
		System.out.println(dt8.format(date));
		System.out.println(dt9.format(date));
		System.out.println(dt10.format(date));
		
	
	}

}
