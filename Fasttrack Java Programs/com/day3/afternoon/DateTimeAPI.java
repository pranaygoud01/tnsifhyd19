package com.day3.afternoon;
import java.time.*;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDateTime current=LocalDateTime.now();
		Month mon=current.getMonth();
		System.out.println(mon);
		int day=current.getDayOfMonth();
		LocalDate date2=LocalDate.of(2002, 11, 29);
		System.out.println(date2);
		
		System.out.println(day);
         LocalDateTime specificDate=current.withDayOfMonth(25).withYear(2024);
         
         System.out.println(specificDate);
	}

}
