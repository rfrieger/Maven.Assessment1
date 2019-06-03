package com.zipcodewilmington.assessment1.part1;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n  ; i++) {
            sum += i;

        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer sum = 1;
        for (int i = 2; i <= n  ; i++) {
            sum *= i;

        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String[] nums = Integer.toString(val).split("");
        String reverseString = "";
        for (int i = nums.length-1; i >= 0; i--) {
            reverseString += nums[i];
        }
        return Integer.valueOf(reverseString);
    }
}
