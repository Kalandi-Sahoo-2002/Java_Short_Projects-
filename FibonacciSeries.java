//program for generating Fibanacci series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a,b;
        a = b = 1;
        int result;
        Scanner input_obj = new Scanner(System.in);

        //taking nth term
        System.out.println("Enter the no. of terms upto which you can generate Fibonacci series: ");
        int n = input_obj.nextInt();

        //logic for generating Fibanacci series
        System.out.print(a+" "+b);
        for(int i = 0; i < (n-2); i++){
            result = a + b;
            a = b;
            b = result;
            System.out.print(" "+b);
        }

    }
}
