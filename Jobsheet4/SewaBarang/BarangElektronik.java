public class BarangElektronik {
    private String idBarang;
    private String namaBarang;
    private String merk;
    private String kategori;
    private double hargaSewaPerHari;
    private boolean tersedia;

    public BarangElektronik(String idBarang, String namaBarang, String merk, String kategori, double hargaSewaPerHari) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.merk = merk;
        this.kategori = kategori;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = true;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public boolean cekKetersediaan() {
        return tersedia;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public double getHarga() {
        return hargaSewaPerHari;
    }

    public String getInfo() {
        return namaBarang + " (" + merk + ", " + kategori + ") - Rp" + String.format("%.0f", hargaSewaPerHari) + "/hari";
    }
}
