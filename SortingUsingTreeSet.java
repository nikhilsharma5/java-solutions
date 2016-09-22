/*
 * Sort a list of strings using Tree Set
 * Testing properties of TreeSet to store elements in a sorted order
 * 
 *  Accepts List of Strings
 *  Returns List of Strings
 */
package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * The Class SortedSet.
 */
public class SortingUsingTreeSet {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("d");
		list.add("ag");
		list.add("ch");
		list.add("dsa");
		list.add("gkls");
		list.add(null);

		try {
			System.out.println(sortListUsingTreeSet(list));
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Sort list using tree set.
	 *
	 * @param list the list
	 * @return the list
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public static List<String> sortListUsingTreeSet(List<String> list) throws IllegalArgumentException {

		if (list.contains(null) || list == null) {
			throw new IllegalArgumentException("Empty List Passed");
		}
		Set<String> set = new TreeSet<String>();
		set.addAll(list);

		List<String> newlist = new ArrayList<>(set);

		return newlist;
	}

}
