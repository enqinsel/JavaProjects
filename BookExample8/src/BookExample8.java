
import java.util.Scanner;

/*
    SORU: 2 adet int tipinde değişken tanımlayın. Bu değişkenieri islemYap() adlı metoda parametre olarak gönderin. 
        Bu metodda, alınan sayılar arasındaki S'e bölünebilen sayıları bulun ve ekrana yazdırın. 
 */

/**
 * @author Engin İNSEL
 * @date 9.05.2021
 */
public class BookExample8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                             
        Scanner s2 = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = s.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = s2.nextInt();
        islemYap(a, b);
    }

    static void islemYap(int a, int b) {
        for (int i = a + 1; i < b; i++) {

            if (i % 5 == 0) {

                System.out.println(i + " Sayısı 5'e BÖLÜNÜR.");
            } else {

                System.out.println(i + " Sayısı 5'e bölünmez.");
            }
        }

    }
}
