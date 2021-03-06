package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class RegistroHabitacion {

    public static Double Sencillo = 100.00;
    public static Double Doble = 200.00;
    //Atributos.
    private final ArrayList<Habitacion> habitaciones;

    public RegistroHabitacion() {
        habitaciones = new ArrayList<>();
    }

    //Metodos.
    public void add() {
        Habitacion habitacion = new Habitacion();

        habitaciones.add(habitacion);

        habitacion.setTipoHabitacion("Sencilla");
        habitacion.setEstado(Boolean.FALSE);
        //VARIABLES GLOBALES.
        habitacion.setPrecio(Sencillo);
    }

    public void add1() {
        Habitacion habitacion = new Habitacion();

        habitaciones.add(habitacion);

        habitacion.setTipoHabitacion("Doble");
        habitacion.setEstado(Boolean.FALSE);
        //VARIABLES GLOBALES.
        habitacion.setPrecio(Doble);
    }

    public void remove() {
        Habitacion habitacion = new Habitacion();
        int nume;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila de la habitacion que desea remover.\n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner num = new Scanner(System.in);
        nume = num.nextInt();
        habitaciones.remove(nume);
    }

    public void set() {
        Habitacion habitacion = new Habitacion();
        int num;
        String nom;
        Scanner cambio = new Scanner(System.in);
        System.out.println("**********SE MODIFICO ESTADO DEL PISO AUTOMATICAMENTE*************");
        System.out.println("Segun la lista mostrada luego de ingresar un registro, ingrese el numero correspondiente segun fila de la habitacion  que desea modificar.\n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        num = cambio.nextInt();

        habitaciones.get(num).setEstado(Boolean.TRUE);

        System.out.println("Ingrese nuevo precio para la habitacion: ");
        habitaciones.get(num).setPrecio(cambio.nextDouble());
        //A TRAVES DE CONDICION PARA SIMPLIFICAR.
    }

    public void mostrar() {
        //Orden
        for (Habitacion e : habitaciones) {
            System.out.println("Tipo de habitacion: " + e.getTipoHabitacion() + " Estado: " + e.getEstado() + " Precio: $" + e.getPrecio());
            System.out.println("\n");
        }
    }
}
