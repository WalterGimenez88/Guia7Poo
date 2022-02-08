
package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica nuevosNum=new Matematica();
        
        nuevosNum.setNumero1(Math.random()*20 +1);
        nuevosNum.setNumero2(Math.random()*20+1);
        
        System.out.println("************************");
        System.out.println("El numero mayor es: "+nuevosNum.devolverMayor());
        System.out.println("************************");
        nuevosNum.calcularPotencia();
        System.out.println("************************");
        nuevosNum.calcularRaiz();
        System.out.println("************************");
        
    }
    
}
   

