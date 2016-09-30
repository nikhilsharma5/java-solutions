/*
 * Reversing a String using recursion.
 * Accepts String as method param
 * Returns String
 */
package Sorting;

/**
 * The Class ReverseStringUsingRecursion.
 */
public class ReverseStringUsingRecursion {

	/**
	 * Reverse.
	 *
	 * @param str the str
	 * @return the string
	 */
	public String reverse(String str) {
		if (str == null || (str.length() <= 1))
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ReverseStringUsingRecursion rr = new ReverseStringUsingRecursion();
		String reversed = rr.reverse("reverse"); 
		System.out.println(reversed);
	}
}
