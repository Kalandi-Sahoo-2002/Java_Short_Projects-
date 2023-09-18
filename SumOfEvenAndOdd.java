//sum of even & sum of odd number in between 1 to 10
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int sumEven = 0,sumOdd = 0;      
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0){
                System.out.println("The number "+i+" is even.");
                sumEven += i;
            }else{
                System.out.println("The number "+i+" is odd.");
                sumOdd += i;
            }
        }
        System.out.println("Sum of all even number in between 1 to 10 is "+sumEven);
        System.out.println("Sum of all odd number in between 1 to 10 is "+sumOdd);
    }
}


