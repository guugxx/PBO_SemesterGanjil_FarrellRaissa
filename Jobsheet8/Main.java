

public class Main {
    public static void main(String[] args) {
        // Objek Kulkas
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.warna = "Silver";
        kulkas.harga = 4500000;
        kulkas.jumlahPintu = 2;

        // Objek TV
        TV tv = new TV();
        tv.merk = "Samsung";
        tv.warna = "Hitam";
        tv.harga = 6000000;
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println(kulkas.getInfo());
        System.out.println(tv.getInfo());

        // Uji interface Audible pada TV
        tv.naikkanVolume();
        System.out.println("Setelah naikkanVolume(): volume TV = " + tv.volume);
        tv.turunkanVolume();
        tv.turunkanVolume();
        System.out.println("Setelah turunkanVolume() 2x: volume TV = " + tv.volume);

        // Uji SmartFridge (Audible) lewat tipe interface
        SmartFridge sf = new SmartFridge();
        sf.merk = "LG";
        sf.warna = "Putih";
        sf.harga = 12000000;
        sf.jumlahPintu = 2;
        sf.ukuranLayar = "10 inci";
        sf.volume = 5;
        Audible a = sf;
        a.naikkanVolume();
        System.out.println(sf.getInfo());
    }
}
