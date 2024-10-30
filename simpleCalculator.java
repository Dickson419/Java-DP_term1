package TopicFour;
import java.util.Scanner;

public class simpleCalculator {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));
        }

        // Method for addition
        public static double add(double a, double b) {
            return a + b;
        }

        // Method for subtraction
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Method for multiplication
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Method for division
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return 0;
            }
            return a / b;
        }
    }

