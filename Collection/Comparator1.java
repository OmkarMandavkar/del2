package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Item {
	int id;
	String name;

	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class SortByIdAsc implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {
		return o1.id - o2.id;
	}
}

class SortByIdDesc implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {
		return o2.id - o1.id;
	}
}

class SortByNameAsc implements Comparator<Item> {
	@Override 
	public int compare(Item o1, Item o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SortByNameDesc implements Comparator<Item> {
	@Override 
	public int compare(Item o1, Item o2) {
		return o2.name.compareTo(o1.name);
	}
}

public class Comparator1 {
	public static void main(String[] args) {
		LinkedList<Item> i = new LinkedList<>();
		i.add(new Item(1,"Mobile"));
		i.add(new Item(2,"Laptop"));
		i.add(new Item(3,"Ac"));
		i.add(new Item(4,"Car"));
		
		Collections.sort(i, new SortByIdAsc());
		System.out.println(i);
		
		Collections.sort(i, new SortByIdDesc());
		System.out.println(i);
		
		Collections.sort(i, new SortByNameAsc());
		System.out.println(i);
		
		Collections.sort(i, new SortByNameDesc());
		System.out.println(i);
	}
}
