package Polymorphism.RunTime;

class BSNL2023 {
	
	public void networkSpeed() {
		System.out.println("3G");
	}

	public void recharge() {
		System.out.println("400");
	}
}

class BSNL2024 extends BSNL2023{
	
	@Override
	public void networkSpeed() {
		System.out.println("4G");
	}
}

public class P2 {

	public static void main(String[] args) {

		BSNL2024 x1 = new BSNL2024();
		x1.networkSpeed();
		
		BSNL2023 x2 = x1; //Upcasting
	    x2.networkSpeed();	//CHILD BODY
	    
	}
}
