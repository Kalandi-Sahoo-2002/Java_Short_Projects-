import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //taking key for the operation
        System.out.println("Enter a key(1:Sum of digits/2: Reverse/3: Factorial)::");
        int key = scn.nextInt();
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        switch(key){
            case 1: //for sum of all digits in a number
                int rem1,q1 = number,sum = 0;
                while(q1 != 0){
                    rem1 = q1%10;
                    sum += rem1;
                    q1 /= 10;
                }
                System.out.printf("Sum of digit %d is %d",number,sum);
                break;
            case 2: //Reverse the number
                int Reverse = 0,q2 = number,rem2;
                while (q2 != 0) {
                    rem2 = q2%10;
                    Reverse = (Reverse * 10) + rem2;
                    q2 /= 10;
                }
                System.out.printf("Reverse of the number %d is %d",number,Reverse);
                break;
            case 3: //Factorial of the number
                int factorial = 1;
                if(number >= 0){
                    for (int i = 1; i <= number; i++) {
                      factorial *= i;
                    }
                    System.out.printf("Facotial of the number %d is %d",number,factorial);
                }else
                    System.out.println("factorial of any negative number is not possible.");             
        }
    }
}
