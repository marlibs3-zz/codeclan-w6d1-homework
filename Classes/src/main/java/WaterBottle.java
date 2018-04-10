public class WaterBottle {

    private int volume;
    private int result;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int drink() {
        result = volume - 10;
        return result;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }

}
