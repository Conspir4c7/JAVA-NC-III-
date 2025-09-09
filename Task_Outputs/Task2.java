package Task_Outputs;

public class Task2 {
    public static void main(String[] args) {
        short three = 3;              // "3"
        int number = 110;             // "110"
        byte zero = 0;                // "0"
        char space = ' ';             // " "
        float point = 2.0f;           // "2.0"
        boolean isPrimitive = true;   // "true"

        String output = "H" + three + number + space 
                        + "w" + zero + "rld" + space 
                        + point + space 
                        + isPrimitive;

        System.out.println(output);
    }
}
