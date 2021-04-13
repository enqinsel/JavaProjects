public abstract class Film {
 private double fiyat;
 private int puan;
 private String filmBilgileri;

    public Film(double fiyat, int puan, String filmBilgileri) {
        this.fiyat = fiyat;
        this.puan = puan;
        this.filmBilgileri = filmBilgileri;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if(fiyat<0)
            fiyat = 10;

        this.fiyat = fiyat;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        if(puan<=5 || puan>=1)
            this.puan = puan;

        else
            System.out.println("Lütfen 1 ile 5 arasında bir puan veriniz!");

    }

    public String getFilmBilgileri() {
        return filmBilgileri;
    }

    public void setFilmBilgileri(String filmBilgileri) {
        this.filmBilgileri = filmBilgileri;
    }

    public abstract void filmGoster();
}
