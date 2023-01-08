package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.Arrays;
public class ArrayPractice {


    public static void main(String [] args) {
        int[] integerArray = {1,1,2,3,5,8};
        for (int i : integerArray) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        String theseWords = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        String[] stringArr = theseWords.split("\\.");
        System.out.println(Arrays.toString(stringArr));
    }
}
