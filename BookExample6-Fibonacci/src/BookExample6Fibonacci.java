
import java.util.Scanner;   // Kullanıcıdan veri almamız için projeye Scanner kütüphanesini bu şekilde import etmemiz gerekir.

/*
    Fibonacci örneği ile Recursive anlatılmak istenmiştir.
 */

/**
 *
 * @author Engin İnsel
 * @Date 7.05.2021
 */
public class BookExample6Fibonacci {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                                                                 // Bellekte s adında scanner nesnesi oluşturduk
        System.out.print("Fibonacci serisindeki bulmak istediğiniz basamağı sayı olarak giriniz: ");       // Kullanıcıdan sayıyı girmesi için bir komut verdik.Bunu ekrana yazdırdık.
        int x = s.nextInt();                                                                              // Kullanıcıdan girilen sayıyı x değişkenine atadık.
        System.out.println(x+". Basamaktaki sayının değeri: "+fibonacci(x));                             // Kullanıcıdaki sayıyı fibonacci() metodunu çağırıp parametreye atadık ve sonucu ekrana yazdırdık.
    }
    
    static int fibonacci(int x){                                // fibonacci() adında değer döndüren parametreli bir metot oluşturduk.
        if(x<=1){                                              // İşlem satırı başlangıcı...
            return x;                                         //
        }                                                    //
        else{                                               //
            return fibonacci(x-1)+fibonacci(x-2);          //
        }                                                 // İşlem satırı sonu...
    }                                                    // Metot sonu...
}       // Finish!!!
