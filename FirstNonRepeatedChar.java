/*
 * Returns first non repeated character from a String passed as method param
 * 
 * returns String
 */

	public static String nonRepeatedChar(String string) {

		String firstNonRepeatedChar = null;
		String[] s = string.split("");
		Map<String, Integer> map = new HashMap<>();
		int j = 1;
		for (String str : s) {
			if (map.containsKey(str))
				map.put(str, (map.get(str)) + j);
			else
				map.put(str, j);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1)) {
				firstNonRepeatedChar = entry.getKey();
				break;
			}
		}

		System.out.println(firstNonRepeatedChar);
		return firstNonRepeatedChar;
	}
}
