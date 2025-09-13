package Task_Outputs;
import java.util.Scanner;

public class NumWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     

        String[] Day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};      
        
        System.out.print("Enter the number of the week: (Enter 1-7): ");  
        int num = scanner.nextInt();

        if (num >= 1 && num <= 7) {
            System.out.println("Day: " + Day[num - 1]);
        } else {
            System.out.println("Invalid Input");
        }

        scanner.close();
    }
}