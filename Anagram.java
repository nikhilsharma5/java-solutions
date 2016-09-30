package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Class Anagram.
 */
public class Anagram {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.anagram("3456", "3465"));
	}
	
	/**
	 * Anagram.
	 *
	 * @param str1 the str 1
	 * @param str2 the str 2
	 * @return true, if successful
	 */
	public boolean anagram(String str1, String str2) {
		boolean isAnagram = false;
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		for (char c1 : str1.toCharArray()) {
			list1.add(String.valueOf(c1));
		}
		for (char c1 : str1.toCharArray()) {
			list2.add(String.valueOf(c1));
		}
		Collections.sort(list1);
		Collections.sort(list2);

		if (list1.equals( list2))
			isAnagram = true;
		return isAnagram;
	}

}
