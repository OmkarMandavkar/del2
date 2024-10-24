package Composition;

class Engine{
	int engnum, cc;
	
	public Engine(int engnum, int cc) {
		this.engnum = engnum;
		this.cc = cc;
	}
	
	public void engine_start() {
		System.out.println("Started");
	}
}

class Car{
	String brand, color;
	Engine e;
	
	public Car(String brand, String color, Engine e) {
		this.brand = brand;
		this.color = color;
		this.e = e;
	}
}

public class P1 {
	public static void main(String[] args) {
		
		Engine e1 = new Engine(12345, 20000);
		
		Car c1 = new Car("Porsche", "Black", e1);
		System.out.println(c1.brand);
		System.out.println(c1.color);
		
		System.out.println(c1.e.engnum);
		System.out.println(c1.e.cc);
		
		c1.e.engine_start();
	}
}