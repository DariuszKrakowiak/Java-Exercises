package Exercises;

import java.util.Scanner;

public class Maths2 {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        int number;
        int remainder;
        System.out.println("Podaj liczbe: ");
        number = userInput.nextInt();
      for (int i = 1; i < number; ++i){
          remainder = i % 2;
          if(remainder > 0){
              System.out.println("Nieparzysta liczba: " +i);

          }
      }
    }
}