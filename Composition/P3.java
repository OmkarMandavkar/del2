package Composition;

class IdCard{
	String cname; 
	int eid;

	public IdCard(String cname, int eid) {
		this.cname = cname;
		this.eid = eid;
	}
}

class Employee{
	String name;
	int salary, cnum;
	IdCard i;

	public Employee(String name, int salary, int cnum, IdCard i) {
		this.name = name;
		this.salary = salary;
		this.cnum = cnum;
		this.i = i;
	}
}

public class P3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("John", 90000, 123, new IdCard("IBM", 2345));
		
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e1.cnum);
		System.out.println(e1.i.cname);
		System.out.println(e1.i.eid);
	}
}
