package com.simpli;

import java.util.Arrays;

public class MyQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue myQ = new MyQueue();

		myQ.enQueue(10);
		myQ.enQueue(20);
		myQ.enQueue(30);

		myQ.display();

		System.out.printf("\n Dequeing ...%s \n", myQ.deQueue());
		
		myQ.display();

	}
}

class MyQueue {

	int SIZE = 5;
	int items[] = new int[SIZE];
	int front, rear;

	MyQueue() {
		front = -1;
		rear = -1;
	}

	// helper methods


	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		return false;
	}

	// operations
	void enQueue(int element) {

		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear++;

			items[rear] = element;
			System.out.println("Inserted " + element);
		}

	}

	// remove operation
// remove operation
	int deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			// the has some elements, so return the front element

			int deQueuedVal = items[front];
			front++;

			// check if the queue is empty after the above dequeue
			if (front >= rear) {
				front = -1;
				rear = -1;
			}

			return deQueuedVal;

		}

	}

//	 void printQueue(){
//		 System.out.println(Arrays.toString(items));
//	 }
	void display() {

		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {

			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(items[i] + "  ");
		}
	}

}