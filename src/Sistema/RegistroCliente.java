/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kriz
 */
public class RegistroCliente {

    private ArrayList<Cliente> Clientes;
    public Fecha fechaInicio;
    private String id;
    private Fecha fechaFin;

    public RegistroCliente() {
        Clientes = new ArrayList<>();
    }
    
    public void add() {

        Cliente cliente = new Cliente();
        //Nombre nombre= new Nombre();
        Scanner input = new Scanner(System.in);

        System.out.println("ID de Cliente:");
        cliente.setId(input.nextLine());

        System.out.println("Nombre de Cliente:");
        cliente.setNombre(input.nextLine());

        System.out.println("Apellido de Cliente:");
        cliente.setApellido(input.nextLine());

        Fecha fechaLlegada = new Fecha();
        Fecha fechaSalida = new Fecha();

        System.out.println("**********Fecha de llegada**********");
        System.out.println("Dia: ");
        fechaLlegada.setDia(input.nextInt());
        System.out.println("Mes: ");
        fechaLlegada.setMes(input.nextInt());
        System.out.println("Annio: ");
        fechaLlegada.setAnnio(input.nextInt());

        cliente.setFechaLlegada(fechaLlegada);

        System.out.println("**********Fecha de salida**********");
        System.out.println("Dia: ");
        fechaSalida.setDia(input.nextInt());
        System.out.println("Mes: ");
        fechaSalida.setMes(input.nextInt());
        System.out.println("Annio: ");
        fechaSalida.setAnnio(input.nextInt());

        cliente.setFechaSalida(fechaSalida);

        Clientes.add(cliente);
    }

    public void remove() {
        System.out.println("ingrese el id de la persona a eliminar");
        Scanner num = new Scanner(System.in);
        String nom = num.nextLine();
        int i=0;
        for(Cliente e : Clientes){
            if(e.getId().equals(nom)){
                Clientes.remove(i);
            }
            i+=1;  
        }
        
    }

    public void set() {
        Scanner cambio = new Scanner(System.in);
        System.out.println("Ingrese el Id de la persona a modificar");
        //num = cambio.nextInt();
        String nom = cambio.nextLine();
        int i=0;
        for (Cliente e : Clientes) {
            if (e.getId().equals(nom)) {
                System.out.println("ID de Cliente:");

                Clientes.get(i).setId(cambio.nextLine());

                System.out.println("Nombre de Cliente:");
                Clientes.get(i).setNombre(cambio.nextLine());

                System.out.println("Apellido de Cliente:");
                Clientes.get(i).setApellido(cambio.nextLine());
                
                Fecha fechaLlegada = new Fecha();
                Fecha fechaSalida = new Fecha();

                System.out.println("**********Fecha de llegada**********");
                System.out.println("Dia: ");
                fechaLlegada.setDia(cambio.nextInt());
                System.out.println("Mes: ");
                fechaLlegada.setMes(cambio.nextInt());
                System.out.println("Annio: ");
                fechaLlegada.setAnnio(cambio.nextInt());

                Clientes.get(i).setFechaLlegada(fechaLlegada);

                System.out.println("**********Fecha de salida**********");
                System.out.println("Dia: ");
                fechaSalida.setDia(cambio.nextInt());
                System.out.println("Mes: ");
                fechaSalida.setMes(cambio.nextInt());
                System.out.println("Annio: ");
                fechaSalida.setAnnio(cambio.nextInt());

                Clientes.get(i).setFechaSalida(fechaSalida);

            }
            i+=1;
        }
        
    }

    public void mostrar() {
        for (Cliente e : Clientes) {
            System.out.println("ID de cliente: " + e.getId());
            System.out.print("Nombre de Cliente: " + e.getNombre());
            System.out.println(" ");
            System.out.print("Apellido de Cliente: " + e.getApellido());
            System.out.println("\n");
            System.out.println("Fecha de incio: ");
            System.out.println(e.getFechaLlegada().getDia() + " / " + e.getFechaLlegada().getMes() + " / " + e.getFechaLlegada().getAnnio());
            System.out.println(" ");
            System.out.println("Fecha de salida: ");
            System.out.println(e.getFechaSalida().getDia() + " / " + e.getFechaSalida().getMes() + " / " + e.getFechaSalida().getAnnio());
            System.out.println("******************************");
            
        }
    }
}


