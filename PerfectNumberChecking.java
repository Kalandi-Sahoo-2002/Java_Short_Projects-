import java.util.Scanner;

public class PerfectNumberChecking {
    public static void main(String[] args) {
        int num,sum = 0,i=2;
        Scanner int_obj = new Scanner(System.in);

        System.out.println("Take a number for checking Perfect number or not:");
        num = int_obj.nextInt();

        //finding factors of the number
        for (int j = 1; j < num; j++) {
            if(num%j == 0){
                System.out.printf("%d is a Factor of %d\n",j,num);
                sum += j;
            }
        }
        if (sum == num)
            System.out.printf("%d is a perfect number",num);
        else
            System.out.printf("%d is not a perfect number",num);             
    }
}
