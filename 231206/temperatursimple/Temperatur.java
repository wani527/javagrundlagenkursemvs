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
    public void printHotOrColdCelsius() {
        if (this.temperatur > 24) {
            System.out.println("It's hot: " + this.temperatur + "° Celsius!");
        } else {
            System.out.println("Its freezing: " + this.temperatur + "° Celsius!");
        }
    }
}
