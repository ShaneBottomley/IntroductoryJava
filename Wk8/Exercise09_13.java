import java.util.Scanner;

public class Exercise09_13 {
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

        Location matrixLocationObj = new Location();
        matrixLocationObj = locateLargest(matrix);

        System.out.println("The largest element is " + matrixLocationObj.maxValue +
                ", located at (" + matrixLocationObj.row + ", "
                + matrixLocationObj.column + ")");
    }


    public static Location locateLargest(double[][] a) {
        // Write your code
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
        // Hint for creating a Location object.
        // Assume the max value in a is m and location is at (x, y)
        Location location = new Location();
        location.maxValue = largest; location.row = largestLocation[0]; location.column =
                largestLocation[1];
        return location;
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;
}