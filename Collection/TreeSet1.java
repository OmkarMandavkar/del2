package Collection;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();

		set.add("Banana");
		set.add("Grapes");
		set.add("Orange");
		set.add("Apple");

		// Adding duplicate elements (TreeSet ignores duplicates)
		set.add("Apple");

		System.out.println(set);

		System.out.println(set.contains("Banana"));

		set.remove("Grapes");
		System.out.println(set);

		System.out.println("Iterate");
		for (String item : set) {
			System.out.println(item);
		}

		System.out.println("Size: " + set.size());

		// First and Last elements (specific to TreeSet)
		System.out.println("First element: " + set.first());
		System.out.println("Last element: " + set.last());

		// 8. TreeSet subset (Range operations)
		System.out.println("Subset (from 'Apple' to 'Orange'): " + set.subSet("Apple", "Orange"));

	}
}
