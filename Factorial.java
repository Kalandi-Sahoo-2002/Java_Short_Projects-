//calculating Factorial of a number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //creating object for taking user inputs
        Scanner input_obj = new Scanner(System.in);
        int number,fact = 1;

        //taking a number as user input
        System.out.print("Take a number to find it's factorial value: ");
        number = input_obj.nextInt();

        //logic for calculating Factorial of a given number
        int i = number;
        while (i != 0) {
            fact *= i;
            i--;
        }
        System.out.println("Factorial value of "+number+" is "+fact);
    }
}
