package ThisKeyword;

class User{
	String id;
	String pword;
	long cno;

	public void initialize(String id, String pword,long cno) {
		this.id = id;
		this.pword = pword;
		this.cno = cno;
	}
	
	public void userProfile() {
		System.out.println(id);
		System.out.println(pword);
		System.out.println(cno);
	}
	
	public void logIn() {
		System.out.println("Logged In");
	}
}

public class P2 {

	public static void main(String[] args) {
		User x1 = new User();
		x1.initialize("AbC", "1221", 9988776655L);
		x1.userProfile();
		x1.logIn();
	}

}
