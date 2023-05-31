package Calculator;

public class Calculator {
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    public static double subtract(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2){
        if (num2 != 0)
        {
            double result = num1 / num2;
            return result;
        }
        else
        {
            throw new IllegalArgumentException("Dividing by Zero is not allowed.");
        }

    }
}
