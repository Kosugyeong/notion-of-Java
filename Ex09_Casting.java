package com.test.java;

public class Ex09_Casting {
	
	public static void main(String[] args) {
		//Ex09_Casting.java
		
		
		/*
		
			형변환, (자료)형변환, Casting, Data Type Casting
			- 코드를 유연하게 작성하기 위한 도구
			- int -> double
			- float -> short
		
		
			1. 암시적 형변환(= 자동 타입 변환)
				- 큰 형 = 작은 형 ex) short = byte
				- 100% 안전
				- short = byte; //2칸 = 1칸
				- int = byte; 	//4칸 = 1칸
				- long = byte;	//8칸 = 1칸
				- int = short; 	//4칸 = 2칸
				- long = short; //8칸 = 2칸
				- long = int;	//8칸 = 4칸
				
			
			2. 명시적 형변환(= 강제 타입 변환)
				- 작은 형 = 큰 형
				- 경우에 따라 다르다. > 작은 형이 소화할 수 있는 범위의 원본값이면 복사가 가능하고, 
				작은 형이 소화할 수 없는 범위의 원본값이면 손실분이 생긴다. > 성공/실패
				- 단, 개발자의 주의를 요함!! 
				
				
			
			
			
			
			
			
			
			'=' 연산자
			- 피연산자 2개 > 2항 연산자
			- 할당 연산자, 대입 연산자
			- 변수 = 값(리터럴, 변수)
			- LValue = RValue
			- ***** LValue의 자료형과 RValue의 자료형은 반드시 동일해야 한다. 
			> 이 규칙을 만족하지 못하면 에러 발생!!(컴파일 에러)
			
		*/
		
		byte b1; //1칸
		short s1;//2칸
		
		b1 = 10; //원본
		
		//복사
		//short = byte
		//2byte = 1byte
		//암시적인 형변환 발생 > 개발자가 모르게 자료형을 바꾸는 행동이 발생!!!
		//s1 = b1;
		
		//(자료형): 형변환 연산자 > 피연산자의 자료형은 ()안의 자료형으로 바꿔서 반환해라.
		s1 = (short)b1;
		
		
		//위의 복사가 안전하게 이뤄졌는지 확인!! 
		System.out.println(s1); //10
		
		
		byte b2; 	//1칸
		short s2; 	//2칸
		
		s2 = 1000;	//원본
		
		//복사
		//작은 형 = 큰 형
		//1칸 = 2칸
		//형변환 연산자를 생략할 수 없다. 
		b2 = (byte)s2; //개발자에게 경고!!! 야!! 여기 잘봐!! 틀릴 수 있으니까...
		
		System.out.println(b2); //복사본 -24.(앞에 값 날라가고 남아있는 뒤에 값 2진b2가 1칸이므로 s2의 한칸만 저장되고 앞에칸 수는 손실됨. 
		
		
		//자료형이 다른값들끼리 복사할 때
		//1. 암시적 형변환 > 신경X > 그래도 확인
		//2. 명시적 형변화나 > 주의!!!!!!!!!!!! > 조심x10000
		
		//명시적 형변환 시 발생하는 넘치는 현상 > 오버플로우(Overflow)
		//1. 위로 넘치는 현상 > Overflow(오버플로우)
		//2. 아래로 넘치는 현상 > Underflow(언더플로우)
		//1+2 > Overflow
		
		//**** 오버플로우가 발생할 만한 상황은 미리 예측해서 관리가 필요하다!!!
		
		//정수형 리터럴은 int이다. 
		
		//byte = int
		//작은형(1) = 큰형(4)
		byte m1 = 10; //서비스 문법. 원래라면 큰형을 작은형에 넣는 것이므로 (byte)와 같이 형변환 연산자를 써야하는데 안써도 되게 서비스 문법을 제공해줌
		
		//short = int
		//작은형(2) = 큰형(4)
		short m2 = 10;
		
		//int = int
		int m3 = 10;
		
		//long = int
		//큰형(8) = 작은형(4) > 암시적 형변환
		long m4 = 10;
		
		//float = double
		//작은형(4) = 큰형(8)
		float f1 = 3.14F; //서비스 문법x
		
		
		//형변환
		//1. 정수 -> 정수
		//2. 실수 -> 실수
		//3. 실수 -> 정수
		//4. 정수 -> 실수
		
		int n1 = 1000;	//원본(4byte)
		float n2;		//복사본(4byte)
		
		//암시적 형변환 > 안전!!
		n2 = n1;
		
		System.out.println(n2); //1000.0  제대로 복사됨.
		
		
		
		int n3;			//복사본(4byte) > -21억 ~ 21억
		float n4 = 1000;//원본(4byte)   > 무한대
		
		//명시적 형변환 > 불안전
		n3 = (int)n4;
		
		System.out.println(n3);
		
		//크기 정리
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//정수는 아무리 커도 실수보다는 작다!!! 정수보다 실수가 표현할 수 있는 범위가 훨씬 크다. 
		
		
		//char, boolean, String > 형변환
		//- boolean > 형변환 대상 불가능.
		//- 값형과 참조형간에는 형변환이 절대 불가능. 
		
		
		//"100"(String) -> 100(int)  불가능!!
		//100(int) -> "100"(String)  불가능!!
		
		//char > 형변환 대상 가능
		//- 겉보기엔 문자, 내부는 숫자
		//- char는 숫자형 자료형 중의 하나로 취급한다. 
		//- char <-> 정수
		//문자 코드 값은 음수는 존재하지 않음. 
		
		char c1;	//2byte
		short r1;	//2byte
		
		c1 = 'A'; 	//원본
		
		//복사
		r1 = (short)c1;
		
		System.out.println("r1: " + r1); //'A' -> 65
		
		char c2;
		short r2;
		
		r2 = 65;
		
		//복사
		c2 = (char)r2;
		
		System.out.println("c2: "+c2); //65 -> 'A'
		
		//결론: char를 숫자로 형변환하려면 반드시 int 이상의 자료형으로 변환해야 한다.(65335까지 표현할 수 있는 자료형이 필요)
		
		char c3;
		int a3;
		
		c3 = 'A';
		
		//암시적
		a3 = c3;
		
		System.out.println(a3); //65
		
		char c4;
		int a4;
		
		a4 = 65;
		
		c4 = (char)a4;
		System.out.println(c4);
		
		
		char c5;
		short r5;
		
		c5 = '가';
		
		r5 = (short)c5;
		
		System.out.println(r5); //-21504
		
		//char <-> int char는 int와만 서로 바꿀 수 있다. 
		
		//각 문자들의 문자 코드값
		System.out.println((int)'A'); //65 ****
		System.out.println((int)'B'); //66 
		System.out.println((int)'C'); //67 
		System.out.println((int)'Z'); //90 
		
		System.out.println((int)'a'); //97 ****
		System.out.println((int)'b'); //98 
		System.out.println((int)'z'); //122 
		
		//1 vs '1'
		System.out.println((int)'0'); //48 ****
		System.out.println((int)'1'); //49 
		System.out.println((int)'9'); //57 
		
		//한글 완성형(가~힣)
		System.out.println((int)'가'); //44032
		
		
		//유효성 검사
		//- 데이터가 업무에 타당한 데이터인지 확인하는 검사
		//- 모든 프로그램에 들어가는 필수 업무
		
		//ex) 사이트 회원가입 > 이름 입력(한글로만 입력)
		
		String name = "홍A동";
		
		//(int)'홍' (int)'A' (int)'동'
		
		
		
		//형변환 복습
		//1. int -> long
		//2. long -> int
		
		//3. int -> double
		//4. double -> int
		//5. long -> double
		//6. double -> long
		
		//7. int -> char
		//8. char -> int
		
		
		
		
		
		
		
		
		
		
		
	}

}
