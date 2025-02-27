public class FunctionalProgrammingExample {
    public static void main(String[] args) {

        // Creating an instance of the interface using a lambda expression
        NumberProcessor processor = (int number) -> number * number;

        System.out.println(processor.process((5)));
        System.out.println(processor.process(10));
    }
}

@FunctionalInterface
interface NumberProcessor {
    int process(int number);
}
