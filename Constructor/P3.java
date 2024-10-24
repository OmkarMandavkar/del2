package Constructor;

class dept{
	int dnum;
	String dname;
	String manager;
	
	
	public dept(int dnum, String dname, String manager) {
		this.dnum = dnum;
		this.dname = dname;
		this.manager = manager;
	}
	
	public void printDetails() {
		System.out.println(dnum);
		System.out.println(dname);
		System.out.println(manager);
	}
}

public class P3 {
	public static void main(String[] args) {
		dept x1 = new dept(01, "IT", "ABC\n");
		x1.printDetails();
		
		dept x2 = new dept(03, "COMPS", "XYZ");
		x2.printDetails();
	}
}
