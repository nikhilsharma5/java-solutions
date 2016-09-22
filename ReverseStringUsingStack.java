/*
 *	Reversing a String using Stack LIFO property
 *	 
 *	Method param accepts string
 *	Returns String
 */
package Sorting;

import java.util.Iterator;
import java.util.Stack;

/**
 * The Class ReverseStringUsingStack.
 */
public class ReverseStringUsingStack {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ReverseString("abcdefghijklmnop");
	}

	/**
	 * Reverse string.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String ReverseString(String str) {
		Stack<String> stack = new Stack<>();
		String stringf = "";
		String[] arr = str.split("");
		for (String string : arr) {
			stack.push(string);
		}

		Iterator<String> iterator = stack.iterator();
		while( iterator.hasNext()){
			stringf += stack.pop();
		}
		System.out.println("Reversed String: " + stringf);
		
		return stringf;
	}

}
