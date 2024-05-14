import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number a : ");
        int a = input.nextInt();
        System.out.println("Enter a number b : ");
        int b = input.nextInt();
        int c=a+b;
        System.out.print("Sum of a number is : c " + c);
    }
}
