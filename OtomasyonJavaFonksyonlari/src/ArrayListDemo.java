
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList<String> isimlerListesi = new ArrayList<>();

        isimlerListesi.add("Ozan");
        isimlerListesi.add("Suzy");

        System.out.println(isimlerListesi);

        isimlerListesi.add("Tibet");
        isimlerListesi.add("Onur");
        System.out.println(isimlerListesi);
        System.out.println(isimlerListesi.get(1));
        isimlerListesi.set(3,"Hazal");
        System.out.println(isimlerListesi);
        String silinenIsim =isimlerListesi.remove(0);
        System.out.println( silinenIsim + " Listemizden çıkartılmıştır!!!");
        System.out.println(isimlerListesi);
        isimlerListesi.add("Canberk");
        isimlerListesi.add("Sofia");
        isimlerListesi.add("Gulin");
        System.out.println(isimlerListesi);
        System.out.println("Listemizde olan element sayisi "+isimlerListesi.size() + " dir!!!");

        System.out.println("Listemizde ozan ismi "+ isimlerListesi.contains("Ozan"));
        System.out.println("Listemizde Tibet ismi "+ isimlerListesi.contains("Tibet"));

        String IkincisilinenIsim =isimlerListesi.remove(3);
        System.out.println( IkincisilinenIsim + " Listemizden çıkartılmıştır!!!");

        System.out.println("İsmin liste numarası "+ isimlerListesi.indexOf("Canberk"));

        System.out.println(isimlerListesi.isEmpty());

        System.out.println(".................................");

        for ( String isim:isimlerListesi){

            System.out.println(isim);
        }
    }
}
