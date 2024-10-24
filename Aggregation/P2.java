package Aggregation;

class ReportCard{
	String sname; 
	int sid;

	public ReportCard(String sname, int sid) {
		this.sname = sname;
		this.sid = sid;
	}
}

class Student{
	String name;
	int rollnum;
	ReportCard r;

	public Student(String name, int rollnum) {
		this.name = name;
		this.rollnum = rollnum;
	}

	public void distribute(ReportCard r) {
		this.r = r;
	}

	public void collect() {
		this.r = null;
	}
}

public class P2 {
	public static void main(String[] args) {
		Student e1 = new Student("John", 123);

		System.out.println(e1.name);
		System.out.println(e1.rollnum);

		e1.distribute(new ReportCard("98", 11));
		e1.collect();
	}
}
