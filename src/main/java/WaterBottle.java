public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }
}
