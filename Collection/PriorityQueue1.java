package Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);

		// Displaying the PriorityQueue (Internally sorted, but order may not be visible
		// directly)
		System.out.println(pq);

		// 2. Peek at the head (highest priority element)
		System.out.println("Peek: " + pq.peek()); // should return the smallest element (5)

		// 3. Poll the head (retrieve and remove the smallest element)
		System.out.println("Polled: " + pq.poll()); // removes 5

		System.out.println(pq);

		pq.remove(20);
		System.out.println(pq);

		System.out.println("Size: " + pq.size());

		System.out.println("Iterate");
		for (Integer num : pq) {
			System.out.println(num);
		}
	}
}
