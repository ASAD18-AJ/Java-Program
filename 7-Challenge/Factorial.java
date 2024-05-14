import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to fac");
        System.out.print("enter a number  : ");
        int num = in.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *=i;
            i++;
        }
        return fact;
    }
}
