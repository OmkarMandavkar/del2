package Collection;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(4, "Grapes");
		map.put(2, "Banana");
		map.put(1, "Apple");
		map.put(3, "Orange");

		System.out.println(map);

		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Orange"));

		map.put(2, "Mango");
		System.out.println(map);

		map.remove(4);
		System.out.println(map);

		System.out.println("Iterate");
		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

		System.out.println("Size of HashMap: " + map.size());
	}
}