package Exercises;

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;
    public Date(int myDay, int myMonth, int myYear){
        day = myDay;
        month = myMonth;
        year = myYear;
    }
    public void setDayDate(int myDay){
        day = myDay;
    }
    public int getDayDate(){
        return day;
    }
    public void setMonthDate(int myMonth){
        month = myMonth;
    }
    public int getMonthDay(){
        return month;
    }
    public void setYearDate(int myYear){
        year = myYear;
    }
    public int getYearDate(){
        return year;
    }
    public void displayDate(){
        System.out.printf("%d.%d.%d", day, month, year);
    }
}
class DateTest{
public static void main(String[]args){
 Scanner userInput = new Scanner(System.in);
 Date myDate;
 myDate = new Date(20, 5, 1989);
 System.out.println("Podaj dzien: ");
 int myDay = userInput.nextInt();
 myDate.setDayDate(myDay);
 System.out.println("Podaj miesiac: ");
 int myMonth = userInput.nextInt();
 myDate.setMonthDate(myMonth);
 System.out.println("Podaj rok: ");
 int myYear = userInput.nextInt();
 myDate.setYearDate(myYear);
 System.out.println("Dzien: " + myDate.getDayDate());
 System.out.println("Miesiac: " + myDate.getMonthDay());
 System.out.println("Rok: " + myDate.getYearDate());
 System.out.println("Kompletna data: ");
 myDate.displayDate();
}
}