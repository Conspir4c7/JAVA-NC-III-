package Task_Outputs;

public class TaskSheet113 {

    public static void main(String[] args) {
        int check_number = 10;

        for (int i = 1; i < check_number+1; i++) {
            // Ternary operator to check even/odd
            String message = (i % 2 == 0) ? i + " is Even" : i + " is Odd";
            System.out.println(message);
        }
    }
}