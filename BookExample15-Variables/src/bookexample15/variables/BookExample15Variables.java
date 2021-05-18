/*
    Burada sınıf değişkeni ile nesne değişkeni arasındaki fark gösterilmek istenmiştir.
 */
package bookexample15.variables;

/**
 * @author Engin İNSEL
 * @date 18.05.2021
 */
public class BookExample15Variables {

    int nesne;  // nesne değişkeni
    static int sinif;   // sınıf değişkeni
    static String yazi = "Engin İNSEL";     // sınıf değişkeni
    public static void main(String[] args) {
        System.out.println("------Nesne Değişkeni İle------");
       BookExample15Variables n1 = new BookExample15Variables();            // n1 adında bir nesne oluşturuldu.
       BookExample15Variables n2 = new BookExample15Variables();            // n2 adında bir nesne oluşturuldu.
       n1.nesne = 4;                                                        // nesne değişkenine 4 atadık.
       n2.nesne = 5;                                                        // nesne değişkenin 5 atadık.
        System.out.println(n1.nesne);                                       // sonuç 4 
        System.out.println(n2.nesne);                                       // sonuç 5 
        
        System.out.println("------Sınıf Değişkeni İle------");
        
       BookExample15Variables s1 = new BookExample15Variables();            // s1 adında bir nesne oluşturuldu.
       BookExample15Variables s2 = new BookExample15Variables();            // s2 adında bir nesne oluşturuldu.
       s1.sinif = 2;                                                        // sinif değişkenine 2 atadık.
       s2.sinif = 3;                                                        // sinif değişkenine 3 atadık.        
        System.out.println(s1.sinif);                                       // sonuç 3
        System.out.println(s2.sinif);                                       // sonuç 3
       
        System.out.println("------Sınıf Değişkeni İle------");
        
        System.out.println(BookExample15Variables.yazi);        // Sonuç: Engin İNSEL , Sınıf değişkenleri nesneden bağımsızdırlar. O yüzden nesne oluşturmadan da sadece sınıf adını kullanarak erişebiliriz.
        
    }
    
}
