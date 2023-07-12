import entities.Puntos;
import service.ServicePuntos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServicePuntos sp = new ServicePuntos();

        sp.crearPuntos();
        System.out.println("The distance between the two points is: " +sp.calculateDistance());
    }
}