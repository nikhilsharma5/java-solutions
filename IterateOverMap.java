/*
 * Using different options t iterate over a Map
 * Entry Set
 * Entry Set with Iterator
 * Key Set
 * Values 
 */
package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * The Class IterateOverMap.
 */
public class IterateOverMap {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list2.add("c");
		list2.add("d");
		map.put("k1", list1);
		map.put("k2", list2);
		System.out.println(map);

		System.out.println("\nUsing Entry Set");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

		System.out.println("\nUsing Iterator");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			Iterator<String> i = entry.getValue().iterator();
			while (i.hasNext()) {
				System.out.println(entry.getKey() + ", " + i.next());
			}
		}

		System.out.println("\nUsing Key Set");
		for (String string : map.keySet()) {
			System.out.println("Keys: " + string);
		}

		System.out.println("\nUsing Values");
		for (List<String> values : map.values()) {
			System.out.println("Values for Key: " + values);
		}
	}
}
