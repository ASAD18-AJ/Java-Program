import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println(("Welcome to fibonacci series"));
        System.out.print("Enter the number");
        int first = in.nextInt();
        System.out.println("Here is the Fibonacci Series");
        printFibonacci(first);
    }
    public static void  printFibonacci(int num){
        if (num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int first=0,second=1;
        while (first+second <= num) {
            int third = first+ second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        
    }
}
