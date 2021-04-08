package zamanornegi;

public class Zaman {

    int saat;
    int dakika; // Sınıf değişkenleridir. Default. Default değeri sıfırdır.
    int saniye;

    void ilerle() {  // Sınıf davranışı, metodu, fonksiyonu, küçük programcık 
        saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakika++;
            if (dakika == 60) {
                dakika = 0;
                saat++;
                if (saat == 24) {
                    saat = 0;
                }
            }
        }
    }

    void zamaniYaz() {
        System.out.println("Zaman: " + saat + ":" + dakika + ":" + saniye);
    }

    /*void Zaman(){
        // Her sınıfın kendi içinde, sınıf ismiyle aynı olan gizli bir fonksiyon olur. new Zaman() buradakini temsil eder. Bu bir tane olmak zorunda değil. Parametreli de alabilir. Bunlara kurucu fonksiyon denir.
    }
    
    void Zaman(int saat){
        // Yukarıdaki gibi kurucu bir fonksiyondur. Kurucu fonksiyon olduklarını sınıf ismiyle aynı olduğundan anlayabiliriz.
    }*/
}
