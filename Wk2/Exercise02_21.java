import java.util.Scanner;
public class Exercise02_21 {
    public static void main(String[] args) {
        //Declare new scanner
        Scanner input = new Scanner(System.in);

        //Get user input for investment amount
        System.out.print("Please enter the investment amount: $");
        double investmentAmount = input.nextDouble();

        //Get user input for annual interest rate
        System.out.print("Please enter the annual interest rate: %");
        double annualInterestRate = input.nextDouble();

        //Get user input for number of years
        System.out.print("Please enter the number of years as a whole number: ");
        int numberOfYears = input.nextInt();

        //Compute monthly interest rate, turn % to decimal
        double monthlyInterestRate = (annualInterestRate/100) / 12;

        //Compute future investment value formula
        // --- futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)
        // --- ^(numberOfYears * 12)

        //Compute parenthesis
        monthlyInterestRate += 1;
        numberOfYears *= 12;

        //Compute exponent and future investment value
        double a = Math.pow(monthlyInterestRate, numberOfYears);
        double futureInvestmentValue = investmentAmount * a;

        //Output future value
        System.out.println("The future value is: $" + (int)(futureInvestmentValue * 100 + .5) / 100.0);
    }
}