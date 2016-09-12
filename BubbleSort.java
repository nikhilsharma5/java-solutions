// Returns sorted array of integers
// @param an array of integers..

	/**
	 * Bubble sort.
	 *
	 * @param arr the arr
	 * @return the integer[]
	 */
	public static Integer[] bubbleSort(Integer[] arr) {
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				System.out.println("Array at this point looks like: " + Arrays.asList(arr));
			}
		}
		return arr;
	}

}
