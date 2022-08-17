package Exercises;

import java.util.Scanner;

public class JohnCena {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj swoje imie i nazwisko");
        String s = userInput.nextLine();
        System.out.println("Podane imie i nazwisko to " +s);
        if(s.equals("John Cena")){
            System.out.println("Znow pracujesz John!");
        }
        else{
            System.out.println("Witaj " +s + ". Czego szukasz?");
        }
    }
}
