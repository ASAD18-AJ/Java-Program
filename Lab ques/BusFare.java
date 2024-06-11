import java.util.*;

public class BusFare {

    String name,num;
    int km;
    double fare;
    void calcFare(String n,String na,int k){
        name = n;
        num = na;
        km =  k;
        if (km<=10) {
            fare = 5*km;
        }
        else if(km > 10 && km<=20){
            fare = 10 * km;
        }
        else if(km > 20 && km<=30){
            fare = 15 * km;
        }
        else if(km > 30 && km<=40){
            fare = 20 * km;
        }
        else{
            fare = 25 * km;
        }
    }
    void show(){
        System.out.println("Bus no \t Name \t km \t fare");
        System.out.println(num + "\t" + name + "\t" + km + "\t" + fare);
    }
    public static void main(String[] args) {
        BusFare obj = new BusFare();
        obj.calcFare("csd kim","JH099",18);
        obj.show();
    }
}