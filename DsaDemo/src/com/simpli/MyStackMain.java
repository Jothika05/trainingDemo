package com.simpli;

public class MyStackMain {

	public static void main(String[] args) {
		System.out.println("Stack Demo");

		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());

	}

}

class MyStack {
	static final int MAX = 1000;

	int top;

	int a[] = new int[MAX];

	// helper methods
	boolean isEmpty() {
		return (top < 0);
	}

	MyStack() {
		top = -1;
	}

	// typical operations of a stack
// typical operations of a stack
	boolean push(int x) {

		if (top > MAX - 1) {
			System.out.println("Stack Overflow!");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed to stack!");
			return true;
		}

	}

	int pop() {

		if (top == -1) {
			System.out.println("Stack underflow!");
			return -1;
		} else {
			int x = a[top];
			top--;
			System.out.println(x + " popped from the stack!");
			return x;
		}

	}

}