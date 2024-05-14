import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        int mO,pM;
        pM=40;
        Scanner in = new Scanner(System.in);
        System.out.println("enter marks obtained : ");
        mO = in.nextInt();
        if(mO>=pM){
            System.out.println("you are passed");
        }

        else{
            System.out.println("you need to try hard");
        }
    }
}
