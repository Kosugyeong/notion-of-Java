package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
	
		
		
		//1. 각 자료형 변수 만들기
		//2. 각 자료형 리터럴 만드는 방법
		
		//정수형
		byte b1;
		
		b1 = 10; //10 > 정수형 리터럴
		System.out.println(b1);
		
		b1 = Byte.MAX_VALUE; //JDK가 제공하는 상수(미리 만들어져있는 상수)
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1;
		s1 = 3000;
		System.out.println(s1);
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		
		int n1;
		n1 = Integer.MAX_VALUE;
		
		
		long l1;
		l1 = Long.MAX_VALUE;
		//l1 = 2300000000; //에러가 난다. 정수형의 리터럴은 int인데 int형으로 23억으로 표현이 안돼서.
		
		l1 = 2300000000L; //Long형 리터럴 > 접미어(L) > L을 붙여서 상수 자체를 Long형으로 만들어 저장할 수 있게 한다. 
		
		
		//** 정수형 리터럴은 int이다. > 이유: CPU + 운영체제
		
		//예로부터 프로그래밍 언어의 'int' 자료형은 운영체제의 bit와 동일하다. 
		
		//정수형 자료형 4개중 > 거의 int만 사용한다. + 가끔씩 long을 사용한다. 
		
		//---------------------------------------------------------------------
		
		//실수형 리터럴(상수)는 float인가? double인가?
		//** 실수형 리터럴은 double이다. > 정밀도가 높아서
		
		//float > 단정도형
		
		float f1;
		f1 = 3.1F; //실수형 리터럴 표기법 , float에 저장할 때는 무조건 뒤에 F붙이기.
		System.out.println(f1);
		
		//double > 배정도형
		double d1;
		d1 = 3.14;
		System.out.println(d1);
		
		
		f1 = 123.1234567890123456789012345678901234567890F;
		d1 = 123.1234567890123456789012345678901234567890D;

		System.out.println(f1); //123.12346 > 손실분이 심하다. 
		System.out.println(d1); //123.12345678901235 double이 float보다 더 자세하게 저장한다. > 정밀도 높음
		//그러므로, 실수형 리터럴은 double이다.  
		
		
		//보통 실수형은 잘 소용 안한다. > 손실분 발생 때문에 반드시 필요한 경우나 손실분이 미미한 경우만 사용한다. 
		
		
		
		//-----------------------------------------------------
		
		//문자형
		char c1;
		c1 = 'A'; //문자형 상수(리터럴) 표기법
		System.out.println(c1);
		
		
		//char형은 반드시 1개의 문자만 저장할 수 있다. 
		
		
		//논리형
		//- 상수의 종류가 딱 2종류
		boolean flag;
		
		flag = true; //논리형 리터럴(true)
		flag = false;//논리형 리터럴(false)
		
		System.out.println(flag);
		
		
		//10
		//10L
		//3.4F
		//3.4
		//3.4D
		//'A'
		//true
		
		//문자열, String
		//- 추가 자료형
		//- 참조형에 속함
		//- 문자의 열
		//- 문자들이 열을 지어 있는 형태 > 문자의 집합 > char가 여러개 모여있는 형태
		
		String name;
		name = "홍길동"; //문자열 리터럴(상수) 표기법
		System.out.println(name);
		
		String m5 = ""; //0개의 문자열 > 빈문자열, Empty String
		
		//char m6 = '';
		char m7 = '\0'; //빈문자(Null 문자)
		
		
		//9개의 자료형
		//값형(8개) + 참조형(1개)
		
		//똑같은 값을 가지는 변수 2개 필요
		//int age = 30;
		//int copy =30;
		
		int age = 20;	//변수 = 값;
		int copy = age; //변수 = 변수; > 변수 = 변수가 가지는 값
		
		//*** 변수끼리 값을 복사할 수 있다.
		
		//연산자 -> =(대입), +
		
		int a1 = 10;
		int a2 = 20;
		int a3 = a1 + a2; //산술 연산
		System.out.println(a3); //30
		
		String str1 = "홍길동";
		String str2 = "안녕하세요.";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		a1 = 100;
		a2 = 200;
		a3 = a1 + a2;
		
		//화면에 출력 > 연산과정과 함께 결과를 출력하시오.
		// > 100 + 200 = 300
		
		System.out.println("100 + 200 = 300");
		System.out.println("100 + 200 = " + a3); 
		
		//
		
		
		int jumin;
		
		
		//2000년 태어난 아기
		//- 2000-03-07
		jumin = 000307;
		System.out.println(jumin); //199 > 8진수가 10진수로 바껴서 199로 출력됨
		
		//자바의 기수 표기법
		//- 데이터 표시는 아래와 같이 3개의 기수법을 제공한다.
		//- 출력은 기수법과 상관없이 항상 10진수로 출력된다.
		//1. 10진수 > 100	>10
		//2. 8진수  > 0100	>010 > 8
		//3. 16진수 > 0x100	>0x10 > 16
		
		String jumin1 = "000503";
		
		
		//과제
		//- 각 자료형(9개)별로 변수를 10개씩 만들어서 문장으로 출력하시오.
		//- 자료형 + 변수 + 리터럴 + 출력
		
		//1. 주변의 데이터 검색!! > 내 키(180cm) 나이 손가락 개수 키 친구몇명인지 좋아하는 색깔 등등 아무거나
		//2. 1의 데이터가 자바의 어떤 자료형에 적합한지 매칭 > 정수 vs 실수 + 길이 > double
		//3. 2의 자료형 > 변수 선언하기 > 의미있게
		//4. 3의 변수 > 데이터 대입(자료형에 맞는 리터럴 표기법)
		//5. 출력 > 문장으로 만들어서 출력
		
		
		//자료형 마다 아래의 예제 10번씩 -> 90번
		double height = 180.5;
		System.out.println("제 키는 " + height + "cm입니다.");
		
		//문장 좀 길게 여러가지 종류로 해보기. 
		
		
		
		
	}

}
