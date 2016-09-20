/*
 * Sorting a Hashset by converting it to a list and using collections.sort
 * converting list back to sorted hashset
 * 
 * returns sorted hashset
 */
package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * The Class SortingHashSet.
 */
public class SortingHashSet {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("dsafasdsa");
		hashSet.add("cfsadfsda");
		hashSet.add("sdfafsag");
		hashSet.add("bfsadfsa");
		hashSet.add("afsafdsgfds");

		for (String string : hashSet) {
			System.out.println(string);
		}

		sortHashSet(hashSet);
	}

	/**
	 * Sort hash set.
	 *
	 * @param hashset the hashset
	 * @return the hash set
	 */
	public static HashSet<String> sortHashSet(HashSet<String> hashset) {
		List<String> list = new ArrayList<>(hashset);

		Collections.sort(list);

		System.out.println("\nSorted Hash Set\n");
		for (String string : list) {
			System.out.println(string);
		}

		HashSet<String> sortedHashSet = new HashSet<>(list);

		return sortedHashSet;
	}

}
