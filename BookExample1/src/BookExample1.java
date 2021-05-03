/*
 Nesneye yönelik programlama - Field
    Sınıf Nesne kavramının mantığı basit bir örnekle gösterilmiştir.
    Nesne, durum(özellikler) ve davranışlardan(metodlar) oluşur.
    Insan sınıfından ozellikler adlı durum nesnesi, davranislar adlı davranış nesnesi oluşturulmuştur.
 */
public class BookExample1 { // BookExample1 sınıfı oluşturuldu.

    public static void main(String[] args) { // main metodu oluşturuldu
        
        System.out.println("---Kişisel Bilgiler---\n"); // keyfi başlık etiketi...
        
        Insan ozellikler = new Insan();     // Insan sınıfından ozellikler adında bir nesne oluşturulmuştur. 
        ozellikler.name = "Engin İnsel";    // Nesnenin name değişkenine bir değer atandı.
        ozellikler.cinsiyet = "Erkek";      // Nesnenin cinsiyet değişkenine bir değer atandı.
        ozellikler.yas = 24;                // Nesnenin yas değişkenine bir değer atandı.
        ozellikler.boy = 1.97;              // Nesnenin boy değişkenine bir değer atandı.
        ozellikler.kilo = 131.5;            // Nesnenin kilo değişkenine bir değer atandı.
        
        System.out.println("Adı: " + ozellikler.name + "\nCinsiyeti: " + ozellikler.cinsiyet + "\nYaşı: " + ozellikler.yas + "\nBoyu: " + ozellikler.boy + " cm"+ "\nKilosu: " + ozellikler.kilo + " kg"); // Nesnenin özellikleri ekrana yazıldı.

        System.out.println("\n---Yetenekler---\n"); // keyfi başlık etiketi...

        Insan davranislar = new Insan();    // Insan sınıfından davranislar adında bir nesne oluşturulmuştur.
        davranislar.kos();                  // davranislar nesnesinin kos adlı metodu çalıştırıldı.
        davranislar.nefesAl();              // davranislar nesnesinin nefesAl adlı metodu çalıştırıldı.
        davranislar.yemekYe();              // davranislar nesnesinin yemekYe adlı metodu çalıştırıldı.
        davranislar.yuru();                 // davranislar nesnesinin yuru adlı metodu çalıştırıldı.
    }

}
