package com.test.java;

public class Ex15_Overloading {

	public static void main(String[] args) {

		// Ex15_Overloading.java

		/*
		
			메소드 오버로딩, Method Overloading
			- 메소드가 인자 리스트를 다양한 형태로 가질 수 있는 기술
			- 같은 이름의 메소드 + 인자를 다양하게 > 여러개 만들 수 있는 기술
			
			메소드 오버로딩을 하는 이유?
			- 성능 향상(X)
			- 개발자 도움(O) > 머리 나쁜 개발자들 위한 기술 > 메소드 이름 외우기 힘든 사람들을 위해서..
		
		
		
			메소드 오버로딩 구현 조건 가능
			1. 매개변수의 갯수
			2. 매개변수의 자료형
			
			메소드 오버로딩 구현 조건 불가능
			1. 매개변수의 이름
			2. 반환값의 자료형
			
			메소드를 선언하는 중..
			1. public static void test() {}				//O
			2. public static void test() {} 			//X , 1번에 이미 있으므로 안됨
			3. public static void test(int n) {}		//O
			4. public static void test(int m) {}		//X, 3번과 변수 이름이 달라도 같은 메소드라고 볼 수 있다. 3번과 구분이 안됨.
			5. public static void test(String s) {} 	//O, 매개변수 갯수는 같지만 매개변수의 자료형이 다르므로 사용 가능
			6. public static void test(int n, int m) {} //O, 매개변수 갯수가 다르므로 가능
			7. public static int test() {}				//X, 1번 때문에. 반환값이 달라도 매개변수 갯수가 같으므로 안됨
			
			메소드를 호출하기(검증!!) *****
			test(); //1번 호출
			test(10); //3번 호출
			test("문자열); //5번 호출
			test(10, 20); //6번 호출
			
			int result = test(); //7번 호출(불가능) 
		
		*/

		// 요구사항] 선을 출력하는 메소드

		drawLine();
		drawLine();
		drawLine();

		drawLine("*");
		drawLine("&");
		drawLine("+");


		// 숫자 출력
		System.out.println(100);
		println(100);

		// 문자열 출력
		System.out.println("문자열");
		println("문자열");

		// bollean
		System.out.println("true");
		println("true");



	}// main

	public static void println(int num) {
		// num 출력

	}

	public static void println(String num) {
		// num 출력

	}

	public static void println(boolean num) {
		// num 출력

	}



	// *** 식별자 중복 > 숫자 붙이는 행동 절대 금지!! > 의미 불분명;;;

	// 메소드 생성 > 이름?
	public static void drawLine() {

		System.out.println("=============================");
	}

	// 메소드 이름 같아서 에러남
	// public static void drawLine() {
	//
	// System.out.println("*****************************");
	// }

	public static void drawLine(String s) {

		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println();

	}


	private static String test1() {

		// 1. 호출 구문 > 메소드 자동 생성(Ctrl + 1 > create)
		// 2. 블럭 선택 > refactor > extract method

		// 10 / 3 -> "3.3"

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.333333333

		System.out.printf("%.1f\n", 10.0 / 3); // 3.3

		// 1. 자바 수학 기능
		// 2. 형식 문자열 지원 메소드(*******)

		System.out.println(Math.round(10.0 / 3 * 10) / 10.0); // 귀찮아서 이렇게 잘 안씀

		// return String.valueOf(Math.round(10.0 / 3 * 10) / 10.0);


		// printf 메소드와 기능은 동일하지만 > 결과를 출력(x) 결과를 반환.
		String result = String.format("%.1f", 10.0 / 3);

		return result;
	}

	/*
		
			코드 컨벤션
			- 프로그래밍 코드 작성 시 지켜야할 규칙
			
			구글 + 자바 코딩 + 코드 컨벤션
			
			1. 수동 적용 > Ctrl + Shift + F
			2. 자동 적용(저장할 때) > "save actions"
		
		
		
	 */


}
