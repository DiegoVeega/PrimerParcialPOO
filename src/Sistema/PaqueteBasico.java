
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael Melara
 */
public class PaqueteBasico {
       private double costo;
    ArrayList<String> Servicios = new ArrayList<String>();

    public PaqueteBasico() {
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

        PaqueteBasico paquete = new PaqueteBasico();
        Servicios.add("Acceso a piscina");
        Servicios.add("Internet Ilimitado ");

    }
    
}
