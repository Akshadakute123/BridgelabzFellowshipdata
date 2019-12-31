package Com.Bridgelabz.Fellowship.DataStructure;

public class LinkedListhashing<T>
{

		public class Node<T> {
			public Node next;
			public T data;

		}

		Node<T> head;

		
		//public UnOrderedLinkedList list() {
			//return new UnOrderedLinkedList();
		//}

		
		public void add(T obj) {
			Node<T> node = new Node();
			node.data = (T) obj;
			if (head == null)
				head = node;
			else {
				Node insert = head;
				while (insert.next != null) {
					insert = insert.next;
				}
				insert.next = node;
			}
		}

		
		public void remove(T data) {
			Node<T> temp = head, prev = null;

			if (temp.data.equals(data)) {
				head = temp.next;
				return;
			}

			while (temp != null && !temp.data.equals(data)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null)
				return;

			prev.next = temp.next;

		}

		
		public boolean search(Object obj) {
			Node search = new Node();
			search.data = obj;
			Node check = head;
			while (check != null) {
				if (check.data.equals(search.data))
					return true;
				check = check.next;
			}
			return false;

		}

		
		public boolean isEmpty() {
			if (head == null)
				return true;
			else
				return false;
		}

		
		public int size() {
			Node<T> temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		
		
		public void append(Object obj) {
			Node<T> node = new Node();
			node.data = (T) obj;
			if (head == null)
				head = node;
			else {
				Node insert = head;
				while (insert.next != null) {
					insert = insert.next;
				}
				insert.next = node;
			}
		}
		// removes element at the passed index
		public void removeAtIndex(int index) {
			if (index == 0)
				head = head.next;
			else {
				Node n = head;
				Node n1 = null;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
			}
		}


		public void display() {
			Node display = head;
			while (display != null) {
				
				System.out.print(display.data+" ");
				display = display.next;
			}
		}


		public int index(T item) {
			Node temp = head;
			int count = 0;
			while (item != (temp.data)) {
				count++;
				temp = temp.next;

			}
			return count;
		}

		
		public void insert(T data, int position) {

			Node<T> new_data = new Node<T>();
			new_data.data = data;
			Node<T> temp = head;

			while (position > 1) {
				temp = temp.next;
				position--;
			}
			new_data.next = temp.next;
			temp.next = new_data;
		}
		
		
		
		public T pop()
		{
			Node temp = head;
			Node poping=null;
			while(temp.next!=null)
			{
				poping=temp;
				temp=temp.next;
			}
			Node value =poping;
			poping.next=null;
			return (T) value.data;
		}
		
		public T popAtIndex(int index)
		{
			Node temp=head;
			Node remove = null;
			if(index==0)
			{
				head=temp.next;
				return (T) temp.data;
			}
			else {
				while (index != 0) {
					remove = temp;
					temp = temp.next;
					index--;
				}
				Node value = remove;
				remove.next = temp.next;
				return (T) value.data;
			}
		}

	}

