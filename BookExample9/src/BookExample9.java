
import java.util.Scanner;

/*
SORU: Bir metot tanımlayın.Bu metot parametre alsın. 
        Aldığı parametreyi kullanarak ebatlarını belirten döngüler yardımıyla içi boş bir kare oluştursun. Kullanıcı'nın iki tane sayı girmesine gerek yoktur. Çünkü Kare'nin ebatları eşit.
 */
/**
 *
 * @author Engin İNSEL
 * @date 10.05.2021
 */
public class BookExample9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz Kare'nin ebatlarını belirlemek için bir sayı giriniz: ");
        int girdi = s.nextInt();
        System.out.println(" ");
        shape(girdi);
        yazdır(girdi);
    }

    static void shape(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == 1 || j == a || i == 1 || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    static void yazdır(int yaz) {
        System.out.println(yaz + "x" + yaz + " Ebatlarında İçi Boş Bir Kare Oluşturuldu.");
    }
}
