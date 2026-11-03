

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public String getInfo() {
        return "Kipas -> " + super.getInfo() + ", Jenis: " + jenis;
    }
}
