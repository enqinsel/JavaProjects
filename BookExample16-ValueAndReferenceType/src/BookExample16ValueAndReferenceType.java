/*
    Burada değer ve referans tipler, tek bir örnek üzerinden anlatılarak ne anlama geldikleri gösterilmek istenmiştir.
 */

/**
 *
 * @author Engin İNSEL
 * @date   18.05.2021
 */
public class BookExample16ValueAndReferenceType {

    int b;
    public static void main(String[] args) {
        
        System.out.println("-----Değer Tiplere Örnek(Stack)------");
        
        int a =4;
        System.out.println("a'nın eski değeri: " + a );
        degistir1(a);
        System.out.println("a'nın yeni değeri: " + a);
        
        System.out.println("-----Referans Tiplere Örnek(Heap)------");
        
        BookExample16ValueAndReferenceType d1 = new BookExample16ValueAndReferenceType();
        d1.b = 10;
        System.out.println("b'nin eski değeri: " + d1.b);
        d1.degistir(d1);
        System.out.println("b'nin yeni değeri: " + d1.b);
        
        System.out.println("Burada a değişkeninin asıl değerinin değişmediğini , b değişkeninin ise asıl değerinin değiştiğini gözlemledik.");
    }
    
    void degistir(BookExample16ValueAndReferenceType d1){
        d1.b = d1.b + 25;
    }
    
    static void degistir1(int a){
        a = a + 5;
    }
}
