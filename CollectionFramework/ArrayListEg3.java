package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

class Laptop {
	String name;
	int ram;

	public Laptop(String name, int ram) {
		super();
		this.name = name;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return String.valueOf(ram);
	}

}

public class ArrayListEg3 {

	public static void main(String[] args) {

		ArrayList<Laptop> a1 = new ArrayList<>();
		a1.add(new Laptop("ASUS ROG", 16));
		a1.add(new Laptop("VICTUS", 8));
		a1.add(new Laptop("MAC", 16));
		a1.add(new Laptop("HP", 12));
		a1.add(new Laptop("DELL", 4));

		System.out.println("Elements: ");
		for (Laptop lp : a1) {
			System.out.println(lp);
		}

		System.out.println("\n");
		ListIterator<Laptop> l1 = a1.listIterator(a1.size());

		System.out.println("Reversed Order:");
		while (l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
	}
}
