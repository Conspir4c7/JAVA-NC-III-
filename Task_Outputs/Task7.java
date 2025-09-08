package Task_Outputs;
import java.util.Scanner;
public class Task7{
public static void main(String[] args) {
   Scanner scanner = new Scanner (System.in);

    System.out.print("Enter the first number: ");
    int number1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int number2 = scanner.nextInt();

    Task7 task = new Task7();
    Operations operations = task.new Operations();
     int addResult = operations.add(number1, number2);
     int subResult = operations.subtract(number1, number2);
     int mulResult = operations.multiply(number1, number2);
     int divResult = operations.divide(number1, number2);

    System.out.println("Addition Result:"+ addResult);   
    System.out.println("Subtraction Result:"+ subResult);
    System.out.println("Mutiplication Result:"+ mulResult);
    System.out.println("Divide Result:"+ divResult);

    scanner.close();   
}
public class Operations{
    int add(int number1, int number2){
      return number1+number2;  
    }
    
    int subtract(int number1, int number2){
    return number1-number2;
    }

    int multiply(int number1, int number2){
    return number1*number2;
    }

    int divide(int number1, int number2){
    return number1/number2;
    }

}












}