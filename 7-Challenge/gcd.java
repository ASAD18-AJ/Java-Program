import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= input.nextInt();
        System.out.println("Enter number 2");
        int num2= input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD of the two number id : " + gcd);
    }
    public static int gcd(int a,int b){
        int gcd = 1;
        int i=2;
        int least = least(a,b);
        while (i<=least) {
            if(a%i==0 && b%i==0){
                gcd = i;
            }
                i++;
        }

        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
}
