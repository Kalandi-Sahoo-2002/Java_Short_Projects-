//Genetaring Random numbers bwtween a range using Math.random() from package java.lang.Math

import java.util.Scanner;
import java.lang.Math;
public class RandomNumGenerator {
    public static void main(String[] args) {
        int min,max,number;
        Scanner obj = new Scanner(System.in);

        System.out.println("Take the minimum value of the range:");
        min = obj.nextInt();       
        System.out.println("Take the maximum value of the range:");
        max = obj.nextInt();

        number = (int)(Math.random()*(max - min + 1)+min); //random() generate double type in between 0.0 to 1.0 but (Math.random()*(max - min + 1)+min) generate number in between min & max
        System.out.println("Your number is:"+number);
    }
}


// //Generating Random numbers using java Random class from package java.util
// import java.util.Random;
// public class RandomNumGenerator {
//     public static void main(String[] args) {
//     Random random = new Random();
//     //creating random integer
//     int i = random.nextInt(100);
//     //creating random floating point
//     float f = random.nextFloat();
//     //creating random double
//     double d = random.nextDouble();
//     //creating random boolean
//     boolean b = random.nextBoolean();

//     System.out.println(i);
//     System.out.println(f);
//     System.out.println(d);
//     System.out.println(b);

//     }
// }

