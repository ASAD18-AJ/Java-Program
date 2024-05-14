import java.util.Scanner;

public class multTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the enter the number you want  to print table of : ");
        int num = in.nextInt();


        for(int i=1;i<=10;i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
