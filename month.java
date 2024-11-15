import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month: ");

        int month = sc.nextInt();
        int days;

        switch (month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            days =31;
            break;

            case 2:
            days = 28;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            days=30;
            break;

            default:
            days = -1;
            


        }
         if (days == -1) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            
         } else {
            System.out.println("The number of days in month " + month + " is: " + days);
            
         } 
           
         
        sc.close();
    }
    
}
