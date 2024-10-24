package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("Raptor");
		a1.add("Spirit");
		a1.add("Eagle");
		a1.add("Lightning");
		a1.add("Sukhoi");
		a1.add("Warthog");

		a1.add(5, "Dassault");

		System.out.println(a1+"\n");

		a1.remove(2);

		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		i.remove();
		System.out.println("\n" + a1);

	}
}
