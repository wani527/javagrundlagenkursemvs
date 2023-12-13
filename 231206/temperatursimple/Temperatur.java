public class Temperatur {

    float temperaturcelsius = 0f;
    float temperaturfahrenheit = 0f;
    float temperaturkelvin = 0f;
    
    public Temperatur() {
            this.temperaturcelsius = 18.32f;
    }
    public Temperatur(float temperaturcelsius) {
        this.temperaturcelsius = temperaturcelsius;
    }

    public void printCelsius() {
        System.out.println(this.temperaturcelsius + "°C");
    }
    public void printFahrenheit() {
       System.out.println(this.temperaturfahrenheit + "°F");
    }

    public void printHotOrColdCelsius() {
        if (this.temperaturcelsius > 24) {
            System.out.println("It's hot: " + this.temperaturcelsius + "° Celsius!");
        } else {
            System.out.println("Its freezing: " + this.temperaturcelsius + "° Celsius!");
        }
    }
    public void printHotOrColdFahrenheit() {
        System.err.println("ERROR: printHotOrColdFahrenheit not implemented! Ignoring");
    }
    public void calculatefahrenheit() {
        temperaturfahrenheit = (this.temperaturcelsius * 1.8f) + 32f;
    }
}
