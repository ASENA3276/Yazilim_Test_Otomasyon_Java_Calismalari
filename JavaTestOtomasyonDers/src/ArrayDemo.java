public class ArrayDemo {
    public static void main(String[] args) {

       String [] isimler = {"Ozan","Ece","Ömer","Deniz","Orhan","Emel","Öykü","Denizli"};
       int[] sayilar = {2,6,8,9,1,9,10,303,6007};

        System.out.println(isimler[3]);
        System.out.println(sayilar[5]);
        isimler[3]= "Pelin";
        System.out.println(isimler[3]);
        sayilar[4]= 66;
        System.out.println(sayilar[4]);

        String [] webUrl ={"www.sayfa1.com" , "www.sayfa5.com" , "wwww.sayfa3.com.tr"};
        System.out.println(webUrl[1]);
        System.out.println(webUrl[0]);
        int diziUzunlugu = isimler.length;
        System.out.println(diziUzunlugu);

        for (int i=5; i< isimler.length; i++){

            System.out.println(isimler[i]);



        }

    }
}
