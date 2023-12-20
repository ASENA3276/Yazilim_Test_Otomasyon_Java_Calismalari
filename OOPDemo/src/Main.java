public class Main {
    public static void main(String[] args) {

    Kopek ilkKopegim = new Kopek("Suzi", "Golden", 10);

        System.out.println("kopegimin Adi " + ilkKopegim.getIsim()+ " Cinsi "+ ilkKopegim.getCins()+ " Yası "+ ilkKopegim.getYas());

        ilkKopegim.setIsim("Karabas");
        System.out.println("Kopegimin yeni ismi " + ilkKopegim.setIsim("kara"));

      ilkKopegim.sesCikar();
      ilkKopegim.uyku();


      Kedi kedi = new Kedi("Pamuk", "Tekiç", 2);
      kedi.sesCikar();
      kedi.uyku();

    }
}