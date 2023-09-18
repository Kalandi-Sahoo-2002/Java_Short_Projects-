//building a simple calculator using java
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Take first operand:");
        float operand1 = scn.nextFloat();
        System.out.println("Take second operand:");
        float operand2 = scn.nextFloat();

        System.out.println("Take the operator:");
        char operator = scn.next().charAt(0);
        switch(operator){
            case '+':
                System.out.printf("Sum of %.2f and %.2f is %.2f",operand1,operand2,(operand1+operand2));
                break;
            case '-':
                System.out.printf("Substraction of %.2f from %.2f is %.2f",operand1,operand2,(operand1-operand2));
                break;
            case '*':
                System.out.printf("Multiplication of %.2f and %.2f is %.2f",operand1,operand2,(operand1*operand2));
                break;
            case '/':
                System.out.printf("Division of %.2f by %.2f is %.2f",operand1,operand2,(operand1/operand2));
                break;
            case '%':
                System.out.printf("Remender when %.2f divided by %.2f is %.2f",operand1,operand2,(operand1%operand2));
                break;
            default:
                System.out.println("Choose a appropriate operator.");
        }
    }
}
