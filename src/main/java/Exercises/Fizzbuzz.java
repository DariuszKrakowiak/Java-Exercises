package Exercises;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args){
    Scanner readNumber = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
    int number = readNumber.nextInt();
    String fizzBuzzResult = fizzBuzz(number);
        System.out.println(fizzBuzzResult);
}

    public static String fizzBuzz(int number) {
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                return "fizzbuzz";
            }
            else {
                return "fizz";
            }
        }
        else if (number % 3 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
