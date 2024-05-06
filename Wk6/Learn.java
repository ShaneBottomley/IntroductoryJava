import java.util.Scanner;

public class Learn {
    int objNum;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get a number to be multiplied
        System.out.print("Enter an int to be multiplied by 10: ");
        int firstNum = input.nextInt();

        System.out.println("Num entered is passed to multiplyBy10 method");
        //pass firstNum to method
        multiplyBy10(firstNum);

        //print first num..
        System.out.println("The number you entered is still " + firstNum);
        //it's still the same as before. This is pass by value. The value of
        // firstNum is passed to the method, but the variable firstNum is not
        // changed.

        System.out.println("");
        System.out.println("Pass by reference");

        //Pass by reference
        Learn obj = new Learn();
        //set objNum to num entered by user previously
        obj.objNum = firstNum;
        //before calling multiply by 10 obj is
        System.out.print("After passing an obj, num is " + multiplyBy10PBR(obj));

    }
    public static int multiplyBy10(int num) {
        int x = num * 10;
        return x;
    }

    public static int multiplyBy10PBR(Learn num) {
        num.objNum = num.objNum * 10;
        return num.objNum;
    }
}