// SINGLE INHERITANCE

package Inheritance;

class Product {
	int id;
	String name;
	double price;

	public Product() {

	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

class PowerBank extends Product {

	public PowerBank(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class P2 {
	public static void main(String[] args) {
		PowerBank p1 = new PowerBank(1, "Oneplus", 1000.0);
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.price);
	}
}
