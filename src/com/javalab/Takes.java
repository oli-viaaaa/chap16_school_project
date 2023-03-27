package com.javalab;

public class Takes {

	// 필드
	String id; //학번
	String subject; //과목
	String score; //점수
	
	// 기본 생성자
	public Takes() {
	}
	
	// 오버로딩 생성자
	public Takes(String id,String subject,String score) {
		this.id = id;
		this.subject =subject;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
}
