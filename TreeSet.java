/*
 * Create a TreeSet and Print Added Strings in reverse order using Comparator - Compare method
 * returns List of added strings in descending order
 */
package Sorting;

import java.util.Set;

/**
 * The Class TreeSet.
 */
public class TreeSet {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Set<String> set = new java.util.TreeSet<String>(new StringComparable());

		set.add("Delhi");
		set.add("Chennai");
		set.add("Mumbai");

		for (String string : set) {
			System.out.println(string);
		}

	}
}


/*
 * String Comparable class implemnting Comparator interface
 * Overrides compare method of Comparator interface to compare two strings
 * 
 * returns int value based on String1 and String2 comparison
 */
package Sorting;

import java.util.Comparator;

/**
 * The Class Comparable.
 */
public class StringComparable implements Comparator<String> {

	/**
	 * Compare.
	 *
	 * @param str1 the str 1
	 * @param str2 the str 2
	 * @return the int
	 */
	@Override
	public int compare(String str1, String str2) {
		return str2.compareTo(str1);
	}
}
