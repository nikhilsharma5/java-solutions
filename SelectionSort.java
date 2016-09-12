// Returns sorted array for selection sort
// @param an array of integers..

	public static Integer[] selectionSort(Integer[] arr) {
		int tempValue = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			tempValue = arr[index];
			arr[index] = arr[i];
			arr[i] = tempValue;
		}

		System.out.println(" Array : " + Arrays.asList(arr) + "\n");
		return arr;
	}

