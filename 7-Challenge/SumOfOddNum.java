import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args){
        System.out.print("enter a number  : ");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is : " + sum);
        // for (int index = 0; index < a; index++) {
        //     int sum=0;
        //     if (a%2==0) {
        //         sum+=
        //     }
        // }
    }
    public static int oddSum(int num){
        int i=1;
        int sum = 0;
        while(i<=num){
            sum +=i;
            i +=2;
        }
        return sum;
    }
}
