public class Exercise09_01 {
    public static void main(String[] args) {
        //new object
        Rectangle r1 = new Rectangle(4, 40);

        //second object
        Rectangle r2 = new Rectangle(3.5, 35.9);

        //output results for r1
        System.out.println("The area of a rectangle with width " +
                r1.width + " and height " + r1.height + " is " +
                r1.getArea());
        System.out.println("The perimeter of a rectangle is " +
                r1.getPerimeter());

        //output results for r2
        System.out.println("The area of a rectangle with width " +
                r2.width + " and height " + r2.height + " is " +
                r2.getArea());
        System.out.println("The perimeter of a rectangle is " +
                r2.getPerimeter());
    }
}

class Rectangle {
    double width;
    double height;

    //default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    //custom constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //method to get area
    double getArea() {
        double area = width * height;
        return area;
    }

    //method to get perimeter
    double getPerimeter() {
        double perimeter = (width * 2 ) + (height * 2);
        return perimeter;
    }
}