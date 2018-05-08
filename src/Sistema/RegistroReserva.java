package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
public class RegistroReserva {

    private final ArrayList<Reserva> reservas;

    public RegistroReserva() {
        reservas = new ArrayList<>();
    }

    public void add() {
        Reserva reserva = new Reserva();

        reservas.add(reserva);
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantas reservas desea hacer: ");

        //while (leer.nextInt() < 1 && leer.nextInt() > 2){
        if (leer.nextInt() == 1) {
            //System.out.println("Se hizo 1 reserva con exito... Ahora ingrese los datos de la reserva: ");
            //Pidiendo el codigo 

            System.out.println("Ingrese el codigo de la reserva: ");
            reserva.setCodigo(leer.nextInt());
        } else {
            System.out.println("Se hicieron 2 reservas...");
            //Pidiendo el codigo 
            System.out.println("Ingrese el codigo de la reserva: ");
            reserva.setCodigo(leer.nextInt());
        }
    }

    public void remove() {
        System.out.println("ingrese codigo de reserva a eliminar");
        Scanner numero = new Scanner(System.in);
        int eliminar = numero.nextInt();
        int j = 0;
        for (Reserva e : reservas) {
            if (e.getCodigo() == (eliminar)) {
                reservas.remove(j);
                break;
            }
            j += 1;
        }
    }

    public void modificar() {
        int numero;
        Scanner modificar = new Scanner(System.in);
        System.out.println("Ingrese codigo de reserva que desea modificar");
        numero = modificar.nextInt();
        int j = 0;
        for (Reserva e : reservas) {
            if (e.getCodigo() == (numero)) {
                reservas.get(j).setCodigo(modificar.nextInt());
            }
            j += 1;
        }
    }

    public void mostrar() {

        for (Reserva e : reservas) {
            //Orden
            System.out.println("Codigo de reserva: " + e.getCodigo());
            System.out.println("\n");
        }
    }
}
