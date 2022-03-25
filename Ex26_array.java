package com.test.java;

import java.util.Arrays;

public class Ex26_array {
	public static void main(String[] args) {
		/*
		
		- 정렬, Sort
			1. 오름차순 정렬
			2. 내림차순 정렬
			
		- 배열 = 순서가 있는 집합
		
		정렬하는 방법
		1. 직접 구현
		- 수많은 정렬 알고리즘 > 10여가지
		- 버블 정렬
		2. 구현된 기능 활용(JDK) > Quick Sort
		
		*/


		// m1();
		// m2();
		 //m3();
		m4();

	}

	private static void m4() {

		int[] nums = {5, 3, 1, 4, 2};
		String[] name = {"유재석", "정형돈", "박나래", "하하", "박명수"};

		System.out.println(Arrays.toString(nums)); // [5, 3, 1, 4, 2]

		// 오름차순 정렬 > 공식적 메소드 O
		// 내림차순 정렬 > 공식적 메소드 X

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));// [1, 2, 3, 4, 5]

		System.out.println(Arrays.toString(name));// [유재석, 정형돈, 박나래, 하하, 박명수]
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));// [박나래, 박명수, 유재석, 정형돈, 하하]
	}

	private static void m3() {

		String[] name = {"유재석", "정형돈", "박나래", "하하", "박명수"};

		System.out.println(Arrays.toString(name)); // 정렬 전

		for (int i = 0; i < name.length; i++) {

			for (int j = 0; j < name.length - 1 - i; j++) {

				// ** 비교?
				if (name[j].compareTo(name[j + 1]) > 0) {

					String temp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(name)); // 정렬 후

	}

	private static void m2() {

		// 정렬
		// 1. 숫자 > 우위 비교
		// 2. 문자(열) > 문자 코드값
		// 3. 날짜 > 과거 vs 미래 > tick값으로 정렬함


		String[] name = {"유재석", "정형돈", "박나래", "하하", "박명수"};

		// 모든 참조형은 산술(비교)연산자의 피연산자가 될 수 없다.
		// if(name[0]>name[1]) 문자열은 비교 불가능. -> 주소값끼리는 연산이 불가능하기 때문에.


		// System.out.println(name[0].charAt(0)); //유
		// System.out.println(name[0].charAt(1)); //재
		// System.out.println(name[0].charAt(2)); //석


		String name1 = "유재석";
		String name2 = "정형돈";

		String result = "";


		// **** 문자열의 우위 비교는 문자열내의 문자들의 문자 코드값으로 비교한다.

		for (int i = 0; i < 3; i++) { // 이름이 3글자니까
			char c1 = name1.charAt(i);
			char c2 = name1.charAt(i);

			if (c1 > c2) {
				result = name1;
				break; // for문 탈출 > 다음 글자는 비교할 필요가 없기때문에
			} else if (c1 < c2) {
				result = name2;
				break;
			}
		}

		System.out.println(result);


		// name1 > name2 : 양수 반환
		// name1 < name2 : 음수 반환
		// name1 = name2 : 0 반환
		System.out.println(name1.compareTo(name2)); // int 반환.
	}

	private static void m1() {

		int[] nums = {5, 3, 1, 4, 2};

		// 오름차순 정렬 > {1,2,3,4,5} 재배치

		// 버블 정렬

		System.out.println(Arrays.toString(nums)); // 정렬 전

		for (int i = 0; i < nums.length - 1; i++) { // N Cycle (nums의 length가 5라면, 5사이클 실행)

			for (int j = 0; j < nums.length - i - 1; j++) { // step


				// if (nums[j] > nums[j + 1]) { //내림차순 정렬
				if (nums[j] > nums[j + 1]) { // 오름차순 정렬
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(nums)); // 정렬 후


	}

}
