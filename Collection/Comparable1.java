package Collection;

import java.util.Collections;
import java.util.LinkedList;

class Product implements Comparable<Product> {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	/*public int compareTo(Product p) {
		return id - p.id; //Ascending
		//return p.id - id;	//Descending
	}*/
	
	public int compareTo(Product p) {
		//return name.compareTo(p.name); //ASC
		return p.name.compareTo(name); //DESC
	}
}

public class Comparable1 {
	public static void main(String[] args) {

		LinkedList<Product> p1 = new LinkedList<>();
		p1.add(new Product(3, "Apple"));
		p1.add(new Product(4, "Samsung"));
		p1.add(new Product(2, "Asus"));
		p1.add(new Product(1, "OnePlus"));

		Collections.sort(p1);
		System.out.println(p1);
	}
}
