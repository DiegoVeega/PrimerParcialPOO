/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Melara
 */
public class PaquetePremium {

    private double costo;
    ArrayList<String> Servicios = new ArrayList<String>();

    public PaquetePremium() {
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

   
    public void modificar() {

        double nuevoPrecio;
        System.out.println("Ingrese un nuevo precio: ");
        Scanner leer = new Scanner(System.in);
        nuevoPrecio = leer.nextDouble();
    }

    public void add() {

        Paquete paquete = new Paquete();
        Servicios.add("Premium");
        Servicios.add("Basico");

    }

}