
import java.util.Scanner;


public class MiniProjeSesliHarfler {


    public static void main(String[] args) {
        
       // yazılan harflerden hangisi kalın sesli, hangisi ince sesli...
        /*
        Sesli harfler; a, e, ı, i, o, ö, u, ü harfleridir
        Kalın olan sesli harfler “a, ı, o, u” 
        İnce olan sesli harfler “e, i, ö, ü”
        */
        
    String harf = "a";
    

    
        boolean flag=true;
        
        String[][] kalinharfler = new String[2][2];
        String[][] inceharfler = new String[2][2];
        
        kalinharfler[0][0] = "a";
        kalinharfler[0][1] = "ı";
        kalinharfler[1][0] = "o";
        kalinharfler[1][1] = "u";
        inceharfler[0][0] = "e";
        inceharfler[0][1] = "i";
        inceharfler[1][0] = "ö";
        inceharfler[1][1] = "ü";
        
        for(int i = 0; i<=1; i++){
            for(int j=0; j<=1; j++){
                if(harf==kalinharfler[i][j]){
                    System.out.println("Kalın Harftir.");
                    flag= false;
                }
                else if(harf==inceharfler[i][j]){
                    System.out.println("İnce Harftir");
                    flag=false;
                }
            }
        }
        if(flag==true){
            System.out.println("Geçersiz Harftir");
        }
}

}