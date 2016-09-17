/*
 *	Fibonnaci Series
 *	Returns List<Integer>
 * 
 */

	/**
	 * Fibonacci series.
	 *
	 * @return the list
	 */
	public static List<Integer> fibonacciSeries() {
		int first = 0;
		int second = 1;
		int f = first + second;

		List<Integer> list = new ArrayList<>();
		list.add(first);
		list.add(second);

		for (int i = 0; i < 100; i++) {
			f = first + second;
			list.add(f);

			first = second;
			second = f;
		}
		return list;
	}
}
