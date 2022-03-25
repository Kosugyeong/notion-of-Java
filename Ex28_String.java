package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex28_String {
	public static void main(String[] args) throws Exception {

		// 문자열, String
		// - JDK 제공하는 문자열 조작 기능
		// - 문자열의 실체


		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		//m12();
		//m13();
		//m14();
		m15();
		
		// String
		// 1. length() > 문자열 길이
		// 2. charAt(index) > 문자 추출
		// 3. indexOf(search, index) > 위치 검색
		// 4. trim() > 공백 제거
		// 5. toUpperCase(), toLowerCase() > 대소문자 변환
		// 6. startsWith(word), endsWith(word) > 패턴 검색
		// 7. substring(begin, end) > 문자열 추출
		// 8. contains(word) > 문자열 검색
		// 9. replace(old, new) > 문자열 치환
		
	}// main

	private static void m15() {
		
		//문자열 분리
		//- String[] split(String delimiter)
		//- 문자열을 구분자를 기존으로 쪼개는 메소드
		
		String name = "홍길동,아무개,하하하,강호동,유재석";
		
		String[] list = name.split(","); //구분자는 사라진다.(***)
		//String[] list = name.split("."); //TODO 없는 구분자를 입력하면 어떻게 되지??
		
		for(int i=0; i<list.length;i++) {
			System.out.println(list[i]);
		}
		//홍길동
		//아무개
		//하하하
		//강호동
		//유재석
		
		
		String txt = "홍길동입니다.";
		char [] clist = txt.toCharArray(); //TODO 이 부분 기억하기 
		System.out.println(Arrays.toString(clist));
		
		char[] clist2 = new char[txt.length()];
		
		for(int i=0;i<clist2.length;i++) {
			clist2[i]=txt.charAt(i);
		}
		System.out.println(Arrays.toString(clist2));
		
		
	}

	private static void m14() {
		//문자열 치환(바꾸기)
		//- String replace(String old, String new)
		//- 문자열의 일부를 다른 문자열로 교체하는 메소드
		
		String txt = "안녕하세요. 홍길동입니다. 저를 홍길동이라고 부르세요.";
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판에 글을 작성합니다. 바보야!!";
		String word = "바보";
		
		//Masking 
		System.out.println(content.replace(word, "**"));
		
		txt = "     하나     둘     셋     ";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		System.out.printf("[%s]\n", txt.replace(" ", "")); //글자 사이 공백을 빈 문자열로 대체 
														//    > replace로 무언가를 제거하고 싶으면 ""로 교체하면 된다. 
		System.out.printf("[%s]\n", txt.replace("하나", "")); //"하나" 제거
		
		
		
		
	}

	private static void m13() {
		
		//문자열 검색
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동")); //true
		System.out.println(txt.contains("아무개")); //false
		
		System.out.println(txt.indexOf("홍길동")>-1);//true > 발견
		
		
	}

	private static void m12() {

		// 문자열 추출
		// - String substring(int beginIndex, int endIndex)
		// - String substring(int beginIndex)
		// - beginIndex: 포함(inclusive)
		// - endIndex: 미포함(exclusive)

		String txt = "가나다라마바사아자차카타파하";

		System.out.println(txt.substring(3, 7)); // 라마바사
		System.out.println(txt.charAt(5)); // 자료형: char > '바'
		System.out.println(txt.substring(5,6));//자료형: String > "바" >> 보통은 문자열로 많이 추출함
		System.out.println();
		
		
		//정형화된 데이터
		String jumin = "950322-2014785";
		
		//성별?
		System.out.println(jumin.charAt(7)=='1'?"남자":"여자");
		System.out.println(jumin.substring(7,8).equals("1")?"남자":"여자");
		
		//몇년생?
		System.out.println(jumin.charAt(0)+jumin.charAt(1)); //문자코드값이 돼서 int로 값이 나옴. > '9'(57) + '5'(53) > 110
		System.out.println(""+jumin.charAt(0)+jumin.charAt(1)); //charAt에서 문자열처럼 95로 뽑고 싶으면 맨 앞에 ""를 더해주면 된다.
																//근데 이렇게는 거의 아예 안씀 > 문자열은 substring으로 쓰자. 
		System.out.println(jumin.substring(0,2)); //95
		
		//몇월생? 
		System.out.println(jumin.substring(2,4));
		
		//몇일생?
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		
		//파일 경로
		String path = "C:\\class\\JavaTest\\Hello.java";
		
		//1. 파일명 추출
		int index = path.lastIndexOf("\\");
		//System.out.println(index);//17
		//String filename = path.substring(index + 1,path.length()); //시작위치~끝위치 추출
		String filename = path.substring(index + 1); // 시작 위치에서 끝까지 추출
		System.out.println(filename); //Hello.java
		
		//2. Hello.java
		// > 확장자 없는 파일명 추출 > Hello
		
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0,index);
		System.out.println(filenameWithoutExtension); //Hello
		
		//3. 확장자만 추출
		String extension = filename.substring(index);
		System.out.println(extension); //.java
		
		
		
		
		
	}

	private static void m11() {

		// 왼쪽 -> 오른쪽 으로 검색
		// - int indexOf(char)
		// - int indexOf(String)
		// - int indexOf(char,int)
		// - int indexOf(String,int)

		// 오른쪽 -> 왼쪽 으로 검색
		// -int lastIndexOf(char)
		// -int lastIndexOf(String)
		// -int lastIndexOf(char,int)
		// -int lastIndexOf(String,int)


		String txt = "홍길동 자바 공부 홍길동";

		System.out.println(txt.indexOf("홍길동")); // 0
		System.out.println(txt.indexOf("홍길동", 0 + 3)); // 10

		System.out.println(txt.lastIndexOf("홍길동")); // 10
		System.out.println(txt.lastIndexOf("홍길동", 9)); // 0 > 앞에 있는 홍길동 찾아줌



	}

	private static void m10() {

		// 패턴 검색
		// - boolean startsWith(String word)
		// - booldean endsWith(String word)

		String txt = "자바 오라클 프로그래밍";

		System.out.println(txt.startsWith("자바")); // 이 문자열이 "자바"로 시작합니까? > true
		System.out.println(txt.startsWith("오라클"));// 이 문자열이 "오라클"로 시작합니까? > false

		String name = "홍길동";

		System.out.println(name.startsWith("홍")); // true > 아래 두 코드와 비교했을 때 가독성이 제일 좋음
		System.out.println(name.charAt(0) == '홍'); // true
		System.out.println(name.indexOf('홍') == 0); // true

		System.out.println(txt.endsWith("프로그래밍"));// true
		System.out.println(txt.endsWith("밍"));// true

		System.out.println(name.endsWith("동"));// ture
		System.out.println(name.endsWith("석"));// false
		System.out.println(name.charAt(name.length() - 1) == '동');// true
		System.out.println(name.indexOf('동') == name.length() - 1);// true
		System.out.println();


		// 파일 경로(파일명)
		String path = "C:\\class\\java\\JavaTest\\Ex28_String.java";

		// 해당 경로의 파일이 자바 소스파일입니까? > 확장자 검사
		if (path.endsWith(".java")) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		String img = "dog.GIF";


		// 해당 파일이 이미지 파일입니까? > /.jpg, .jpeg, .gif, .png
		if (img.toLowerCase().endsWith(".jpg") || img.toLowerCase().endsWith(".jpeg")
				|| img.toLowerCase().endsWith(".gif") || img.toLowerCase().endsWith(".png")) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("다른 종류 파일");
		}



	}

	private static void m9() {

		// 문자열 댇소문자 변경
		// - String toUpperCase() > 문자열의 모든 문자를 대문자로 변환
		// - String toLowerCase() > 문자열의 모든 문자를 소문자로 변환

		String content = "오늘 수업하는 과목은 Java입니다.";
		String word = "java";

		System.out.println(content.toUpperCase());
		System.out.println(word.toUpperCase());

		// 대소문자 구분(Case sensitive)
		// - 정확도 높음
		// - 검색율 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 있음");
		} else {
			System.out.println("결과 없음");
		}

		// 대소문자 구분 X (Case insensitive) > 정확도 높음 > 검색율 낮음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 있음");
		} else {
			System.out.println("결과 없음");
		}

		// 메소드 체인
		// - 코딩 패턴 중 하나 > 패턴 > 패러다임 > 함수형 프로그래밍
		// - 문자열.메소드().메소드().메소드()
	}

	private static void m8() {

		// 게시판 글쓰기 > 금지어!!

		String word = "바보";
		String content = "안녕하세요. 야!! 멍청이 저는 자바를 배우는 학생입니다. ";// 글쓰기


		if (content.indexOf(word) > -1) { // 금지어를 발견!!(indexOf는 주어진 문자를 못찾으면 -1을 반환하므로 -1보다 큰 수가
											// 반환되면 찾은것.
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행...");
		}
		String[] words = {"바보", "멍청이", "메롱"};

		for (int i = 0; i < words.length; i++) {
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			}
		}
		System.out.println("완료");

		// 주민등록번호 '-'
		String jumin = "950510-2012541";

		if (jumin.charAt(6) == '-') { // 1번째 방법 charAt으로
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		if (jumin.indexOf('-') == 6) {// 2번째 방법 indexOf으로.
			System.out.println("O");
		} else {
			System.out.println("X");
		}

	}

	private static void m7() {

		// 문자열 검색(***********)
		// - 문자열 내에서 원하는 문자(열)을 검색 > 발견한 위치(index) 반환
		// - 처음 만난 검색의 위치를 반환한 뒤 종료(뒤에 반복되는 검색어는 검색 안함)
		// - int indexOf(char c)
		// - int intdexOf(String s)
		// - int indexOf(char c, int beginIndex)
		// - int intdexOf(String s, int beginIndex)


		String txt = "안녕하세요. 홍길동입니다.";

		int index = -1;
		index = txt.indexOf('하');
		System.out.println(index); // 2

		index = txt.indexOf('홍');
		System.out.println(index); // 7

		index = txt.indexOf('강'); // 없는 값
		System.out.println(index); // -1 > 못찾았기 때문에.

		index = txt.indexOf("홍길동");
		System.out.println(index); // 7 > 시작하는 위치 반환함.

		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 네 홍길동입니다.";

		index = txt.indexOf("홍길동");
		System.out.println(index); // 7

		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // 22

		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // 32
	}

	private static void m6() {

		// 문자열 공백 제거
		// - String trim()
		// - 문자열에 존재하는 공백(Whitespace > 스페이스, 탭, 개행)을 제거하는 메소드
		// - 문자열의 시작과 끝에 존재하는 공백 문자를 제거한다. 문자열 중간에 있는 공백은 제거되지 않는다.
		// - 불필요하거나 or 사용자 실수로 생긴 공백 제거 역할
		String txt = "     하나     둘     셋     ";

		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());

	}

	private static void m5() {

		// 951005-1021457
		// - 중간에 '-' 반드시 입력
		String jumin = "951005-1021457";

		if (isValidJumin(jumin)) {
			System.out.println("올바른 주민번호");

			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}

		} else {
			System.out.println("올바르지 않은 주민번호");
		}


	}

	private static boolean isValidJumin(String jumin) {

		if (jumin.charAt(6) == '-') {
			return true;
		} else {
			return false;
		}



	}

	private static void m4() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 회원 가입
		// - 이름 입력 > 길이(2~5자) + 한글만 가능

		System.out.print("이름: ");
		String name = reader.readLine();

		if (isValid(name)) {
			System.out.println("올바른 이름");

		} else {
			System.out.println("올바르지 않은 이름");
		}
	}

	private static boolean isValid(String name) { // *****유효성 검사는 이런식으로!!!!!!!!!

		// 조건이 두 개 이상일 때는 올바르지 않은것부터 찾게 하기!!! 조건에 위배되는것들 먼저 찾게 하기.

		if (name.length() < 2 || name.length() > 5) { // 1. 첫번째 검사 (너 2자~5자를 만족시키지 않지?)
			return false;

		}

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c < '가' || c > '힣') { // 2. 두번째 검사 ( 너 한글 조건 만족 안하지?)
				return false;
			}
		}

		return true; // 여기까지 내려왔다는 것은 위 if문들을 다 통과해서 올바르다는 것.

	}



	private static boolean isValid2(String name) {

		// 길이 검사
		// 한글 검사

		// 코드 위상 > 들여쓰기 증가

		// 길이 검사
		if (name.length() >= 2 && name.length() <= 5) { // 1. 첫번째 검사

			// 한글 검사
			for (int i = 0; i < name.length(); i++) { // 2. 두번째 검사
				char c = name.charAt(i);

				if (c >= '가' && c <= '힣') {

				} else {
					return false;

				}
			}

			return true; // *** 입력 문자 모두가 한글인게 확인된 위치!!

		} else {
			return false;
		}



	}

	private static void m3() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 아이디 입력 > 올바른 아이디 검사
		// - 영어 소문자

		System.out.print("아이디: ");
		String id = reader.readLine();

		for (int i = 0; i < id.length(); i++) {

			char c = id.charAt(i);
			// System.out.println(c);

			// 문자 코드값 비교
			if (c < 'a' || c > 'z') { // 영소문자가 아니냐?
				System.out.println("잘못된 문자가 발견되었습니다. ");
				break;

			}

		}
		System.out.println("종료");



	}

	private static void m2() {

		// 문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메소드
		// - Zero-based Index

		String txt = "안녕하세요. 홍길동입니다.";

		char c = txt.charAt(3);
		System.out.println(c); // 세

		c = txt.charAt(7);
		System.out.println(c); // 홍
		//
		// c=txt.charAt(14);
		// System.out.println(c); // java.lang.StringIndexOutOfBoundsException:


		// 마지막 문자
		c = txt.charAt(txt.length() - 1);
		System.out.println(c);

	}

	private static void m1() throws Exception {

		// 문자열 <=> 문자
		// String <=> char
		// 문자열 = 문자의 집합

		// 문자열 없는 언어 > 문자 배열 > String == char[]

		// 문자열 조작 기능 == 배열 조작 기능 유사


		// 문자열 길이
		// - 문자열을 구성하는 문자의 개수(글자수)
		// - int length()

		int[] nums = {10, 20, 30};
		System.out.println(nums.length); // 프로퍼티(변수)

		String str = "홍길동입니다.";
		System.out.println(str.length()); // 메소드

		char[] clist = {'홍', '길', '동', '입', '니', '다', '.'};
		System.out.println(clist.length); // 7

		System.out.println("아무개입니다.".length()); // 7

		// 요구사항] 사용자 입력 > 문자수?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("문자 입력: ");
		String statement = reader.readLine();

		System.out.printf("입력한 문장은 %d개의 문자로 구성되었습니다.\n", statement.length());

		// 유효성 검사
		// - 이름 입력
		// - 2자 ~ 5자 이내
		if (statement.length() >= 2 && statement.length() <= 5) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름은 2자 ~ 5자 이내");
		}


	}

}


