m/*
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
public class Paquete {
    
    private double costo;
    private boolean Premium;                                                               
    ArrayList<String> Servicios = new ArrayList<String>();
    
    public Paquete(){}

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
    }
    
    public void modificar(){
       
        double nuevoPrecio;
        System.out.println("Ingrese un nuevo precio: ");
        Scanner leer = new Scanner(System.in);
        nuevoPrecio = leer.nextDouble();
    }  
     public void add(){
     
         Paquete paquete = new Paquete();
         Servicios.add("Premium");
         Servicios.add("Basico");
         
         
         
     }
    
}