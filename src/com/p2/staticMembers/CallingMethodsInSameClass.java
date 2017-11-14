package com.p2.staticMembers;

/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass {
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		// Cannot make a static reference to the non-static method printThree()
		// from the type CallingMethodsInSameClass
		// printThree();
		CallingMethodsInSameClass cmi = new CallingMethodsInSameClass();
		cmi.printThree();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

	public void printThree() {
		System.out.println("Hello World 3");
		// printOne();
	}
}