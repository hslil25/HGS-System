import java.util.ArrayList;
public class yonetim {
    private static ArrayList<arac> gecisYapanlar;
    private static double bakiye;

    public static void listeOlustur() {
        System.out.println(String.format("\n%-20s%-15s%-10s%-10s", "Adı Soyadı","HGS No","Sınıfı","Bakiye"));
        System.out.println("--------------------------------------------------------");
        for(arac gecisYapan:gecisYapanlar) {
            System.out.println(String.format("%-20s%-15s%-10o%-10.2f", gecisYapan.getAdSoyad(),gecisYapan.getHgsNo(),gecisYapan.getSinif(),gecisYapan.getBakiye()));  
        }
        System.out.println();
    }

    public static void eldeEdilenBakiye() {
        System.out.println("Elde edilen bakiye: " + bakiye + "₺");
    }
    public static void listeyeEkle(arac eklencek) {
        gecisYapanlar.add(eklencek);
        if(eklencek.sinif==1) {
           bakiye += 8.25;
        }
        if(eklencek.sinif==2) {
            bakiye += 10.75;
        }
        if(eklencek.sinif==3) {
            bakiye += 23.25;
        }
    }

    public static void main(String[] args) {
        gecisYapanlar = new ArrayList<>();
        gise.gecisYap(new otomobil("2054566", "Halil Tataroğlu", 96));
        listeOlustur();
        eldeEdilenBakiye();
        gise.gecisYap(new otobus("4843953", "Ali Yılmaz", 65));
        gise.gecisYap(new minibus("9654369", "Erdem Bakır", 65));
        listeOlustur();
        eldeEdilenBakiye();
    }
}
