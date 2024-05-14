import java.util.Scanner;


public class reverseTheDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is " + reverse);
    }
    public static int reverse(int num){
        int newNum = 0;
        while (num> 0){
            int digit = num%10;
            newNum = newNum*10 + digit;
            num /= 10;
         }
         return newNum;
    }


}
