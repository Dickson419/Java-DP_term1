package TopicFour;

import java.util.Random;
import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        for(int i = 10; i<20; i++){
            int rNumber = generateRandomNumber(10);

            if (isPrime(rNumber)) {
                System.out.println(rNumber + " is a prime number.");
            } else {
                System.out.println(rNumber + " is not a prime number.");
            }

        }

        for(int i = 1; i<20; i++){

            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }

        }

    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int generateRandomNumber(int amount){
        Random numbers = new Random();
        return numbers.nextInt(amount); // Generates a random number between 0 (inclusive) and 'amount' (exclusive)
    }
}
