import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int array[] = new int[6],sum = 0;
        System.out.println("Enter 6 numbers of elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
            System.out.printf("%d ",array[i]);
            sum += array[i];
        }
        System.out.println("\nSum is "+sum);
    }
}
