package com.test.java.student;

//성적 컨테이너
public class Score {
	
	private String seq;
	private int kor;
	private int eng;
	private int math;
	public Score(String seq, int kor, int enng, int math) {
		super();
		this.seq = seq;
		this.kor = kor;
		this.eng = enng;
		this.math = math;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "Score [seq=" + seq + ", kor=" + kor + ", enng=" + eng + ", math=" + math + "]";
	}
	
	
	
}
