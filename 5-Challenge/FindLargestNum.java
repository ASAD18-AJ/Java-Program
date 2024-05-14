import java.util.Scanner;

 class FindLargestNum {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Enter x,y and z ");
        Scanner in= new Scanner(System.in);
        x=in.nextInt();
        y= in.nextInt();
        z= in.nextInt();
        if (x> y && x>z) {
            System.out.println("x is greater ");
        }
        else if(y>x && y>z){
            System.out.println("y is greater ");
        }
        else if(z> x && z>y){
            System.out.println("z is greater  ");
        }
        else{
            System.out.println("Enterf sdgdlff ");
        }
    }
}
