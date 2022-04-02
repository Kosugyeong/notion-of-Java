package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Ex58_Queue {
	public static void main(String[] args) {

		// Queue > 인터페이스! 클래스가 아님.
		// - 선입선출

		Queue<String> queue = new LinkedList<String>();

		// 1.요소 추가하기
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");

		// 2. 요소 개수
		// - int size()
		System.out.println(queue.size());

		// 3. 요소 읽기(=꺼내기)
		System.out.println(queue.poll()); // 노랑
		System.out.println(queue.size());

		System.out.println(queue.poll()); // 파랑
		System.out.println(queue.size());

		System.out.println(queue.poll()); // 빨강
		System.out.println(queue.size());

		System.out.println(queue.poll()); // null > 데이터가 아무것도 없어도 에러가 안나고 null을 반환함
		System.out.println(queue.size());

		// 4. 비었는지?
		System.out.println(queue.size() == 0);
		System.out.println(queue.isEmpty());


		// 5. 요소 확인
		queue.add("주황");
		queue.add("초록");
		System.out.println(queue.peek());// 주황
		System.out.println(queue.size());// 2

		// 6. 전부 지우기
		queue.clear();
		System.out.println(queue.size()); // 0

	}

}
