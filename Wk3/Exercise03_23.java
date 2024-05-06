import java.util.Scanner;
public class Exercise03_23 {
    public static void main(String args[]) {
        //Program checks if two points are within the rectangle centered at
        // (0,0) and has a width of 10 and a height of 5
        //Declare new scanner
        Scanner input = new Scanner(System.in);

        //Get user input for X, Y
        System.out.print("Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        //Check points and output whether points are in rectangle or not
        if (pointX <= 5 && pointX >= -5 && pointY <= 2.5 && pointY >= -2.5) {
            System.out.println("Point (" + pointX + ", " + pointY + ") is in " +
                    "the rectangle");
        }
        else {
            System.out.println("Point (" + pointX + ", " + pointY + ") is not" +
                    " in the rectangle");
        }
    }
}
