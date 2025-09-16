package Task_Outputs;
import java.util.Scanner;

public class Task8 {

    // Method with varargs
    public int cumulativeSum(int... numbers) {
        int totalSum = 0;

        System.out.println("Cumulative sums for each parameter:");
        for (int num : numbers) {
            int cumSum = (num * (num + 1)) / 2; 
            System.out.println(num + " -> " + cumSum);
            totalSum += num;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for 3 numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        Task8 calculator = new Task8();

        // Pass the 3 numbers into varargs method
        int result = calculator.cumulativeSum(a, b, c);

        System.out.println("Total sum of all parameters: " + result);

        sc.close();
    }
}