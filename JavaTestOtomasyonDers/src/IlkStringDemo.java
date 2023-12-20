public class IlkStringDemo {
    public static void main(String[] args) {
        String ilkMetin ="Test Otomasyonu Baslangici";
        String ikinciMetin ="Yazilim Testi";
        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);

        int metinUzunlugu = ilkMetin.length();
        System.out.println(metinUzunlugu);
        int karakterSayisi = ikinciMetin.length();
        System.out.println(karakterSayisi);
        String kucukHarf = ilkMetin.toLowerCase();
        System.out.println(kucukHarf);
        String buyukHarf = ikinciMetin.toUpperCase() ;
        System.out.println(buyukHarf);
        System.out.println(kucukHarf +"  "+ buyukHarf);
        String yeniString = "En Sevdigim \n\"film\"\nAvatar";
        System.out.println(yeniString);
    }
}
