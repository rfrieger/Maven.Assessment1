package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        String[] letterArr = input.split("");
        Integer count = letterArr.length; //handles all single letters

// need to handle for even num of letter cases :(


        for (int i = 0; i <letterArr.length ; i++) {
            //check if letter +1 index is same, if so count ++
            if(  i != letterArr.length-1 && letterArr[i].equals( letterArr[i + 1])) {
                count++;
            } else if (i == letterArr.length -1 && letterArr[i].equals( letterArr[i - 1]) ) {
                count++;
            }


                for (int j = 1; j < letterArr.length - 1; j++) {
                    if (i - j > 0 && i + j < letterArr.length - 1) {
                        if (letterArr[i - j].equals(letterArr[i + j])) {
                            count++;
                        } else break;
                    }
                }
        }

        return count;
    }
}
