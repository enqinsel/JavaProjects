
import java.util.Scanner;

/*
    Burada, basit bir örnek ile constructor yapısı gösterilmek istenmiştir.
 */

/**
 *
 * @author Engin İnsel
 * @date 21.05.2021
 */
public class BookExample17Constructor {
    
    int deger1, deger2;                                                         // iki tane nesne değişkeni oluşturduk.
    
    public BookExample17Constructor(){                                          // Varsayılan yapıcı. Sınıf adı ile aynıdır ve parametre almaz.Nesne oluşturulduğunda otomatik oluşturulur. Ancak burada varsayılan yapıcıyı biz kendimiz oluşturduk
        deger1=5;                                                               // deger1'e 5 atadık.
    }
    
    public BookExample17Constructor(int sayi){                                  // Parametre alan yapıcı. Sınıf adı ile aynıdır.
        deger2=sayi;                                                            // deger2 değişkenine sayi parametresini atadık.
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                                     // Kullanıcıdan girmesini istedik.
        System.out.print("İkinci nesnenin değerini giriniz: ");
        int sayi = s.nextInt();
        
        
        BookExample17Constructor nesne1 = new BookExample17Constructor();       // Nesnemizi oluşturduk. Bu nesne aslında varsayılan yapıcıyı çağıracaktır.
        BookExample17Constructor nesne2 = new BookExample17Constructor(sayi);     // parametre alacak olan nesneyi oluşturdul parametreli constructor için... Yapıcıya parametreyi gönderdik. Parametreyi girmeseydik ekrana int tipinin default değeri olan sıfır(0) yazdırılacaktı.
        
        System.out.println("İlk nesnenin değer: " + nesne1.deger1);             // deger1 değişkeni ekrana yazdırıldı.
        System.out.println("İkinci nesnenin değeri: " + nesne2.deger2);       // deger2 değişkeni ekrana yazdırıldı.
        

        
    }
    
}
