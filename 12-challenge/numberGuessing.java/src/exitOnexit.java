import java.util.Scanner;

public class exitOnexit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = in.next();
            if(command.equals("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited");

    }
}