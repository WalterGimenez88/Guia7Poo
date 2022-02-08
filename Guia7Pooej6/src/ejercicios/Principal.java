package ejercicios;

public class Principal {

    public static void main(String[] args) {
        Cafetera caf1 = new Cafetera(2000, 900);

        System.out.println("Cantidad Actual: " + caf1.getCantidadActual());
        System.out.println("Cantidad Maxima: " + caf1.getCapacidadMaxima());
        caf1.llenarCafetera();
        System.out.println("Cantidad Actual: " + caf1.getCantidadActual());
        caf1.vaciarCafetera();
        System.out.println("Cantidad Actual: " + caf1.getCantidadActual());
        caf1.llenarCafetera();
        caf1.servirTaza(30);
        System.out.println("Cantidad Actual: " + caf1.getCantidadActual());
    }

}


