public class MethodParametreDemo {

    public static void main(String[] args) {

     konsolciktisi("Ozan");
     konsolciktisi("Aleyna");
        System.out.println(ToplamaIslemi(6,9));
        System.out.println(ToplamaIslemi(7,9));


  NotYazdirma("Asena",90);

        System.out.println(".........................");

       int carpmaSonucu= carpma(20,50);
        System.out.println(carpmaSonucu);

        System.out.println("....................");
        System.out.println(ToplamaIslemi(5,9));
        System.out.println(ToplamaIslemi(7,34,90));
        System.out.println(ToplamaIslemi(4.6, 6.7 ,5.9));



    }

    private static void konsolciktisi(String isim){

        System.out.println("Merhaba Dünya"+" Ve Merhaba  "+ isim);
    }
    private static int ToplamaIslemi(int a,int b ){
        return a+b;


    }

    private static double ToplamaIslemi(double a,double b, double c){
        return a+b+c;


    }

    private static void NotYazdirma(String ad, int not){
        System.out.println(ad + " İsimli Öğrencinin Notu " + not);

    }

    private static int carpma(int a, int b){

        int carpmaSonucu = a*b;
        return carpmaSonucu;

    }
}
