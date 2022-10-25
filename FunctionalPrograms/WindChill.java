package FunctionalPrograms;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class WindChill  {
    public static void main(String[] args) {

        double windSpeed, temperature, windChill;

        temperature = Double.parseDouble(args[0]);
        windSpeed = Double.parseDouble(args[1]);

        windChill= 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        System.out.println("Temperature of wind is   "+temperature+"  "+"in Fahrenheit"+"  "
                +"and a wind speed is : "+windSpeed+"mph");
        System.out.println("The WindChill is =" +windChill);

    }
}

    /*Write a program WindChill.java that takes two double command-line arguments t
        and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
        temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
        National Weather Service defines the effective temperature (the wind chill) to be:*/