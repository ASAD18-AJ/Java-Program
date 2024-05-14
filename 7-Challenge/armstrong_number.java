import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int finalNumber =0;
        int numCopy=num;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit,noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1,int num2){
        int result = 1;
        int i= 0;
        while (i<num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
