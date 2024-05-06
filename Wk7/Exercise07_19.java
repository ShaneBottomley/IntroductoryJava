import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get size of list
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        //initialize list
        int[] list = new int[size];

        //get contents of the list
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++)
            list[i] = input.nextInt();

        //output results of list size and contents
        System.out.println("The list has " + size + " integers " +
                Arrays.toString(list));

        //invoke isSorted method and print results
        if (isSorted(list))
            //if isSorted returns true
            System.out.println("The list is already sorted");
        else
            //if isSorted returns false
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
