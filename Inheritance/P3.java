//Hierarchial Inheritance

package Inheritance;

class Shape {
	String name;
	double area;

	public Shape() {

	}

	public Shape(String name, double area) {
		this.name = name;
		this.area = area;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String name, double area, double radius) {
		super(name, area);
		this.radius = radius;
	}
}

class Rectangle extends Shape {
	int length, breadth;

	public Rectangle(String name, double area, int length, int breadth) {
		super(name, area);
		this.length = length;
		this.breadth = breadth;
	}
}

public class P3 {
	public static void main(String[] args) {

		Circle c = new Circle("Circle", 10.24, 3.0);
		System.out.println(c.name);
		System.out.println(c.area);
		System.out.println(c.radius);

		Rectangle r = new Rectangle("\nRectangle", 18.0, 8, 6);
		System.out.println(r.name);
		System.out.println(r.length);
		System.out.println(r.breadth);
		System.out.println(r.area);
	}
}
