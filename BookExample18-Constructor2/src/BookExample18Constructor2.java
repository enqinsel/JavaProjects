/*
        Metot ve Constructor ikilisinin birlikte nasıl çalıştığı gösterilmek istenmiştir.
 */

/**
 *
 * @author Engin İnsel
 * @date 21.05.2021
 */
public class BookExample18Constructor2 {


    public static void main(String[] args) {
        
        BookExample18Constructor2 nesne1 = new BookExample18Constructor2();                   // default constructoru çağırması için nesne1 adında nesne oluşturduk. Sonra yapıcı çağırıldı ve onunla birlikte metot1 çağırılıp ekrana mesaj verildi.
        BookExample18Constructor2 nesne2 = new BookExample18Constructor2(10);                // kendimize ait özel parametreli constructorumuzu çağırmak için nesne2 adında nesne oluşturduk. Ve herhangi bir parametreyi girdik, yapıcıyı çağırdıkdan sonra yapıcıda metot2' yi çağırdı ve ekrana mesaj verildi.
        
    }
    
    void metot1(){                                                                       // metot1 adında void tipinde parametresiz metot oluşturduk.
        System.out.println("Parametre almayan metot, Default Constructor ile çağırıldı.");                       // Bilgilendirme mesajı...
    }
    
    void metot2(int sayi1){                                                          // metot2 adında void tipinde parametreli metot oluşturduk.
        System.out.println("Parametre alan metot, Özel Oluşturulan Constructor ile çağırıldı.");                      // Bilgilendirme mesajı...
    }
    
    public BookExample18Constructor2(){                                          // default constructor oluşturduk nesne1 için...
        metot1();                                                               // bu yapıcıdan metot1 metotunu çağırmasını istedik.
    }
    
    public BookExample18Constructor2(int sayi2){                              // parametreli bir yapıcı oluşturduk nesne2 için...
        metot2(sayi2);                                                       // bu yapıcıdan da metot2 metotunu çağırmasını istedik.
    }
}
