import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to Factorial generator\n");
        System.out.print("Please enter your number: ");
        int num = in.nextInt();
        // long fact = factorialIterative(num);
        long fact = factorial(num);
        System.out.println("Factorial of your number is: " + fact);
    }
    // public static long factorialIterative(int num){
    //     long result = 1;
    //     for(int i=1;i<=num;i++){
    //         result *=i;
    //     }
    //     return result;
    // }
    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num*factorial(num-1);
    }

}
