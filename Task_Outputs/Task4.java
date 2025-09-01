package Task_Outputs;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Create a StringBuilder with the input string
        StringBuilder sb = new StringBuilder(input);

        // Reverse the StringBuilder to get the reversed string
        String inputreversed = sb.reverse().toString();

        // Check if the input string is a palindrome
        if (input.equals(inputreversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

}

