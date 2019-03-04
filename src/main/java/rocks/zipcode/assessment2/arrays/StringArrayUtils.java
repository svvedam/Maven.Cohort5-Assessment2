package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] subArray = Arrays.copyOfRange(arrayToBeSpliced,startingIndex, endingIndex);
        return subArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws ArrayIndexOutOfBoundsException {
        String[] subArray={};
        String exception = "";

            if(startingIndex>arrayToBeSpliced.length) {
                throw new IllegalArgumentException();
            }
            else if(startingIndex<0){
                throw new ArrayIndexOutOfBoundsException();
            }
            else {
                subArray = Arrays.copyOfRange(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
            }
        return subArray;
    }
}
