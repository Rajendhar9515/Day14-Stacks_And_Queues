package com.stacksandqueues;

import java.util.LinkedList;

public class Stack {

	// created object of LinkedList class 
	LinkedList<Integer> linkedList = new LinkedList<Integer>();

	// add element to the stack. 
	public void push(Integer data) {
		linkedList.addFirst(data);
	}

	// print method to print stack elements. 
	public void printStack() {
		System.out.println(linkedList.toString());
	}

	// Main method.
	public static void main(String[] args) {
		
		// Displayed welcome message 
		System.out.println("\t WELCOME TO STACK \n");

		Stack stack = new Stack();
		stack.push(70); // 70 is adding first
		stack.push(30); // 30 is adding second
		stack.push(56); // 56 is adding last
		stack.printStack();
	}

}
