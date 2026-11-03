public class Dosen extends Pegawai {
    public String nidn;

    // Pemanggilan constructor superclass harus di baris pertama (Percobaan 7 langkah 5 & 7)
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    // Overriding getInfo() milik Pegawai (Percobaan 5 langkah 4)
    @Override
    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();   // NIP, Nama, Gaji dari Pegawai
        info += this.getInfo();          // NIDN dari Dosen

        return info;
    }
}