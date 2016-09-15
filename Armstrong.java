// Returns a boolean value if the passed param is an Armstrong Number
// Accepts int value as method param

	/**
	 * Armstrong number.
	 *
	 * @param integer the integer
	 * @return true, if successful
	 */
	public static boolean armstrongNumber(Integer integer) {
		int temp = 0;
		boolean isEqual = false;
		for (int i = 0; i < String.valueOf(integer).length(); i++) {
			String[] s = integer.toString().split("");
			temp += Math.pow(Integer.parseInt(s[i]), 3);
		}

		if (integer == temp)
			isEqual = true;

		return isEqual;
	}
}
