
public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override
    public String getInfo() {
        return "SmartFridge -> " + super.getInfo().replace("Kulkas -> ", "")
                + ", Ukuran Layar: " + ukuranLayar + ", Volume: " + volume;
    }
}
