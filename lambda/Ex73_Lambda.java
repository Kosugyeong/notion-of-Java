package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex73_Lambda {

	public static void main(String[] args) {

		// 익명 객체 활용하는 곳 > 람다식 활용하는 곳

		Random rnd = new Random();

		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			nums.add(rnd.nextInt(20) + 1); // 1~20
		}

		System.out.println(nums);

		// 오름차순 정렬
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {

				return o1 - o2;
			}
		});

		System.out.println(nums);



		// 람다식으로 변경
		nums.sort((Integer o1, Integer o2) -> {
			return o1 - o2;
		});

		nums.sort((o1, o2) -> o1 - o2);

		System.out.println(nums);


		try {

			BufferedReader reader = new BufferedReader(new FileReader("data\\user.txt"));

			ArrayList<User> list = new ArrayList<User>();

			String line = null;



			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");
				String[] ctemp = temp[4].split("-"); // 2022-01-01

				Calendar c = Calendar.getInstance();
				c.set(Integer.parseInt(ctemp[0]), Integer.parseInt(ctemp[1]),
						Integer.parseInt(ctemp[2]));

				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], c);


				list.add(user);

			}
			System.out.println(list);



			// 8개의 객체 > 정렬!!
			Collections.sort(nums); // ArrayList<Integer>
			// Collections.sort(list); //ArrayList<User> ***User 객체의 무슨 기준으로 정렬을 해야하는지 모르므로 이렇게는 불가능


			// *****객체 배열 정렬하려면 이와 같이 Comparator 사용해서 무엇을 기준으로 비교할지 만들어주기
			// 오름차순
			list.sort(new Comparator<User>() {

				@Override
				public int compare(User o1, User o2) {

					return o1.getAge() - o2.getAge();
				}

			});

			System.out.println(list);


			// 나이 기준 내림차순 람다식으로
			list.sort((u1, u2) -> u2.getAge() - u1.getAge());
			System.out.println(list);


			// 객체 배열 > 문자열멤버 정렬 > 문자열 비교는 compareTo로
			list.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
			System.out.println(list);

			// 객체 배열 > 날짜멤버 정렬 > 날짜 비교도 오버플로우 때문에 compareTo로 비교
			list.sort((u1, u2) -> u1.getHireDate().compareTo(u2.getHireDate()));
			System.out.println(list);


			// 객체배열 > 직급 정렬 > 부장 - 차장 - 과장 - 대리 - 사원
			list.sort((u1, u2) -> {
				if (u1.getPosition().equals("부장") && u2.getPosition().equals("차장")) {
					return -1;
				} else if (u1.getPosition().equals("부장") && u2.getPosition().equals("과장")) {
					return -1;
				} else if (u1.getPosition().equals("부장") && u2.getPosition().equals("대리")) {
					return -1;
				} else if (u1.getPosition().equals("부장") && u2.getPosition().equals("사원")) {
					return -1;
				} else if (u1.getPosition().equals("차장") && u2.getPosition().equals("부장")) {
					return 1;
				} else if (u1.getPosition().equals("차장") && u2.getPosition().equals("과장")) {
					return -1;
				} else if (u1.getPosition().equals("차장") && u2.getPosition().equals("대리")) {
					return -1;
				} else if (u1.getPosition().equals("차장") && u2.getPosition().equals("사원")) {
					return -1;
				} else if (u1.getPosition().equals("과장") && u2.getPosition().equals("부장")) {
					return 1;
				} else if (u1.getPosition().equals("과장") && u2.getPosition().equals("차장")) {
					return 1;
				} else if (u1.getPosition().equals("과장") && u2.getPosition().equals("대리")) {
					return -1;
				} else if (u1.getPosition().equals("과장") && u2.getPosition().equals("사원")) {
					return -1;
				} else if (u1.getPosition().equals("대리") && u2.getPosition().equals("부장")) {
					return 1;
				} else if (u1.getPosition().equals("대리") && u2.getPosition().equals("차장")) {
					return 1;
				} else if (u1.getPosition().equals("대리") && u2.getPosition().equals("과장")) {
					return 1;
				} else if (u1.getPosition().equals("대리") && u2.getPosition().equals("사원")) {
					return -1;
				} else if (u1.getPosition().equals("사원") && u2.getPosition().equals("부장")) {
					return 1;
				} else if (u1.getPosition().equals("사원") && u2.getPosition().equals("차장")) {
					return 1;
				} else if (u1.getPosition().equals("사원") && u2.getPosition().equals("과장")) {
					return 1;
				} else if (u1.getPosition().equals("사원") && u2.getPosition().equals("대리")) {
					return 1;
				} else {
					return 0;
				}
			}

			);



		} catch (

		Exception e) {
			System.out.println("Ex73_Lambda.main");
			e.printStackTrace();
		}



	}// main

}// Ex73


// 1,홍길동,25,사원,2011-02-05
class User {
	private String seq;
	private String name;
	private int age;
	private String position;
	private Calendar hireDate;

	public User(String seq, String name, int age, String position, Calendar hireDate) {
		super();
		this.seq = seq;
		this.name = name;
		this.age = age;
		this.position = position;
		this.hireDate = hireDate;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}


	// ******날짜 출력때문에 toString에서 %tF으로 바꿔줌
	@Override
	public String toString() {
		return String.format("User [seq=%s, name=%s, age=%s, position=%s, hireDate=%tF]\n", seq,
				name, age, position, hireDate);
	}



}


