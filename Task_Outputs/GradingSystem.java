package Task_Outputs;
import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);     

    System.out.print("Enter your test score: ");
    int inputScore = scanner.nextInt();
    
    char grade = (inputScore>=90)? 'A'    
                :(inputScore>= 80)?'B'
                :(inputScore>=70)? 'C'
                :(inputScore>=60)? 'D'
                : 'F';

       System.out.println(grade +" "+ "grade");

scanner.close();
    }


}