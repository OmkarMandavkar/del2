package Constructor;

class Mail{
	String id;
	String pword;

	public Mail(String id, String pword) {
		this.id = id;
		this.pword = pword;
	}

	public void mailDetails() {
		System.out.println(this.id);
		System.out.println(this.pword);
	}
}

public class P2 {

	public static void main(String[] args) {
		Mail x1 = new Mail("aa@gmail", "ab123");
		x1.mailDetails();

		Mail x2 = new Mail("xy@gmail", "abc123");
		x2.mailDetails();

	}
}
