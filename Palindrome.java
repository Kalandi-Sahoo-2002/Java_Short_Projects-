//checking a number is palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        //Taking the number for checking palindrome or not
        System.out.println("Enter the number:");
        int number = inputObj.nextInt();

        //logic for reversing a number
        int result = 0,reminder,q;
        q = number;
        while (q != 0) {
            reminder = q%10;
            result = result * 10 + reminder;
            q /= 10;           
        }

        //dispalying statement
        if (number == result) {
            System.out.println(number+" is a palindrome number.");
        }else{
            System.out.println(number+" is not a palindrome number.");
        }
    }
}
