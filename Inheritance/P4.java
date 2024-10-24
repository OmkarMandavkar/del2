//Super Keyword

package Inheritance;

class Shirt {
	String color;
	int size;

	public Shirt() {

	}

	public Shirt(String color, int size) {
		this.color = color;
		this.size = size;
	}
}

class FormalShirt extends Shirt {
	double price;

	public FormalShirt(String color, int size, double price) {
		super(color, size);
		this.price = price;
	}

	public void printDetails() {
		System.out.println("Color: " + super.color);
		System.out.println("Size: " + super.size);
		System.out.println("Price: " + this.price);
	}
}

public class P4 {
	public static void main(String[] args) {

		FormalShirt f = new FormalShirt("Black", 30, 1000.0);
		f.printDetails();
	}
}
