package Exercises;

import java.util.Scanner;

public class Password {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj haslo");
        String s = userInput.nextLine();
        System.out.println("Podane haslo to " + s);
        if (s.equals("sekret")) {
            System.out.println("Witaj w tajnym miejscu");
        }
        else{
            System.out.println("Brak dostepu");
        }
    }
}
