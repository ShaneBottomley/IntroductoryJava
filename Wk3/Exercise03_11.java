import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String args[]) {
        //This program prompts the user to enter the month and year and
        //display the number of days in the month

        //Declare scanner
        Scanner input = new Scanner(System.in);

        //Get input for month and year
        System.out.print("Enter month in the year (e.g., 1 for Jan):" +
                " ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //determine days in month
        int days = 0 ;
        //if month is a 30-day month
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        //days changes to 29 if leap year and deb
        else if (year % 4 == 0 && month == 2) {
            days = 29;
        }
        //if month is feb then days is 28 (leap year calculated later)
        else if (month == 2) {
            days = 28;
        }
        //all other months between 1-12 are 31 days
        else if (month > 0 && month < 13) {
            days = 31;
        }
        //did not enter between 1-12
        else {
            System.out.println("Month must be 1 through 12");
            return;
        }

        //assign name to month number
        String monthName = "Error";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        //output results
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}