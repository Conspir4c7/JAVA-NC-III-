package Task_Outputs;
import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b); 
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b); 
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b); 
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b); 
    }

    public static void main(String[] args) {
        int x = 15, y = 4;

        System.out.println("Addition of " + x + " and " + y + " = " + add(x, y));
        System.out.println("Subtraction of " + x + " and " + y + " = " + subtract(x, y));
        System.out.println("Multiplication of " + x + " and " + y + " = " + multiply(x, y));
        System.out.println("Division of " + x + " and " + y + " = " + divide(x, y));
    }
}
