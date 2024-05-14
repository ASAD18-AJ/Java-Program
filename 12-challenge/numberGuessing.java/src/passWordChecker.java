import java.util.Scanner;
public class passWordChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to set  your password\n");
        String password;
        do{
            System.out.print("Please enter your password: ");
            password = in.next();
        }while(!isValidPassword(password) );
        System.out.println("Thanks for entering a valid pass");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
