/*
 SORU: 2 adet aynı isimli metod tanımlayın (overload). Bu metodlardan birisi int tipinde 2 parametre, diğeri ise int tipinde 3 parametre alsın. 
Bu metodlar,aldığı sayıları çarpıp geriye sonucu döndürsün. Daha sonra metodlara ayrı ayrı parametreler gönderin ve dönen sonuçları ekrana yazdırın.

 */

/**
 *
 * @author Engin iNSEL
 * @DATE 7.05.2021
 */
public class BookExample7 {


    public static void main(String[] args) {
        System.out.println("İşlem1: " + metot1(1,2,3)); // Satır 25-27 arasındaki metot1() çağırılıp parametre gönderilmiştir.
        System.out.println("İşlem2: " + metot1(4,5));   // Satır 20-23 arasındaki metot1() çağırılıp parametre gönderilmiştir
    }
    
    static int metot1(int a, int b){
        int sonuc = a*b;            
        return sonuc;
    }
    
    static int metot1(int sayi1, int sayi2, int sayi3){
        int sonuc2= sayi1*sayi2*sayi3;
        return sonuc2;
    }
}
