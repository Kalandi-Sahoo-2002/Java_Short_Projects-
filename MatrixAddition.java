//addition of two matrix
import java.util.Scanner;
public class MatrixAddition {
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
        int R[][] = new int[rb][cb];

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
            System.out.println("Resultant matrix will be:");
            for (int i = 0; i < ra; i++) {
                for (int j = 0; j < ca; j++) {
                    R[i][j] = A[i][j] + B[i][j];
                    System.out.print(R[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Both matrix should have same number of rows & columns.");
        }
    }
}
