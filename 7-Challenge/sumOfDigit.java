import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number");
        int num= in.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("sum of Digits is : " + sum);
    }
    public static int sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum+= num%10 ;
            num/=10;
        }
        return sum;
    }
}
