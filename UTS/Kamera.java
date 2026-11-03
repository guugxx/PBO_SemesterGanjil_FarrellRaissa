public class Kamera extends BarangElektronik {

    
    public Kamera() {
        System.out.println("Constructor Kamera tanpa parameter");
    }

    public Kamera(String layar, String tombol, int daya) {
        super(layar, tombol, daya);

        System.out.println("Constructor Kamera berparameter");
    }



    public void potret() {
        System.out.println("Kamera: mengambil foto...");
    }

    public void aturIso() {
        System.out.println("Kamera: mengatur ISO...");
    }

    // Overriding
    @Override
    public void tampilInfo() {
        System.out.println("=== INFO KAMERA ===");
        super.tampilInfo("Farrell");
        System.out.println("Fitur  : potret, atur ISO");
        System.out.println("Info   : Lihat buku panduan kamera pada bagian 'Pengaturan ISO'.");
    }
}
