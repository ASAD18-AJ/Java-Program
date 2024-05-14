import java.util.Scanner;

public class multpTable {
    public static void main(String[] args){
        System.out.print("enter a number for muliplication table : ");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        for(int i=0;i<=9;i++){
            System.out.println( a+" X " +(i+1) + " = " + a*(i+1));
        }
    }
}
