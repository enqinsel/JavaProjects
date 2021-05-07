/*
    İki metot üzerinden Overloading kavramı basit bir şekilde anlatılmak istenmiştir.
    -Overloading kavramına göre; aynı isimli iki metot olabilir.
      Fakat bu metotların parametre tipleri, parametre sıraları ve sayılarından herhangi birinin farklı olması gerekir.
        Eğer parametre sıraları vs. farklı olmayasaydı, hangi metodun kullanılacağı bilinemezdi.
 */

/**
 *
 * @author Engin İnsel
 * @Date   7.05.2021
 */
public class BookExample5Overloading {


    public static void main(String[] args) {     // Main metodunun başlangıcı
        System.out.println(metod1(5));          // ilk metod1() adlı metodumuzu çağırıp 5 parametresini atadık.Ve ekrana yazdırdık.(Satır 20-22)
        System.out.println(metod1(3,4));       // İkinci metod1() adlı metodumuzu çağırıp 3,5 parametrelerini atadık.Ve ekrana yazdırdık.(Satır 24-26)
    }                                         // Main Metodu Bitişi...
    
    static int metod1(int a){                           // Değer döndüren, integer tipinde, tek parametreli metod1() adında bir metot oluşturduk.
        return a;                                      // a değerini return ile döndürdük.
    }                                                 // metod1 bitişi...
    
    static int metod1(int sayi1, int sayi2){       // Değer döndüren, integer tipinde, çift parametreli metod1() adında bir metot oluşturduk.
        return (sayi1+sayi2)+(sayi1*sayi2);       // Kafamıza göre belirlediğimiz işlemin sonucunu return ile döndürdük.  
    }                                            // metod1 bitişi...
} // finish!!!
