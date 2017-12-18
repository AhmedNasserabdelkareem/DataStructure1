package eg.edu.alexu.csd.datastructure.queue.cs09;

import eg.edu.alexu.csd.datastructure.queue.IArrayBased;
import eg.edu.alexu.csd.datastructure.queue.IQueue;
/**
 * @author Ahmednasser
 *
 */
public class arrqueue implements IQueue, IArrayBased {
	/**
	 * @author Ahmednasser
	 *
	 */
	private Object[] qarr;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int front = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int rear = -1;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int size = 0;
	/**
	 * @author Ahmednasser
	 *
	 */	
	private int max = 0;
	/**
	 * @author Ahmednasser
	 * @param s
	 *
	 */
	public arrqueue(final int n) {
		// TODO Auto-generated constructor stub
		Object[] arr = new Object[n];
		this.qarr = arr;
		this.max = n;
	}

	@Override
	public final void enqueue(final Object item) {
		if (size == max) {
			throw null;
		} else {
			rear++;
			if (rear == max - 1) {
				qarr[rear] = item;
				size++;
				rear = -1;

			} else {
				qarr[rear] = item;
				size++;
			}
		}
	}

	@Override
	public final Object dequeue() {
		if (size == 0) {
			throw null;
		} else {
			Object z = qarr[front];
			qarr[front] = null;
			front++;
			size--;
			if (front == max) {

				front = 0;
				return z;
			} else {
				return z;

			}

		}

	}

	@Override
	public final boolean isEmpty() {
		return size == 0;
	}

	@Override
	public final int size() {
		return size;
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public final void printing() {
		int i = 0;
		while (i <= max - 1) {
			if (qarr[i] != null) {
				System.out.println(qarr[i]);
			}
			i++;
		}
	}
}
