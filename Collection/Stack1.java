package Collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();

		s1.push("A");
		s1.push("B");
		s1.push("C");
		s1.push("D");
		s1.push("E");

		System.out.println(s1);

		System.out.println("Pop: " + s1.pop());
		System.out.println(s1);

		System.out.println("Peek: " + s1.peek());

		System.out.println("Search: " + s1.search("D"));

		System.out.println("isEmpty: " + s1.empty());
	}
}
