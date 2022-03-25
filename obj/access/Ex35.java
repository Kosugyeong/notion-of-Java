package com.test.java.obj.access;

public class Ex35 {
	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		cpu.setModel("Intel i5");
		cpu.setSpeed("1.8");
		
		MainBoard mainboard= new MainBoard();
		mainboard.setModel("M5000");
		
		Storage storage = new Storage();
		storage.setModel("SM");
		storage.setType("SSD");
		storage.setSize(500);
		
		Computer computer = new Computer();
		//조립이라고 보면 됨. 컴퓨터에 부품 끼우는 모습
		computer.setCpu(cpu);
		computer.setMainboard(mainboard);
		computer.setStorage(storage);
		
		
		Memory memory = new Memory();
		computer.setMemory(memory); //첫번째 메모리
		
		Memory memory2 = new Memory();
		computer.setMemory(memory2); //두번째 메모리 
		
		Memory memory3 = new Memory();
		computer.setMemory(memory3); //세번째 메모리 
		
		Memory memory4 = new Memory();
		computer.setMemory(memory4); //네번째 메모리 
		
//		Memory memory5 = new Memory();
//		computer.setMemory(memory5); //다섯번째 메모리 > 들어가지 못함. 자리가 없음.  
		
		computer.removeMemory();
		computer.removeMemory();
		computer.removeMemory();
		computer.removeMemory();
		//computer.removeMemory(); > 4개를 다 지우고 나면 더 이상 지울게 없음. 
		
		
//		Memory[] mlist = new Memory[2];
//		
//		Memory m1 = new Memory();
//		mlist[0] = m1;
//		
//		//위와 같이 m1 굳이 안만들과 아래와 같이 new Memory 바로 써도됨.
//		mlist[1]= new Memory();
//		
//		computer.setMemorylist(mlist);
		
		
		
		User hong = new User();
		
		hong.setNick(0, "강아지");
		hong.setNick(1, "천재");
		hong.setNick(2, "뚱보");
		
		System.out.println(hong.getNick(1));
		
		
		
		
		
		
	}//main

}//Ex35


//컴퓨터
//- CPU
//- MainBoard
//- Memory
//- Storage

class Computer{
	
	private CPU cpu;
	private MainBoard mainboard;
	
	private int i = 0; //메모리 관리 변수
	private Memory[] memorylist = new Memory[4]; //class 멤버변수에 배열이 들어간 모습이다! ******
	
	private Storage storage;
	
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public MainBoard getMainboard() {
		return mainboard;
	}
	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	
	
	
//	public Memory[] getMemorylist() {
//		return memorylist;
//	}
//	public void setMemorylist(Memory[] memorylist) {
//		this.memorylist = memorylist;
//	}
	
	
	//*****스타일 1. 메모리를 자동으로 관리. 
	
	public void setMemory(Memory memory) { //이와 같은 로직 기억하기 !!!
		
		if(i==4) {
			System.out.println("더 이상 남아있는 메모리 슬롯이 없습니다.");
			return;  //빈 리턴문 > 메소드 중지!!
		}
		
		
		this.memorylist[i]=memory;
		i++;
		
	}
	
	public void removeMemory() {
		
		if(i==0) {
			System.out.println("더 이상 제거 가능한 메모리가 없습니다.");
			return;
		}
		
		
		i--; //4까지 다 찼으면 i가 인덱스 3까지 들어가고서 i++의 코드로 인해 4가 되므로 i를 먼저 뺴고 시작해야함. 
		this.memorylist[i] = null; //NULL 상수, NULL 리터럴 > 주소값이 사라짐 > 참조를 잃어버리므로 쓰레기값이 됨 즉, 삭제가 되는 것이다. 
		
	}
	
	
	
}

class CPU{
	private String model;
	private String speed;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
}

class MainBoard{
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
class Memory{
	private String model;
	private int size;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
class Storage{
	private String model;
	private String type;
	private int size;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}


class User {
	
	private String name;
	private int age;
	private String[] nick = new String[10]; //별명 
	
	
	
	//*****스타일 2. 반수동으로 배열 인덱스에 접근해서 관리. 
	public void setNick(int index, String value) {
		this.nick[index] = value;
	}
	
	public String getNick(int index) {
		return this.nick[index];
	}
	
}


