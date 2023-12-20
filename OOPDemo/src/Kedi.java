public class Kedi extends Hayvan{


    public Kedi(String isim, String cins, int yas) {
        super(isim, cins, yas);
    }

    @Override
    void sesCikar() {
        System.out.println("Miyav Miyav");

    }


    public void komut(){

        System.out.println( super.isim + "Buraya Gelll!!!");
    }

    @Override
    public void uyku(){
        super.uyku();
        System.out.println("Kedi uyurken mırıldanıyor");

    }
}
