/*
SORU: Scanner sınıfı ile klavyeden 10 sayı alın.
        Girilen bu 10 sayıdan pozitif olanların ortalamasını, negatiflerin ise toplamını ekrana yazdırın.
 */
package bookexample14;

import java.util.Scanner;

/**
 * @author Engin İnsel
 * @date 13.05.2021
 */
public class BookExample14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int dizi[] = new int[6];
        int ptoplam = 0;
        int ntoplam = 0;
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". Sayıyı giriniz: ");
            dizi[i] = s.nextInt();
            if (dizi[i] > 0) {
                ptoplam += dizi[i];
                sayac++;
            } else if (dizi[i] < 0) {
                ntoplam += dizi[i];
            }
        }
        System.out.println("Pozitif sayıların ortalaması: " + ptoplam / sayac);
        System.out.println("Negatif sayıların toplam değeri: " + ntoplam);
    }

}
