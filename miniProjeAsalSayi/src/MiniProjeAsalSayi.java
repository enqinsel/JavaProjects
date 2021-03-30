
import java.util.Scanner;


public class MiniProjeAsalSayi {

    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz: ");
        Scanner text= new Scanner(System.in);
        int number = text.nextInt();
        
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return; // Bu komut burayı direkt sonuca ulaştırır.Bitirir.
        }

        if (number < 1) {
            System.out.println("Tanımlanmayan Sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Sayı Asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }

}
