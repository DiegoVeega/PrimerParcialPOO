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
        
        System.out.println("Ingrese el piso en que se enceuntra la habitacion: ");
        piso.setPiso();
    }
    
    public void modificar(){
        
    }
}
