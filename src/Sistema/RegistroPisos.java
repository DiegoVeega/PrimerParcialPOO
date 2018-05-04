package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
//Esta esperando que se cree la clase piso...
public class RegistroPisos{
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
    
    public void remove(){
        Piso piso=new Piso();
        char[] nombrespisos ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int nume;
        System.out.println("escriba el piso que quiere eliminar(a,b,c,etc)");
        Scanner num=new Scanner(System.in);
        char elim=num.next(".").charAt(0);  
        
        //busca en el array abecedario la posicion en la que esta la letra que ingreso
        pisos.remove(Arrays.binarySearch(nombrespisos, elim));
    }
}
