package main;

public class Student {

	public String Name;
	public String Surname;
	public String Gender;
	public int Age;
	public int Mark;
	
	//konötruktory //toto je preùaûovanie konötuktoru (overload)(su aû 3)
	//jeden pre pripad ûe niË nepoölem
	public Student() {}
	//jeden pre pripad ûe poölem len meno
	public Student(String name) {
	Name = name;
	}
	//jeden pre pripad ûe poölem meno aj vek
	public Student(String name, int age) {
	Name = name; Age = age;
	}


	public void PresentYourSelf(){
		System.out.println("Hello my name is "+Name+" and I am "+Age+" years old.");
	}
	
	
}
