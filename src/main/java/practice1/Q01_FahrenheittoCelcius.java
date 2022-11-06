package practice1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_FahrenheittoCelcius {

        public static void main(String[] args) {
            // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
            // formül: c = (f-32)*5/9

            Scanner input = new Scanner(System.in);
            System.out.println("Fahrenheit degeri giriniz");
            double fh = input.nextDouble();
            double celsius = (fh - 32) * 5 / 9;
            System.out.println("Fahrenheit ın celsius a donusturulmus hali: " + celsius);

            NumberFormat numberFormat = new DecimalFormat(",00");   // . dan sonra iki basamak goster demek
            String formattedC = numberFormat.format(celsius);              // .## da kullanilabilir.
            System.out.println("formatedC = " + formattedC);              //Bu bir Stringdir.Matematiksel islemde kullanmak istersek donusum yapmaliyiz

            double doubleC = Double.valueOf(formattedC);                  //Artik matematiksel islem yapabiliriz.
            System.out.println("doubleC = " + doubleC);


        }
    }

