/*
    Scanner ve Random sınıflarını kullanarak basit bir Sayı tahmin oyunu yapılmmıştır.
 */
package bookexample13.sayıtahminoyunu;

import java.util.*; // Scanner ve Random sınıflarını import ettik

/**
 * @author Engin İnsel
 * @date 12.05.2021
 */
public class BookExample13SayıTahminOyunu {

    public static void main(String[] args) {
        int deger = 1;
        Random r = new Random();
        int sayi = r.nextInt(10);   // 0'dan başlayıp 10'a kadar rastgele sayı ürettik ve program bir tanesini belirledi.
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Tahmin Girin (0-10) - Çıkış İçin '-1' gir: ");
            int tahmin = s.nextInt(); // tahmin alınıyor
            if (tahmin == sayi) {
                System.out.println("Tebrikler! " + deger + ".Tahminde Bildiniz.");
                break;
            } else {
                deger += 1; // her tahminde bunu arttırdık.
            }
            if(tahmin == -1){
                System.out.println("Oyun Sonlandı.");
                break;
            }
        }
    }

}
