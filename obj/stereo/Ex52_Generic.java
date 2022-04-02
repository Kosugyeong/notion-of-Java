package com.test.java.obj.stereo;

public class Ex52_Generic {
	public static void main(String[] args) {

		// 클래스 종류
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상 클래스
		// 4. enum
		// 5. 제네릭 클래스



		// 제네릭, Generic
		// 1. 제네릭 클래스
		// 2. 제네릭 메소드


		// 요구사항] 클래스 설계
		// 1. 멤버 변수 선언 > int
		// 2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언

		// 추가사항] String을 중심으로 하는 클래스를 추가 설계
		// 추가사항] boolean을 중심으로 하는 클래스를 추가 설계
		// 추가사항] double
		// 추가사항] byte
		// 추가사항] Calendar
		// 추가사항] 무한대... > 요구를 할 때마다 클래스를 만들면 생산성이 좋지 않다. >



		// 위의 문제점 > 해결방안
		// 1. Object 클래스 > 오래된 방식
		// 2. 제네릭 클래스 > 최신 방식


		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();

		/* Object */
		WrapperObject n2 = new WrapperObject(20); // 범용(만능) > 사용할 때 다운캐스팅이 필요
		System.out.println(n2.toString());// 20으로 잘 찍힘
		System.out.println((int) n2.getData() * 2); // getData()에 숫자가 들어있으니까 자기 타입인 int로 다운캐스팅 해야함
													// 그래야 산술연산 가능.
		System.out.println();
		System.out.println();

		/* 제네릭 */
		Wrapper<Integer> n3 = new Wrapper<Integer>(20); // 범용(만능) > 사용할 때 바로 사용 가능 다운캐스팅이 필요없다.
		System.out.println("제네릭: " + n3.toString());
		System.out.println(n3.getData() * 2); // 제네릭의 장점 다운캐스팅 안해도 산술연산이 된다.

		System.out.println();



		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();

		/* Object */
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.toString());
		System.out.println(((String) s2.getData()).length()); // (String)으로 다운캐스팅 하고 겉으로 괄호를 또
																// 묶어줘야함!!!!! 그래야 .length가 나옴
		System.out.println();
		System.out.println();


		/* 제네릭 */
		Wrapper<String> s3 = new Wrapper<String>("테스트");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length()); // 범용 클래스 역할 + 전용 클래스 사용법
		System.out.println();
		System.out.println();


		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();

		/* Object */
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		System.out.println((boolean) b2.getData() ? "참" : "거짓");
		System.out.println();

		/* 제네릭 */
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");


	}// main

}// Ex52


class WrapperInt {

	private int data; // 클래스의 중심이 되는 데이터!!!

	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}



}


class WrapperString {

	private String data; // 클래스의 중심이 되는 데이터!!!

	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}



}


class WrapperBoolean {

	private boolean data; // 클래스의 중심이 되는 데이터!!!

	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}



}


// Object 클래스
class WrapperObject {

	private Object data; // 클래스의 중심이 되는 데이터!!! > Object로 바꾸는 순간 모든 자료형을 넣을 수 있는 상태가 됨!!!

	public WrapperObject(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}



}



// 제네릭 클래스
class Wrapper<T> {

	private T data; // 클래스의 중심이 되는 데이터!!

	public Wrapper(T data) { // 생성자
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}

}


