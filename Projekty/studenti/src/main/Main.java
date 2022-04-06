package main;

public class Main {

	public static void main(String[] args) {

		Student firstStudent = new Student("SubjectA",30);
		Student secondStudent = new Student();
		

		secondStudent.Name = "SubjectY";
		secondStudent.Age = 20;
		
		firstStudent.PresentYourSelf();
		secondStudent.PresentYourSelf();
		
		System.out.println(firstStudent);
		System.out.println(secondStudent);
		

	}

}
