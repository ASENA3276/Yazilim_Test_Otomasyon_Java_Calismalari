public class Araba {

    private String kasaTipi ;
    private String model;
    private int kullanimKm;
    private int kapiSayisi;
    private int fiyat ;

    public Araba(String kasaTipi, String model, int kullanimKm , int kapiSayisi , int fiyat){

        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.kapiSayisi = kapiSayisi;
        this.fiyat = fiyat;

    }


    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void arabayiSür(int surulenKm){

        this.kullanimKm += surulenKm;
        System.out.println("Arabanın Kullanım Km" + this.kullanimKm);

    }

    public int satisFiyati(int yeniSatisFiyati){

        return this.fiyat = yeniSatisFiyati;


    }
}
