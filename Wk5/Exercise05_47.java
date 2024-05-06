import java.util.Scanner;
public class Exercise05_47 {
    public static void main (String args[]) {
        //initialize variables needed
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a " +
                "string: ");
        String s = input.nextLine();
        if (s.length() != 12) {
            System.out.println(s + " is an invalid input");
            return;
        }
        else {
            int sum = 0;
            for (int i = 0; i <= s.length() -1; i++) {
                if (i % 2 == 0 )
                    sum += (s.charAt(i) - '0');
                else
                    sum += (s.charAt(i) - '0') * 3;
            }
            int checksum = 10 - sum % 10;
            if (checksum == 10)
                checksum = 0;
            System.out.println("The ISBN-13 number is " + s + checksum);
        }
    }
}