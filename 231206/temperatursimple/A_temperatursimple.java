import java.util.Scanner;

public class A_temperatursimple {
    public static void main(String[] args) {
        Scanner temperaturscanner = new Scanner(System.in);
        Temperatur temp1 = new Temperatur();
        Temperatur temp2 = new Temperatur(18.322342156342525768345768453f);
        temp2.printCelsius();
        Temperatur temp3 = new Temperatur(temperaturscanner.nextFloat());
        temp3.printHotOrColdCelsius();
        temp3.calculatefahrenheit();
        temp3.printFahrenheit();
        temp3.printHotOrColdFahrenheit();
        temperaturscanner.close();
    }
}
