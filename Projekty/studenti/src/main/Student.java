package main;

public class Student {

	public String Name;
	public String Surname;
	public String Gender;
	public int Age;
	public int Mark;
	
	//kon�truktory //toto je pre�a�ovanie kon�tuktoru (overload)(su a� 3)
	//jeden pre pripad �e ni� nepo�lem
	public Student() {}
	//jeden pre pripad �e po�lem len meno
	public Student(String name) {
	Name = name;
	}
	//jeden pre pripad �e po�lem meno aj vek
	public Student(String name, int age) {
	Name = name; Age = age;
	}


	public void PresentYourSelf(){
		System.out.println("Hello my name is "+Name+" and I am "+Age+" years old.");
	}
	
	
}
