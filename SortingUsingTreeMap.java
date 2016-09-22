/*
 * Sort a list of strings using Tree Map
 * Testing properties of TreeMap to store entries in a sorted order
 * 
 */

package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * The Class SortingUsingTreeMap.
 */
public class SortingUsingTreeMap {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("d", 4);
		map.put("ag", 6);
		map.put("ch", 1);
		map.put("dsa", 2);
		map.put("gkls", 8);
		map.put("adsa", 5);

		System.out.println(map);

		Map<String, Integer> map1 = new TreeMap<>();
		map1.putAll(map);

		System.out.println("\nSorted Map");
		System.out.println(map1);

	}

}
