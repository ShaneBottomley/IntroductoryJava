public class Exercise04_21 {
    public static void main (String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //input
        System.out.print("Enter a SSN: ");
        String socialSecurityNum = input.next();

        //validate ssn
        boolean isValid =
                socialSecurityNum.length() == 11 &&
                        Character.isDigit(socialSecurityNum.charAt(0)) &&
                        Character.isDigit(socialSecurityNum.charAt(1)) &&
                        Character.isDigit(socialSecurityNum.charAt(2)) &&
                        socialSecurityNum.charAt(3) == '-' &&
                        Character.isDigit(socialSecurityNum.charAt(4)) &&
                        Character.isDigit(socialSecurityNum.charAt(5)) &&
                        socialSecurityNum.charAt(6) == '-' &&
                        Character.isDigit(socialSecurityNum.charAt(7)) &&
                        Character.isDigit(socialSecurityNum.charAt(8)) &&
                        Character.isDigit(socialSecurityNum.charAt(9)) &&
                        Character.isDigit(socialSecurityNum.charAt(10));

        //print
        if (isValid)
            System.out.println(socialSecurityNum + " is a valid social " +
                    "security number");
        else
            System.out.println(socialSecurityNum + " is an invalid social " +
                    "security number");
    }
}