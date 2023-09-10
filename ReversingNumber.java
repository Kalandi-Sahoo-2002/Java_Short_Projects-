//Reversing a number
import java.util.Scanner;
public class ReversingNumber {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        //Taking the number for reversing 
        System.out.println("Enter the number You want to reverse:");
        int number = inputObj.nextInt();

        //logic for reversing a number
        int result = 0,reminder,q;
        q = number;
        while (q != 0) {
            reminder = q%10;
            result = result * 10 + reminder;
            q /= 10;
            
        }
        System.out.println("The reversed number is "+result);
    }
}
