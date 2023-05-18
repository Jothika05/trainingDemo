package com.simpli;



public class DoublyLinkedListMain {

	public static void main(String[] args) {
		MyDoublyLinkedList DLL1 = new MyDoublyLinkedList();

		DLL1.insertFirst(5);
		DLL1.insertFirst(7);
		DLL1.insertFirst(12);

		DLL1.printDLL();
	}

}

class MyDoublyLinkedList {
	Node head = null;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	// operation
	// operation
		public void insertFirst(int data) {
			Node new_node = new Node(data);

			// case 1 if the DLL was empty
			if (this.head == null) {
				this.head = new_node;
			}

			else {
				new_node.next = this.head;
				this.head.prev = new_node;

				this.head = new_node;
			}

		}

		public void printDLL() {
			Node current_node = this.head;

			while (current_node != null) {
				System.out.print(current_node.data + "->");
				current_node = current_node.next;
			}
			;
			System.out.println();

		}

	
/// append
	public void insertLast(int data) {
		Node new_node = new Node(data);

		// case 1 if the DLL was empty
		if (this.head == null) {
			this.head = new_node;
		}
		
		else {
			Node current_node = this.head;
			
			while(current_node.next != null)
				current_node = current_node.next;
			
			current_node.next = new_node;
			new_node.prev = current_node;		
		}

	}
public class DoublyLinkedListMain {

	public static void main(String[] args) {
		MyDoublyLinkedList DLL1 = new MyDoublyLinkedList();

		DLL1.insertFirst(5);
		DLL1.insertFirst(7);
		DLL1.insertFirst(12);

		DLL1.printDLL();
		
		DLL1.insertLast(101);
		DLL1.printDLL();
		DLL1.insertLast(104);
		DLL1.printDLL();
	}

}}