import java.util.Scanner;
public class Learn {
    public static void main(String[] args) {
        //initialize variables needed
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        //-----PRETEST LOOP----
        //check for count BEFORE asking next question
        for (int count = 1; count <= 3; count++) {
            System.out.println("Question " + count);
            double target = Math.ceil(Math.random() * 101);

            //------POST TEST LOOP------
            //output input instructions one time (before the loop)
            System.out.print("Enter two numbers seperated by a space that add " +
                    "to " + target + ": ");
            //get user input for num1 and num2 infinite times until correct
            do {
                num1 = input.nextInt();
                num2 = input.nextInt();
                //print correct if numbers match
                if (num1 + num2 == target)
                    System.out.println("Correct!");
                    //print try again if numbers don't add to target
                else
                    System.out.println("Try Again");
            }
            //loop until numbers add to target
            while (num1 + num2 != target);
        }
    }
}