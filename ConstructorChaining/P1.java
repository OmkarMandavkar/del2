package ConstructorChaining;

class Student{
	String name;
	int id;
	int contact;

	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int id) {
		this(name);
		this.id = id;
	}
	
	public Student(String name, int id, int contact) {
		this(name, id);
		this.contact = contact;
	}
	
	public void details() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(contact);
	}
}

public class P1 {
	public static void main(String[] args) {
		
		Student s1 = new Student("ABC", 11, 99887654);
		s1.details();
	
	}
}
