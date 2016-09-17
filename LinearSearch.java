/*
 *	Linear Search Function
 *	Accepts Array of Integers
 *	Returns boolean  
 */

	/**
	 * Binary search.
	 *
	 * @param arr
	 *            the arr
	 */
	public static boolean linearSearch(Integer[] arr) {
		int counter = 0;
		int searchFor = 5;
		boolean isFound = false;

		for (Integer integer : arr) {
			counter++;
			if (integer == searchFor) {
				System.out.println("Found at: " + counter);
				isFound = true;
				break;
			}
		}

		return isFound;

	}
}
