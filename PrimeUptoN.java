import java.util.Scanner;

public class PrimeUptoN {
    public static void main(String[] args) {
        int num,a = 2,b = 3;
        Scanner scn = new Scanner(System.in);

        System.out.println("Take a number: ");
        num = scn.nextInt();

        //displaying prime numbers upto given number
        System.out.printf("%d %d ",a,b);
        for (int i = 1; i <= num; i++) {
            int n = i/2;
            for(int j = 2 ; j <= n;j++){
                if(i%j == 0){
                    break;
                }else{
                    if(j == n)
                        System.out.printf("%d ",i);
                }
            }
        }
    }
}
