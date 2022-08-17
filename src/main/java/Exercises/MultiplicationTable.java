package Exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String []args){
        Scanner readRange = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Podaj zakres tabliczki mnozenia: ");
        a = readRange.nextInt();
        b = readRange.nextInt();
        for(c=a; c<=b; c++){
            System.out.println("Tabliczka mnozenia dla liczby " +c);
            for(d=1;d<=10;d++){
                System.out.println(c+" * "+d+ " = " + (c*d));
            }

        }
    }
}
