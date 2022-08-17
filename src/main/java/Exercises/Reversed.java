package Exercises;

import java.util.Scanner;

public class Reversed {
    public static void main(String []args){
        Scanner readNumber = new Scanner(System.in);
        int num;
        int reversed = 0;
        System.out.println("Jaka liczbe odwrocic?");
        num = readNumber.nextInt();
        while(num !=0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            //for(;num !=0; num/= 10){
            //int digit = num % 10;
            //reversed = reversed * 10 + digit;
            //}
        }
           System.out.println("Wartosc odwrocona: " + reversed);
        }

    }

