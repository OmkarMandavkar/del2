package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();

		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("C");

		a1.add(4, "X");
		a1.add(2, "Z");
		System.out.println(a1);


		a1.set(4, "O");	//update
		a1.remove(1); // index
		a1.remove("X");	//object
		System.out.println(a1);

		System.out.println("Element: " + a1.get(3));

		System.out.println("Iterator:");
		Iterator<String> i1 = a1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("ListIterator: hasNext()");
		ListIterator<String> l1 = a1.listIterator();
		while (l1.hasNext()) {
			System.out.println(l1.next());
		}

		System.out.println("ListIterator: hasPrevious()");
		ListIterator<String> l2 = a1.listIterator(3);
		while (l2.hasPrevious()) {
			System.out.println(l2.previous());
		}

		System.out.println("IndexOf(): " + a1.indexOf("C"));
		System.out.println("IndexOf(): " + a1.lastIndexOf("C"));

		System.out.println("Size " + a1.size());
		System.out.println("Empty? " + a1.isEmpty());
	}
}