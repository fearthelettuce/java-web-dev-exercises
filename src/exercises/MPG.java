package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles: ");
        double milesDriven = input.nextDouble();
        System.out.println("Gallons: ");
        double gallonsUsed = input.nextDouble();
        double mpg = milesDriven / gallonsUsed;
        System.out.println(mpg);
        input.close();
    }
}
