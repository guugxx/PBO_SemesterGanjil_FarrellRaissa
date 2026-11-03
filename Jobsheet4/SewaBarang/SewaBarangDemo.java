import java.time.LocalDate;

public class SewaBarangDemo {
    public static void main(String[] args) {
        BarangElektronik kamera = new BarangElektronik("B001", "Kamera Mirrorless", "Sony", "Kamera", 150000);
        BarangElektronik laptop = new BarangElektronik("B002", "Laptop Gaming", "Asus", "Komputer", 200000);
        BarangElektronik proyektor = new BarangElektronik("B003", "Proyektor", "Epson", "Presentasi", 100000);
        String Proyektor5678 = proyektor.getNamaBarang();
        Pelanggan pelanggan1 = new Pelanggan("P001", "Farrell", "Jl. Merdeka No. 10, Jakarta", "081234567890");
        Transaksi transaksi1 = pelanggan1.buatTransaksi();

        
        transaksi1.setTanggalSewa(LocalDate.of(2026, 9, 21));
        transaksi1.setTanggalKembali(LocalDate.of(2026, 9, 24));
        transaksi1.tambahBarang(kamera);
        transaksi1.tambahBarang(laptop);
        transaksi1.setMetodeBayar("Transfer Bank");

        System.out.println("Total biaya  : Rp" + String.format("%.0f", transaksi1.hitungTotal()));
        System.out.println("Pembayaran   : " + (transaksi1.prosesPembayaran() ? "Berhasil" : "Gagal"));
        System.out.println();

        System.out.println(pelanggan1.getInfo());

        transaksi1.prosesPengembalian();
        System.out.println("Setelah pengembalian:");
        System.out.println(pelanggan1.getInfo());

        Pelanggan pelanggan2 = new Pelanggan("P002", "Raissa", "Jl. Sudirman No. 5, Jakarta", "089876543210");
        pelanggan2.registrasi();
        System.out.println(pelanggan2.getInfo());
    }
}
