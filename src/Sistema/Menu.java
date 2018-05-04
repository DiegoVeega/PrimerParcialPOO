package Sistema;

import java.util.Scanner;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
//Clae principal para el sistema.
public class Menu {

    private static Menu instance;

    private Menu() {

    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

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

            op = leer.nextInt();
            switch (op) {
                //Opciones de acceso a opciones de registro.
                case 1:
                    //Se accedera a las opciones del Registro Clientes.
                    int valor = 5;
                    Scanner lee = new Scanner(System.in);
                    RegistroCliente clientes = new RegistroCliente();
                    while (valor != 4) {
                        System.out.println("Seleccione una opcion a realizar: \n");
                        System.out.println("1. Agregar Producto.");
                        System.out.println("2. Eliminar/Descartar Producto.");
                        System.out.println("3. Modificar Producto(CARGAR o Decargar un producto).");
                        System.out.println("4. Salir.\n");

                        valor = lee.nextInt();

                        switch (valor) {
                            case 1:
                                //Se accede al metodo para agregar
                                
                                break;
                            case 2:
                                //Se accede al metodo para eliminar
                                break;
                            case 3:
                                //Se accede al metodo para modificar
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + op + " Por favor ingrese un valor valido.");
                        }
                    }
                    break;
                case 2:
                    //Se accedera a las opciones del Registro Habitaciones.
                    int valor1 = 5;
                    Scanner lec = new Scanner(System.in);
                    RegistroHabitacion habitaciones = new RegistroHabitacion();
                    while (valor1 != 4) {
                        System.out.println("Seleccione una opcion a realizar: \n");
                        System.out.println("1. Agregar Producto.");
                        System.out.println("2. Eliminar/Descartar Producto.");
                        System.out.println("3. Modificar Producto(CARGAR o Decargar un producto).");
                        System.out.println("4. Salir.\n");

                        valor = lec.nextInt();

                        switch (valor1) {
                            case 1:
                                //Se accede al metodo para agregar
                                habitaciones.add();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                break;
                            case 2:
                                //Se accede al metodo para eliminar
                                habitaciones.remove();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                break;
                            case 3:
                                //Se accede al metodo para modificar
                                habitaciones.set();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + op + " Por favor ingrese un valor valido.");
                        }
                    }
                    break;
                case 3:
                    //Se accedera a las opciones del Registro Pisos.
                    break;
                case 4:
                    //Se accedera a las opciones del Registro Reservas.
                    break;
                case 5:
                    //Se saldra del programa.
                    System.out.println("ADIOS. Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Usted ingreso " + op + " Por favor ingrese un valor valido.");
            }
        }
    }
}
