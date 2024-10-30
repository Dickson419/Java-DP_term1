package TopicFour;


import java.util.Random;
import java.util.Scanner;

/*
    Say Fizz if the number is divisible by 3.
    Say Buzz if the number is divisible by 5.
    Say FizzBuzz if the number is divisible by both 3 and 5.
    Return the number itself, if the number is not divisible by 3 and 5
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // Say Fizz if the number is divisible by 3.
        Scanner scan = new Scanner(System.in);
        

        int number = 18;
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }

        else if (number % 3 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println("Not fizz or buzz");
        }





    }

    }

