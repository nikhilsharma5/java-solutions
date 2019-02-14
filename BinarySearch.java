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
	private static boolean binarySearch( Integer[] array, int element, int left, int right ) {
        if ( left > right ) {
            return false;
        }

        int mid = left + ((right - left) / 2);
        if ( element == array[mid] ) {
            return true;
        } else if ( element < array[mid] ) {
            return binarySearch( array, element, left, mid - 1 );
        } else if ( element > array[mid] ) {
            return binarySearch( array, element, mid + 1, right );
        }
        return false;
    }

    public static void main( String[] args ) {
        Integer[] array = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println( binarySearch( array, 7, 0, array.length - 1 ) );
    }

}
