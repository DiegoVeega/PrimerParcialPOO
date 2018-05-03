package Sistema;

import java.util.Scanner;

/**
 *
 * @author diego
 */
//Clae principal para el sistema.
public class Menu {

    public void Opciones() {
        int op = 6;
        Scanner leer = new Scanner(System.in);

        while (op != 5) {
            System.out.println("Bienvenido, elija un Registro. ");
            System.out.println("1. Registro de Clientes.");
            System.out.println("2. Registro de Habitaciones.");
            System.out.println("3. Registro de Pisos.");
            System.out.println("4. Registro de Reservas.");
            System.out.println("5. Salir.");
            
            op=leer.nextInt();
            switch(op){
                //Opciones de acceso a opciones de registro.
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Usted ingreso "+op+" Por favor ingrese un valor valido.");
            }
        }
    }
}
