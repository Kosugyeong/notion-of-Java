package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {
	public static void main(String[] args) {

		//m1();
		m2();

	}

	private static void m2() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		
		System.out.println(nums);
		
		//오름차순
		Collections.sort(nums);
		System.out.println(nums);
		
		//이 Collections도 배열과 정렬 기능 같다.
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1; //내림차순
			}
			
		});
		
		System.out.println(nums);
		
		
		//Collections.sort를 굳이 안쓰고 이렇게 써도 정렬 가능..
		nums.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
			
		});
		
		System.out.println(nums);
		
	}

	private static void m1() {


		String[] names = {"홍길동", "아무개", "하하하", "호호호", "테스트"};

		Arrays.sort(names); // 오름차순

		System.out.println(Arrays.toString(names)); // 오름차순 결과

		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				// 내림차순
				return o2.compareTo(o1); // o2 - o1과 같다!
			}

		});

		System.out.println(Arrays.toString(names)); // 내림차순 결과


		Calendar[] dates = new Calendar[5]; // Calendar를 담을 수 있는 방 생성

		for (int i = 0; i < dates.length; i++) {
			dates[i] = Calendar.getInstance();// 객체 생성해서 데이터 들어감.
		}

		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, 2);
		dates[2].add(Calendar.DATE, 5);
		dates[3].add(Calendar.DATE, 1);
		dates[4].add(Calendar.DATE, 4);

		for (int i = 0; i < dates.length; i++) {

			System.out.printf("%tF\n", dates[i]);

		}

		System.out.println();

		Arrays.sort(dates); // 오름차순

		for (int i = 0; i < dates.length; i++) {

			System.out.printf("%tF\n", dates[i]);

		}
		
		System.out.println();
		
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return(int)(o2.getTimeInMillis() - o1.getTimeInMillis()); > 이렇게 쓰면 불안해서 쓰지 말기 long형이 int로 되면서 짤려서...?
				return o2.compareTo(o1); //내림차순
			}
			
		});
		
		for (int i = 0; i < dates.length; i++) {

			System.out.printf("%tF\n", dates[i]); //내림차순 결과

		}
		



	}// m1

}// Ex67
