public class Dragon {
    int x;
    int y;
    int direction;

    // Constructor: dijalankan otomatis saat objek dibuat
    public Dragon(int newX, int newY, int newDirection) {
        x = newX;
        y = newY;
        direction = newDirection;
    }

    // Mengubah arah, tapi hanya boleh 1, 2, 3, atau 4
 public void changeDirection(int newDirection) {
    if (newDirection == 1) {
        direction = 1;
    } else if (newDirection == 2) {
        direction = 2;
    } else if (newDirection == 3) {
        direction = 3;
    } else if (newDirection == 4) {
        direction = 4;
    } else {
        System.out.println("Arah tidak valid! Direction harus diantara 1 - 4.");
    }
}

    // Menggerakkan dragon sesuai arah saat ini
    public void move(int steps) {
        if (direction == 1) {
            // arah atas, y bertambah
            y = y + steps;
        } else if (direction == 2) {
            // arah kanan, x bertambah
            x = x + steps;
        } else if (direction == 3) {
            // arah bawah, y berkurang
            y = y - steps;
        } else if (direction == 4) {
            // arah kiri, x berkurang
            x = x - steps;
        }
    }

    // Mencetak posisi dan arah dragon
    public void printStatus() {
        System.out.println("Posisi x: " + x);
        System.out.println("Posisi y: " + y);
        System.out.println("Direction: " + direction);
        System.out.println("====================");
    }
}