
package ejercicios;


public class Principal {
   public static void main(String[] args) {
        boolean edad1,edad2,edad3,edad4;
        int imc1,imc2,imc3,imc4;
        
        Persona pers1 = new Persona();
        
        pers1.crearPersona();
        System.out.println("IMC : " + pers1.calcularIMC());
        imc1 = pers1.calcularIMC();
        if(pers1.esMayorEdad()){
            System.out.println("Es mayor de edad");
        }
        //System.out.println("Es mayor de edad : " + pers1.esMayorEdad());
        edad1 = pers1.esMayorEdad();
        
        Persona pers2 = new Persona("Pepe", 35, "H", 1.65, 70); 
        System.out.println("IMC : " + pers2.calcularIMC());
        imc2 = pers2.calcularIMC();
        
        System.out.println("Es mayor de edad : " + pers2.esMayorEdad());
        edad2 = pers2.esMayorEdad();
        Persona pers3 = new Persona("Laura", 32, "M", 1.75, 72.8);
        System.out.println("IMC : " + pers3.calcularIMC());
        imc3 = pers3.calcularIMC();
        System.out.println("Es mayor de edad : " + pers3.esMayorEdad());
        edad3 = pers3.esMayorEdad();
        Persona pers4 = new Persona("Mariela", 25, "M", 1.68, 68.7);
        System.out.println("IMC : " + pers4.calcularIMC());
        imc4 = pers4.calcularIMC();
        System.out.println("Es mayor de edad : " + pers4.esMayorEdad());
        edad4 = pers4.esMayorEdad();
        
        
    }
    
}