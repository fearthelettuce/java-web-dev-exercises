package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        double rectLen = input.nextDouble();
        System.out.println("Width: ");
        double rectWidth = input.nextDouble();
        double area = rectLen * rectWidth;
        System.out.println(area);
        input.close();
    }

}
