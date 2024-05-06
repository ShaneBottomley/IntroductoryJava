import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //main program
        System.out.print("Enter an Integer: ");
        int myNum = input.nextInt();
        System.out.print("Enter the width: ");
        int myWidth = input.nextInt();

        System.out.println(format(myNum, myWidth));
    }

    //method to format string
    public static String format(int number, int width) {
        String numString = String.valueOf(number);
        String formattedString = "";
        if (numString.length() != width) {
            int numOfZeros = width - (numString.length());
            for (int i = 0; i < numOfZeros; i++) {
                formattedString += "0";
            }
            formattedString = formattedString + numString;
        }
        else {
            formattedString = numString;
        }
        return formattedString;
    }
}