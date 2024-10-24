package ThisKeyword;

class Car{
	String brand;
	int cc;
	double mileage;

	public void drive() {
		System.out.println("Drive");
	}

	public void park() {
		System.out.println("Park");
	}

	public void initialize(String brand, int cc, double mileage) {
		this.brand = brand;
		this.cc = cc;
		this.mileage = mileage;
	}
	
	public void carDetails() {
		System.out.println(brand);
		System.out.println(cc);
		System.out.println(mileage);
	}
}

public class P1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.initialize("Porsche", 1111, 11.110);
		c1.carDetails();
	
		Car c2 = new Car();
		c2.initialize("Peugot", 1111, 11.110);
		c2.carDetails();
	}

}
