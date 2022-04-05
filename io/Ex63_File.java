package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex63_File {

	public static void main(String[] args) {

		/*
		
			1. 파일/디렉토리 조작
			
			2. 파일 입출력
			- 자바 프로그램 <-> (데이터) <-> 저장 장치
			- 메모장
			
			저장 장치(HDD, SSD)
			- 데이터 1, 0으로 저장
			- 데이터의 자료형 존재X
			
			인코딩, Encoding
			- 문자 코드(응용 프로그램의 데이터)를 부호화(1,0) 시키는 작업
			- 자바 프로그램("홍길동, String) -> 텍스트 파일("1010100010010")
			
			디코딩, Decoding
			- 부호 데이터를 문자코드로 변환하는 작업
			- 텍스트 파일("1010100010010") -> 자바 프로그램("홍길동, String)
			
			
			인코딩/디코딩 규칙
			- 저장 장치 혹은 네트워크 상에서 데이터를 표현하는 규칙
			1. ISO-8859-1
			2. EUC-KR
			3. ANSI
			4. MS949
			5. UTF-8
			6. UTF-16
			
			
			****외워야함
			ANSI(ISO-8859-1, EUC-KR, MS949)
			1. 영어(숫자, 특수문자, 서유럽): 1byte(한 글자 당)
			2. 한글(한자, 일본어 등): 2byte
			
			UTF-8 *** 이 인코딩을 사용한다.(국제 표준..)
			1. 영어: 1byte
			2. 한글: 3byte
			
			UTF-16
			1. 영어: 2byte
			2. 한글: 2byte
		
		
		*/

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		m8();
	}

	private static void m8() {
		
		//파일 읽기
		try {
			File file = new File("C:\\class\\java\\JavaTest\\src\\com\\test\\java\\Ex28_String.java");
			
			if(file.exists()) {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				
				String line = null;
				int n = 1;
				
				while((line = reader.readLine())!=null) {
					
					
					System.out.printf("%3d: %s\n",n,line);
					n++;
				}
				reader.close();
				
				
			}else {
				System.out.println("읽을 파일이 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("Ex63_File.m8");
			e.printStackTrace();
		}

	}

	private static void m7() {

		// 파일 쓰기
		// - FileWriter of BufferedWriter > 둘 중에 아무거나 써도 됨

		// 파일 읽기
		// - BufferedReader > 문장 단위로 읽을 수 있는건 얘밖에 없어서 얘 쓰는게 가장 편한다.

		// 맞춰서 쓰려면 둘 다 Buffered로 사용하거나 편할 걸 더 추구할거면 FileWriter


		// 파일 읽기
		try {

			// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //키 입력


			BufferedReader reader =
					new BufferedReader(new FileReader("C:\\class\\java\\file\\할일.txt")); // 파일 입력

			// 파일의 한줄을 읽기
			// String line = reader.readLine();
			// System.out.println(line);

			// line = reader.readLine();
			// System.out.println(line);

			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}


			reader.close();

		} catch (Exception e) {
			System.out.println("Ex63_File.m7");
			e.printStackTrace();
		}


	}

	private static void m6() { // 적극적으로 추천하는 방법은 아님

		try {

			// FileWriter
			// FileReader

			FileReader reader = new FileReader("C:\\class\\java\\file\\할일.txt");

			// int code = reader.read();
			// System.out.println(code);

			int code = -1;

			while ((code = reader.read()) != -1) {

				System.out.print((char) code);

			}

			reader.close();


		} catch (Exception e) {
			System.out.println("Ex63_File.m6");
			e.printStackTrace(); // 어디서 에러가 났는지와 에러메시지 같이 출력해줌.
		}

	}

	private static void m5() {

		// 파일 읽기
		try {

			// FileOustStream
			// FileInputStream

			FileInputStream stream = new FileInputStream("C:\\class\\java\\file\\data.txt");

			// int code = stream.read(); // 문자 코드값이니까
			// System.out.println(code);
			//
			// code = stream.read();
			// System.out.println(code);

			int code = -1;

			while ((code = stream.read()) != -1) { // 읽어올 글자가 없을 때 -1을 반환하니까!
				System.out.print((char) code); // 1byte단위로 읽어와서 잘 안씀 > 이렇게 하면 한글이 깨져서
			}

			stream.close();



		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void m4() {

		// 파일 쓰기
		try {

			// 범용 도구
			// - 설정에 따라 다양한 소스를 입출력하는 도구
			// - BufferedReader reader;
			// - BufferedWriter writer;

			// 전용 도구
			// - 파일을 대상으로 입출력하는 도구
			// - FileReader reader;
			// - FileWriter writer;

			// FileWirter보다 손이 더 간다...
			BufferedWriter writer =
					new BufferedWriter(new FileWriter("C:\\class\\java\\file\\list.txt"));

			writer.write("안녕하세요.");
			writer.newLine(); // writer.write("\n")
			writer.write("홍길동입니다.");

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void m3() { // > 이 방법 연습 많이 하기

		// 메모장 쓰기 > 콘솔 버전
		try {

			Scanner scan = new Scanner(System.in);

			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();

			FileWriter writer = new FileWriter("C:\\class\\java\\file\\" + filename + ".txt");

			boolean loop = true;

			while (loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();

				if (line.equals("exit")) { // exit 입력 시 종료
					break;
				}

				writer.write(line); // 한줄 입력 > 한줄 쓰기
				writer.write("\n");
			}

			// 자원 해제 코드, Clean-up Code
			scan.close();
			writer.close();

			System.out.println("쓰기 종료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m2() {

		// 쓰기 스트림
		try {

			// true를 넣으면 이어쓰기 모드, false를 넣거나 아무것도 안넣으면 그냥 생성모드(덮어쓰기모드)
			FileWriter writer = new FileWriter("C:\\class\\java\\file\\member.txt", true);

			writer.write("홍길동");
			writer.write("\n");
			writer.write("아무개");
			writer.write("\n");
			writer.write("하하하");

			writer.close();

			// 스트림은 close를 하면 끝. close를 적은 밑에 줄에는 wirte를 쓰면 안된다.

			System.out.println("종료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void m1() {

		// 파일 입출력

		// 파일 쓰기 > 파일 출력
		// - 스트림 생성(도구)

		// 쓰기 스트림 객체
		// 1. 생성모드(=덮어쓰기), Create Mode > 더 많이 사용!!!!
		// - 기본 방식
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 항상 파일을 덮어쓰기 한다.

		// 2. 추가 모드(=이어쓰기), Append Mode
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면.. 기존 내용을 그대로 두고, 추가로 데이터 저장한다.


		try {
			File file = new File("C:\\class\\java\\file\\data.txt");

			// 스트림 열기
			FileOutputStream stream = new FileOutputStream(file);

			// stream.write(65); //문자코드
			// stream.write(66); //문자코드
			// stream.write(67); //문자코드

			String txt = "Hello~ Hong~";

			for (int i = 0; i < txt.length(); i++) {
				stream.write(txt.charAt(i));
			}


			// 스트림 닫기 > 열린 스트림을 반드시 닫아야 한다.
			// - 닫지 않으면 저장이 안된다. close를 하는 순간 저장이 됨.
			// - 닫지 않으면 잠긴 파일이 된다.
			stream.close();

			System.out.println("종료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
