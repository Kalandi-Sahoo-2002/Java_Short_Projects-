//chacking two matrix are similar or not

import java.util.Scanner;
public class MatrixEqualChecking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows & columns in matrix A:");
        int ra = scn.nextInt();
        int ca = scn.nextInt();
        System.out.println("Enter number of rows & columns in matrix B:");
        int rb = scn.nextInt();
        int cb = scn.nextInt();

        int A[][] = new int[ra][ca];
        int B[][] = new int[rb][cb];
        int flag = 0;
        //logic
        if(ra == rb && ca == cb){
            System.out.println("Taking elements for matrix A:");
            for (int i = 0; i < ra; i++) {
                for (int j = 0; j < ca; j++) {
                    A[i][j] = scn.nextInt();
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("Taking elements for matrix B:");
            for (int i = 0; i < rb; i++) {
                for (int j = 0; j < cb; j++) {
                    B[i][j] = scn.nextInt();
                    System.out.print(B[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println();
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    if(A[i][j] == B[i][j]){

                    }else{
                        flag++;
                    }
                }
            }
            if(flag == 0){
                System.out.println("Two matrices are Equal.");
            }else{
                System.out.println("Two matrices are not Equal.");
            }
        }else{
            System.out.println("Two matrices are not Equal.");
        }
    }
}
