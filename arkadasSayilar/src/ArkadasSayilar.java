
import java.util.Scanner;


public class ArkadasSayilar {


    public static void main(String[] args) {
        // 220'nin bölenlerinin toplamı 284'tür.
        // 284'ün bölenlerinin toplamı ise 220'dir.
        // Kendileri hariç bölenlerinin toplamı birbirlerine eşitse bu iki sayı arkadaş sayılardır.
        
        int sayi1,sayi2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Sayiyi Giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = scanner.nextInt();
        
        
        int toplam1 = 0;
        int toplam2 = 0;
        for(int i = 1; i<sayi1; i++){
            if(sayi1%i==0){
                toplam1 = toplam1 + i;
            }
        }
       
        for(int i = 1; i<sayi2; i++){
            if(sayi2%i==0){
                toplam2 = toplam2 + i;
            }
        }
        
        
        if(toplam1==sayi2 && toplam2==sayi1){
            System.out.println("'"+sayi1+"'" + " İle " + "'"+sayi2+"'" + " Arkadaş Sayılardır. ");
        }else{
            System.out.println("'"+sayi1+"'" + " İle " + "'"+sayi2+"'" + " Arkadaş Sayı Değildirler. ");
        }
        
    }
    
}
