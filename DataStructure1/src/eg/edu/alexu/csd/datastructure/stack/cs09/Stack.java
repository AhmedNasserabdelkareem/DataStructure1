package eg.edu.alexu.csd.datastructure.stack.cs09;

import eg.edu.alexu.csd.datastructure.stack.IStack;

/**.
 * @author Ahmednasser
 *
 */

public class Stack implements IStack {
private SinglyLinkedList x = new SinglyLinkedList();

	/**.
	 * Using to add an object at any index of stack
	 *
	 */
	@Override
	public void add(final int index, final Object element) {
		x.add(x.size - index, element);

	}

	/**.
	 * Using to get the object of the top of stack then remove it from stack
	 *
	 */

	@Override
	public Object pop() {
		Object z = x.get(0);
		x.remove(0);
		return z;
	}

	/**.
	 * Using to get the object of the top of stack
	 *
	 */

	@Override
	public Object peek() {
		Object z = x.get(0);
		return z;
	}

	/**.
	 * Using to add object to the top of stack
	 */

	@Override
	public void push(final Object element) {
		x.add(0, element);
		// TODO Auto-generated method stub

	}

	/**.
	 * Using to ckeck if stack is empty or not
	 *
	 */

	@Override
	public boolean isEmpty() {
		boolean z = x.isEmpty();
		return z;
	}

	/**.
	 * Using to get size of stack
	 *
	 */

	@Override
	public int size() {
		int s = x.size;
		return s;
	}

	/**.
	 * Using to print all stack
	 *
	 */

	public void print() {
		x.printList();

	}

	/**.
	 * Using in app to get the last index
	 *
	 */

	public Object peekind(final int index) {
		Object z = x.get(index);
		// char m=(char) z;
		return z;
	}
}
