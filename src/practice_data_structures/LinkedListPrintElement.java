package practice_data_structures;

import java.util.Scanner;

public class LinkedListPrintElement {

	static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
	
	static class LinkedList {
		public Node head;
		public Node tail;
		
		public LinkedList() {
			this.head = null;
			this.tail = null;
		}
		
		public void insertNode (int data) {
			
			Node node = new Node(data);
			
			if(this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}
			
			this.tail = node;
		}
	}
	
	public static void printLinkedList(Node head) {
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
        LinkedList llist = new LinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
	
}
