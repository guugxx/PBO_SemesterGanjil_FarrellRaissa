public class Radio extends BarangElektronik {

    // Constructor tanpa parameter
    public Radio() {
        System.out.println("Constructor Radio tanpa parameter");
    }

    // Constructor berparameter -> memanggil super() berparameter
    public Radio(String layar, String tombol, int daya) {
        super(layar, tombol, daya);
        System.out.println("Constructor Radio berparameter");
    }

    public void gantiSaluran() {
        System.out.println("Radio: mengganti saluran...");
    }

    public void aturVolume() {
        System.out.println("Radio: mengatur volume...");
    }

    // Overriding
    @Override
    public void tampilInfo() {
        System.out.println("=== INFO RADIO ===");
        super.tampilInfo();
        System.out.println("Fitur  : ganti saluran, atur volume");
        System.out.println("Info   : Lihat buku panduan radio pada bagian 'Mengatur Saluran'.");
    }
}
