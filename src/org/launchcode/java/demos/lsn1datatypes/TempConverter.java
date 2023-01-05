package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double degF;
        double degC;
        char enteredType;
        String userInput;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temp followed by C or F");
        userInput = input.next();
        enteredType = userInput.charAt(2);
        degF = Double.parseDouble(userInput.substring(0,2));
        input.close();

        degC = (degF - 32) * 5/9;
        System.out.println("The temp in C is: " + degC);
    }
}

//public class TempConverter {
//    public static void main(String[] args) {
//        double fahrenheit;
//        double celsius;
//        Scanner input;
//
//        input = new Scanner(System.in);
//        System.out.println("Enter the temperature in Fahrenheit: ");
//        fahrenheit = input.nextDouble();
//        input.close();
//
//        celsius = (fahrenheit - 32) * 5/9;
//        System.out.println("The temperature in Celsius is: " + celsius + "°C");
//    }
//}
