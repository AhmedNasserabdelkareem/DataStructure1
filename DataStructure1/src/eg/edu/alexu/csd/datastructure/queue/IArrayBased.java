package eg.edu.alexu.csd.datastructure.queue;

/**
 * @author Ahmednasser
 *
 */
public interface IArrayBased extends IQueue {
	/**
	 * Inserts an item at the queue front.
	 */
	void enqueue(Object item);

	/**
	 * Removes the object at the queue rear and returns it.
	 */
	Object dequeue();

	/**
	 * Tests if this queue is empty.
	 */
	boolean isEmpty();

	/**
	 * Returns the number of elements in the queue
	 */
	int size();

}
