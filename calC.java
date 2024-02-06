import java.util.Scanner;

public class calC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Select operation(1-5):");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    performAddition(scanner);
                    break;
                case '2':
                    performSubtraction(scanner);
                    break;
                case '3':
                    performMultiplication(scanner);
                    break;
                case '4':
                    performDivision(scanner);
                    break;
                case '5':
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != '5');
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }
}
