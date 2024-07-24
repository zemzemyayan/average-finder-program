package avarageFinderProgram;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        Scanner sc = new Scanner(System.in);
        System.out.println("matematik dersi notu gir :");
        int mat = sc.nextInt();
        System.out.println("fizik dersi notu gir :");
        int fizik = sc.nextInt();
        System.out.println("kimya dersi notu gir :");
        int kimya = sc.nextInt();
        System.out.println("turkce dersi notu  gir :");
        int turkce = sc.nextInt();
        System.out.println("tarih dersi notu gir :");
        int tarih = sc.nextInt();
        System.out.println("müzik dersi gir :");
        int muzik = sc.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int ortalama = toplam / 6;

        /*
         * int max = (a > b) ? a : b;
         * System.out.println("Max value is " + max);
         */

        boolean state = false;
        state = (ortalama > 60) ? true : false;
        if (state)
            System.out.println("geçtiniz");
        else
            System.out.println("kaldiniz");

        sc.close();

    }

}
