package Sistema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
//Esta esperando que se cree la clase piso...
public class RegistroPisos {

    public static double Pocen = 0.20;
    public static double Porcentaje = 0.0;
    
    private final ArrayList<Piso> pisos;

    public RegistroPisos() {
        pisos = new ArrayList<>();
    }

    public void add() {
        //PROBLEMAS AL AÑADIR
        Piso piso = new Piso();

        pisos.add(piso);
        Scanner leer = new Scanner(System.in);
        //MODIFICAR, DEBERIA HACRELO AUTOMATICAMENTE
        //AGREGAR CONDICION QUE LO VERIFIQUE
        //System.out.println("Ingrese el parcentaje agregado del piso del piso: ");
        
        piso.setEstado(true);
        
        //DEBERIA INDICARSE QUE AL SER LOS ULTIMOS NIVELES SE AGREGARA UN COSTO EXTRA DEL 20% si es E O F
        System.out.println("Ingrese el nivel de piso: A, B, C, D, E, F: Si tiene problemas siga ingresando el nivel.");
        piso.setPiso(leer.next().charAt(0));
        
        if(leer.next().charAt(0)=='E' || leer.next().charAt(0)=='F' ){
            piso.setCosto(Pocen);
        }
        else{
            piso.setCosto(Porcentaje);
        }
    }

    public void modificar() {
        //PROBLEMAS PARA MODIFICAR DATOS
        Piso piso = new Piso();
        String mod;
        int nume;
        Scanner modificar = new Scanner(System.in);
        System.out.println("**********SE MODIFICO ESTADO DEL PISO AUTOMATICAMENTE*************");
        System.out.println("Ingrese la lista que desea modificar: ");
        nume = modificar.nextInt();

        System.out.println("Ingrese el costo que desea modificar: ");
        pisos.get(nume).setCosto(modificar.nextDouble());

       
        pisos.get(nume).setEstado(false);

        System.out.println("Ingrese el piso que desea modificar: ");
        pisos.get(nume).setPiso(modificar.next().charAt(0));
    }

    public void remove() {
        Piso piso = new Piso();
        //VERIFICAR ARREGLO DE CARACTERES
        char[] nombrespisos = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int nume;
        System.out.println("escriba el piso que quiere eliminar(a,b,c,etc)");
        Scanner num = new Scanner(System.in);
        char elim = num.next(".").charAt(0);

        //busca en el array abecedario la posicion en la que esta la letra que ingreso
        pisos.remove(Arrays.binarySearch(nombrespisos, elim));
    }

    public void mostrar() {
        //MODIFICAR, NO COSTO PORCENTAJE AGREGADO
        for(Piso e:pisos){
            System.out.println("Porcentaje agregado al costo total "+e.getCosto()+" %. "+"Estado de piso: "+e.getEstado()+" Piso: "+e.getPiso());
            System.out.println("\n");
        }
    }
}
