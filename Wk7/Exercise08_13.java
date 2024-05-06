import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get array size and initialize array
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] matrix = new double[rows][columns];

        //get array contents
        System.out.println("Enter the array: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        //get index location array
        int[] indexLocation = new int[2];
        indexLocation = locateLargest(matrix);

        //print index location
        System.out.println("The location of the largest element is at " +
                "(" + indexLocation[0] + ", " + indexLocation[1] + ")");

    }
    public static int[] locateLargest(double[][] a) {
        //set largest to first element in array
        double largest = a[0][0];
        //array for location of largest double. [row, column] ex. [0, 2]
        int[] largestLocation = new int[2];

        //iterate through column and rows comparing largest to current
        for (int column = 0; column < a[0].length; column++) {
            for (int row = 0; row < a.length; row++) {
                if (a[row][column] > largest) {
                    largest = a[row][column];
                    //set row to index 0 and column to index 1
                    largestLocation[0] = row;
                    largestLocation[1] = column;
                }
            }
        }
        return largestLocation;
    }
}