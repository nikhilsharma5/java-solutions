// Return position of smallest integer from a 2 dimensional array passed as method param..
// @param an array of integers..
// we can use getters/setters to return value of i & j

     *
     * @param arr the arr
     */
    public static void smallestInt( Integer[][] arr ) {
        int minimum = arr[0][0];
        int DEFAULT_INDEX = 0;
        boolean flag = false;
        

        for ( int i = DEFAULT_INDEX; i < arr.length; i++ ) {
            for ( int j = DEFAULT_INDEX; j < arr.length; j++ ) {
                if ( arr[i][j] < minimum ) {
                    minimum = arr[i][j];
                    logger.info("Minimum was at {} and {}", i, j);
                    flag = true;
                }
            }
        }
        if ( flag == false){
            logger.info("Minimum was at {} and {}", DEFAULT_INDEX, DEFAULT_INDEX);
        }
    }
