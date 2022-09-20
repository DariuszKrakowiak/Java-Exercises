package Exercises;

import java.util.Scanner;

public class Chain {
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj wyrazenie, ktore chcesz obciac: ");
        String strChain = userInput.nextLine();
        System.out.println("Podaj poczatek zakresu: ");
        int rangeBegin = userInput.nextInt();
        System.out.println("Podaj koniec zakresu: ");
        int rangeEnd = userInput.nextInt();
        System.out.println("Wyrazenie, ktore bedzie obcinane: " + strChain);
        System.out.println("Wycinek: " + strChain.substring(rangeBegin, rangeEnd));

    }
}
