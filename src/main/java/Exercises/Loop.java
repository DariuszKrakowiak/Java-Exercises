package Exercises;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ile wyswietlic komunikatow?");
        int a = userInput.nextInt();
        System.out.println("Wyswietl " +a+ " komunikatow.");
        for (int i = 0; i < a; i++) {
            System.out.println("To jest " + i + " komunikat w petli");
        }
    }
}