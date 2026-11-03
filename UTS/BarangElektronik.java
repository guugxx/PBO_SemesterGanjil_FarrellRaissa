public class BarangElektronik {
    public String layar;
    public String tombol;
    public int daya;
    public String abc = "Farrell";
    

    // Constructor tanpa parameter
    public BarangElektronik() {
        System.out.println("Constructor BarangElektronik tanpa parameter");
    }

    // Constructor berparameter
    public BarangElektronik(String layar, String tombol, int daya) {
        this.layar = layar;
        this.tombol = tombol;
        this.daya = daya;
        System.out.println("Constructor BarangElektronik berparameter");
    }

 


    public void tampilInfo() {
        System.out.println("Layar  : " + layar);
        System.out.println("Tombol : " + tombol);
        System.out.println("Daya   : " + daya + " Watt");
        System.out.println("Info   : Lihat buku panduan untuk petunjuk penggunaan.");
    }
        public void tampilInfo(String abc) {
        System.out.println("Layar  : " + layar);
        System.out.println("Tombol : " + tombol);
        System.out.println("Daya   : " + daya + " Watt");
        System.out.println("Info   : Lihat buku panduan untuk petunjuk penggunaan.");
    }
}
