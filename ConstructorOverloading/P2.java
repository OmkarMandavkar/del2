package ConstructorOverloading;

class Form {
	String name;
	int age;
	long contact;

	public Form(String name) {
		this.name = name;
	}

	public Form(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Form(String name, int age, long contact) {
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public void printDetails() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(contact);
	}
}

public class P2 {
	public static void main(String[] args) {

		Form f1 = new Form("ABC", 21, 9988776655L);
		f1.printDetails();
	}
}
