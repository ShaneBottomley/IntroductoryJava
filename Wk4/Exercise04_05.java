public class Exercise04_05 {
    //
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //input
        System.out.println("Enter the number of sides: ");
        int numOfSides = input.nextInt();
        System.out.println("Enter the length of the side: ");
        double lengthOfSides = input.nextDouble();

        //compute area - numOfSides * lengthOfSides ^ 2 / (4 * tan
        // (pi/numOfSides))
        double area = (numOfSides * Math.pow(lengthOfSides, 2)) /
        (4 * Math.tan ((Math.PI) / numOfSides));

        //output area
        System.out.println(area);
    }
}