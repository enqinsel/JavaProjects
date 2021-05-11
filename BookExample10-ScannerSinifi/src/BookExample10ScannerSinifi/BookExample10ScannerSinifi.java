/*
    Scanner sınıfı ile nextLine() ve next() arasındaki farkı basit bir örnek ile göstermek istedim.
 */
package BookExample10ScannerSinifi;

import java.util.*; // java.util paketindeki tüm sınıfları import ettik. Sadece Scanner sınıfını etmek istiyorsak: java.util.Scanner yazabilirdik.

/**
 *
 * @author Engin İnsel
 * @date 11.05.2021
 */
public class BookExample10ScannerSinifi {

    public static void main(String[] args) {
        Scanner veriAl = new Scanner(System.in);
        System.out.print("Bir Cümle gir: ");
        String metin = veriAl.nextLine();
        System.out.print("İkinci Cümleyi Gir: ");
        String metin2 = veriAl.next();

        System.out.println("nextLine() İle Yazılmış Cümle : " + metin); // nextLİne() : string içerisinde boşluk olsa bile cümlenin tamamını okur.
        System.out.println("next() İle Yazılmış Cümle: " + metin2);    // next() : String içerisinde boşluk olursa, boşluğa kadar olan kısmı okur.Boşluk yoksa tamamını bir değişkene atar.
    }

}
