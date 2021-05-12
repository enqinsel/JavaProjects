/*
    Çok boyutlu diziler ile matris oluşumu...
 */
package bookexample12;

import java.util.Scanner;

/**
 *
 * @author Engin İnsel
 * @date 12.05.2021
 */
public class BookExample12 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dizi[][] = new int[2][2];
        System.out.println("Dizinin 1. Satır , 1.Sütununu girin: ");
        dizi[0][0] = s.nextInt();
        System.out.println("Dizinin 1. Satır , 2.Sütununu girin: ");
        dizi[0][1] = s.nextInt();
        System.out.println("Dizinin 2. Satır , 1.Sütununu girin: ");
        dizi[1][0] = s.nextInt();
        System.out.println("Dizinin 2. Satır , 2.Sütununu girin: ");
        dizi[1][1] = s.nextInt();
        
        for( int i = 0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }

}
