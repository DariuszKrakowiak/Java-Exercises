package Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj dwie liczby: ");
        double first = userInput.nextDouble();
        double second = userInput.nextDouble();
        System.out.println("Wybierz operator(+, -, *, /): ");
        char operator = userInput.next().charAt(0);
        double result;
        switch(operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Blad! Zly operator!");
                return;

        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
