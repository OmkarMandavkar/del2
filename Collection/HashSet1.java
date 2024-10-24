package Collection;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("Banana");
		set.add("Grapes");
		set.add("Orange");
		set.add("Apple");

		// Adding duplicate elements (HashSet ignores duplicates)
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

		set.clear();
		System.out.println(set);
	}
}