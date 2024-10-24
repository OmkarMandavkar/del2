package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {

		 // 1. Creating an ArrayList of String type
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Orange"); // Adding at a specific index

        System.out.println("ArrayList after adding elements: " + list);

        // 3. Accessing elements using get()
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        // 4. Modifying elements using set()
        list.set(2, "Mango");
        System.out.println("ArrayList after modifying: " + list);

        // 5. Removing elements using remove()
        list.remove("Banana");  // Removing by object
        list.remove(1);         // Removing by index
        System.out.println("ArrayList after removing elements: " + list);

        // 6. Checking size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // 7. Iterating over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String s : list) {
            System.out.println(s);
        }

        // 8. Checking if the list contains an element
        boolean hasApple = list.contains("Apple");
        System.out.println("Does the list contain 'Apple'? " + hasApple);

        // 9. Clearing the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);

        // 10. Checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

		System.out.println();
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
}
