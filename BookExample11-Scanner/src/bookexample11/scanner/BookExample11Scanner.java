/*
    Scanner sınıfı ile örnek çözülmüştür. Sonsuz toplama işlemi...
 */
package bookexample11.scanner;

import java.util.*;

/**
 *
 * @author Engin İnsel
 * @date 12.05.2021
 */
public class BookExample11Scanner {

    public static void main(String[] args) {
        int toplam = 0;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Değer giriniz(Sonucu Görmek İçin '0'a Bas!): ");
            int sayi = s.nextInt();
            if (sayi > 0) {
                toplam += sayi;
            } else if (sayi == 0) {
                System.out.println("İşlem Sonlandı.");
                break;
            }

        }
        System.out.println("Girmiş Olduğunuz Sayıların Toplamı: " + toplam);
    }
}
