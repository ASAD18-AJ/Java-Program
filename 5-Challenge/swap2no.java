import java.util.Scanner;

public class swap2no {
    public static void main(String[] args){
        int x,y;
        System.out.print("Enter the x and y : ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();

        x= x+ y;
        y= x - y;
        x=x-y;
        System.out.print("x :" + x + " y :" + y);
    }
}
