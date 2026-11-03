import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String alamat;
    private String noTelepon;
    private ArrayList<Transaksi> daftarTransaksi;

    public Pelanggan(String idPelanggan, String nama, String alamat, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.daftarTransaksi = new ArrayList<Transaksi>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void registrasi() {
        System.out.println("Pelanggan " + nama + " (" + idPelanggan + ") berhasil registrasi");
    }

    public Transaksi buatTransaksi() {
        String idTransaksi = "TRX-" + idPelanggan + "-" + (daftarTransaksi.size() + 1);
        Transaksi transaksi = new Transaksi(idTransaksi);
        daftarTransaksi.add(transaksi);

        return transaksi;
    }

    public ArrayList<Transaksi> lihatRiwayat() {
        return daftarTransaksi;
    }

    public String getInfo() {
        String info = "";
        info += "ID Pelanggan       : " + this.idPelanggan + "\n";
        info += "Nama               : " + this.nama + "\n";
        info += "Alamat             : " + this.alamat + "\n";
        info += "No Telepon         : " + this.noTelepon + "\n";

        if (!daftarTransaksi.isEmpty()) {
            info += "Riwayat Transaksi  :\n";

            for (Transaksi transaksi : daftarTransaksi) {
                info += transaksi.getInfo();
                info += "\n";
            }
        } else {
            info += "Belum ada riwayat transaksi";
        }

        info += "\n";

        return info;
    }
}
