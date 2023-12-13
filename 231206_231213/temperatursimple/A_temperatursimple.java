import java.util.Scanner;

public class A_temperatursimple {
    public static void main(String[] args) {
        Scanner temperaturscanner = new Scanner(System.in);
        Temperatur temp1 = new Temperatur();
        temp1.printCelsius();
        Temperatur temp2 = new Temperatur(18.322342156342525768345768453f);
        temp2.printCelsius();
        System.err.print("Enter a Temperature: ");
        Temperatur temp3 = new Temperatur(temperaturscanner.nextFloat());
        temp3.calculateFahrenheit();
        temp3.calculateKelvin();
        temp3.printFahrenheit();
        temp3.printKelvin();
        System.err.print("Enter another Temperature: ");
        temp3.printHotOrColdCelsius(temperaturscanner.nextFloat());
        temperaturscanner.close();
    }
}
