import java.util.Scanner;
public class Vehicle {
    Scanner input = new Scanner(System.in);
    String make;
    String model;
    int year;
    String color;

    //constructor
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }



    public static void main(String[] args) {
        //new vehicle object
        Vehicle shaneVehicle = new Vehicle(
                "Toyota", "Tundra", 2006, "Silver");

        System.out.println(shaneVehicle.color);

        //pass by reference
        paintJob(shaneVehicle, "Red");

        //new color is red
        System.out.println(shaneVehicle.color);
    }

    public static void paintJob(Vehicle vehicle, String newColor) {
        vehicle.color = newColor;
    }
}
