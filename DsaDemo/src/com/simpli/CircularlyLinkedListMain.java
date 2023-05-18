package com.simpli;

public class CircularlyLinkedListMain {

	public static void main(String[] args) {
		
		CircularlyLinkedList CLL1 =  new CircularlyLinkedList();
		
		CLL1.sortedInsert(5); // inserting into EMPTY CLL
		CLL1.printCLL();

		CLL1.sortedInsert(3); // 
		CLL1.printCLL();
		
		CLL1.sortedInsert(31); // 
		CLL1.printCLL();
		CLL1.sortedInsert(77); // 
		CLL1.printCLL();
		CLL1.sortedInsert(1); // 
		CLL1.printCLL();
		
		
		
		

	}

}

class CircularlyLinkedList{
	
	Node head;
	
	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	
//  operations
	
	void sortedInsert(int data) {
		Node new_node = new Node(data);
		
		// case 1 if the CLL was empty
		if(this.head == null) {
			this.head = new_node;
			new_node.next = new_node;
		}
		
		// case 2.1 if the CLL is NOT empty
		// and data to insert is less than the head's data.
		Node current = this.head;
		if (new_node.data < current.data) {
			
			while(current.next != this.head)
				current = current.next;
			
			current.next = new_node;
			new_node.next = this.head;
			 this.head = new_node;			
		}
		// case 2.2 if the CLL is NOT empty
		  // and data to insert is > than the head's data.
		  if (new_node.data >= current.data) {

		   while (current.next != this.head && current.next.data < new_node.data)
		    current = current.next;

		   new_node.next = current.next;
		   current.next = new_node;
		  }
		
	}
void printCLL(){
		
		Node current_node = this.head;

		do {
			System.out.print(current_node.data + "->");

			current_node = current_node.next;
		} while (current_node != this.head);

		System.out.println();
		
		
	}
	
	
}