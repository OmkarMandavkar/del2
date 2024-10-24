package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("A1");
		a1.add("A2");
		a1.add("A3");
		a1.add("A4");
		a1.add("A5");

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("B1");
		a2.add("B2");
		a2.add("B3");
		a2.add("B4");
		a2.add("B5");

		System.out.println(a1); // [A1, A2, A3, A4, A5]
		System.out.println(a2); // [B1, B2, B3, B4, B5]

		a1.addAll(a2);
		System.out.println("\n" + a1);
		// [A1, A2, A3, A4, A5, B1, B2, B3, B4, B5]

		//a1.removeAll(a2);
		//System.out.println("\n" + a1); // [A1, A2, A3, A4, A5]
		
		//a1.retainAll(a2);
		//System.out.println("\n" + a2); // [B1, B2, B3, B4, B5]


	}
}
