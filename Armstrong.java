//checking the number is palindrome or not

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input_obj = new Scanner(System.in);

        //taking the number
        System.out.println("Enter the number to check if it is Armstrong number or not:");
        int number = input_obj.nextInt();
        int cnt = 0,reminder,q,sum = 0,result = 1;;
        q = number;

        //counting number of digits in the given number
        while (q != 0) {
            reminder = q%10;
            cnt++;
            q /= 10;
        }
        System.out.println("Number of digits in the number "+number+" is "+cnt);
        q = number;

        //logic for checking Armstrong number or not
        while (q != 0) {
            reminder = q%10;
            result = 1;
            for (int i = 0; i < cnt; i++) {
                result = result*reminder;
            }
            sum += result;
            q /= 10;
        }

        //displaying statement
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
