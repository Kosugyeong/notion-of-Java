package com.test.java.obj.stereo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class Ex53_Object {
	public static void main(String[] args) {
		
		
		//업캐스팅
		SSS s1 = new SSS();
		
		SSS s2 = new TTT(); //업캐스팅
		
		
		//*** Object 변수는 이 세상 모든것들을 담을 수 있다!!! > 만능 주머니!!!
		
		Object o1 = new Object();
		
		Object o2 = new SSS(); //가능, 업캐스팅
		
		Object o3 = new TTT(); //가능, 업캐스팅 , 손자 -> 할아버지
		
		Object o4 = new Date();
		
		Object o5 = Calendar.getInstance();
		
		Object o6 = new BufferedReader(new InputStreamReader(System.in));
		
		Object o7 = new G304();
		
		
		//Object 장점
		//1. 모든걸 담을 수 있다. 
		//2. 처음에 무언가를 담으면.. 죽을 때까지 그 자료형만 담는다. (*************)
		
		//Object 단점
		//1. 다운 캐스팅이 종종 필요하다.
		//2. 다운 캐스팅 과정에서 원래 자료의 자료형을 유추하기가 힘들다. 
		System.out.println(o4);
		
		
		
		
		
		//업캐스팅 > 상속관계에 있는 클래스끼리! 
		
		Object o10 = new SSS();
		
		//값형 데이터를 어떻게 참조형 변수에 넣느냐????
		//겉으로는 값형 데이터를 참조형 변수에 넣은것으로 보이나 실제로는 참조형 변수를 Integer객체에 넣은 것이다.
		//참조형 변수 = 객체 //new Integer() > 실제
		
		//박싱(Boxing) - 오토 박싱
		// > 값형 데이터를 자동으로 객체로 만드는 작업
		Object o11 = 100;
		//Object o12 = new Integer(10);
		
		System.out.println(o11); //100으로 잘 출력됨. > toString으로 출력된거라고 볼 수 있다.
		System.out.println(o11.toString());
		
		//The operator * is undefined for the argument type(s) Object, int
		//System.out.println(o11 * 2); // > o11은 숫자가 아니라 주소값이므로 산술연산이 안된다. 
	
		//언박싱(UnBoxing)
		// > Object 변수에 들어있는 값형 데이터를 원래 값형으로 자료형을 반환하는 작업
		System.out.println((int)o11*2);
		System.out.println((Integer)o11 * 2);
		
		
		int a = 10;		//비용 보통
		Object b = 20;	//비용 비쌈 > 박싱과 언박싱의 단계를 모두 거쳐야 하므로.
		
		
		//Object 단점을 해결하기 위해 Generic!!
		
		
		
	}
	
	

}


class SSS{ //extends Object가 생략되어 있는 것이다. 
	
	
}


class TTT extends SSS{
	
}