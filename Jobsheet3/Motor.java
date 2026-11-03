public class Motor {
    private String platNomor;
    private int kecepatan;
    private boolean statusMesin;

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif!");
        } else if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void displayInfo() {
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Status Mesin : " + (statusMesin ? "ON" : "OFF"));
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("========================");
    }
}