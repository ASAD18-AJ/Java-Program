import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        x = in.nextInt();
        if(x%2==0){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
