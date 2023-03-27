package com.javalab;

/*
 * 학과 클래스
 * 920, "컴퓨터공학과", "201호"
 * 923, "산업공학과", "207호"
 * 925, "전자공학과", "308호"
 */

public class Department {
	// 필드
	int id;
	String name;
	String office;

	// 기본 생성자
	public Department() {
	}

	// 오버로딩 생산자
	public Department(int id, String name, String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

}
