import java.util.*;

public class second {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int k = 2;
        Rotateeletoright(arr, n, k);
        System.out.print("After Rotating the k elements to right: ");
        for (int i = 0; i < n; i++)
       System.out.print(arr[i] + " ");
       System.out.println();
    }
}