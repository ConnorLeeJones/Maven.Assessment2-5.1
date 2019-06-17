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
        try {
            String[] myArr = new String[endingIndex - startingIndex];
            System.arraycopy(arrayToBeSpliced, startingIndex, myArr, 0, myArr.length);
            return myArr;
        } catch (NegativeArraySizeException e){
            throw new IllegalArgumentException();
        }
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        //String[] myArr = new String[arrayToBeSpliced.length - startingIndex];
        try {
            String[] myArr = new String[arrayToBeSpliced.length - startingIndex];
            System.arraycopy(arrayToBeSpliced, startingIndex, myArr, 0, myArr.length);
            return myArr;
        } catch (NegativeArraySizeException e){
            throw new IllegalArgumentException();
        }
    }
}
