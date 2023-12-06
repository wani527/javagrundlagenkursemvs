public class Car {
    String color = "";
    String brand = "";
    public short currentSpeedInKMH = 0;
    public boolean lightsOn = true;
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

}