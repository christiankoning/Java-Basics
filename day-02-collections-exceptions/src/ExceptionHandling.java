public class ExceptionHandling {
    public static void main(String[] args) {
        TestingExceptions testingExceptions = new TestingExceptions();

        testingExceptions.divideNumbers(10, 2);
        testingExceptions.divideNumbers(10, 0);

        try {
            testingExceptions.divideWithThrows(10, 2);
            testingExceptions.divideWithThrows(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error caught in main: Division by zero is not allowed.");
        }

        try {
            testingExceptions.divideWithCustomThrows(10, 2);
            testingExceptions.divideWithCustomThrows(10, 0);
        } catch (InvalidNumberException e) {
            System.out.println("Error caught in main: Division by zero is not allowed.");
        }
    }
}
class TestingExceptions {

    // Try catch finally
    public void divideNumbers(int a, int b) {
        try {
            int c = a / b;
            System.out.println("The answer is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Running.");
        }
    }

    // Throws
    public void divideWithThrows(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println("The answer is: " + c);
    }

    // Throws with custom exception
    public void divideWithCustomThrows(int a, int b) throws InvalidNumberException {
        if(b == 0) {
            throw new InvalidNumberException("Custom Error: Division by zero is not allowed.");
        }
        int c = a / b;
        System.out.println("The answer is: " + c);
    }

}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
