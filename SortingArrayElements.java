//sorting array SortingArrayElements
import java.util.Scanner;
public class SortingArrayElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Taking 10 elements for the array:");
        for(int i = 0;i < array.length;i++){
            array[i] = scn.nextInt();
            System.out.print(array[i]+" ");
        }
        // int Rarray[] = new int[10];

        //logic
        for(int i = 0;i<array.length;i++){
            int min = array[i];
            for(int j = i; j < array.length;j++){
                if(array[j] < min){
                    int temp = array[j];
                    array[j] = min;
                    min = temp;
                }
            }
            array[i] = min;
        }

        System.out.println();
        System.out.println();
        System.out.println("Sorted array is:");
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}