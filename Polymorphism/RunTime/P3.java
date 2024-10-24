package Polymorphism.RunTime;

import java.util.Objects;

class Laptop {
	String brand;
	int ram, storage;

	public Laptop(String brand, int ram, int storage) {
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return brand;
	}

	public int hashCode() {
		int n = Objects.hash(brand, ram, storage);
		return n;
	}

	public boolean equals(Object o) {
		Laptop x = (Laptop) o;
		if (brand == x.brand && ram == x.ram && storage == x.storage) {
			return true;
		} else
			return false;

	}
}

public class P3 {
	public static void main(String[] args) {
		Laptop x1 = new Laptop("ASUS", 8, 512);
		Laptop x2 = new Laptop("DELL", 16, 240);
		Laptop x3 = new Laptop("ASUS", 8, 512);

		System.out.println("toString() method");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);

		System.out.println("\nhasCode() method");
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		System.out.println(x3.hashCode());

		System.out.println("\nequals() method");
		System.out.println(x1.equals(x2));
		System.out.println(x1.equals(x3));
		System.out.println(x2.equals(x3));
	}
}
