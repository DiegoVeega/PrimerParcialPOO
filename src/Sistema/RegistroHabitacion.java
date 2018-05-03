package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class RegistroHabitacion extends Habitacion{
    //Atributos.
    private final ArrayList<Habitacion> habitaciones;
    
    public RegistroHabitacion(){
        habitaciones=new ArrayList<>();
    }
    //Metodos.
    public void add(){
        Habitacion habitacion = new Habitacion();
        //Nombre nombre= new Nombre();
        
        habitaciones.add(habitacion);
        Scanner leer=new Scanner(System.in);
        //PARA SABER EL TIPO DE HABITACION SE PIENSA AGREGAR UN METODO QUE VERIFIQUE SI EL NUMERO DE HABITACION ES PAR O NO.
        habitacion.setTipoHabitacion(TipoHabitacion);
        //SET PRECIO BASE DEL CUARTO
        System.out.println("Ingrese el precio de la habitacion: ");
        habitacion.setPrecio(leer.nextDouble());
        //SET ESTADO
        System.out.println("Ingrese el Estado de la habitacion: ");
        //PROBABLE CONDICION PARA IDENTIFICAR EL ESTADO DEL CUARTO.
        habitacion.setEstado(Boolean.TRUE);
    }
    
    public void remove(){
        Habitacion habitacion=new Habitacion();
        int nume;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea remover./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner num=new Scanner(System.in);
        nume=num.nextInt();
        habitaciones.remove(nume);
    }
    
    public void set(){
        Habitacion habitacion=new Habitacion();
        int num;
        String nom;
        Scanner cambio=new Scanner(System.in);
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea modificar./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        num=cambio.nextInt();
        
        System.out.println("Ingrese nuevo precio para la habitacion: ");
        habitaciones.get(num).setPrecio(cambio.nextDouble());
        System.out.println("Ingrese nuevo estado para la habitacion: ");
        //A TRAVES DE CONDICION PARA SIMPLIFICAR.
    }
}
