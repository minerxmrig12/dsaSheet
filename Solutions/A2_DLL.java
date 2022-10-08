package pkg.customLL;

class DLL {
	private Node head;
	private Node tail;
	private int size;

	private class Node {
		Node prev;
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}// - constructor end
		public Node(int val, Node nodeP, Node nodeN) {
			this.val = val;
			this.prev = nodeP;
			this.next = nodeN;
		}// - constructor end
	}// Node end
	public DLL() {
		this.size = 0;
	}

	// Insert at first position
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.prev = null;
		node.next = head;
		if (head != null)
			head.prev = node;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}// - insertFirst end

	// Display function
	public void display() {
		Node temp = head;
		Node last = null;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			// last will store the (temp-1)st node at last iteration and temp
			// will store the next i.e., null which will violate the condition
			// and last will not get updated which will give us the tail of the
			// LL
			last = temp;
			temp = temp.next;
		}
		System.out.println("END");

		//printing in reverse
		// Now that last var is pointing to the last node of the LL we can use
		// that to print reverse LL
//		while (last != null) {
//			System.out.print(last.val + " -> ");
//			last = last.prev;
//		}
//		System.out.println("START" + "\n");
	}// - display end

	public void insertLast(int val) {
		Node node = new Node(val);
		Node temp = head;
		// We are running till temp.next != null so that we will get te last
		// node and not the null
		while (temp.next != null) {
			temp = temp.next;
		} // - We got the tail here

		node.prev = temp;
		node.next = null;
		temp.next = node;
		// We are not given the tail in interviews but still we are maintaining
		// here for extras.
		tail = node;
		size++;
	}// - insertLast end

//	public void insert(int after, int val) {
//		Node node = new Node(val);
//		Node where = find(after);
//		if(where == null) {
//			System.out.println("Doesnt exist ");
//			return;
//		}
//		node.next = where.next;
//		where.next = node;
//		node.prev = where;
//		if(where.next != null)
//			where.next.prev = node;
//		size++;
//
//	}// - insert end -- Not WOrking
	
	public void insert(int after, int val) {
		Node node = new Node(val);
		Node nodep = find(after);
		
		if(nodep == null) {
			System.out.println("Element doesn't exist");
		}
		
		
		if(nodep.next == null) {
			
		}
		node.next = nodep.next;
		node.prev = nodep;
		nodep.next = node;
		
		
	}//- insert end
	
	public Node find(int after) {
		Node node = head;
		while(node!=null) {
			if(node.val == after)
				return node;
			node = node.next;
		}
		return node;
	}

	public void deletFirst() {
		head = head.next;
		head.prev = null;
		size--;
	}// - deleteFirst end

	public void deleteLast() {

		Node last = head;
		while (last.next.next != null) {
			last = last.next;
		}
		// - we got 2nd the last node
		last.next = null;
		size--;
	}// - deleteLast end

//	public void deleteAt(int ele) {
//		Node where = find(ele);
//		if (where == null) {
//			System.out.println("Element Doesn't exist to delete!!!!");
//			return;
//		}
//		where.next.prev = where;
//		where.next = where.next.next;
//		size--;
//	}// - deleteAt end
//	public Node find(int val) {
//		Node node = head;
//		while(node!= null) {
//			if(node.val == val)
//				return node;
//			node = node.next;
//		}
//		return null;
//	}// - find end -- Not Working
	
}// - DLL end

public class A2_DLL {
	public static void main(String[] args) {
		DLL lt = new DLL();
		lt.insertFirst(4);
		lt.insertFirst(3);
		lt.insertFirst(2);
		lt.insertFirst(1);
		lt.display();
		lt.insertLast(34);
		lt.display();
		lt.insert(34, 5);
		lt.display();
//		lt.deletFirst();
//		lt.display();
//		lt.deleteLast();
//		lt.display();
//		lt.deleteAt(2);
//		lt.display();
	}

}// A2_DLL end
