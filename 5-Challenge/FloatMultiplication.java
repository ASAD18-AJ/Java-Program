import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("FLoat multilication \n");
        System.out.print("Enter number a: ");
        double first = input.nextDouble();
        System.out.print("Enter second Number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("Result : " + mul);

    }
}
