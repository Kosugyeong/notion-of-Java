package com.test.java;

public class Ex06_Escape {
	
	public static void main(String[] args) {
		
		//내가 만든 프로그램을 다른 사람에게 주소 싶다!! > 배포 
		//자바의 기본 배포 단위 > 소스 파일을 컴파일한 결과물(*.class) > jar > 자바 압축 파일
		
//		int age;
//		
//		age = 20;
//		
//		System.out.println("안녕하세요. 저는" + age + "살입니다.");
		
		//Ex06_Escape.java
		
		//특수 문자 > Escape Sequence
		//- 컴파일러가 번역을 할 때, 미리 약속된 표현을 만나면 그 표현을 바로 출력하지 않고, 약속에 따라 처리를 한 후에 출력하는 구성 요소
		//- 자료형 > char
		
		
		//1. \n
		//- new line, line feed
		//- 개행 문자
		
		char c1 = '\n';
		String str = "\n";
		
		//문자열 리터럴에는 엔터를 넣을 수 없다. 
		
		String msg = "안녕하세요. 홍길동입니다.";
		System.out.println(msg);
		
		String msg2 = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg2);
		
		System.out.println();
		System.out.println();
		
		//2. \r
		//- carriage return
		//- 커서(캐럿)의 위치를 현재 라인의 맨앞(첫번째 열)으로 이동
		//- 키보드 > Home 키
		//- 이클립스 콘솔에서는 제대로 동작 안함
		msg = "안녕하세요.\r홍길동";
		
		System.out.println(msg);
		
		
		//운영체제(os)에서의 엔터
		//1. 윈도우: \r\n ---> 이 두 개가 합쳐진게 엔터의 실체다!!!
		//2. 맥os: \r
		//3. 리눅스: \n
		
		
		//3. \t
		//- 탭문자, tab
		//- 탭 > 행동(x) > 지표(o) > 이미 정해져있는 위치를 표시한 요소
		//- 서식 작업(열 맞추기)
		//탭은 8칸마다 지정되어있고 탭을 누르면 제일 가까운 탭 위치로 가는 것이다. 
		
		msg = "하나\t둘\t셋\t넷";
		System.out.println(msg);
		
		//4. \b
		//- Backspace
		//- 콘솔 > 동작O
		//- 이클립스에서는 안됨. 
		msg = "홍길동\b입니다.";
		System.out.println(msg);//홍길입니다.
		
		
		//5. \", \', \\
		//- 이미 무언가를 하는 문자들을 의미없게 만드는 역할
		
		//요구사항) 화면 > 홍길동: "안녕하세요."
		msg = "홍길동: \"안녕하세요.\"";
		System.out.println(msg);
		
		//요구사항) 수업 폴더의 경로를 출력하시오.
		//C:\class\java
		
		//String path="C:\class\java";  이렇게 하면 \를 escape sequence라고 생각해 에러가 남
		String path="C:\\class\\java";
		System.out.println(path);
		
		//요구사항) 변수 2개, 숫자 대입, 더하기 연산 > 연산과정과 결과를 출력하세요.
		//10 + 20 = 30
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b); //30
		
		//연산 방향(왼쪽 -> 오른쪽)
		System.out.println(a + " + " + b + " = " + a + b); //10 + 20 = 1020
		System.out.println(a + " + " + b + " = " + (a + b)); //10 + 20 = 30

		//자바 > 변수를 만들고 초기화를 하지 않으면 사용이 불가능하다!!!!
		
		
		//현재 num은 null 상태입니다. 
		//현재 num은 null값을 가집니다.
		//현재 num은 초기화되어 있지 않습니다. 
		int num; //NULL 상태
		
		//int result = num + 100; //100 + 무언가? 
	}


}














