import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter score for subject 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for subject 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for subject 3: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("\nStudent: " + studentName);
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);

        input.close();
    }
}
