public class Temperatur {

    float temperatur = 18.32f;

    public Temperatur() {
            System.out.println(temperatur);
    }
    public Temperatur(float temperatur) {
            this.temperatur = temperatur;
    }
    public void printCelsius() {
        System.out.println(this.temperatur + "°C");
    }
}
