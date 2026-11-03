public abstract class BarangElektronik {
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
    }

    public abstract void tampilGaransi();
}
