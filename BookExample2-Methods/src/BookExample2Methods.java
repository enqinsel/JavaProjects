/*

       Burada parametresiz metodlar, parametreli metodlar, void tipinde metodlar , değer döndüren metodlar, kullanıcıdan veri alınarak oluşturulan metodlara ilişkin birkaç örnek verilmiştir. 
    
@author: Engin İNSEL
@date: 5:05:2021
*/
import java.util.Scanner;       // kullanıcıdan veri almamız için projeye Scanner kütüphanesini bu şekilde import etmemiz gerekir.


public class BookExample2Methods {
   static int buyuksayi;         // Bunu yapmamızın sebebi; static metodlar içerisinden, aynı zamanda da static olmayan bir değer geri döndürülememesidir.O yüzden büyüksayiyi döndürmemiz için static olarak tanımlamalıyız.(Satır 47-55)
   static String adi,soyadi;    //değişkenler static olarak tanımlandı.(Satır 58-65)
    
   public static void main(String[] args) {
        
        ekranaYaz();  // ekranaYaz() metodunu çağırdık.(Satır 31-33)
        
        carp();     // carp() metodunu çağırdık.(Satır 37-39)
        
        String isim = yaz();                 // yaz() metodunu isim değişkenine atadık. (Satır 42-44)
        System.out.println("Adı: "+isim);   // isim değişkenini ekrana yazdırdık. (Satır 42-44)
        //System.out.println("isim: "+yaz()); --> Bu şekilde de yapılabilir.
        
        hesapla(5,7); // Kullanıcıdan değer almadan, parametre olarak 5 ve 7 sayılarını gönderdik. Yani metoda; bu sayıları al ve işlem yap dedik. (Satır 46-48)
        
        Scanner girdi = new Scanner(System.in);      // Bellekte girdi adında yeni bir nesne oluşturduk. (Satır 46-48) 
	System.out.print("İlk sayıyı gir: ");       // Kullanıcıdan ilk sayıyı girmesi için bir komut verdik.Bunu ekrana yazdırdık.(Satır 46-48)
	int a = girdi.nextInt();                   // Kullanıcıdan girilen sayıyı a değişkenine atadık.(Satır 46-48)
        System.out.print("ikinci sayıyı gir: ");  // Kullanıcıdan ilk sayıyı girmesi için bir komut verdik.Bunu ekrana yazdırdık. (Satır 46-48)
	int b = girdi.nextInt();                 // Kullanıcıdan ikinci sayıyı girmesi için bir komut verdik.Bunu ekrana yazdırdık.(Satır 46-48)
        hesapla(a,b);                           // 17 ve 22. satırlar arasında, kullanıcıdan değer alarak metodumuza parametre gönderdik. Ve hesapla metodunu çalıştırdık.(Satır 46-48)
        
        int x = islem(7,2);                                     // islem() metoduna parametre verip x değişkenine atadık. (Satır 50-58)
        System.out.println("Büyük olan sayı: " + x+"'dir");    // x değişkenini ekrana yazdırdık. (Satır 50-58)
        
        degerAl("Engin" , "İnsel");        // degerAl() metodunu çağırdık ve parametre atadık. (Satır 61-68)
        yazdir();                         // yazdir() metodunu çağırdık. (Satır 61-68)
    }       // MAİN METODUNUN BİTİŞİ
    
    // ------------ Metodlar ------------ //
    
    static void ekranaYaz(){                        // void tipinde ekranaYaz() metodu oluşturduk.
        System.out.println("Bu metod çağrıldı.");   // Bu metod çağırıldığında yapılması gereken işlem... Ekrana yazdırılmasını istedik.
    }
    
    static void carp(){                 // void tipinde carp() metodu oluşturduk.
        System.out.println(3*5);       // Bu metod çağırıldığında yapılması gereken işlem... 3 İle 5'in çarpımını ekrana yazılmasını istedik.
    }
    
    static String yaz(){            // String tipinde değer döndüren yaz() metodu oluşturduk. 
        return "Engin";            // "Engin" değerini döndürmek istedik.
    }
    
    static void hesapla(int a, int b){          // void tipinde hesapla() adlı parametreli bir metod oluşturduk.
        System.out.println("Sonuç: " + a*b);   // işlemi yapıp ekrana yazdırmasını istedik.
    }
    
    static int islem(int a, int b){         // integer tipinde değer döndüren islem() adlı parametreli bir metod oluşturduk.
        if(a>b){                           // işlem satırımızın başlangıcı.
            buyuksayi=a;                  // işlem satırı... eğer a büyükse buyuksayi değişkenine a'yı atamasını istedik.
        }                                // (a>b) komutunun bitişi
        else if(a<b){                   // işlem satırı...
            buyuksayi=b;               // işlem satırı... eğer b büyükse buyuksayi değişkenine b'yi atamasını istedik.
        }                             // (a<b) komutunun bitişi
        return buyuksayi;            // return ile buyuksayi değişkenini döndürmesini istedik.
    }
    
    
    static void degerAl(String ad, String soyad){       // void tipinde degerAl adlı parametreli bir metod oluşturduk.
        adi = ad;                                      // ad parametresini adi değişkenine atadık.
        soyadi = soyad;                               // soyad parametresini soyadi değişkenine atadık.
    }
    
    static void yazdir(){                                                     // void tipinde yazdir() adlı parametresiz bir metod oluşturduk.
        System.out.println("Adı: " + adi +"," + " Soyadı: " + soyadi);       // yukarıda oluşturduğumuz adi ve soyadi adlı iki değişkeni, bu metod çağrıldığında ekrana yazdırılmasını istedik.
    }
}  // finish...
