import java.util.Scanner;

public class findMinOfTwoNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        findMinOfTwoNum ternary = new findMinOfTwoNum();
        int min = ternary.min(num1,num2);
        System.out.println("Minimum number is: " +min);

    }

    public int min(int num1,int num2){
        // if(num1 < num2){
        //     return num1;
        // }else{
        //     return num2;
        // }
        return num1<num2?num1:num2;
    }
}
