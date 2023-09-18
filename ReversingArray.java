import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();
        int array[] = new int[size];
        int reversedArray[] = new int[size];

        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < reversedArray.length; i++) {
            array[i] = scn.nextInt();
            System.out.print(array[i]+" ");
        }
        //reversing
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[size-(i+1)] = array[i];
        }
        System.out.println("\nReversed array is:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.printf("%d ",reversedArray[i]);
        }
    }
}
