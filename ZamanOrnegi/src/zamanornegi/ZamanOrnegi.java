package zamanornegi;

public class ZamanOrnegi {

    public static void main(String[] args) {
        // Sınıf tek, sınırsız sayıda nesne üretilebilir. Kod parçaçıcığına örneğin; "Zaman zmn = new Zaman();" gibi bir nesne daha üretebiliriz.
        Zaman zamanNesnesi = new Zaman();  //Bir zaman sınıfından bir nesne üretir
        int i;
        for (i = 0; i < 3600; i++) {
            zamanNesnesi.zamaniYaz();
            zamanNesnesi.ilerle();
            zamanNesnesi.zamaniYaz();
        }
    }
}
