package com.javalab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 콘솔 화면에 보여줄 메뉴와 입력된 객체들에 관한 정보를 저장할 ArryList를 필드로 갖고 있는 클래스
 */

public class MenuSelect {

	// 필드
	// 학생 ArrayList
	List<Student> studentList = new ArrayList<Student>();
	// 교수 ArrayList
	List<Professor> professorList = new ArrayList<Professor>();
	// 학과 ArrayList
	List<Department> departmentList = new ArrayList<Department>();
	// 성적 ArrayList
	List<Takes> takesList = new ArrayList<Takes>();

	// 키보드에서 입력받을 Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	int ch;

	// 콘솔 화면에서 보여질 메인 메뉴를 보여주는 메소드
	public void displayMenu() {
		System.out.println("==================================");
		System.out.println("작업을 선택하세요.");
		System.out.println("----------------------------------");
		System.out.println("1. 학생등록");
		System.out.println("2. 교수등록");
		System.out.println("3. 학과등록");
		System.out.println("4. 성적등록");
		System.out.println("5. 학생조회");
		System.out.println("6. 교수조회");
		System.out.println("7. 학과조회");
		System.out.println("8. 성적조회");
		System.out.println("9. 종료");
		System.out.println("==================================");
	}

	// 사용자가 키보드로 입력한 값을 입력 받는 메소드
	public void selectMenu() {
		while (true) {
			displayMenu();
			System.out.println("작업을 선택하세요.");
			ch = scanner.nextInt();
			switch (ch) {
			case 1: // 학생등록
				while (true) {// while 학생을 연속으로 등록하려고 사용, 안써도 무관
					System.out.println("1. 학생등록 메뉴를 선택하셨습니다.");
					System.out.println("학번을 입력하세요");
					String id = scanner.next();
					System.out.println("학생명을 입력하세요");
					String name = scanner.next();
					System.out.println("학생 주민번호를 입력하세요");
					String jumin = scanner.next();
					System.out.println("학년을 입력하세요");
					int year = scanner.nextInt();
					System.out.println("주소를 입력하세요");
					String address = scanner.next();
					System.out.println("학과를 입력하세요");
					int department = scanner.nextInt();

					Student student = new Student(id, jumin, name, year, address, department);
					studentList.add(student);

					System.out.println("학생 정보가 성공적으로 저장되었습니다.");
					System.out.println();
					System.out.println("학생 정보를 추가적으로 입력하시겠습니까?");
					break;
				} // end while
				break; // end case 1

			case 2: // 교수 등록
				while (true) {
					System.out.println("2. 교수등록 메뉴를 선택하셨습니다.");
					System.out.println("교수 ID를 입력하세요");
					String id = scanner.next();
					System.out.println("교수 주민번호를 입력하세요");
					String jumin = scanner.next();
					System.out.println("교수명을 입력하세요");
					String name = scanner.next();
					System.out.println("교수 학과를 입력하세요");
					int department = scanner.nextInt();
					System.out.println("교수 grade를 입력하세요");
					String grade = scanner.next();
					System.out.println("입사일자를 입력하세요");
					String hiredate = scanner.next();

					Professor professor = new Professor(id, jumin, name, department, grade, hiredate);
					professorList.add(professor);

					System.out.println("교수 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break; // end case 2

			case 3: // 학과 등록
				while (true) {
					System.out.println("3. 학과등록 메뉴를 선택하셨습니다.");
					System.out.println("학과 번호를 입력하세요");
					int id = scanner.nextInt();
					System.out.println("학과를 입력하세요");
					String name = scanner.next();
					System.out.println("강의실을 입력하세요");
					String office = scanner.next();

					Department department = new Department(id, name, office);
					departmentList.add(department);

					System.out.println("학과 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break; // end case 3

			case 4: // 성적등록
				while (true) {
					System.out.println("4. 성적등록 메뉴를 선택하셨습니다.");
					System.out.println("학번을 입력하세요");
					String id = scanner.next();
					System.out.println("과목을 입력하세요");
					String subject = scanner.next();
					System.out.println("점수를 입력하세요");
					String score = scanner.next();

					Takes takes = new Takes(id, subject, score);
					takesList.add(takes);

					System.out.println("성적 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break;// end case 4

			case 5: // 학생조회
				while (true) {
					System.out.println("5. 학생조회 메뉴를 선택하셨습니다.");
					studentList.forEach(System.out::println);
					System.out.println();
					System.out.println("학생 조회가 성공적으로 처리되었습니다.");
					break;
				} // end while
				break;// end case 5

			case 6: // 교수조회
				while (true) {
					System.out.println("6. 교수조회 메뉴를 선택하셨습니다.");
					professorList.forEach(System.out::println);
					System.out.println();
					System.out.println("교수 조회가 성공적으로 처리되었습니다.");
					break;
				} // end while
				break;// end case 6

			case 7: // 학과조회
				while (true) {
					System.out.println("7. 학과조회 메뉴를 선택하셨습니다.");
					departmentList.forEach(System.out::println);
					System.out.println();
					System.out.println("학과 조회가 성공적으로 처리되었습니다.");
					break;
				} // end while
				break; // end case 7

			case 8: // 성적조회
				while (true) {
					System.out.println("8. 성적조회 메뉴를 선택하셨습니다.");
					takesList.forEach(System.out::println);
					System.out.println();
					System.out.println("성적 조회가 성공적으로 처리되었습니다.");
					break;
				} // end while
				break;// end case 8
			case 9: // 종료
				System.out.println("프로그램 종료를 선택하셨습니다.");
				System.exit(0);
				break;
			default:
				System.out.println("프로그램 종료를 선택하셨습니다. Bye~");
				System.exit(0);
			}

		}

	}

}
