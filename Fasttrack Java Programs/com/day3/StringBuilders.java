package com.day3;

public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" Pranay");
		System.out.println(sb);
		sb.insert(2, "java");
		System.out.println(sb);
		sb.replace(2, 6, "");
		System.out.println(sb);
		sb.delete(1,3);
		System.out.println(sb);
		
	}

}
