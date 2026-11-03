

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return "Merk: " + merk + ", Warna: " + warna + ", Harga: Rp" + String.format("%,.0f", harga);
    }
}
