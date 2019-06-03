package com.zipcodewilmington.assessment1.part1;

import java.util.Calendar;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] stringArr = str.split("");
        String returnString = stringArr[0].toUpperCase();
        for (int i = 1; i <stringArr.length ; i++) {
            returnString += stringArr[i];
        }

        return returnString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverseString ="";
        for (int i = str.length() -1; i >= 0 ; i--) {
            reverseString +=  str.charAt(i);
        }
        return reverseString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversString = reverse(str);
        return camelCase(reversString);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String[] stringArr = str.split("");
        String returnString = "";
        for (int i = 1; i <stringArr.length - 1 ; i++) {
            returnString += stringArr[i];
        }

        return returnString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charArr = str.toCharArray();
        String returnString = "";
        for (int i = 0; i <charArr.length  ; i++) {
            if(Character.isLowerCase(charArr[i])) {
                returnString += Character.toUpperCase(charArr[i]);
            } else {
                returnString += Character.toLowerCase(charArr[i]);
            }
        }
        return returnString;
    }
}
