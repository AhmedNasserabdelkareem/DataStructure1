package eg.edu.alexu.csd.datastructure.linkedList.cs09;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

/**
 * @author Ahmednasser
 *
 */
public class DoublyLinkedList implements ILinkedList {
	/**
	 * @author Ahmednasser
	 *
	 */
	public Node head = null;
	/**
	 * @author Ahmednasser
	 *
	 */
	public Node tail = new Node();
	/**
	 * @author Ahmednasser
	 *
	 */
	public int size = 0;

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void add(final int index, final Object Value) {
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
	/**
	 * @author Ahmednasser
	 *
	 */
	public void add(final Object Value) {
		Node element = new Node();
		element.value = Value;
		if (size == 0) {
			head = element;
			head.next = tail;
			tail.prev = head;
			size++;
		} else {
			Node temp = theElementBefore(this.size);
			temp.next = element;
			element.prev = temp;
			element.next = tail;
			tail.prev = element;
			size++;
		}
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public Object get(final int index) {
		if (index < 0) {
			throw null;
		}

		Node temp = head;
		if (index < size) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			throw null;
		}
		return temp.value;

	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void set(final int index, final Object Value) {
		if (index < 0) {
			throw null;
		}
		Node element = new Node();
		element.value = Value;
		if (index < size && index != 0) {
			Node temp = theElementBefore(index);
			element.next = temp.next.next;
			temp.next.next.prev = element;
			temp.next = element;
			element.prev = temp;
		} else if (index == 0) {
			head.next.prev = element;
			element.next = head.next;
			head = element;
		} else {
			throw null;
		}

	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void clear() {
		if (size > 0) {
			head = null;
			tail.prev = null;
			size = 0;
		} else {
			return;
		}
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public boolean isEmpty() {
		boolean Empty = false;
		if (size == 0) {
			Empty = true;
		}
		return Empty;
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public void remove(final int index) {
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
	/**
	 * @author Ahmednasser
	 *
	 */
	public ILinkedList sublist(final int fromIndex, final int toIndex) {
		DoublyLinkedList list = new DoublyLinkedList();
if (fromIndex < size && toIndex < size && fromIndex <= toIndex) {
			Node temp = theElementBefore(fromIndex);
			if (fromIndex > 0) {
				temp = temp.next;
			}
			for (int i = 0; i <= toIndex - fromIndex; i++) {

				list.addWithoutTailing(temp.value);
				temp = temp.next;

			}
			temp.next = tail;
			tail.prev = temp;
		} else {
			throw null;
		}

		return list;
	}

	@Override
	/**
	 * @author Ahmednasser
	 *
	 */
	public boolean contains(final Object o) {
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
	public Node theElementBefore(final int index) {
		Node temp = head;
		for (int i = 0; i < index - 1; i++){
			temp = temp.next;
		}
		return temp;
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public void addWithoutTailing(final Object Value) {
		Node element = new Node();
		element.value = Value;
		if (size == 0) {
			head = element;
			size++;
		} else {
			Node temp = theElementBefore(this.size);
			temp.next = element;
			element.prev = temp;
			size++;
		}
	}
	/**
	 * @author Ahmednasser
	 *
	 */
	public void printList() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.value + " ");
			if (temp.next != null) {
				temp = temp.next;
			}
		}
	}

}
