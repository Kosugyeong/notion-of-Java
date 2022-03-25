package com.test.java.obj.constructor;

public class Ex37_Constructor {
	public static void main(String[] args) {
		
		//공산품 > 일괄적 초기화 > model(M705), price(40000)
		Mouse m1 = new Mouse();
		
		Mouse m2 = new Mouse();
		
		Mouse m3 = new Mouse();
		
		
		//객체의 초기 상태 > 상황에 따라 달라질 수 있다. > 생성자의 매개변수 사용
		Mouse m4 = new Mouse(35000); // 모델명 기본값(M705) + 가격 지정
		
		//QC > 불량품> discount > 35000
		
		
		Mouse m5 = new Mouse("A100"); //모델명 지정 + 가격은 기본값(40000)으로.
		
		Mouse m6 = new Mouse("B123",30000); //모델명 지정 + 가격 지정
		
		System.out.println(m1.getModel()+"," + m1.getPrice());
		System.out.println(m2.getModel()+"," + m2.getPrice());
		System.out.println(m3.getModel()+"," + m3.getPrice());
		System.out.println(m4.getModel()+"," + m4.getPrice());
		
	}

}

class Mouse{ //생성자 여러 개 있어도 됨 > 오버로딩을 해서 입맛에 따라 골라서 초기화할 수 있으므로
	
	private String model;
	private int price;
	
	public Mouse() { //기본값으로 초기화해주는 기본생성자
		this.model = "M705";
		this.price = 40000;
		
	}
	
	public Mouse(int price) { //매개변수로 넘어오는 값으로 초기화하는 생성자
		this.model = "M705";
		this.price = price;
	}
	
	public Mouse(String model) {
		this.model = model;
		this.price = 40000;
	}
	
	public Mouse(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}