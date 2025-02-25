public class LoopsAndConditionals {
    public static void main(String[] args) {
        NumberChecker numberChecker1 = new NumberChecker();

        numberChecker1.positiveNegativeZeroChecker(5); // Return positive print
        numberChecker1.positiveNegativeZeroChecker(-5); // Return negative print
        numberChecker1.positiveNegativeZeroChecker(0); // Return zero print

        numberChecker1.forLoopMethod();
        numberChecker1.whileLoopMethod();
    }
}

class NumberChecker {
    public void positiveNegativeZeroChecker(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

    public void forLoopMethod() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void whileLoopMethod() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
