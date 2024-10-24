package NonStaticMembers;

class School {
	String name;
	String principal;
	String location;
	
	public void join() {
		System.out.println("Join");
	}
	
	public void transfer() {
		System.out.println("Transfer");
	}
}


public class P3 {	//SCHOOL
	public static void main(String[] args) {
		School s1 = new School();
		s1.name = "ABC";
		s1.location = "Powai";
		s1.principal = "a1";
		s1.join();
		s1.transfer();
		System.out.println(s1.name);
		
		
		School s2 = new School();
		s2.name = "XYZ";
		s2.location = "Powai";
		s2.principal = "Z1";
		s2.join();
		s2.transfer();
		System.out.println(s2.principal);
		System.out.println(s2.location);
	}
}
