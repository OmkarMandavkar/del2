package Composition;

class User{
	String name;
	int num;
	
	public User(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class Account{
	int account;
	double balance;
	User u;
	
	public Account(int account, double balance, User u) {
		this.account = account;
		this.balance = balance;
		this.u = u;
	}
}

public class P2 {
	public static void main(String[] args) {
		Account a1 = new Account(1234, 2000.00, new User("Omkar", 8765));
		
		System.out.println(a1.account);
		System.out.println(a1.balance);
		
		System.out.println(a1.u.name);
		System.out.println(a1.u.num);
		
	}
}
