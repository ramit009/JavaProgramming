package programmingKnowldege;

import programmingKnowldege.Student;

public class Example {

	public static void main(String[] args) {
		Student S1= new Student();
		S1.setRollNo(100);
		S1.setName("ramit");
		System.out.println("Student rollno " + S1.getRollNo());
		System.out.println("Student Name " + S1.getName());

	}

}
