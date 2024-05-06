import java.util.Scanner;
public class CommentedCode {
    public static void main(String args[]) {
        //This program calculates the bill total after applying
        //eligible discounts
        Scanner input = new Scanner(System.in);

        //Get total for bill
        System.out.println("Bill Calculator");
        //Get bill total
        System.out.print("What is the total for your bill?: ");
        double billTotal = input.nextDouble();

        //Ask senior discount eligibility
        System.out.println();
        System.out.println("We offer 3 discounts");
        System.out.println("Senior=$5, Super-Senior=$10, Military=$10");
        System.out.println();
        System.out.println("1=Yes 2=No");
        System.out.print("Are you over 55 years old?: ");
        int seniorElig = input.nextInt();

        //Begin if statement to apply discount($5 for seniors, $10 super senior)
        int discount = 0;
        //if over 55
        if (seniorElig == 1) {
            //nested if (if statement inside an if statement)
            System.out.print("Are you over 70 years old?: ");
            int superSeniorElig = input.nextInt();
            if (superSeniorElig == 1) {
                discount = 10;
            }
            //multiway if (includes an else if)
            else if (superSeniorElig == 2){
                discount = 5;
            }
            else {
                System.out.println("You need to enter 1 for yes and 2 for no");
            }
        }
        //if not over 55
        else if (seniorElig == 2) {
            discount = 0;
        }
        else {
            System.out.println("You must enter 1 for yes and 2 for no");
        }

        //Ask military eligibility discount
        System.out.println("We also offer a military discount.");
        System.out.println("1=Yes 2=No");
        System.out.print("Are you military?: ");
        int milElig = input.nextInt();

        int discount2 = 0;
        //begin switch for military discount
        switch (milElig) {
            case 1 -> discount2 = 10;
            case 2 -> discount2 = 0;
        }

        //billTotal calculation after discounts
        discount += discount2;
        System.out.println("Your discount is $" + discount);
        billTotal = billTotal - discount;
        System.out.println("Your total after the discount is $" + billTotal);
    }
}
