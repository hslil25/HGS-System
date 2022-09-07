public class gise {

public static void gecisYap(arac gecisYapan){
    if(gecisYapan.sinif==1) {
        gecisYapan.bakiye = gecisYapan.bakiye - 8.25;
    }
    if(gecisYapan.sinif==2) {
        gecisYapan.bakiye = gecisYapan.bakiye - 10.75;
    }
    if(gecisYapan.sinif==3) {
        gecisYapan.bakiye = gecisYapan.bakiye - 23.25;
    }
    yonetim.listeyeEkle(gecisYapan);

}
    
}