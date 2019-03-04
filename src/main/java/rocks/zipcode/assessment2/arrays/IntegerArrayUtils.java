package rocks.zipcode.assessment2.arrays;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer... valueToBeAdded) {

        Integer[] newArray = new Integer[integerArray.length + valueToBeAdded.length];
        System.arraycopy(integerArray, 0, newArray, 0, integerArray.length);
        System.arraycopy(valueToBeAdded, 0, newArray, integerArray.length, valueToBeAdded.length);

        return newArray;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(integerArray));
        list.set(indexToInsertAt,valueToBeInserted);
        Integer[] newArray = new Integer[list.size()];
        newArray = list.toArray(newArray);
        return newArray;

    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        int temp =0;
        for(int i=0;i<integerArray.length;i++){
            temp = integerArray[i];
            if(temp%2==0){
                integerArray[i]= temp + 1;
            }
            else if(temp%2!=0){
                integerArray[i]= temp - 1;
            }

        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        int temp =0;
        for(int i=0;i<integerArray.length;i++){
            temp = integerArray[i];
            if(temp%2==0){
                integerArray[i]= temp + 1;
            }

        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        int temp =0;
        for(int i=0;i<input.length;i++){
            temp = input[i];
            if(temp%2!=0){
                input[i]= temp - 1;
            }

        }
        return input;
    }
}
