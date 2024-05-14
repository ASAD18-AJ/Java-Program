import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= in.nextInt();
        System.out.println("Enter number 2");
        int num2= in.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("LCM of the two number id : " + lcm);

    }

    public static int lcm(int num1,int num2){
        int i=1;
        while(i<=num2){
            int factor= num1 *i;
            if(factor % num2 == 0 ){
                return factor;
            }
            i++;
        }
        return 0;
    }


}
