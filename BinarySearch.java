/*
 *Binary Search Algorithm with recursion.
 *Accepts Array and returns boolean value
 */
	/**
	 * Binary search.
	 *
	 * @param arr
	 *            the arr
	 * @return true, if successful
	 */
	public static boolean binarySearch(Integer[] arr) {
		int x = 99;
		boolean isFound = false;
		Integer[] sub;

		if (arr.length == 0) {
			System.out.println("Empty Array");
		} else if (arr.length == 1) {
			if (x == arr[0]) {
				isFound = true;
				System.out.println("Integer found : " + x);
			} else
				System.out.println("Integer not found in given Array");
		} else {
			mean = arr.length / 2;
			if (x == arr[mean]) {
				System.out.println("Integer found at: " + mean);
			} else if (x < arr[mean]) {
				if (mean == 1) {
					sub = Arrays.copyOfRange(arr, 0, mean);
					binarySearch(sub);
				} else {
					sub = Arrays.copyOfRange(arr, 0, mean - 1);
					binarySearch(sub);
				}
			} else if (x > arr[mean]) {
				sub = Arrays.copyOfRange(arr, mean + 1, arr.length);
				binarySearch(sub);
			}
		}

		return isFound;
	}

}
