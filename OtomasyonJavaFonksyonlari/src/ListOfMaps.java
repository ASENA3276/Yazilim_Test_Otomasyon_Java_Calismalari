import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {

        HashMap<String, String  > ilkOgrenci = new HashMap();

        ilkOgrenci.put("Isim:","John");
        ilkOgrenci.put("Soyisim:","Doe");
        ilkOgrenci.put("Ders:", "Matematik");
        ilkOgrenci.put("Notu:","90");

        System.out.println(ilkOgrenci);


        HashMap<String,String> ikinciOgrenci = new HashMap<>();

        ikinciOgrenci.put("Isim:","Kate");
        ikinciOgrenci.put("Soyisim:","Win");
        ikinciOgrenci.put("Ders:", "Fizik");
        ikinciOgrenci.put("Notu:","100");

        System.out.println(ikinciOgrenci);

        HashMap<String,String> UcuncuOgrenci = new HashMap<>();

        UcuncuOgrenci.put("Isim:","Juan");
        UcuncuOgrenci.put("Soyisim:","Jose");
        UcuncuOgrenci.put("Ders:", "Spor");
        UcuncuOgrenci.put("Notu:","70");

        System.out.println(UcuncuOgrenci);

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList();

        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ikinciOgrenci);
        ogrenciListesi.add(UcuncuOgrenci);

        System.out.println(ogrenciListesi.get(1));





    }
}
