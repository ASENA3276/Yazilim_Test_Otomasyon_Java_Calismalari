
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap <String,Integer> ogrenciNotu = new HashMap<>();
        ogrenciNotu.put("Ozan" , 90);
        ogrenciNotu.put("Tibet", 50);
        ogrenciNotu.put("Onur", 100);
        System.out.println(ogrenciNotu);
        System.out.println("Ozanın Ders Notu "+ ogrenciNotu.get("Ozan"));
        System.out.println("Butun Anahtar Degerleri: "+ ogrenciNotu.keySet());
        System.out.println("Butun Values Degerler: "+ogrenciNotu.values());
        System.out.println("Butun Girdi Ciftleri: "+ ogrenciNotu.entrySet());
        ogrenciNotu.replace("Tibet",20);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Ozan");
        System.out.println(ogrenciNotu);
    }
}
