import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(final Operation operation, final int num1, final int num2){
        double result = 0;

        if (operation == Operation.ADD) {
            // if operation = ADD, return the sum
            result = num1 + num2;
        } else if (operation == Operation.SUBTRACT) {
            // if operation = SUBTRACT, return the difference
            result = num1 - num2;
        } else if (operation == Operation.MULTIPLY) {
            // if operation = MULTIPLY, return the product
            result = num1 * num2;
        } else if (operation == Operation.DIVIDE) {
            // if operation = DIVIDE, return the quotient
            if (num2 == 0) {
                System.out.println("Can't divide by 0");
            } else {
                result = ((double) num1) / num2;
            }
        }

        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
