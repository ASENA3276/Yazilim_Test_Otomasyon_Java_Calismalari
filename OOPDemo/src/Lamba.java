public class Lamba {

    public boolean durumu = false;
    private String konum;

    public Lamba(String odakonumu) {
        konum= odakonumu;
        System.out.println("odamizin konumu" + konum );
    }

    public void lambaDurumu( ){

      if (durumu){

          System.out.println( "Lamba Açik !");
      }
        else {

          System.out.println( "Lamba Kapali !" );
      }
    }
}
