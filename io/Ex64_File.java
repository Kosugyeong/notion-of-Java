package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex64_File {

	public static void main(String[] args) {


		// m1();
		// m2();
		// m3();
		m4();

	}

	private static void m4() { //컬렉션에 옮겨 넣고 사용하는 방법 > 다시 reader를 만들 필요가 없다! 훨씬 더 편함! 

		ArrayList<User> list = new ArrayList<User>();

		load(list);

		for (User u : list) {
			System.out.printf("%s.%s(%d세)\n", u.getNo(), u.getName(), u.getAge());


		}
		System.out.println();

		for (User u : list) {

			if (u.getAge() >= 22) {
				System.out.printf("%s.%s(%d세)\n", u.getNo(), u.getName(), u.getAge());

			}
		}
		System.out.println();
		
		//데이터 수정
		//- 나이가 많은 사람을 표시
		//- 홍길동 > 홍길동(*)
		for(User u : list) {
			if(u.getAge()>=22) {
				u.setName(u.getName()+"(*)");
			}
		}
		//System.out.println(list);
		
		//데이터 삭제
		list.remove(2);

		
		//메모리(배열) > 텍스트 파일 반영 (수정을 하면 메모리(배열)에서 텍스트 파일에 반영을 해야함)
		save(list);
		
	}

	
	//배열에 있는 데이터들을 텍스트 파일에 다시 적용(덮어쓰기)
	private static void save(ArrayList<User> list) { 
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.MEMBER));
			
			//User 1개 -> 1,홍길동,20 -> writer.write()
			
			for(User u : list) {
				
				writer.write(String.format("%s,%s,%d\n", u.getNo(),u.getName(),u.getAge()));
				
			}
			
			writer.close();
			
			
			
		} catch (Exception e) {
			System.out.println("Ex64_File.save");
			e.printStackTrace();
		}
		
	}

	private static void load(ArrayList<User> list) {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.MEMBER));

			String line = null;

			while ((line = reader.readLine()) != null) {

				// 1,홍길동,20
				String[] temp = line.split(",");


				// 텍스트 파일 1줄 > User 객체 1개
				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]));

				list.add(user);

			}


		} catch (Exception e) {
			System.out.println("Ex64_File.load");
			e.printStackTrace();
		}

	}

	private static void m3() {

		// 파일 읽기
		try {


			// 데이터 파일 구조 > Scheme(스키마)

			// CSV 표기법
			// 번호,이름,나이
			// 1,홍길동,20

			BufferedReader reader = new BufferedReader(new FileReader(Data.MEMBER));

			String line = null;

			while ((line = reader.readLine()) != null) {
				// System.out.println(line);

				String[] temp = line.split(",");
				System.out.printf("%s. %s(%s세)\n", temp[0], temp[1], temp[2]);


			}
			reader.close();

			// 22세 이상 목록 다시 출력


			// 스트림 객체를 다시 생성 > 왜냐면 위에 있는 reader 객체의 커서는 이미 EOF(End Of File)에 가있으므로 이 객체로는 다시 읽을 수 없음
			// > 생성 직후 커서는 BOF(Begin of File)에 위치
			// reader는 재사용 불가.

			reader = new BufferedReader(new FileReader(Data.MEMBER));


			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");

				if (Integer.parseInt(temp[2]) >= 22) {
					System.out.printf("%s. %s(%s세)\n", temp[0], temp[1], temp[2]);
				}

			}



		} catch (Exception e) {
			System.out.println("Ex64_File.m3");
			e.printStackTrace();
		}



	}

	private static void m2() {

		// 파일 수정 > 콘솔은 고치고 싶은 부분만 고치는건 불가능하고 전부 다 다시 쳐서 고치고 싶은 내용만 바꿔서 쓰는 방식으로
		// 1. 기존 내용을 출력한다. > 읽기
		// 2. 내용의 일부를 수정한다.
		// 3. 저장한다.

		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.EDIT));

			System.out.println("[현재 내용]");


			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();

			Scanner scan = new Scanner(System.in);

			System.out.println("[수정 내용]");

			String input = scan.nextLine();


			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.EDIT));

			writer.write(input);

			writer.close();

			System.out.println("수정 완료");

		} catch (Exception e) {
			System.out.println("Ex64_File.m2");
			e.printStackTrace();
		}

	}

	private static void m1() {

		// 읽고 쓰는 파일의 위치
		// 1. 프로젝트 폴더 외부
		// 2. 프로젝트 폴더 내부
		// - 관리 용이
		// - 프로젝트 위치 이동 > 파일 같이



		try {

			/*
			
				콘솔 명령어
				
				
				1. dir
					- 현재 디렉토리의 목록(내용물) 보여주세요.
				2. cd
					- change directory
					- cd 자식폴더명	> 자식 폴더로 이동
					- cd ..   > 부모 폴더로 이동
					- C:\class\java\data.txt
					
				자원 경로 표현법
				1. 절대 경로
					- 기준점: 절대 위치
					- ex) 홍길동, A6열에 앉아있는 사람
					
				2. 상대 경로
					- 기준점: 상대 위치
					- ex) 나, 앞에 앉아 있는 사람 
					- .\data.txt	> .은 자기 자신(즉 현재 위치의 폴더에서 data.txt를 찾아라)
					- .\file\member.txt		
					
					
					
					
			*/

			// 프로젝트 할 때 위와 같이 상대 경로 쓰기
			File file = new File("data\\data.txt"); // 현재 폴더를 .이라고 하니까! > 상대 경로

			// System.out.println(file.getAbsolutePath()); //절대 경로 C:\class\java\JavaTest\.
			// System.out.println(file.getPath()); //. File 생성때 표현을 그대로 반환


			// 파일 수정하기(****)
			// - 파일 입출력(스트림)에는 수정이라는 행동이 없다.
			// - 덮어쓰기로 구현한다.(우리가 알고 있는 수정이라는 행동은 모두 덮어쓰기로 실행이 됐던 것이다.)


			BufferedWriter writer = new BufferedWriter(new FileWriter(file));



			writer.write("테스트");

			writer.close();

			System.out.println("종료");



		} catch (Exception e) {
			System.out.println("Ex64_File.m1");
			e.printStackTrace();
		}

	}

}


class User {

	// 번호,이름,나이
	// 1,홍길동,20

	private String no;
	private String name;
	private int age;

	public User(String no, String name, int age) { // 생성자
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", age=" + age + "]";
	}



}
