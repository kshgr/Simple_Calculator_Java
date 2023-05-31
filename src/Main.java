import Calculator.Calculator;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;
        try {
            switch (operator) {
                case '+':
                    output = Calculator.add(num1, num2);
                    break;

                case '-':
                    output = Calculator.subtract(num1, num2);
                    break;

                case '*':
                    output = Calculator.multiply(num1, num2);
                    break;

                case '/':
                    output = Calculator.divide(num1, num2);
                    break;

                default:
                    System.out.println("Error! Invalid operator. Please enter correct operator.");
                    return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
        }
        catch (IllegalArgumentException error){
            System.out.println("Error! " + error.getMessage());
        }

    }
}