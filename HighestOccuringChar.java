/*
 * Return the count of highest occurring chars
 * Accepts a String as a method variable
 * Returns Map
 */
package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * The Class HighestOccuringChar.
 */
public class HighestOccuringChar {

	/**
	 * Count char.
	 *
	 * @param str
	 *            the str
	 * @return the map
	 */
	public static Map<String, Integer> highestCharCount(String str) {
		Map<String, Integer> map = new TreeMap<>();
		int i = 1;
		for (String s : str.split("")) {
			// Can Add Regex for specific matching
			if (!s.equals("-") && !s.equals(" ")) {
				if (map.get(s) == null)
					map.put(s.toLowerCase(), i);
				else
					map.put(s, i + map.get(s));
			}
		}

		System.out.println("Char Count ---> " + map);

		int value = 0;
		String key = "";

		List<String> list = new ArrayList<String>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (value == entry.getValue()) {
				list.add(entry.getKey());
			}
			if (entry.getValue() > value) {
				value = entry.getValue();
				key = entry.getKey();
				list.clear();
				list.add(key);
			}
		}

		map.clear();

		for (String string : list) {
			map.put(string, value);
		}
		return map;
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Char`s with highest count ->>>> "
				+ highestCharCount("So many words in this line nnnn that oooo it just gets hard to count"));
	}

}
