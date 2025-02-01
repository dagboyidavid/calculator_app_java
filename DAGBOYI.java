public class DAGBOYI{
//Dagboyi David Onuche-Ojo U23ME1028 Mechanical Engineering 
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        DAGBOYI calculator = new DAGBOYI();
        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 2));
        System.out.println("Multiplication: " + calculator.multiply(3, 4));
        System.out.println("Division: " + calculator.divide(10, 2));
    }
}