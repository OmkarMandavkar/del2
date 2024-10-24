package Collection;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {

		ArrayDeque<String> deque = new ArrayDeque<>();

		deque.addFirst("A"); // adds to front
		deque.addLast("B"); // adds to back
		deque.addFirst("C");
		deque.addLast("D");

		System.out.println(deque);

		System.out.println("Peek first: " + deque.peekFirst()); // should return "C"
		System.out.println("Peek last: " + deque.peekLast()); // should return "D"

		// 3. Poll (remove and retrieve) from both ends
		System.out.println("Poll first: " + deque.pollFirst()); // removes "C"
		System.out.println("Poll last: " + deque.pollLast()); // removes "D"

		// After polling
		System.out.println(deque);

		deque.remove("B"); // removes "B"
		System.out.println(deque);

		deque.addFirst("E");
		deque.addLast("F");
		System.out.println(deque);

		System.out.println("Iterate");
		for (String item : deque) {
			System.out.println(item);
		}

		deque.clear();
		System.out.println(deque);
	}
}
