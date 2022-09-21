public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //değişken isimlendirmeleri java'da camelCase yazılır.
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin =  "Vade Süresi";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolardun = 18.23;
        double dolarBugun = 18.25;

        boolean dolarDustumu = false;

        String okYonu = "";

        if (dolarBugun < dolardun) { //true
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun > dolardun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hızlı Kredi" , "Maaşını Halkbanktan Alanlar", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }



    }
}