public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test Case 1
        System.out.println("Add Test: " + (calc.add(5, 3) == 8));

        // Test Case 2
        System.out.println("Subtract Test: " + (calc.subtract(10, 4) == 6));


    }
}
