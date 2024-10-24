package ConstructorOverloading;

class Boy{
	String fname;
	String lname;

	public Boy(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public Boy(String fname) {
		this.fname = fname;
	}

	public Boy() {

	}
}

public class P1 {
	public static void main(String[] args) {
		Boy b1 = new Boy("A", "B");
		Boy b2 = new Boy("X");
		Boy b3 = new Boy();
	}
}
