public class Main {
    public static void main(String[] args) {


       Sedan sedanCoupe = new Sedan("Opel",1000000, 5, 600000);
        System.out.println(" Aracımın Modeli "+ sedanCoupe.getModel() +" Kulanım Km " + sedanCoupe.getKullanimKm()
        +" Kapı Sayısı "+ sedanCoupe.getKapiSayisi()+ " Fiyatı " + sedanCoupe.getFiyat() );

        sedanCoupe.arabayiSür(500);
        sedanCoupe.satisFiyati(70000);


        System.out.println(" Aracımın Modeli "+ sedanCoupe.getModel() +" Kulanım Km " + sedanCoupe.getKullanimKm()
                +" Kapı Sayısı "+ sedanCoupe.getKapiSayisi()+ " Fiyatı " + sedanCoupe.getFiyat() );

        sedanCoupe.arabayiSür(100);
        sedanCoupe.satisFiyati(80000);

        System.out.println(" Aracımın Modeli "+ sedanCoupe.getModel() +" Kulanım Km " + sedanCoupe.getKullanimKm()
                +" Kapı Sayısı "+ sedanCoupe.getKapiSayisi()+ " Fiyatı " + sedanCoupe.getFiyat() );

    }
}