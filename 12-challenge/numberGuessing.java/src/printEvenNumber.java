import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class printEvenNumber {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
