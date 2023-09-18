//Array implimentation in Fibonacci series upto N terms
import java.util.Scanner;
public class FibonacciSeriesUptoN_UsingArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scn.nextInt();
        int array[] = new int[n];
        array[0] = array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            int temp = array[i-2] + array[i-1];
            array[i] = temp;
        }
        System.out.println("Fibonacci series:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
