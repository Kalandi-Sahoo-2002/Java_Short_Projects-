import java.util.Scanner;

public class FibonacchiSeriesUptoN{
    public static void main(String[] args) {
        int a,b;
        a = b = 1;
        int result;
        Scanner input_obj = new Scanner(System.in);

        System.out.println("Enter the number upto which you can generate Fibonacci series: ");
        int n = input_obj.nextInt();

        System.out.print(a+" "+b);
        for(int i = 0; i < (n-2); i++){
            result = a + b;
            a = b;
            b = result;
            if (b <= n) {
                System.out.print(" "+b);
            }
        }

    }
}
