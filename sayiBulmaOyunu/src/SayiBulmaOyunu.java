
import java.util.Scanner;


public class SayiBulmaOyunu {

    public static void main(String[] args) {
        
        
        int[] sayilar = new int[]{16,43,97,72,16,25,34,53,60,81};
        
        Scanner tuslar = new Scanner(System.in);
        System.out.print("Merhaba, bana uğurlu gelen en sevdiğim iki basamaklı 10 sayıyı seçtim. Tek hakkın var, umarım bilirsin ve sana uğur getirir.\n"
                + "Oyununu başlatmak istiyorsan 1'e bas ya da iptal etmek istiyorsan 0'a bas: ");
        int tus = tuslar.nextInt();
        
        if(tus==1){
            System.out.println("Oyun başladı...");
        }
        else if(tus==0){
            System.out.println("Oyun iptal edildi. Halbuki yeni başlamıştık.Umarım geri dönersin. Hoşçakaaal!");
            return;
        }
        else{
            System.out.println("Hey! yanlış sayı girdin, sadece 1 ve 0 tuşuna basabilirsin. Oyunu tekrar çalıştır.");
            return;
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("Tahmin ettiğin sayıyı gir.Unutma tek hakkın var ;) : ");
        int aranacak = s.nextInt();
        boolean varMi=false;
        
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Tebrikleeer iyi seçim. Yüzde 10 şansın vardı, BAŞARDIN!!");
        }else{
            System.out.println("Ahh! Üzgünüm, bir daha deneyebilirsin, pes etme.");
        }
        
    }
    
}
