package Exercises;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe calkowita");
        int a = userInput.nextInt();
        System.out.println("Podaj druga liczbe calkowita");
        int b = userInput.nextInt();
        System.out.println("Uzytkownik podal liczbe " +a);
        System.out.println("Uzytkownik podal liczbe " +b);
        double addition_result = a + b;
        System.out.println(a +" dodac " + b + " rowna sie " +addition_result );
        double substraction_result = a - b;
        System.out.println(a +" odjac " + b + " rowna sie " + substraction_result);
        double multiplication_result = a * b;
        System.out.println(a + " razy " + b + " rowna sie " + multiplication_result);
        double division_result = a / b;
        System.out.println(a + " podzielic przez " + b + " rowna sie " + division_result);
        double power_result = java.lang.Math.pow(a, b);
        System.out.println(a + " do potegi " + b + " rowna sie " + power_result);

    }
}
