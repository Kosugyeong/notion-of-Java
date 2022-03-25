package com.test.java.obj.constructor;

public class Ex36_Constructor {
	public static void main(String[] args) {

		/*
		
		생성자, Constructor
		- (특수한 목적을 가지는) 메소드
		- 객체 멤버(변수)를 초기화하는 역할을 가지는 메소드
		- 일반 메소드처럼 마음대로 호출이 불가능하다. ? 객체가 생성될 때 딱 1번만 호출된다. > 그 뒤에는 호출이 불가능 > 1회용!!!
		- 클래스 이름과 동일한 이름을 가진다.
		
		
		
		
		new, 객체 생성 연산자
		
		
		
		*/

		User u1 = new User();//오브젝트를 만드는 과정 중에 필수적으로 호출되는 메소드 > 생성자 

		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isFlag());
		System.out.println();
		System.out.println();
		
		
		//하얀색, 미정
		
		Cup c1 = new Cup();
		
		
		//Setter 역할 > 객체 정보 수정
		c1.setColor("yellow");
		c1.setOwner("홍길동");
		
		
		Cup c2 = new Cup();
		
//		c2.setColor("white");
//		c2.setOwner("미정");
		
		c1.info(); //색상: white, 소유주: 미정 > 초기화를 하지 않았는데도 생성자에 초기화한 것으로 인해 자동으로 초기화가 됨.
		c2.info(); //색상: white, 소유주: 미정
		

	}//main

}

class Cup {
	
	private String color;
	private String owner;
	
	//기본 생성자는 개발자가 작성 안하면 자동 생성된다.
	//기본 생성자는 개발자가 작성하면 자동 생성이 안된다. 
	//개발자는 기본 생성자를 생성 후 일부멤버를 초기화를 안해도 그 일부 멤버에 한해서는 자동으로 초기화 코드가 작성된다.
	//**** > 객체의 멤버 변수는 반드시 초기화 과정을 거치게 된다. (개발자가 하든, 컴파일러가 자동으로 초기화를 해주든간에. )
	public Cup() { //생성자 > 컵이 만들어질 때마다 반드시 호출되는 메소드!!! > 생성자가 초기화를 함.!!
		
		this.color="white";
		this.owner="미정";		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public void info() {
		System.out.printf("색상: %s, 소유주: %s\n", this.color,this.owner);
	}
	
	
}



class User {

	private String name;
	private String id;
	private int age;
	private boolean flag;

	// 기본 생성자
	// 1.메소드명 == 클래스명
	// 2. 반환값 명시 안함 > 생성자 반환값을 가질 수 없다. > 표현 안함
	// 3. return문 가질 수 없다.
	// 4. 구현부는 해당 클래스의 멤버를 초기화하는 코드를 작성한다.(****)
	 public User() {
		 
//		 this.name = null;
//		 this.id = null;
//		 this.age=0;
//		 this.flag = false;
		 
		 this.name = "익명";
		 this.id = "none";
		 this.age=-1;
		 this.flag = true;
		 
	
	 }



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}


}
