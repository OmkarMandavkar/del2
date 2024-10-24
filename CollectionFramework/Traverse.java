package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		Iterator i = a1.iterator();
		
		System.out.println(i.next());	
		System.out.println(i.next());
		System.out.println(i.next());	
		System.out.println(i.next());
		System.out.println(i.next());
		
		System.out.println(i.next());
	}
}
