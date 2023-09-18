import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int size,max;
        System.out.println("Enter the length of the array:");
        size = scn.nextInt();
        int array[] = new int[size];
        System.out.printf("Enter %d no.s of elements in array:\n",size);
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
            System.out.printf("%d ",array[i]);
        }
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= max)
                max = array[i];
        }
        System.out.println("\nLargest element is "+max);

    }
}
