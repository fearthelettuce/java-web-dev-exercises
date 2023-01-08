package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numArrList = new ArrayList<>();
        numArrList.add(4);
        numArrList.add(44);
        numArrList.add(6);
        numArrList.add(1);
        numArrList.add(2);
        numArrList.add(9);
        numArrList.add(48);
        numArrList.add(5);
        numArrList.add(8);
        numArrList.add(14);
        System.out.println(sumInt(numArrList));

        ArrayList<String> wordArrList = new ArrayList<>();
        wordArrList.add("Farts");
        wordArrList.add("Poop");
        wordArrList.add("Scoop");
        wordArrList.add("Beets");
        wordArrList.add("Fartzilla");
        printWords(wordArrList, 5);
    }

    public static Integer sumInt(ArrayList<Integer> arrList) {
        Integer totalSum = 0;
        for (int arrEle : arrList) {
            totalSum += arrEle;
        }
        return totalSum;
    }

    public static void printWords(ArrayList<String> arrList, int numLetters) {
        for (String arrEle : arrList) {
            if (arrEle.length() == numLetters) {
                System.out.println(arrEle);
            }
        }
    }


}
