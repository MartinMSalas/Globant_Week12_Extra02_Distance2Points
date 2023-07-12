package service;

import entities.Puntos;

import java.util.Scanner;

public class ServicePuntos {
    private Puntos p= new Puntos();
    /*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la dista

     */
    public void crearPuntos(){
        int[] p1 = new int[2];
        int[] p2 = new int[2];
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please insert the value of x1: " );
        p1[0]=read.nextInt();
        System.out.println("Please insert the value of y1: " );
        p1[1]=read.nextInt();
        p.setP1(p1);

        System.out.println("Please insert the value of x2: " );
        p2[0]=read.nextInt();
        System.out.println("Please insert the value of y2: " );
        p2[1]=read.nextInt();
        p.setP2(p2);
    }
    public  double calculateDistance(){
        //System.out.println(p.toString());
        return Math.sqrt(Math.pow((p.getP2()[0] - p.getP1()[0]), 2) + Math.pow((p.getP2()[1]-p.getP1()[1]),2));

    }
}
