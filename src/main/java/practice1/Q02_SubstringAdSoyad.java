package practice1;

import java.util.Scanner;

public class Q02_SubstringAdSoyad {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi aralarinda bosluk olacak sekilde giriniz...");
        String adSoyad = input.nextLine();
        int idxOf = adSoyad.indexOf(" ");   // space in indexini bulduk
        String ad = adSoyad.substring(0,idxOf);
        String  soyAd = adSoyad.substring(idxOf+1);


        System.out.println("Ad: " +ad);
        System.out.println("Soyad: " +soyAd);


    }
}
