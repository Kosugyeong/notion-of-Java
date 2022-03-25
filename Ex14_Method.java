package com.test.java;

public class Ex14_Method {
	
	public static void main(String[] args) {
		
		//Ex14_Method.java
		
		/*
		
		메소드 매개변수
		- 호출 -> (데이터) -> 메소드
		
		
		메소드 반환값
		- 메소드가 실행 뒤 호출한 곳에 값을 돌려주는 행동
		- 메소드 -> (데이터) -> 호출
		- 목적? 메소드내에서 업무 진행의 결과를 이어서 사용하고자 반환
		
		
		*/
		
		System.out.println(getNum());
		
		int num = getNum(); //메소드 반환값인 10을 변수에 저장
		System.out.println(num);
		
		
		
		int age = 25;
		String result = checkAge(age);
		System.out.println(result);
		
		
	}//main
	
	
	public static int getNum() { //This method must return a result of type int
		
		
		//리턴문, 반환문
		//- getNum을 호출한 곳에 아래의 값을 돌려준다. 
		//- 하나의 값만 반환 가능하다. 
		return 10;
	}
	
	public static String checkAge(int age) {
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		return result;
		
	}
	

}












