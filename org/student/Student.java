package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		
		System.out.println("I am in studentName ");

	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("I am in studentDept");
	}
	
	public void studentId() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in studentId");
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.CollegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
	}

}
