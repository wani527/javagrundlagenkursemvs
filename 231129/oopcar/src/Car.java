public class Car {
    String color = "";
    String brand = "";
    public short currentSpeedInKMH = 0;
    public boolean lightsOn = false;
    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        System.out.println("ssss");
    }
    public void honk() {
        System.out.println("honk honk");
    }
    public void accelerate() {
        this.currentSpeedInKMH += 10;
    }
    public void brake() {
        this.currentSpeedInKMH -= 10;
    }
    public void turnLightsOn() {
        this.lightsOn = true;
    }
    public void turnLightsOff() {
        this.lightsOn = false;
    }

}