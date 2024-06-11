import java.util.*;

public class series {
    
    int n;
    double x,num = 0;
    void assign(double den,int num){
        n = num;
        x = den;
        for(int i=2;i<=n+1;i++){
            double numer = 1, denom=1;
            for(int j=1;j<=j-1;j++){
                numer *= x;
            }
            for(int k=i;k>0;k--){
                denom *= k; 
            }
            if(i%2==0){
                sum += (numer/denom);
            }
            else{
                sum-=(numer/denom);
            }
        }
    }
    void show(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        double sum=0;
        series obj = new series();
        obj.assign(4, 5);
        obj.show();
    }
    
}
