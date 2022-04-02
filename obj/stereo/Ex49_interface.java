package com.test.java.obj.stereo;

public class Ex49_interface {
	
	public static void main(String[] args) {
		
		//다중 상속
		//- 자바에서는 다중 상속을 지원하지 않는다. (부모 클래스가 두 개 이상일 수가 없다.) > 어렵다(복잡)
		
		//- 자바에서는 인터페이스에 한해서 다중 상속을 지원한다. > 매우 활발하게 사용 중..
		
	}//main

}//Ex49

//인터페이스 == 규격(제약) == 자격

//아빠로서 갖춰야할 행동에 대한 정의..
interface 아빠 {
	
	void 돈을번다();
	void 아이와놀아준다();
	void 가족을지킨다();
	
	
}

interface 남자 {
	
	void 굵은목소리로말한다();
	void 면도를한다();
	
}

interface 과장 {
	
	void 결재를한다();
	void 직원을관리한다();
	
	
}

interface 카페사장{
	
	void 매장을연다();
	void 매장을닫는다();
	void 음료를판다();
	
}

//진짜 사람 > 아빠 역할
class 홍길동 implements 아빠{

	//여러가지 멤버 구현..
	
	@Override
	public void 돈을번다() {
		
	}

	@Override
	public void 아이와놀아준다() {
		
	}

	@Override
	public void 가족을지킨다() {
		
	}
	
	
	
}

class 가가가 implements 아빠 {

	@Override
	public void 돈을번다() {
		
	}

	@Override
	public void 아이와놀아준다() {
		
	}

	@Override
	public void 가족을지킨다() {
		
	}
	
}

class 아무개 implements 과장{

	@Override
	public void 결재를한다() {
		
	}

	@Override
	public void 직원을관리한다() {
		
	}
	
}

//결혼(아빠) + 과장 + 남자 + 카페사장 > 다중상속
class 테스트 implements 아빠, 과장, 남자, 카페사장 {

	@Override
	public void 결재를한다() {
		
	}

	@Override
	public void 직원을관리한다() {
		
	}

	@Override
	public void 돈을번다() {
		
	}

	@Override
	public void 아이와놀아준다() {
		
	}

	@Override
	public void 가족을지킨다() {
		
	}

	@Override
	public void 매장을연다() {
		
	}

	@Override
	public void 매장을닫는다() {
		
	}

	@Override
	public void 음료를판다() {
		
	}

	@Override
	public void 굵은목소리로말한다() {
		
	}

	@Override
	public void 면도를한다() {
		
	}
	
}










