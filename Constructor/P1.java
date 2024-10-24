package Constructor;

class Student{
	String name;
	{
		System.out.println("Fill the Form");
	}
	{
		System.out.println("Pay the fee");
	}
	
	public Student(){
		System.out.println("Admission Confirmed\n");
	}
}

public class P1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

	}

}
