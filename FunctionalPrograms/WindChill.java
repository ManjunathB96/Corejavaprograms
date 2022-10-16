package FunctionalPrograms;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class WindChill  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double windSpeed, temperature, windChill;

        System.out.println("Enter temperature (fahrenheit) :");
        temperature = sc.nextDouble();
        System.out.println("Enter wind speed :");
        windSpeed = sc.nextDouble();

        windChill= 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        System.out.println("Temperature of wind is   "+temperature+"  "+"in Fahrenheit"+"  "
                +"and a wind speed is : "+windSpeed+"mph");
        System.out.println("The WindChill is =" +windChill);

    }
}
