package org.college;

public class Student extends Department {
	public String studentName() {
		return "Mayuri Thakur";
	}
	public String studentDept() {
		return "Biopharmaceutics";
	}
	public int studentid() {
		return 78650;
	}
	public static void main (String[] args) {
		Student std =new Student();
		
		System.out.println(std.collegeName());
		System.out.println(std.collegeCode());
		System.out.println(std.collegeRank());
		System.out.println(std.deptName());
		System.out.println(std.studentName());
		System.out.println(std.studentDept());
		System.out.println(std.studentid());
		
	}
	

}
