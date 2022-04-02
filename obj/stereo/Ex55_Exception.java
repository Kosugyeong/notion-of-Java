package com.test.java.obj.stereo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex55_Exception {

	public static void main(String[] args) {

		/*
		
			예외, Exception
			- 컴파일 발견 X > 실행 중 발견 O
			- 런타임 오류
			- 개발자가 미리 예측 할 수도 있고 못 할 수도 있음 . 
			
			
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
			
			2. 전용 처리 방식
			 	- try catch finally문 사용
		
		
		에러를 중앙으로 모는 방식(throws Exception 적고 main에서 try catch로 한번에 잡아서 처리하는 것)과 에러를 각자 해결하는 방식(지역에서 try catch로 해결) 두 가지가 있는데 각자 스타일이다.
		
		
		*/

		// Ex55_Exception.m1(); // 원래는 이게 정석이다. 즉 Ex55_Exception이 생략되어있는 것
		// m1();

		// m2();
		// m3();
		try {
			m4();
		} catch (Exception e) {

		}
		
		m5();
		
	}// main

	private static void m5()  {

		// 예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건] 반드시 짝수만 입력
		//		홀수 > 에러
		
		int num = 1; // try catch보다는 if 로 처리하는게 이 문제에서는 더 낫다..
		
		if(num%2==0) {
			System.out.println("업무 코드..");
		}else {
			System.out.println("예외 처리");
		}
		
		
		/* try catch */  // > 무리해서 굳이 try catch 만듦 
		try {
			
			if(num%2==1) {
				throw new Exception("홀수를 입력했습니다."); //강제 에러 발생!!!
			}
			System.out.println("업무 코드..");
		}catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage()); //홀수를 입력했습니다. 
		}
		
		

	}

	private static void m4() throws Exception {

		// 예외 미루기
		// - 해당 영역에서 예외 처리를 할만한 상황이 안되면 다른 곳으로 예외 처리의 책임을 떠넘길 수 있다.

		// - throws Exception


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Unhandled exception type IOException

		// String input = reader.readLine();

	}

	private static void m3() {
		// Exception 객체의 역할

		try {

			int num = 10;
			System.out.println(100 / num); // A. ArithmeticException

			// throw new ArithmeticException(); > 에러가 나면 이 코드가 생성되고 new ArithmeticException()가
			// throw(던져짐)된다. 이때 catch부분에서 맞는 자료형이 (catch)잡는다.

			int[] nums = {10, 20, 30};
			System.out.println(nums[0]); // B. ArrayIndexOutOfBoundsException


			Parent p = new Parent();
			Child c;

			// c = (Child)p; //C. ClassCastException



		} catch (ArithmeticException e) {

			System.out.println("0으로 나누기");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("배열 첨자 오류");

		} catch (ClassCastException e) {

			System.out.println("형변환 오류");

		} catch (Exception e) {

			// Exception > 모든 OOOException의 부모 클래스 > 잡을 수 있는 공을 모두 잡음 > 예측이 불가능한 에러를 잡기 위해 마지막에 꼭
			// 필요한 코드
			System.out.println("예외 처리");

		}



		// catch (Exception e) {
		// System.out.println("예외 처리");
		// System.out.println(e.getMessage());
		// }
	}



	private static void m2() {
		// Exception 객체의 역할

		int num = 10;

		try {

			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}

		int[] nums = {10, 20, 30};

		try {
			System.out.println(nums[0]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}

		Parent p = new Parent();
		Child c;

		try {
			c = (Child) p;;
		} catch (Exception e) {
			System.out.println("형변환 오류");
		}


	}

	// 메소드 자동 생성 > 생각?
	// 1. private
	// 2. static
	// 3. void
	// 4. ()


	// static이 없는 메소드는 객체메소드이다.(객체가 생성되어야 사용할 수 있는 메소드)
	// static이 있는 메소드는 정적메소드이다. 객체가 없어도 사용할 수 있는 클래스메소드
	// static 메소드 안에서는 this 사용 못함 > 객체 메소드 호출 불가능이라는 뜻
	private static void m1() {

		// 요구사항] 숫자를 입력받아 연산을 하시오.

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자: ");

		int num = scan.nextInt();


		// 전통적인 방식
		if (num != 0) {

			// 비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {

			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}


		// 비권장 > 가독성 낮음 > 예외 처리 부분이 밑에 오게끔
		if (num == 0) {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");

		} else {

			// 비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}


		/*
		
		if(조건) {
			참 블럭 > 긍정적
		} else {
			거짓 블럭 > 부정적
		}
		
		
		
		*/

		// try문
		// - try : 비즈니스 코드 작성
		// - catch: 예외 처리 코드 작성

		// 1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서
		// 2. 아무 문제 없음 > 빠져나감 > cathch 실행 안함

		// 1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서
		// 2. 에러 발생!!!
		// 3. 남아있는 업무코드의 실행을 중단!!!
		// 4. 즉시, catch로 이동한다.
		// 5. catch 실행

		// if문 vs try문
		// - if문: 사전에 미리 검사를 해서 사고가 안나게 처리..
		// - try문: 일단 실행 > 감시!!! > 사고가 터지면 그때 처리..



		// try의 영역 > 예외가 발생할것 같다고 예측 가능한 최소한의 영역에만 적용하기
		try {
			// 비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} catch (Exception e) {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");

			// Exception e
			// - 예외 객체
			// - 예외가 발생한 상황에 대한 정보를 알려준다.

		}


	}



}// Ex55


