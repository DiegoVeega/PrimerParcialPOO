package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
//Esta esperando que se cree la clase piso...
public class RegistroPisos extends Piso{
    private final ArrayList<Piso> pisos;
    
    public RegistroPisos(){
        pisos = new ArrayList<>();
    }
    
    public void add(){
        Piso piso = new Piso();
        
        pisos.add(piso);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el costo del piso: ");
        piso.setCosto(leer.nextDouble());
        
        System.out.println("Ingrese el estado en que se encuentra el piso de donde se quiere hacer la reserva: ");
        piso.setEstado(true);
        
        System.out.println("Ingrese el piso en que se encuentra la habitacion: ");
        piso.setPiso(leer.next().charAt(0));
    }
    
    public void modificar(){
        Piso piso = new Piso();
        String mod;
        int nume;
        Scanner modificar = new Scanner(System.in);
        System.out.println("Ingrese la lista que desea modificar: ");
        nume = modificar.nextInt();
        
        System.out.println("Ingrese el costo que desea modificar: ");
        pisos.get(nume).setCosto(modificar.nextDouble());
        
        System.out.println("Ingrese el estado que desea modificar de un piso: ");
        pisos.get(nume).setEstado(false);
        
        System.out.println("Ingrese el piso que desea modificar: ");
        pisos.get(nume).setPiso(modificar.next().charAt(0));
    }
}
