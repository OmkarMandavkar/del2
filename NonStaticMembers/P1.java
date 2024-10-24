package NonStaticMembers;

public class P1 {	//PowerBank Example

	String brand;
	int capacity;
	String color;

	public void charge() {
		System.out.println("Charge");
	}

	public void discharge() {
		System.out.println("Discharge");
	}
	
	public static void main(String[] args) {
		P1 x1 = new P1();
		x1.brand = "Oneplus";
		x1.capacity = 20000;
		x1.color = "Black";
		x1.charge();
		
		
		P1 x2 = new P1();
		x2.brand = "Mi";
		x2.capacity = 10000;
		x2.color = "Blue";
		x2.charge();
		x2.discharge();
	}
}
