
package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;

    }

    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = entrada.nextDouble();

    }

    public void area() {
        System.out.println("Area: " + Math.PI * Math.pow(radio, 2));
    }

    public void perimetro() {
        System.out.println("Perimetro: " + 2 * Math.PI * radio);
    }
}


    