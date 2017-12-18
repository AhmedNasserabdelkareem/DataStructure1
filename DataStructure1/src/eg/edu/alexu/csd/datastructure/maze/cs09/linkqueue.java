package eg.edu.alexu.csd.datastructure.maze.cs09;

import eg.edu.alexu.csd.datastructure.queue.ILinkedBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;
import eg.edu.alexu.csd.datastructure.queue.cs09.SinglyLinkedList;

/**
 * @author Ahmednasser
 *
 */
public class linkqueue implements IQueue, ILinkedBased {
	/**
	 * @author Ahmednasser
	 *
	 */
	private SinglyLinkedList x = new SinglyLinkedList();

	@Override
	public final void enqueue(final Object item) {
		x.add(item);

	}

	@Override
	public final Object dequeue() {
		// TODO Auto-generated method stub
		Object deq = x.get(0);
		x.remove(0);
		return deq;
	}

	@Override
	public final boolean isEmpty() {

		return x.isEmpty();
	}

	@Override
	public final int size() {
		// TODO Auto-generated method stub
		return x.size();
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public void printing() {
		x.printList();

	}

}
