package Exercises;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[]args){
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbe/ciag znakow, ktora chcesz sprawdzic.");
        original = userInput.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse.append(original.charAt(i));
        if(original.equals(reverse.toString()))
            System.out.println("Wprowadzona liczba/ciag jest palindromem.");
        else
            System.out.println("Wprowadzona liczba/ciag nie jest palindromem.");
    }
}
