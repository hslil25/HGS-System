abstract class arac {
    arac(String hgsNo, String adSoyad, double bakiye) {
        this.hgsNo = hgsNo;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
    }

    // HGS numarasının boyutunu bilmediğimiz için String kullanıyorum.
    String hgsNo;
    String adSoyad;
    double bakiye;
    byte sinif;

    public byte getSinif() {
        return this.sinif;
    }

    public String getHgsNo() {
        return this.hgsNo;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }

    public double getBakiye() {
        return this.bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

}
