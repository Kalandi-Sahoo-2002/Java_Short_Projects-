import java.util.Scanner;

public class WeekDayNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //taking day number 
        System.out.println("Take a day number in the week:");
        int number = scn.nextInt();

        switch (number) {
            case 1:
                System.out.println("It is Sunday.");
                break;
            case 2:
                System.out.println("It is Monday.");
                break;
            case 3:
                System.out.println("It is Tuesday.");
                break;
            case 4:
                System.out.println("It is Wednesday.");
                break;
            case 5:
                System.out.println("It is Thursday.");
                break;
            case 6:
                System.out.println("It is Friday.");
                break;
            case 7:
                System.out.println("It is Saturday.");
                break;
            default:
                System.out.println("Choose a correct number for days in week.");
                break;
        }
    }
}
