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
            System.out.println("Bienvenido, por favor complete cada uno de los siguientes registros. ");
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
                        System.out.println("1. Agregar Cliente.");
                        System.out.println("2. Eliminar/Descartar Cliente.");
                        System.out.println("3. Modificar Cliente.");
                        System.out.println("4. Salir.\n");

                        valor = lee.nextInt();

                        switch (valor) {
                            case 1:
                                clientes.add();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                clientes.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 2:
                                clientes.remove();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                clientes.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 3:
                                clientes.set();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                clientes.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + valor + " Por favor ingrese un valor valido.");
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
                        System.out.println("1. Agregar Habitacion.");
                        System.out.println("2. Eliminar/Descartar Habitacion.");
                        System.out.println("3. Modificar Habitacion.");
                        System.out.println("4. Salir.\n");

                        valor1 = lec.nextInt();

                        switch (valor1) {
                            //VERIFICAR POR ERROR EN OUT.
                            case 1:
                                //*************************************************************************AGREGAR LISTA ADD
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                //SEGUNDO
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                //TERCERO
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                //CUARTO
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                //QUINTO
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                //SEXTO
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                habitaciones.add();
                                habitaciones.add1();
                                
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                habitaciones.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 2:
                                //Se accede al metodo para eliminar
                                habitaciones.remove();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                habitaciones.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 3:
                                //Se accede al metodo para modificar
                                habitaciones.set();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                habitaciones.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + valor1 + " Por favor ingrese un valor valido.");
                        }
                    }
                    break;
                case 3:
                    //Se accedera a las opciones del Registro Pisos.
                    int valor2 = 5;
                    Scanner lec1 = new Scanner(System.in);
                    RegistroPisos pisos = new RegistroPisos();
                    while (valor2 != 4) {
                        System.out.println("Seleccione una opcion a realizar: \n");
                        System.out.println("1. Agregar Piso.");
                        System.out.println("2. Eliminar/Descartar Piso.");
                        System.out.println("3. Modificar Piso.");
                        System.out.println("4. Salir.\n");

                        valor2 = lec1.nextInt();

                        switch (valor2) {
                            case 1:
                                //Se accede al metodo para agregar
                                pisos.add();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                pisos.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 2:
                                //Se accede al metodo para eliminar
                                pisos.remove();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                pisos.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 3:
                                //Se accede al metodo para modificar
                                pisos.modificar();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                pisos.mostrar();
                                System.out.println("\n******************************\n");
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + valor2 + " Por favor ingrese un valor valido.");
                        }
                    }
                    break;
                case 4:
                    //Se accedera a las opciones del Registro Reservas.
                    int valor3 = 5;
                    Scanner lec2 = new Scanner(System.in);
                    RegistroReserva reservas = new RegistroReserva();
                    while (valor3 != 4) {
                        System.out.println("Seleccione una opcion a realizar: \n");
                        System.out.println("1. Agregar Reserva.");
                        System.out.println("2. Eliminar/Descartar Reserva.");
                        System.out.println("3. Modificar Reserva.");
                        System.out.println("4. Salir.\n");

                        valor3 = lec2.nextInt();

                        switch (valor3) {
                            case 1:
                                //Se accede al metodo para agregar
                                reservas.add();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                reservas.mostrar();
                                break;
                            case 2:
                                //Se accede al metodo para eliminar
                                reservas.remove();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                reservas.mostrar();
                                break;
                            case 3:
                                //Se accede al metodo para modificar
                                reservas.modificar();
                                System.out.println("\n******************************\n");
                                //mostrar lo agregado
                                System.out.println("\n******************************\n");
                                reservas.mostrar();
                                break;
                            case 4:
                                //Se saldra del programa.
                                System.out.println("ADIOS. Saliendo del sistema.");
                                break;
                            default:
                                System.out.println("Usted ingreso " + valor3 + " Por favor ingrese un valor valido.");
                        }
                    }
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
