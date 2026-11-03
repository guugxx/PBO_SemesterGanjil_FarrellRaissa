public class Main {
    public static void main(String[] args) {
        // 2 objek subclass
        Radio radio1 = new Radio("LCD 2 inci", "Tombol putar", 15);
        System.out.println();
        Kamera kamera1 = new Kamera();
        System.out.println();

        Kamera kamera2 = new Kamera("LCD 8 inci", "Tombol shutter", 35);
        System.out.println();


        radio1.tampilInfo();
        radio1.gantiSaluran();
        radio1.aturVolume();
        System.out.println();

        kamera1.tampilInfo();
        kamera1.potret();
        kamera1.aturIso();
        System.out.println();

        kamera2.tampilInfo();
        kamera2.potret();
        kamera2.aturIso();
        System.out.println();


    }
}
