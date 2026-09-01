public class DragonMain {
    public static void main(String[] args) {
        // Membuat objek dragon1, posisi awal (0,0), menghadap atas (1)
        Dragon dragon1 = new Dragon(0, 0, 1);
        dragon1.printStatus();

        // dragon1 bergerak 5 langkah sesuai arah saat ini
        dragon1.move(5);
        dragon1.printStatus();

        // ubah arah dragon1 jadi kanan (2), lalu bergerak 3 langkah
        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();

        // Membuat objek dragon2, posisi awal (10,10), menghadap bawah (3)
        Dragon dragon2 = new Dragon(10, 10, 3);
        dragon2.printStatus();

        // dragon2 bergerak 4 langkah sesuai arahnya sendiri
        dragon2.move(4);
        dragon2.printStatus();
    }
}