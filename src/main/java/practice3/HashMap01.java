package practice3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap01 {

    public void hashMapeEkleme(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = input.nextLine();
        String[] newCumle = cumle.replace(" ","").split("");
        System.out.println(Arrays.toString(newCumle));

        HashMap<String, Integer> harfSayilari = new HashMap<>();

        for(String w:newCumle){
            int sayac = 0;
            for(String k:newCumle){
                if(w.equals(k)){
                    sayac++;
                }
            }
            if(!harfSayilari.containsKey(w)){
                harfSayilari.put(w,sayac);
            }
        }
        System.out.println(harfSayilari);
    }
}
