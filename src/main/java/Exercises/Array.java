package Exercises;


public class Array {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for (int i = 0; myIntArray.length > i; i++) {
            myIntArray[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; myIntArray.length > i; i++) {
            System.out.println("Wartosc z tablicy: " + myIntArray[i]);
        }
        int max = getMax(myIntArray);
        System.out.println("Maksimum wynosi: " + max);
        int min = getMin(myIntArray);
        System.out.println("Minimum wynosi: " + min);

    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int [] inputArray){
        int minValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

}
