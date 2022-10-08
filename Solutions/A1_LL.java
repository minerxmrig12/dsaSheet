package pkg.customLL;

class LL {
	private Node head;
	private Node tail;
	private int size;

	LL() {
		this.size = 0;
	}

	private class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		Node(Node next) {
			this.next = next;
		}
	}// Node end
		// Inserting the element at the 1st position in the LL

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		++size;
	}// firstAdd end

	// Inserting the element at the last position in the LL
	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		// At this point tail is pointing to the previous node.
		// and we want nodeP to point to the next node ie., node so changing the
		// tail.next = node
		// means that the nodeP will point to the node
		tail.next = node;
		// In below line the tail will point to the node which means that the tail.next
		// will point to null.
		tail = node;
		size++;
	}// -insertLast end

	// Inserting element at the desired index and indexing start from 0
	public void insert(int val, int index) {
		if (size == 0) {
			insertFirst(val);
			return;
		}
		if (size == index) {
			insertLast(val);
			return;
		}
		// created a temp Node which will start from head
		Node temp = head;
		// for loop to go till the index-1 where we want to insert the index
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		} //- When for loop completes the temp is pointing to the node at index-1

		// After below line, node -> next will point to the temp.next i.e., the next
		// node after temp
		Node node = new Node(val, temp.next);
		// - The node is pointing to the next node, what remains is that the nodeP
		// should point to the node
		// As the temp is pointing to the nodeP we can just change the value of the
		// nodeP -> next to point to the node
		temp.next = node;
		size++;
	}// -insert end

	// Deleting 1st element from the LL
	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		if (head == null)
			tail = null;
		size--;
		return val;
	}// -deleteFirst end

	// Deleting last element
	public int deleteLast() {
		if (size <= 1) {
			deleteFirst();
		}
		// for deleting we need to get the 2nd last node of LL
		Node secLast = get(size - 2);
		// -As indexing starts from 0 but size from 1, so size-2
		int val = tail.val;
		// -Storing this value which is going to get deleted
		tail = secLast;
		tail.next = null;
		return val;
	}// -deleteLast end

	// deleting element at certain index
	public int delete(int index) {
		if (index == 0)
			return deleteFirst();
		if (index == size - 1)
			return deleteLast();
		// We have to get the previous node of the node which we want to delete
		Node prev = get(index - 1);
		int val = prev.val;
		prev.next = prev.next.next;
		return val;
	}//-delete end

	//to find a certain value in the LL
	public Node find(int val) {
		Node node = head;
		while(node!= null) {
			if(node.val == val)
				return node;
			node = node.next;
		}
		return node;
	}
	public Node get(int index) {
		Node node = head;
		for (int i = 1; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}// -display end
}// -class LL end

public class A1_LL {
	public static void main(String[] args) {
		LL node = new LL();
		node.insertLast(4);
		node.insertLast(5);
		node.insertFirst(2);
		node.insertFirst(1);
		node.insertLast(6);
		node.insert(3, 2);
		node.display();
		System.out.println(node.deleteFirst());
		node.display();
		System.out.println(node.deleteLast());
		node.display();
		System.out.println(node.delete(1));
		node.display();
		System.out.println(node.find(4));
		

	}// -main end
}