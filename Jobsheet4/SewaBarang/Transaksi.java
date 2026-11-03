import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;
    private int lamaSewa;
    private double totalBiaya;
    private String metodeBayar;
    private String status;
    private ArrayList<BarangElektronik> daftarBarang;

    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.lamaSewa = 0;
        this.totalBiaya = 0;
        this.status = "Dipesan";
        this.daftarBarang = new ArrayList<BarangElektronik>();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public LocalDate getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(LocalDate tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<BarangElektronik> getDaftarBarang() {
        return daftarBarang;
    }

    public void tambahBarang(BarangElektronik b) {
        if (b.cekKetersediaan()) {
            daftarBarang.add(b);
            b.setTersedia(false);
        } else {
            System.out.println("Barang " + b.getNamaBarang() + " sedang tidak tersedia");
        }
    }

    public void hapusBarang(BarangElektronik b) {
        if (daftarBarang.remove(b)) {
            b.setTersedia(true);
        }
    }

    public double hitungTotal() {
        if (tanggalSewa != null && tanggalKembali != null) {
            lamaSewa = (int) ChronoUnit.DAYS.between(tanggalSewa, tanggalKembali);
            if (lamaSewa < 1) {
                lamaSewa = 1;
            }
        }

        double total = 0;
        for (BarangElektronik b : daftarBarang) {
            total += b.getHarga() * lamaSewa;
        }
        totalBiaya = total;

        return totalBiaya;
    }

    public boolean prosesPembayaran() {
        if (daftarBarang.isEmpty() || metodeBayar == null) {
            return false;
        }

        hitungTotal();
        status = "Dibayar";

        return true;
    }

    public void prosesPengembalian() {
        for (BarangElektronik b : daftarBarang) {
            b.setTersedia(true);
        }
        status = "Selesai";
    }

    public String getInfo() {
        String info = "";
        info += "\tID Transaksi : " + this.idTransaksi + "\n";
        info += "\tTanggal Sewa : " + this.tanggalSewa + " s.d. " + this.tanggalKembali + " (" + this.lamaSewa + " hari)\n";

        info += "\tBarang       :\n";
        if (!daftarBarang.isEmpty()) {
            for (BarangElektronik b : daftarBarang) {
                info += "\t\t- " + b.getInfo() + "\n";
            }
        } else {
            info += "\t\tBelum ada barang\n";
        }

        info += "\tTotal Biaya  : Rp" + String.format("%.0f", this.totalBiaya) + "\n";
        info += "\tMetode Bayar : " + (this.metodeBayar == null ? "-" : this.metodeBayar) + "\n";
        info += "\tStatus       : " + this.status + "\n";

        return info;
    }
}
