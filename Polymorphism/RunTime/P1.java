package Polymorphism.RunTime;

class AV1 {
	public void sendMsg() {
		System.out.println("text");
	}

	public void logout() {
		System.out.println("Logged Out");
	}

	public void logIn() {
		System.out.println("Logged In");
	}
}

class AV2 extends AV1 {
	public void call() {
		System.out.println("Audio Call");
	}

	@Override
	public void sendMsg() {
		System.out.println("Text Voice");
	}
}

public class P1 {
	public static void main(String[] args) {
		AV2 x1 = new AV2();
		x1.call();
		x1.sendMsg();
		x1.logIn();
		x1.logout();

		System.out.println();
		AV1 x2 = new AV2(); // UPCASTING
		x2.logIn();
		x2.logout();
//		x2.call();	NOT POSSIBLE
		x2.sendMsg();
	}
}
