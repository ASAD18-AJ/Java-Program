import java.util.Scanner;


public class LeapYe {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to the Year calculator\n");
        System.out.println("Enter the year");
        int year = in.nextInt();

        if(year % 400 == 0 || (year % 100 != 0 &&year % 4 == 0)){
            System.out.println("year is leap year");

        }
        else{
            System.out.println("Year is not a leap year");
        }

        // if(year % 400 == 0){
        //     System.out.println("year is leap year");

        // }
        // else if(year % 100 == 0){
        //     System.out.println("year is not leap year");
        // }
        // else if(year % 4 == 0){
        //     System.out.println(" Year is a leap year");
        // }
        // else{
        //     System.out.println("Year is not a leap year");
        // }
    }
}
