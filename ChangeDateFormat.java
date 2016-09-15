/*
 * Fetch Dates from a String in MM/DD/YYYY format and replace the 
 * string with date in DD/MM/YYYY format
 * 
 * Accepts string as method param and returns string
 */

	/**
	 * Change date format.
	 *
	 * @param paragraph the paragraph
	 * @return the string
	 * @throws ParseException
	 *             the parse exception
	 */
	public static String changeDateFormat(String paragraph) throws ParseException {
		StringBuilder builder = new StringBuilder();

		try {
			String[] s = paragraph.split(" ");
			for (int i = 0; i < s.length; i++) {
				if (s[i].contains("/")) {
					SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
					SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yy");
					Date date = format1.parse(s[i]);
					s[i] = format2.format(date).toString().replace("-", "/");
				}
			}
			for (int j = 0; j < s.length; j++) {
				if (j == s.length - 1)
					builder.append(s[j] + ".");
				else
					builder.append(s[j] + " ");
			}
		} catch (UnsupportedOperationException ex) {
			throw new UnsupportedOperationException("Waiting to be implemented.");
		}
		return builder.toString();
	}
}