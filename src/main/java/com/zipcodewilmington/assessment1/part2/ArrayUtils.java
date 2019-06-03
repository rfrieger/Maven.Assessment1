package com.zipcodewilmington.assessment1.part2;

//import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for(Object object: objectArray){
            if(object.equals(objectToCount)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {

        ArrayList<Integer> newArr= new ArrayList<Integer>();
        ;
        for (int i = 0; i <objectArray.length ; i++) {
            if(!objectArray[i].equals(objectToRemove)) {
                newArr.add(objectArray[i]);
            }
        }

        Integer[] returnArr = new Integer[newArr.size()];

        for (int i = 0; i <newArr.size() ; i++) {
            returnArr[i] = newArr.get(i);
        }
        return returnArr;


    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        Object temp;
        int count = 0;
        int tempCount;
        for (int i = 0; i <objectArray.length -1 ; i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 0; j <objectArray.length ; j++) {
                if (temp.equals(objectArray[j])){
                    tempCount++;
                }
            }
            if (tempCount > count) {
                mostCommon = temp;
                count = tempCount;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object least = objectArray[0];
        Object temp;
        int count = 1;
        int tempCount;
        for (int i = 0; i <objectArray.length  ; i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 0; j <objectArray.length ; j++) {
                if (temp.equals(objectArray[j])){
                    tempCount++;
                }
            }
            if (tempCount <= count) {
                least = temp;
                count = tempCount;
            }
        }
        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] mergedArr = new Object[objectArray.length + objectArrayToAdd.length+10];

        System.arraycopy(objectArray, 0, mergedArr, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd,0, mergedArr, objectArray.length+1, objectArrayToAdd.length);

        return mergedArr;
    }
}
