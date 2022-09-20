package Exercises;

import java.util.Scanner;

public class Compare {
    public static void main(String[]args){
        Scanner stringToCompare = new Scanner(System.in);
        System.out.println("Podaj pierwszy ciag znakow:");
        String first = stringToCompare.nextLine();
        System.out.println("Podaj drugi ciag znakow:");
        String second = stringToCompare.nextLine();
        System.out.println("Porownujemy " + first + " oraz "+ second);
        boolean areEquals = first.equals(second);
        System.out.println("Wynik porownania: " + areEquals);
    }
}
