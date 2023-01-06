package studio.areaofacircle ;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {


        double radius = getUserInput();
        System.out.println("The area of a circle is " + Circle.areaOfCircle(radius));

    }
    public static double getUserInput() {
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        while(true) {
            System.out.println("Enter a radius:");
            try {
                userInput = Double.parseDouble(input.next());
                if(inputIsValid(userInput)) {break;}
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input");
            }
        }
        input.close();
        return userInput;
    }
    public static boolean inputIsValid(double userInput) {
        if (userInput <= 0)
        {
            return false;
        }
        return true;
    }

    static final double pi = 3.14;
}
