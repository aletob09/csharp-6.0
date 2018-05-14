import java.util.*;

/**
 * Main
 */
public class Main{
    public static void main(String[] args) {
        double num1;
        double num2;
        String operation;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.print("Enter operation: ");
        operation = op.next();

        switch(operation) {
            case "+": System.out.print(num1 + num2);
                    break;
            case "-": System.out.print(num1 - num2);
                    break;
            case "*": System.out.print(num1 * num2);
                    break;
            case "/": System.out.print(num1 / num2);
                    break;
            default: System.out.print("error");
        }
    }
}