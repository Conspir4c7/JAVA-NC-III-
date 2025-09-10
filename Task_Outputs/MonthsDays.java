package Task_Outputs;
import java.util.Scanner;
public class MonthsDays{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int regularDays=30;
    int leapday = 28;
    int specialDays = 31;


    System.out.print("Enter the month:(1-12):");
    int month = scanner.nextInt();

String monthInWords =     (month==1) ? "January"
                        : (month==2) ? "Febuary"            
                        : (month==3) ? "March"
                        : (month==4) ? "April" 
                        : (month==5) ? "May"            
                        : (month==6) ? "June"
                        : (month==7) ? "July" 
                        : (month==8) ? "August"            
                        : (month==9) ? "September"
                        : (month==10) ? "October" 
                        : (month==11) ? "November"
                        : (month==12) ? "December"
                        :              "Invalid month"; 


    switch (month) {
        case 1:
            System.out.println(monthInWords + regularDays + "days");
            break;
        case 2:
            System.out.println(monthInWords + leapday + "days");
            break;
        case 3:
            System.out.println(monthInWords + specialDays+ "days");    
            break;
         case 4:
            System.out.println(monthInWords + regularDays + "days");
            break;
        case 5:
            System.out.println(monthInWords + specialDays + "days");
            break;
        case 6:
            System.out.println(monthInWords + regularDays + "days");    
            break;
         case 7:
            System.out.println(monthInWords + specialDays + "days");
            break;
        case 8:
            System.out.println(monthInWords + specialDays + "days");
            break;
        case 9:
            System.out.println(monthInWords + regularDays + "days");    
            break;    
         case 10:
            System.out.println(monthInWords + specialDays + "days");
            break;
        case 11:
            System.out.println(monthInWords + regularDays + "days");
            break;
        case 12:
            System.out.println(monthInWords + specialDays + "days");   
            break;    
        default:
            break;
    }



    scanner.close();
  }

}