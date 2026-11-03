

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return "Kulkas -> " + super.getInfo() + ", Jumlah Pintu: " + jumlahPintu;
    }
}
