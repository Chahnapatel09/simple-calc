public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test Case 1
        System.out.println("Add Test: " + (calc.add(5, 3) == 8));

        // Test Case 2
        System.out.println("Subtract Test: " + (calc.subtract(10, 4) == 6));

        // Test Case 3
        System.out.println("Multiply Test: " + (calc.multiply(6, 2) == 12));

        // Test Case 4
        System.out.println("Divide Test: " + (calc.divide(8, 2) == 4));

        // Test Case 5
        try {
            calc.divide(5, 0);
            System.out.println("Divide by Zero Test: false");
        } catch (IllegalArgumentException e) {
            System.out.println("Divide by Zero Test: true");
        }
    }
}
