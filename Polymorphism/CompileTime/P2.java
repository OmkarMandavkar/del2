//METHOD OVERLOADING

package Polymorphism.CompileTime;

public class P2 {

	public static void main(String[] args) {
		max(29, 2);
		max(11L, 48L);
		max(33.3, 88.8);
	}

	public static void max(int a, int b) {
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
	}

	public static void max(long a, long b) {
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
	}

	public static void max(double a, double b) {
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
	}

}
