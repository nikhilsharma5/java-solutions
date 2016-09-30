/*
 * Finding the longest Palindrome from a given string
 * Accepts a String
 * Returns a String
 */
package Sorting;

/**
 * The Class LongestPalindrome.
 */
public class LongestPalindrome {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("bananas"));
	}

	/**
	 * Longest palindrome.
	 *
	 * @param str the str
	 * @return the string
	 */
	public String longestPalindrome(String str) {
		String longest = str.substring(0, 1);
		String tmp;
		if (str.isEmpty()) {
			return "Please enter a String";
		}

		if (str.length() == 1) {
			return str;
		}

		for (int i = 0; i < str.length(); i++) {

				tmp = checkForEquality(str, i, i);
				if (tmp.length() > longest.length()) {
					longest = tmp;
				}
				tmp = checkForEquality(str, i, i + 1);
				if (tmp.length() > longest.length()){
					longest = tmp;
			}
		}
		return longest;
	}

	/**
	 * Check for equality.
	 *
	 * @param str the str
	 * @param begin the begin
	 * @param end the end
	 * @return the string
	 */
	private String checkForEquality(String str, int begin, int end) {
		while (begin >= 0 && end <= str.length() - 1 && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin + 1, end);
	}
}
