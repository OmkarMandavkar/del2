package Encapsulation;

class debitCard{
	private int num;
	private int pin;
	private double balance;

	public debitCard(int num, int pin, double balance) {
		this.num = num;
		this.pin = pin;
		this.balance = balance;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class P2 {

	public static void main(String[] args) {
		
		debitCard d1 = new debitCard(1111, 1234, 8800.00);
		
		System.out.println(d1.getNum());
		System.out.println(d1.getBalance());
		System.out.println(d1.getPin());
		
		System.out.println();
		
		d1.setNum(9999);
		d1.setPin(4321);
		d1.setBalance(5544.32);
				
		System.out.println(d1.getNum());
		System.out.println(d1.getBalance());
		System.out.println(d1.getPin());
		
	}

}
