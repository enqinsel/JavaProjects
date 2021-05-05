/*
    Bu örnekte 4 farklı kombinasyonu kullandık. Parametre alıp almamasına ve değer döndürüp döndürmemesine bağlı olarak 4 adet metod yazdık. Daha sonra hepsini sırasıyla çağırdık.
 */

/**
 *
 * @author Engin İnsel
 */
public class BookExample4MetotlarÖzet {

    static void metot1(){
        System.out.println("metot1 --> Bu metot parametre almıyor ve değer döndürmüyor.");
    }
    
    static int metot2(){
        System.out.println("metot2 --> Bu metot parametre almıyor fakat değer döndürüyor.");
        return 5;
    }
    
    static void metot3(int a ){
        System.out.println("metot3 --> Bu metot parametre alıyor fakat değer döndürmüyor.");
    }
    
    static int metot4(int x){
        System.out.println("metot4 --> Bu metot parametre alıyor ve değer döndürüyor.");
        return x;
    }
    
    public static void main(String[] args) {
        
        metot1();
        metot2();
        metot3(3);
        metot4(43);
        //System.out.println(metot4(6));
       // System.out.println("Döndüreceği sayıyı yazdırmak istiyorsak böyle yapmalıyız, dönen sayı: " + metot2());
    }
    
}
