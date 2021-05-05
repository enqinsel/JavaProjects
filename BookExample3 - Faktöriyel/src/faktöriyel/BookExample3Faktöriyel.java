/**
 *      Metot mantığı ile Faktöriyel Hesaplama yapılmıştır.  
 * @Engin İNSEL     
 * @date 5.05.2021  
 */                     
package faktöriyel; 

import java.util.Scanner;   // kullanıcıdan veri almamız için projeye Scanner kütüphanesini bu şekilde import etmemiz gerekir.


public class BookExample3Faktöriyel {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);                                                    // Bellekte s adında yeni bir nesne oluşturduk.
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");                            // Kullanıcıdan sayıyı girmesi için bir komut verdik.Bunu ekrana yazdırdık.
        long fakt = s.nextLong();                                                              // Kullanıcıdan girilen sayıyı fakt değişkenine atadık.
        System.out.println(fakt + " Sayısının Faktöriyeli: " + hesapla(fakt) + "'dir.");    // Kullanıcıdaki sayıyı hesapla metodunu çağırıp parametreye atadık ve sonucu ekrana yazdırdık.
    }                                                                                      // main metodunun bitişi...
    
    static long hesapla(long sayi){              // long tipinde tek parametreli değer döndüren hesapla adlı bir metot oluşturduk.
        long carpim = 1;                        // integer tipinde carpim adlı bir değişken tanımladık ve 1 değerini atadık.
        for(long i=1 ; i<=sayi ; i++){         // for döngüsüyle algoritma mantığına dayalı işlem gerçekleştirildi.
            carpim*=i;                       // burada i her arttığında carpim değişkeniyle çarpılıp, carpim değişkenine atandı.
        }                                   // for döngüsünün bitişi...
        return carpim;                     // tüm sayılar çarpıldı ve carpim adlı değişkeni döndürdük.
    }                                     // hesapla metodunun bitişi...
}                                        // finish... 
