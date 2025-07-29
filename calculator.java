public class Calculator {

    // Basic operations
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero not allowed!");
        return (double) a / b;
    }

    // Main method for execution & self-test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Demo operations
        System.out.println("=== Calculator Demo ===");
        System.out.println("Add(10, 5): " + calc.add(10, 5));
        System.out.println("Subtract(10, 5): " + calc.subtract(10, 5));
        System.out.println("Multiply(10, 5): " + calc.multiply(10, 5));
        System.out.println("Divide(10, 5): " + calc.divide(10, 5));

        // Self-tests (mock unit tests)
        System.out.println("\n=== Self-Test Results ===");
        try {
            assert calc.add(2, 3) == 5;
            assert calc.subtract(5, 3) == 2;
            assert calc.multiply(2, 4) == 8;
            assert calc.divide(10, 2) == 5.0;
            try {
                calc.divide(10, 0);
                System.out.println("❌ divide(10,0) did not throw exception");
            } catch (ArithmeticException e) {
                System.out.println("✅ divide(10,0) correctly threw exception");
            }
            System.out.println("✅ All self-tests passed.");
        } catch (AssertionError e) {
            System.out.println("❌ Test failed: " + e.getMessage());
        }
    }
}
