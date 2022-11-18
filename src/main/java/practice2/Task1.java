package practice2;

import java.util.HashSet;

public class Task1 {
    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.

    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {
        HashSet<Double> hash = new HashSet<>();
        Methodlar obj = new Methodlar();
        System.out.println(obj.setOlustur());
        System.out.println(obj.toplaminiAl(hash));



    }

}
