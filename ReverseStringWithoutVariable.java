/*
 * Reverse a String w/o using any additional String, Arrays or any other Data Structure 
 */
package Sorting;

public class ReverseStringWithoutVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String str = "something";
		try {for (int j = 0; j < str.length(); j++) {
			str = str.substring(1, str.length() - j) + str.substring(0, 1)
					+ str.substring(str.length() - j, str.length());
		}
		System.out.println("Reversed String : " + str);
		}
		catch ( StringIndexOutOfBoundsException ex){
			throw new StringIndexOutOfBoundsException("Exception while fetch length of String");
		}
	}

}
