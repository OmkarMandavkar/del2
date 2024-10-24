package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LikedList1 {
	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		
		ListIterator<String> x = l1.listIterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	}
}
