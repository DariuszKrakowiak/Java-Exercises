package Exercises;

import java.util.Scanner;

public class Password2 {
    public static void main(String [] args){
        Scanner readPassword = new Scanner(System.in);
        String password;
        String correctPassword = "secretpassword";
        while(true){
            System.out.println("Podaj haslo: ");
            password = readPassword.nextLine();
            if(password.equals(correctPassword)){
                System.out.println("Poprawne haslo. Witaj!");
                break;
            }
            else{
                System.out.println(password);
                System.out.println("Niepoprawne haslo");
            }
        }
    }
}
