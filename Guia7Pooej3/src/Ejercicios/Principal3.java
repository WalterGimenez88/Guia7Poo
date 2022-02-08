package Ejercicios;



public class Principal3 {
     public static void main(String[] args) {
     
        Operacion opracion1 = new Operacion();
        opracion1.CrearOperacion();
        System.out.println("Suma: " + opracion1.Sumar());
        System.out.println("Resta: " + opracion1.Restar());
        System.out.println("Producto: " + opracion1.Multiplicar());
        System.out.println("Division : " + opracion1.Dividir());
    
        
    }
    
}



