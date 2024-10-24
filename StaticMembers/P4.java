package StaticMembers;

public class P4 {
	static {
		System.out.println("A");
		int a = 10;
	}
	
	static {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		System.out.println("X");
	}
	
	static {
		System.out.println("C");
	}
}
