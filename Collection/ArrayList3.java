package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<>();

		a1.add(new Student(1, "A"));
		a1.add(new Student(2, "D"));
		a1.add(new Student(3, "G"));
		a1.add(new Student(4, "X"));

		System.out.println(a1);

		System.out.println(a1.get(2));

		Student s = (Student) a1.get(2);
		System.out.println(s.id);
		System.out.println(s.name);

		System.out.println();
		Iterator<Student> i = a1.iterator();
		while (i.hasNext()) {
			Student x = (Student) i.next();
			System.out.println(x.id);
		}
		
		
	}
}
