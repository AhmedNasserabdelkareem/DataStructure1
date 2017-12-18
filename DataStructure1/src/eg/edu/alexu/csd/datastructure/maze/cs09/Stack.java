package eg.edu.alexu.csd.datastructure.maze.cs09;

import eg.edu.alexu.csd.datastructure.stack.IStack;

/**
 * .
 *
 * @author Ahmednasser
 *
 */

public class Stack implements IStack {
/**
 * .
 *
 * @author Ahmednasser
 *
 */
private SinglyLinkedList x = new SinglyLinkedList();

/**
 * . Using to add an object at any index of stack
 * @param
 * @param
 *
 */
	@Override
	public void add(final int index, final Object element) {
		x.add(x.size - index, element);

	}

/**
 * * . Using to get the last object then remove it from stack
 * @return z
 *
 */

	@Override
	public Object pop() {
		Object z = x.get(0);
		x.remove(0);
		return z;
	}

	/**
	 * . Using to get the object of the top of stack
	 * @return z
	 *
	 */

	@Override
	public Object peek() {
		Object z = x.get(0);
		return z;
	}

	/**
	 * . Using to add object to the top of stack
	 * @param element
	 */

	@Override
	public void push(final Object element) {
		x.add(0, element);
	}

	/**
	 * . Using to ckeck if stack is empty or not
	 * @return z
	 *
	 */

	@Override
	public boolean isEmpty() {
		boolean z = x.isEmpty();
		return z;
	}

	/**
	 * . Using to get size of stack
	 * @return s
	 *
	 */

	@Override
	public int size() {
		int s = x.size;
		return s;
	}

	/**
	 * . Using to print all stack
	 *
	 */

	public void print() {
		x.printList();

	}

	/**
	 * @param index Object  Using in app to get the last index
	 * @return hd
	 */

	public Object peekind(final int index) {
		Object z = x.get(index);
		return z;
	}
}
