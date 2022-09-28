public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel.";
        String yeniMesaj = sehirver();
        System.out.println(yeniMesaj);

        int sayi=topla(7,9);
        System.out.println(sayi);
        int toplam=topla2(2,4,5,6,7,9);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1 , int sayi2){
        return sayi1+sayi2;
    }

    public static String sehirver() {
        return "Ankara" ;
    }

    public static int topla2(int...sayilar) {
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }

        return toplam;
    }
}