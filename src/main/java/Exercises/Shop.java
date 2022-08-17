package Exercises;

import java.util.Scanner;

public class Shop {
    public static void main(String []args) {
        Scanner userInput = new Scanner(System.in);
        int installmentNumber;
        double loanAmount = 1000;
        double interestRate = 0;
        double monthlyInstallment;
        System.out.println("Podaj liczbe rat: ");
        installmentNumber = userInput.nextInt();
        System.out.println("Podaj kwote pozyczki: ");
        loanAmount = userInput.nextInt();
        if ((installmentNumber >= 6) && (installmentNumber <= 12)) {
            interestRate = 0.025;
        } else if ((installmentNumber >= 13) && (installmentNumber <= 24)) {
            interestRate = 0.05;
        } else if ((installmentNumber >= 25) && (installmentNumber <= 48)) {
            interestRate = 0.1;
        } else {
            System.out.println("Zle dane");

        }
        if ((installmentNumber >= 6) && (installmentNumber <= 48)) {
            monthlyInstallment = (loanAmount / installmentNumber) + (loanAmount / installmentNumber) * interestRate;
            System.out.println("Rata miesieczna: " + monthlyInstallment);


        }
    }

            }




