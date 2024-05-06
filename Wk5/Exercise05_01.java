import java.util.Scanner;
public class Exercise05_01 {
    public static void main (String args[]) {
        //declare variables needed
        Scanner input = new Scanner(System.in);
        int inputNum = 1;
        int numOfNegatives = 0;
        int numOfPositives = 0;
        float total = 0;

        //get user input
        System.out.print("Enter an integer, the input ends if it is 0: ");
        //begin while loop for user input
        while (inputNum != 0 ) {
            inputNum = input.nextInt();
            if (inputNum > 0)
                numOfPositives += 1;
            else if (inputNum < 0)
                numOfNegatives += 1;
            total += inputNum;
        }
        if (numOfPositives + numOfNegatives == 0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.println("The number of positives is " + numOfPositives);
            System.out.println("The number of negatives is " + numOfNegatives);
            System.out.println("The total is " + total);
            double avg = 1.0 * total / (numOfPositives + numOfNegatives);
            System.out.println("The average is " + avg);
        }
    }
}