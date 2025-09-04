package Task_Outputs;
import java.util.Scanner;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration of Variables;
        double num1;
        double num2;
        double num3;
        double largest;

        //User prompt
        System.out.print("Enter the first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        num2 = scanner.nextDouble();
        System.out.print("Enter the third number:");
        num3 = scanner.nextDouble();

        //Using Array method
        double[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        
        //Largest number will be found at the last sorted index of the array.
        largest = numbers [numbers.length - 1];

        //Conditions using else if
        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The largest number is:" + largest);

        }
    }
}
