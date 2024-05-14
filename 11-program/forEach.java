import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        String[] array = new String[]{
            "Ram","Shyam","Mohan","Sohan","Sita",
        };
        //printArray(array);
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name : array){
            System.out.println(name);
        }
    }

    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
