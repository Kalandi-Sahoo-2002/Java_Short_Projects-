import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num,flag = 0;
        int n;
        Scanner int_obj = new Scanner(System.in);

        System.out.println("Take a number:");
        num = int_obj.nextInt();

        n = num/2;
        int i = 2;
        while (i <= n) {
            if (num%i == 0) {
                flag++;
                System.out.println(num+" is not a prime number.");
                break;
            }
            i++;
        }
        if (flag == 0) {
            System.out.println(num+" is a prime number.");
        }
    }
}
