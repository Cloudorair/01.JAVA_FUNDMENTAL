package com.itwill01.method;



public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		st1.setStudentData(1, "김경수", 45,67,90);
		st2.setStudentData(2, "김경우", 88,99,12);
		st3.setStudentData(3, "김경미", 60,91,34);
		
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		st1.calculateTot();
		st1.calculateAvg();
		st1.caculateGrade();
		
		st2.calculateTot();
		st2.calculateAvg();
		st2.caculateGrade();
		
		st3.calculateTot();
		st3.calculateAvg();
		st3.caculateGrade();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		 3   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		
	}

}