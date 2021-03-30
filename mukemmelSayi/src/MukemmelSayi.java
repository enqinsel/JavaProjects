
import java.util.Scanner;


public class MukemmelSayi {


    public static void main(String[] args) {
        //Mükemmel Sayıyı Bulan Program
        // 6 --> 1,2,3 --> 1+2+3=6
        // 28 --> 1,2,4,7,14 --> 1+2+4+7+14=28
        
        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number = s.nextInt();
        
        int toplam = 0;
      
        for(int i=1; i<number; i++){  // i<=number yapılmamasının sebebi: Mükemmel sayılar; KENDİSİ HARİÇ, pozitif tam bölenlerinin toplamı kendisine eşit olan sayılardır.Yani bölenlerini toplatırken kendisini eklemiyoruz.
            System.out.println(i);
            if(number%i==0){
                toplam = toplam + i;    
            }
        }
        
        if(toplam==number){
            System.out.println("Mükemmel Sayıdır.");
        }
        else{
            System.out.println("Mükemmel Sayı Değildir!");
        }
        
    }
    
}
