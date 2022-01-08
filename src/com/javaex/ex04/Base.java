package com.javaex.ex04;

public class Base {

	private String base;

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Base [base=" + base + "]";
	}

	public void service(String state) {

	}

	public void day(String base) {
		if (base == "낮") {
			System.out.println("낮에는 열심히 수업듣자");
		}
	}

	public void night(String base) {
		if (base == "밤") {
			System.out.println("밤에는 숙면");
		}
	}

	public void afternoon(String base) {
		if (base == "오후") {
			System.out.println("오후도 낮과 마찬가지로 공부해야한다");
		}
	}

	
	
	public void show() {
		day(base);
		night(base);
		afternoon(base);
		
	}
	
}
