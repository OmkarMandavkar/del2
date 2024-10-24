package StaticMembers;

public class P1 {

	public static String x1="Posedion";
	public static String x2="Raptor";
	
	public static void method1() {
		System.out.println("Method 1 definition");
	}
	
	public static void method2() {
		System.out.println("Method 2 definition");
	}
	
	public static void main(String[] args) {
		System.out.println(P1.x1);
		method1();
		method2();
		System.out.println(x2);
	}
}
