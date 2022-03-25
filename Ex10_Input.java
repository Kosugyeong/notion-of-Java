package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_Input {
	public static void main(String[] args) throws Exception {
		
		//Ex10_input.java
		
		//요구사항] 숫자 2개를 입력받아 두 숫자의 합을 구하시오.
		
		
		//Ctrl + Shift + O > 현재 페이지 모든 클래스를 import 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("숫자 입력: ");
		String input1 = reader.readLine();
		
		System.out.printf("숫자 입력: ");
		String input2 = reader.readLine();
		
		System.out.println(input1 + input2); //1020
		
		//String(참조형) -> int(값형)
		//"10" -> 10
		
		//형변환 불가능 -> 해당 작업 가능(따로 구현)
		
		
		//유틸 클래스
		//- 문자열을 자신의 자료형으로 바꿔주는 일 제공
		
		//문자열 -> 값형
		
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%d + %d = %d\n"
							, num1
							, num2
							, num1 + num2);
		
		
		//문자열을 자신의 자료형으로 바꿔주는 일 제공
		
		//Byte.parseByte("10")
		//Short.parseShort("10")
		//Integer.parseInt("10")
		//Long.parseLong("10")
		
		//Float.parseFloat("3.14")
		//Double.parseDouble("3.14")
		
		//Boolean.parseBoolean("true")
		
		//"A" -> 'A' 문자열을 char로 바꾸기
		//"A".charAt(0) TODO 문자열 char로 바꾸는거 기억하기
		
		
		//자신의 자료형을 문자열로 바꿔주는 일
		
		//100 -> "100"
		//String.valueOf(100) -> "100"  문자열로 변환됨. TODO 문자열로 변환하는거 확인하고 외울것. 
		//String.valueOf(3.14) -> "3.14"  문자열로 변환됨. 
		//String.valueOf(true) -> "true"
		
		
	}

}
