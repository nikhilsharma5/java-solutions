package Sorting;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		int temp = str.length() - 1;
		boolean isPalindrome = false;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(temp))
				isPalindrome = true;
			else
				isPalindrome = false;
			temp--;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println("Is Palindrom: " + isPalindrome("12345654321"));
	}
}
