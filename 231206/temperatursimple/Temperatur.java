public class Temperatur {

    float temperaturCelsius = 0f;
    float temperaturFahrenheit = 0f;
    float temperaturKelvin = 0f;
    
    public Temperatur() {
            this.temperaturCelsius = 18.32f;
    }
    public Temperatur(float temperaturCelsius) {
        this.temperaturCelsius = temperaturCelsius;
    }

    public void printCelsius() {
        System.out.println(this.temperaturCelsius + "°C");
    }
    public void printFahrenheit() {
        System.out.println(this.temperaturFahrenheit + "°F");
    }
    public void printKelvin() {
        System.out.println(this.temperaturKelvin + "°K");
    }

    public void printHotOrColdCelsius(float temperatur) {
        if (temperatur > 24) {
            System.out.println("It's hot: " + temperatur + "° Celsius!");
        } else {
            System.out.println("Its freezing: " + temperatur + "° Celsius!");
        }
    }
    public void printHotOrColdFahrenheit(float temperatur) {
        System.err.println("ERROR: printHotOrColdFahrenheit not implemented! Ignoring");
    }
    public void printHotOrColdKelvin(float temperatur) {
        System.err.println("ERROR: printHotOrColdKelvin not implemented! Ignoring");
    }

    public void calculateFahrenheit() {
        temperaturFahrenheit = (this.temperaturCelsius * 1.8f) + 32f;
    }
    public void calculateKelvin() {
        temperaturKelvin = this.temperaturCelsius + 273.15f;
    }
}
