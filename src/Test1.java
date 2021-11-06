public static double basicCalculator(Operation operation, int num1, int num2){
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