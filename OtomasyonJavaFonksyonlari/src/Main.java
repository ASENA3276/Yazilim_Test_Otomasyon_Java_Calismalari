public class Main {
    public static void main(String[] args) {


        Araba ilkArabam = new Araba();
        ilkArabam.setModel("Volvo");

        System.out.println("Ilk Arabamın modeli "+ ilkArabam.getModel()+ " Ve Fiyati "+ ilkArabam.arabaFiyati);

        ilkArabam.arabaFiyati= 45000;

        System.out.println("Ilk Arabamın modeli "+ ilkArabam.getModel()+ " Ve Fiyati "+ ilkArabam.arabaFiyati);


        Araba ikinciArabam = new Araba();
        ikinciArabam.setModel("Fiat");

        System.out.println("Ikinci Arabamin Modeli " +ikinciArabam.getModel()+ " Ve Fiyati "+ ikinciArabam.arabaFiyati);
    }


}