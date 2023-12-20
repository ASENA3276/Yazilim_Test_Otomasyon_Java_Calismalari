import org.example.HesapMakinesi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HesapMakinesiTests {



    @Test
    public void toplamaTesti(){

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double toplamaSonucu=hesapMakinesi.toplama(4.5, 8.9);
        Assertions.assertEquals( 13.4, toplamaSonucu);

    }
}
