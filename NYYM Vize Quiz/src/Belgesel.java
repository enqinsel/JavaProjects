public class Belgesel extends Film{
    public Belgesel(double fiyat, int puan, String filmBilgileri) {
        super(fiyat, puan, filmBilgileri);
    }

    @Override
    public void filmGoster() {
        System.out.println("Belgesel türü filmimizin bilgileri:" +getFilmBilgileri());
        System.out.println("Filmimizin fiyatı: " +getFiyat());
        System.out.println("Filmimizin puanı: " +getPuan());
    }

}
