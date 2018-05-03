package Sistema;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
public class RegistroReserva extends Reserva{
    private final ArrayList<Reserva> reservas;
    
    public RegistroReserva(){
        reservas = new ArrayList<>();
    }
    
    public void add(Reserva NombreReserva){
        Reserva reserva = new Reserva();
        
        reservas.add(reserva);
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Cuantas reservas desea hacer: ");
            
            if (leer.nextInt() == 1){
                System.out.println("La reserva se hizo con exito");
            }
            else{
                System.out.println("Se hicieron dos reservas");
            }
            
        } while (leer.nextInt() < 1 && leer.nextInt() > 2);
        
    }
}
