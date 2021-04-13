import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilmMenu();
    }

    public static void FilmMenu(){
        Drama d = new Drama(20.5,4,"\nFilmin adı: Cesur Yürek\nFilmin Konusu: İngiliz soyluları, yeni evli İskoç kadınlarıyla ilk geceyi geçirme hakkına sahiptir. Çocukken ailesini İskoçya uğruna kaybeden William Wallace'ın karısı da İngiliz birlikleri tarafından öldürüldüğü zaman, onun intikam arayışı kısa zamanda ülkesinin özgürlüğü için amansız bir savaşa dönüşür. ");
        Belgesel b = new Belgesel(15,3,"\nBelgeselin adı: Neşet Ertaş Belgeseli\nBelgeselin Konusu: Bir Cengiz Özkarabekir Belgesel Filmi. \"Tek Başına\" adlı serinin Neşet Ertaş bölümü bu belgesel... TV'de yayınlandığı dönem çok ilgi görmüştü. Rahmetli Neşet Ertaş'la İstanbul, Bursa, Kırşehir ve Gaziantep'te bire bir yapılan  röportajlar ve çekimler üzerine kurgulanmış bir belgeseldir...");
        BilimKurgu bk = new BilimKurgu(25,5,"Filmin adı: Yıldızlararası\nFilmin Konusu:Yıldızlararası'nda, teknik bilgisi ve becerisi yüksek olan Cooper, geniş mısır tarlalarında çiftçilik yaparak geçinmektedir; amacı iki çocuğuna güvenli bir hayat sunmaktır. Onlarla yaşayan Büyükbaba Donald çocuklara göz kulak olurken, henüz 10 yaşındaki kızı Murph şaşırtıcı bir zekaya sahiptir. Geçmişte bıraktığı biliminsanı kariyerini özleyen Cooper'un karşısına bir gün beklenmedik bir teklif çıkar ve ailesinin, dahası insanlığın güvenliği için zorlu bir karar alması gerekir...");
        Komedi k = new Komedi(15,3,"Filmin adı: Aile Arasında\nFilmin Konusu:21 yıllık ilişkileri aynı gün noktalanan nevrotik Fikret ile müzikhol vokalisti Solmaz komik bir tesadüfle tanışır. Solmaz’ın kızı Zeynep, Adanalı sevgilisiyle evlenmeye karar verince her şeyden korkan Fikret, kendini bir anda hayatının rolünü oynarken bulur. Aile arasında olması planlanan nikah, damadın ailesinin ısrarıyla büyüdükçe büyür. Bu ekip düğün hazırlıkları boyunca silahlı, geleneksel, kebapçı zinciri sahibi Adanalı aileyle anlaşabilecek ve bu düğün bir terslik çıkmadan yapılabilecek midir?");
        System.out.println("**********MENU**********");
        System.out.println("Film bilgilerini görmek için lütfen kategori seçiniz:\n1.Belgesel\n2.Bilim Kurgu\n3.Drama\n4.Komedi");
        Scanner scanner = new Scanner(System.in);
        int secim =scanner.nextInt();

        switch(secim){
            case 1:
                b.filmGoster();
                break;
            case 2:
                bk.filmGoster();
                break;
            case 3:
                d.filmGoster();
                break;
            case 4:
                k.filmGoster();
                break;

            default:
                System.out.println("Geçersiz seçim lütfen 1-4 arasında bir seçim yapınız!\n");
                FilmMenu();
        }
    }
}
