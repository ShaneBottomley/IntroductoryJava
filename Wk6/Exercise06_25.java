import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get input for milliseconds
        System.out.print("Enter time in milliseconds: ");
        long millis = input.nextLong();
        //call convert millis
        String myString = convertMillis(millis);
        System.out.println(myString);
    }
    public static String convertMillis(long millis) {
        long seconds = millis / 1000;
        long totalMinutes = seconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        seconds = seconds % 60;
        String s = totalHours + ":" + minutes + ":" + seconds;
        return s;
    }
}