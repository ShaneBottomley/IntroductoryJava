import java.util.Arrays;
import java.util.Scanner;
public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get num of cities
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        //create cities array
        double[][] cities = new double[numberOfCities][2];

        //get coordinates of each city
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++) {
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        //minimum total
        double minTotal = 1000;
        int minIndex = -1;
        for (int i = 0; i < cities.length; i++) {
            if (totalDistance(cities, i) < minTotal){
                minTotal = totalDistance(cities, i);
                minIndex = i;
            }
        }
        System.out.println("The central city is at "
                + Arrays.toString(cities[minIndex]));
        System.out.println("The total distance to all other cities is " + minTotal);
    }

    public static double distance(double[] c1, double[] c2) {
        double x1 = c1[0];
        double y1 = c1[1];
        double x2 = c2[0];
        double y2 = c2[1];
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double totalDistance(double[][] cities, int cityIndex) {
        double totalDistance = 0;
        for (int i = 0; i < cities.length; i++) {
            if (i != cityIndex) {
                totalDistance += distance(cities[cityIndex], cities[i]);
            }
        }
        return totalDistance;
    }
}