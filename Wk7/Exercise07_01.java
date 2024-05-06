import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number of students
        System.out.print("Enter number of students: ");
        int numOfStudents = input.nextInt();
        double best = 0;
        double[] scores = new double[numOfStudents];

        //enter each student's score
        System.out.print("Enter " + numOfStudents + " scores: ");
        for (int i = 0; i < numOfStudents; i++) {
            scores[i] = input.nextDouble();
            if (scores[i] > best)
                best = scores[i];
        }
        char grade = 'F';
        for (int i = 0; i < numOfStudents; i++) {
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20) {
                grade = 'B';
            }
            else if (scores[i] >= best - 30) {
                grade = 'C';
            }
            else if (scores[i] >= best - 40) {
                grade = 'D';
            }
            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grade);
        }
    }
}
