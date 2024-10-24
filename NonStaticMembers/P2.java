package NonStaticMembers;

public class P2 {	//Bank Example

	String name;
	String branch;
	int ifsc;
	int pincode;

	public void deposit() {
		System.out.println("Money Deposited");
	}

	public void withdraw() {
		System.out.println("Money Withdrawn");
	}

	public static void main(String[] args) {
		P2 x1 = new P2();
		x1.name = "SBI";
		x1.branch = "Powai";
		x1.ifsc = 1234;
		x1.pincode = 400072;
		x1.deposit();
		x1.withdraw();

		P2 x2 = new P2();
		x2.name = "ICICI";
		x2.branch = "Thane";
		x2.ifsc = 4321;
		x2.pincode = 400088;
		x2.deposit();
		x2.withdraw();
	}
}
