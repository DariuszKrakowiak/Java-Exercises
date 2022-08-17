package Exercises;

import java.util.Scanner;

public class Temperature {
    public static void main(String [] args){
        Scanner readTemperature = new Scanner(System.in);
        System.out.println("Podaj temperature");
        double temp = readTemperature.nextDouble();
        CtoF(temp);
        FtoC(temp);
        CtoK(temp);
        KtoC(temp);
        KtoF(temp);
        FtoK(temp);
    }
    private static void CtoF(double temp){
        System.out.println("C do F "+ 1.8 * temp + 32);
    }
    private static void FtoC(double temp){
        System.out.println("F do C "+ (temp - 32)/ 1.8);
    }
    private static void CtoK(double temp){
        System.out.println("C do K " + temp + 273.15);
    }
    private static void KtoC(double temp){
        System.out.println("K do C " + (temp - 273.15));
    }
    private static void KtoF(double temp){
        System.out.println("K do F "+ (temp - 273.15) * 1.8 + 32);
    }
    private static void FtoK(double temp){
        System.out.println("F do K "+((temp - 32)/1.8) + 273.15);
    }
}
