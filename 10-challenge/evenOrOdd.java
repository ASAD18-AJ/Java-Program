import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number:");
        int num = in.nextInt();
        String result = num%2==0?"Even":"Odd";
        System.out.println( "Your number is :" + result );
    }
    
 


}
