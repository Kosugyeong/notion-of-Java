package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex19_DateTime {

	public static void main(String[] args) {

		// Ex19_DateTime

		/*
			자바의 자료형
			1. 원시형(값형)
				- byte, short, int, long
				- float, double
				- char
				- boolean
				
			2. 참조형
				- 클래스
				- String
				- 날짜시간
				
				
			자바의 날짜시간 자료형
			1. Date 클래스 > 거의 사용 안함
			2. Calendar 클래스 > 현역
			3. 추가 클래스 > 현역
			
			
			A. 시각
			B. 시간
			
			2022년 3월 14일 오후 4시 22분 27초 > 시간 vs 시각 ==> 시각
			
			8시간 수업 > 시간 vs 시각 ==> 시간
			
			자료형의 시각 > 둘은 완전 다른 자료형
			
		
			시각, 시간 > 연산
			
			한달 = 며칠
			특정 기준일(1970년 1월 1일 0시 0분 0초, 1년 1월 1일 자정)로부터 해당 시각이 얼만큼 흘렀는지 구한 누적 시간 -> 틱(tick)값, Epoch Time, Timestamp
			
			
			시각 + 시각 = X 연산 불가능. 2022-03-01 + 2025-05-10
			시각 - 시각 = 0,
			
			시간 + 시간 = O(시간), 8시간 + 2시간 = 10시간
			
			
			시각 + 시간 = O(시간), 2022-03-01 + 5일 = 2022-03-06
			
		*/

		// m1();

		//m2();
		
		//m3();
		
		//m4();
		
		//m5();
		
		//m6();
		
		m7();
	}

	private static void m7() {
		
		//현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용 메소드 -> 현재 시각의 tick을 한번에 보게해주는 메소드. 
		System.out.println(System.currentTimeMillis());
		
	}

	private static void m6() {
		
		//1. 현재 시각 만들기 > getInstance() + get()
		//2. 특정 시간 만들기 > set()
		//3. 시각 + 시간 = 시각 > add()
		//4. 시각 - 시간 = 시각 > add()
		//5. 시각 - 시각 = 시간 > getTimeInMillis()
		//6. 시간 + 시간 = 시간
		//7. 시간 - 시간 = 시간
		
		
		//2시간 30분 + 10분 = 2시간 40분
		
		int hour = 2;
		int min = 30;
		
		min += 10;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		//2시간 30분 + 40분 = 2시간 70분 = 3시간 10분
		hour = 2;
		min = 30;
		
		min += 40;
		System.out.printf("%d시간 %d분\n", hour, min);
		
		hour = hour + (min / 60); //2시간 + 1시간 > 자리올림
		min = min % 60; //10분 > 나머지
		System.out.printf("%d시간 %d분\n", hour, min);
		
	}

	private static void m5() {
		
		//연산
		//- 시각 - 시각
		
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1999, 8, 17);
		
		//now - birthday = 내가 살아온 시간
		//산술 연산자(-)는 값형을 대상으로 연산을 한다. 
		//오류 구문: The operator - is undefined for the argument type(s) java.util.Calendar, java.util.Calendar
		//System.out.println(now - birthday); 
		
		
		//tick, epoch
		System.out.println(birthday.getTimeInMillis()); //937530448163ms
		System.out.println(now.getTimeInMillis()); //1647306470757ms -> 1970-01-01부터 이만큼 흐른 거임 
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis()) / 1000 / 60 /60 / 24); //8214 -> 태어나서 8214일 살았다는 소리이다. 
	

		//올해 크리스마스 며칠 남았는지??
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2022, 11, 25, 0, 0, 0);
		
		long nowTick = now.getTimeInMillis();
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.println((christmasTick - nowTick) / 1000 / 60 / 60 / 24); //284일
		
		
		
		//오늘 수업 끝나려면 몇 시간 남았는지??
		Calendar end = Calendar.getInstance();
		end.set(Calendar.HOUR_OF_DAY, 18);
		end.set(Calendar.MINUTE, 0);
		
		long endTick = end.getTimeInMillis();
		
		System.out.println((double)(endTick - nowTick) / 1000 / 60 / 60); //7.650003611111111 -> 대략 7.6시간
		

		
	}
	

	private static void m4() {
		//연산
		//- 시각 + 시간
		//- 시각 - 시간
		
		//오늘 만난 커플 > 100일을 알고 싶다!!
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차: %tF\n",now);
		
		now.add(Calendar.DATE, 100);
		
		System.out.printf("100일차: %tF\n",now);
		
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(1999, 8, 17);
		
		birthday.add(Calendar.DATE, 100);
		
		System.out.printf("내 백일잔치: %tF\n", birthday);
		
		//돌잔치-> 1년을 더하기 전에 다시 내 생일로 설정해야한다. 이미 100일 더한값이 들어가있으므로.
		birthday.set(1999, 8, 17);
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("내 돌잔치: %tF\n", birthday);
		
		//현재 시각 다시 초기화
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -50); //과거로 가려면 음수로! 
		
		System.out.printf("50일 전: %tF\n", now);
		
		
		//현재 시각 다시 초기화
		now = Calendar.getInstance();
		
		//3시간 25분 뒤 비타민 복용
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 25);
		
		System.out.printf("비타민 먹을 시간: %tT\n", now);
		
		
		
	}

	private static void m3() {
		
		//Calendar 메소드
		//1. int get(int) -> 원하는 걸 확인할 때는 get
		//2. int set(..) -> 원하는 값으로 수정하고 싶을 때는 set
		
		//현재 시각 얻어오기
		Calendar c1 = Calendar.getInstance();
		
		//특정 시각 얻어오기 > 원하는 시각 만들기
		//1.무조건 현재 시각 만들기***
		//2. 원하는 시각으로 수정하기
		
		Calendar birthday = Calendar.getInstance(); //현재 시각 만들기
		
		//시각 수정하기
		//- void set()
		birthday.set(Calendar.YEAR, 1999); //올해 년도를 1999로 수정
		birthday.set(Calendar.MONTH, 8);//현재 월을 9월로 수정. 자바에서 9월은 8이다
		birthday.set(Calendar.DATE, 17);//현재 일을 17일로 수정.
		
		birthday.set(Calendar.HOUR, 10);
		birthday.set(Calendar.MINUTE, 30);
		birthday.set(Calendar.SECOND, 0);
		
		System.out.printf("%tF %tT %tA\n", birthday, birthday, birthday);
		
		
		Calendar christmas = Calendar.getInstance();
		
		//****이와 같이 한번에 수정할 수도 있다. 
		christmas.set(2022, 11, 25);
		System.out.printf("%tF %tT %tA\n", christmas,christmas,christmas);
		
		christmas.set(2022, 11, 25, 18, 0); //년도, 월, 일, 시, 초
		System.out.printf("%tF %tT %tA\n", christmas,christmas,christmas);
		
		christmas.set(2022, 11, 25, 18, 0, 0);//년도, 월, 일, 시, 밀리초
		System.out.printf("%tF %tT %tA\n", christmas,christmas,christmas);
		
		
		
		
	}

	private static void m2() {
		// 두번째 예제

		// Calendar 클래스

		// 현재 시각 얻어오기(가장 기본적인 행동)
		Calendar c1 = Calendar.getInstance();
		// System.out.println(c1); // 보통 이렇게 c1 그대로 출력하지는 않음.
		// c1 안에 들어있는 수많은 데이터 중 원하는 데이터를 추출
		// - int get(int)

		System.out.println(c1.get(1)); // 2022 ->년도 추출
		System.out.println(c1.get(2)); // 2
		System.out.println(c1.get(3)); // 12
		System.out.println(c1.get(4)); // 3
		System.out.println(c1.get(5)); // 14


		int year = 1;
		System.out.println(c1.get(1));// 가독성 낮음
		System.out.println(c1.get(year));// 가독성 높음


		// 자바가 제공하는 Calendar 상수(변수)
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR)); // *** 실제로 사용하는 최종 구문!!!!!!
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(c1.get(Calendar.YEAR)); // 2022 년도
		System.out.println(c1.get(Calendar.MONTH)); // 2 월(0~11)
		System.out.println(c1.get(Calendar.DATE)); // 14 날짜(일)
		System.out.println(c1.get(Calendar.HOUR)); // 5 시(12H)
		System.out.println(c1.get(Calendar.MINUTE)); // 23 분
		System.out.println(c1.get(Calendar.SECOND)); // 22 초
		System.out.println(c1.get(Calendar.MILLISECOND)); // 251 밀리초(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); // 1 오전(0), 오후(1)

		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); // 73 올해 들어 며칠차
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); // 14 이번 달 들어 며칠자
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); // 2 이번 주 들어서 몇쨰 요일인지

		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); // 12 이번 년도 들어 몇째주인지
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); // 3 이번 달 들어서 몇째주인지

		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); // 17 시(24H)
		System.out.println();
		System.out.println();


		//요구사항] "오늘은 2022년 3월 14일입니다." + 출력하시오.
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		System.out.println();


		//요구사항] "지금은 오후 5시 37분입니다." + 출력하시오.
		System.out.printf("지금은 %s %d시 %d분입니다.\n"
							, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
							, now.get(Calendar.HOUR)
							, now.get(Calendar.MINUTE));
		System.out.println();
		
		
		//printf(), format() > 형식 문자 + 날짜시간
		
		System.out.printf("%tF\n", now); //2022-03-14 *********기억하기
		 
		System.out.printf("%d-%02d-%02d\n"
								, now.get(Calendar.YEAR)
								, now.get(Calendar.MONTH) + 1
								, now.get(Calendar.DATE));
		
		System.out.printf("%tT\n", now); //17:44:50 ********** 기억하기
		System.out.printf("%tA\n", now); //월요일

	}


	private static void m1() {
		// 첫번째 예제

		// Date

		// 자료형(Date) 변수명(date) = new Date();
		Date date = new Date(); // 현재 시각을 생성해서 date라는 변수에 담아라.

		System.out.println(date); // Mon Mar 14 17:04:36 KST 2022

	}



}
