public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // Constructor tanpa parameter di-comment (Percobaan 7 langkah 4)
    // public Pegawai() {
    //     System.out.println("Ini constructor class Pegawai");
    // }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}