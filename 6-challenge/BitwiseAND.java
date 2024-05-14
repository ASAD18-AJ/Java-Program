import java.util.Scanner;

/**
 * BitwiseAND
 */
public class BitwiseAND {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Showingcasing Bitwise And operator\n");
        System.out.print("Please enter the first number: ");
        int first = in.nextInt();
        System.out.println("Now, enter the other number");
        int second = in.nextInt();

        int result = first & second;
        System.out.println("REsult is : " + result);
    }
}


// first num=13
// second num= 3
// result =1