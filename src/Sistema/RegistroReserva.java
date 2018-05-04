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
        System.out.println("Ingrese el codigo de la reserva: ");
        reserva.setCodigo(leer.nextLine());
        
        //Obteniendo fecha de entrada y salida...
        System.out.println("Ingrese la fecha de entrada: ");
        reserva.setFechaent(leer.nextLine());
        
        System.out.println("Ingrese la fecha de salida: ");
        reserva.setFechasal(leer.nextLine());
        
        //Tipo de paquete
        System.out.println("Ingrese el tipo de paquete, puede ser PREMIUN o BASICO: ");
        reserva.setPaquete(leer.nextLine());
        
        //Dias de reserva
        System.out.println("Ingrese los dias de reserva: ");
        reserva.setDias(leer.nextInt());
        
    }
    public void remove(){
        Reserva reserva = new Reserva();
        int eliminar;
        System.out.println("¿Que reserva desea eliminar? ");
        Scanner numero = new Scanner(System.in);
        eliminar = numero.nextInt();
        reservas.remove(eliminar);
    }
    
    public void modificar(){
        Reserva reserva = new Reserva();
        String mod;
        int numero;
        Scanner modificar = new Scanner(System.in);
        System.out.println("Eliga que reserva desea modificar: ");
        numero=modificar.nextInt();
        
        System.out.println("Ingrese la fecha de salida que desea modificar: ");
        reservas.get(numero).setFechasal(modificar.nextLine());
        
        System.out.println("Ingrese los dias que desea modificar: ");
        reservas.get(numero).setDias(modificar.nextInt());
        
        System.out.println("Ingrese el paquete que desea modificar: ");
        reservas.get(numero).setPaquete(modificar.nextLine());
    }
}
