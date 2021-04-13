public class BilimKurgu extends Film {

    public BilimKurgu(double fiyat, int puan, String filmBilgileri) {
        super(fiyat, puan, filmBilgileri);
    }

    @Override
    public void filmGoster() {
        System.out.println("Bilim Kurgu türü filmimizin bilgileri:" +getFilmBilgileri());
        System.out.println("Filmimizin fiyatı: " +getFiyat());
        System.out.println("Filmimizin puanı: " +getPuan());
    }
}
