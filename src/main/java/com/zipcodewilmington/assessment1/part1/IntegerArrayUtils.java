package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for(Integer num : intArray){
            sum += num;
        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer sum = intArray[0];
        for (int i = 1; i <intArray.length ; i++) {
            sum *= intArray[i];
        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {


        Integer sum = 0;
        for(Integer num : intArray){
           sum += num;
        }

        Double dSum = Double.valueOf(sum);


        return dSum/intArray.length ;
    }
}
