package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member01=new Member();
		
		member01.setName("정우성(jws)");
		member01.setPoint(50000);
		
		member01.showinfo();
		
		
Member member02=new Member();
		
		member02.setName("유재석(yjs)");
		member02.setPoint(30000);
		
		member02.showinfo();
		
		
		
Member member03=new Member();
		
		member03.setName("이효리(lhr)");
		member03.setPoint(40000);
		
		member03.showinfo();
	}

}
