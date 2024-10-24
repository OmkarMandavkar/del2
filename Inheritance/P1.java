// SINGLE INHERITANCE

package Inheritance;

class Watch {
	String brand, color, type;

	public Watch() {

	}

	public Watch(String brand, String color, String type) {
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
}

class Fossil extends Watch {

	public Fossil(String brand, String color, String type) {
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
}

public class P1 {

	public static void main(String[] args) {

		Fossil f1 = new Fossil("Fossil", "Black", "Analog");
		System.out.println(f1.brand);
		System.out.println(f1.color);
		System.out.println(f1.type);
	}
}
