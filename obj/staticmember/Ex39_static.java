package com.test.java.obj.staticmember;

public class Ex39_static {
	
	//1. 클래스 로딩, Class Loading
	//- 해당 프로그램을 실행하기 전에 클래스의 정의를 미리 읽어서 메모리에 얹는 작업
	//- 설계도를 미리 읽어서 언제든지 사용 가능하게 메모리에 올려놓는 작업
	//- 클래스 로딩 과정에서 발견되는 모든 static 멤버는 메모리에 구현된다. main이 실행되기도 전에!! 제일 먼저.(*********************)
	//2. main()
	
	public static void main(String[] args) {

		// static 키워드
		// - 클래스 멤버에 붙이는 키워드(***)
		// - 클래스에 붙이는 키워드
		// 1. 멤버 변수에 붙일 수 있다.
		// 2. 멤버 메소드에 붙일 수 있다.
		// 지역변수에는 붙일 수 없다.

		// 학생 3명 > 300명
		// "역삼 중학교" > 개명 > "대치 중학교" > 300번 고치려면 동일한 데이터를 반복해서 저장하니 메모리 차지도 많이 하고 유지보수에도 힘들다.

		
		//TODO static 메소드는 접근할 때 앞에 클래스명을 붙인다. (****)
		Student.setSchool("역삼 중학교");
		
		
		Student s1 = new Student();

		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼 중학교");

		System.out.println(s1.info());


		Student s2 = new Student();

		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼 중학교");

		System.out.println(s2.info());

		Student s3 = new Student();

		s3.setName("테스트");
		s3.setAge(16);
		//s3.setSchool("역삼 중학교");

		System.out.println(s3.info());


	}

}


// 학생 클래스
// - "역삼 중학교" > 모든 학생
class Student {

	// 클래스 멤버 변수 = 객체 변수 + 정적 변수

	// 객체 변수 => 각 개인(객체)이 각자 저장할 데이터를 저장하는 변수 , 나만의 데이터(*****) > 개인의 특성(*****)
	private String name;
	private int age;

	// static 들어가면!!! 정적 변수, static 변수, 클래스 변수, 공용 변수(다같이 쓰는 변수니까)
	//=> 하나의 클래스로부터 만들어진 모든 객체가 공통으로 가지는 데이터를 저장하는 변수
	//- 모든 객체의 공통된 특성(****)
	//- 공용 사물함
	private static String school;

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
	// public String getSchool() {
	// return school;
	// }
	// public void setSchool(String school) {
	// this.school = school;
	// }


	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}

	public String info() {
																				
		return String.format("이름: %s\n나이: %d\n학교: %s\n", this.name, this.age, Student.school);


	}
}



// class Student {
//
// private String name;
// private int age;
// private String school;
// public String getName() {
// return name;
// }
// public void setName(String name) {
// this.name = name;
// }
// public int getAge() {
// return age;
// }
// public void setAge(int age) {
// this.age = age;
// }
// public String getSchool() {
// return school;
// }
// public void setSchool(String school) {
// this.school = school;
// }
//
// public String info() {
//
// return String.format("이름: %s\n나이: %d\n학교: %s\n", this.name,this.age,this.school);
//
// }
//
// }

