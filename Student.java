package week3;

public class Student extends department {
public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeName();
		student.collegeRank();
		student.collegeCode();
		student.deptname();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
	public void studentName() {
		
		System.out.println("Student Name:Chitra");
	}
public void studentDept() {
		
		System.out.println("Student Department:CSE");
	}
public void studentId() {
	
	System.out.println("Student Id:890");
}
}


