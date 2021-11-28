package com.javaex.ex01;

public class Member {

	private static String id;
	private static String name;
	private static int point;
	
	
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Member.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Member.name = name;
	}
	public static int getPoint() {
		return point;
	}
	public static void setPoint(int point) {
		Member.point = point;
	}
	@Override
	public String toString() {
		return "Member [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void  showinfo() {
		System.out.println("회원정보 : "+name + ","+point+"점");
	}
}
