package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add(false);
		a1.add(88);
		a1.add("Mango");
		a1.add("Sheep");
		a1.add(true);
		
		ArrayList a2 = new ArrayList();
		a2.add("Mango");
		a2.add("Sheep");
		a2.add(false);
		a2.add(23);
		a2.add(23);
		
		System.out.println(a1);
		System.out.println(a2);

		System.out.println("kjb "+a1.remove(4));
		System.out.println("\n1" + a1+ "\n");
		
//		
//		System.out.println(a2.removeAll(a1));
//		System.out.println("\n2" + a2 + "\n");
//
//		System.out.println(a2.retainAll(a1));
//		System.out.println("\n3" + a2 + "\n");
		
		//a2.clear();
		System.out.println("\nclr" + a2 + "\n");
		
		System.out.println("11"+a1.contains(88));
		System.out.println(a2.containsAll(a1));
		System.out.println("1114"+ a1.indexOf(false));
		System.out.println(a2.indexOf(2));
		System.out.println(a2.lastIndexOf(23));
		

		System.out.println(a1);
		System.out.println(a2);
		
	}

}
