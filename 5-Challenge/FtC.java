import java.util.*;

class FtC {
    public static void main(String[] args){
        float temp;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter fahrenhiet");
        temp = in.nextInt();
        temp=((temp-32)*5)/9;
        System.out.println("Temp in celsius : " + temp);
    }
}
