import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Quotient: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }

        input.close();
    }
}
