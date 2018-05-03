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
                System.out.println("Se hizo 1 reserva con exito");
            }
            else{
                System.out.println("Se hicieron 2 reservas");
            }
            
        } while (leer.nextInt() < 1 && leer.nextInt() > 2);
        //Pidiendo el codigo 
        System.out.println("Ingrese el codigo: ");
        reserva.setCodigo(leer.nextLine());
        
        //Obteniendo fecha de entrada y salida...
        System.out.println("Ingrese la fecha de entrada: ");
        reserva.setFechaent(leer.nextLine());
        
        System.out.println("Ingrese la fecha de salida: ");
        reserva.setFechasal(leer.nextLine());
    }
}
