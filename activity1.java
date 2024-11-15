import java.util.Scanner;

public class activity1{

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Enter Student's grade: ");

        double score = sc.nextDouble();

        if(score>=90){
            System.out.println("The student's grade is: A");
        } else if (score>=80){
            System.out.println("The student's grade is: B");
        }
        else if (score>=70){
            System.out.println("The student's grade is: C");
        }
        else if (score>=60){
            System.out.println("The student's grade is: D");
        }
        else{
            System.out.println("The student's grade is: F");
        }

        sc.close();
        
    }
}

