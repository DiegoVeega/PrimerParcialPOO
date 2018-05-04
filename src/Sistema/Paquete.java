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
    
    public void modificarPrecio(){
       
        double nuevoPrecio;
        System.out.println("Ingrese un nuevo precio");
        Scanner leer = new Scanner(System.in);
        nuevoPrecio = leer.nextDouble();
    }
    
    public void add(){
        
        System.out.println("");
        Paquete paquete = new Paquete();
        Servicios.add("");
        
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        .setNombre(leer.nextLine()); 
        
        System.out.println("Ingrese el cantidad del producto: ");
        System.out.println("Ingrese el costo del producto: ");
        producto.setCosto(Float.parseFloat(leer.nextLine())); 
        
        System.out.println("Ingrese el nombre del proveedor del producto: ");
        producto.setProveedor(leer.nextLine()
    }

    
    
}


