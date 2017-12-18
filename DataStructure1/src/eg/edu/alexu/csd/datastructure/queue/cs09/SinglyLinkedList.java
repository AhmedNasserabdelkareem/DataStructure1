package eg.edu.alexu.csd.datastructure.queue.cs09;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;
import eg.edu.alexu.csd.datastructure.stack.cs09.Node;

/**
 * .
 * 
 * @author Ahmednasser
 *
 */
public class SinglyLinkedList implements ILinkedList {
	/**
	 * @author Ahmednasser
	 *
	 */
	public Node head = null;
	/**
	 * @author Ahmednasser
	 *
	 */
	public int size = 0;

	@Override
	public final void add(final int index, final Object Value) {
		System.out.println();
		Node element = new Node();
		element.value = Value;
		if (index > size || index < 0) {
			throw null;
		} else if (index == 0) {
			element.next = head;
			head = element;
			size++;
		} else {
			Node temp = theElementBefore(index);
			element.next = temp.next;
			temp.next = element;
			size++;
		}
	}

	@Override
	public final void add(final Object Value) {
		Node element = new Node();
		element.value = Value;
		if (size == 0) {
			head = element;
			head.next = null;
			size++;
		} else {
			Node temp = theElementBefore(size);
			temp.next = element;
			element.next = null;
			size++;
		}

	}

	@Override
	public final Object get(final int index) {
		if (index < 0) {
			throw null;
		}
		Node temp = head;
		if (index < size) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.value;

		} else {
			throw null;
		}
	}

	@Override
	public final void set(final int index, final Object Value) {
		if (index < 0) {
			throw null;
		}
		Node element = new Node();
		element.value = Value;
		if (index < size && index != 0) {
			Node temp = theElementBefore(index);
			element.next = temp.next.next;
			temp.next = element;
		} else if (index == 0) {
			element.next = head.next;
			head = element;
		} else {
			throw null;
		}

	}

	@Override
	public final void clear() {
		if (size > 0) {
			head = null;
			size = 0;
		} else {
			return;
		}
	}

	@Override
	public final boolean isEmpty() {
		boolean Empty = false;
		if (size == 0) {
			Empty = true;
		}
		return Empty;
	}

	@Override
	public final void remove(final int index) {
		if (index >= size || index < 0) {
			throw null;
		}
		if (index < size && size != 0 && index > 0) {
			Node temp = theElementBefore(index);
			Node removed = temp.next;
			temp.next = removed.next;
			size--;
		} else if (index == 0 && size != 0) {
			head = head.next;
			size--;
		}
	}

	@Override
	public final int size() {
		return size;
	}

	@Override
public final ILinkedList sublist(final int fromIndex, final int toIndex) {
		SinglyLinkedList list = new SinglyLinkedList();
if (fromIndex < size && toIndex < size && fromIndex <= toIndex) {
			Node temp = theElementBefore(fromIndex);
			if (fromIndex > 0) {
				temp = temp.next;
			}
			for (int i = 0; i <= toIndex - fromIndex; i++) {

				list.addWithoutGrounding(temp.value);
				temp = temp.next;

			}
			temp.next = null;

		} else {
			throw null;
		}

		return list;
	}

	@Override
	public final boolean contains(final Object o) {
		Node temp = head;
		if (size == 0) {
			throw null;
		}
		for (int i = 0; i < size; i++) {
			if (o.equals(temp.value)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public void addWithoutGrounding(final Object Value) {
		Node element = new Node();
		element.value = Value;
		if (size == 0) {
			head = element;
			size++;
		} else {
			Node temp = theElementBefore(this.size);
			temp.next = element;
			size++;
		}
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public Node theElementBefore(final int index) {
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		return temp;
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public void printList() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(this.get(i) + " ");
			temp = temp.next;
		}
	}
}
