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
public class RegistroCliente{

    private ArrayList<Cliente> Clientes;
    public Fecha fechaInicio;
    private Fecha fechaFin;

    public RegistroCliente() {
        Clientes = new ArrayList<>();
    }

    public void add() {

        Cliente cliente = new Cliente();
        //Nombre nombre= new Nombre();
        Scanner input = new Scanner(System.in);

        System.out.println("ID de Cliente:");
        cliente.setNombre(input.nextLine());

        System.out.println("Nombre de Cliente:");
        cliente.setNombre(input.nextLine());

        System.out.println("Apellido de Cliente:");
        cliente.setNombre(input.nextLine());

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
    
    public void remove(){
        Cliente cliente = new Cliente();
        int nume;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea remover./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner num=new Scanner(System.in);
        nume=num.nextInt();
        Clientes.remove(nume);
    }

    public void set(){
        Cliente cliente = new Cliente();
        int num;
        String nom;
        Scanner cambio=new Scanner(System.in);
        System.out.println("Segun la lista mostrada luego de ingresar un registro, ingrese el numero correspondiente segun fila del producto que desea modificar./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        num=cambio.nextInt();
        
        System.out.println("ID de Cliente:");
        Clientes.get(num).setId(cambio.nextLine());

        System.out.println("Nombre de Cliente:");
        Clientes.get(num).setNombre(cambio.nextLine());

        System.out.println("Apellido de Cliente:");
        Clientes.get(num).setApellido(cambio.nextLine());

        Fecha fechaLlegada = new Fecha();
        Fecha fechaSalida = new Fecha();

        System.out.println("**********Fecha de llegada**********");
        System.out.println("Dia: ");
        fechaInicio.setDia(cambio.nextInt());
        System.out.println("Mes: ");
        fechaInicio.setMes(cambio.nextInt());
        System.out.println("Annio: ");
        fechaInicio.setAnnio(cambio.nextInt());
        
        cliente.setFechaLlegada(fechaLlegada);
        
        System.out.println("**********Fecha de salida**********");
        System.out.println("Dia: ");
        fechaFin.setDia(cambio.nextInt());
        System.out.println("Mes: ");
        fechaFin.setMes(cambio.nextInt());
        System.out.println("Annio: ");
        fechaFin.setAnnio(cambio.nextInt());
        
        cliente.setFechaSalida(fechaSalida);
    }
    
    public void mostrar(){
        
        for(Cliente e:Clientes){
            System.out.println("ID de cliente: ");
            System.out.print(e.getId());
            System.out.print(" ");
            System.out.print("Nombre de Cliente: "+e.getNombre());
            System.out.println(" ");
            System.out.print("Apellido de Cliente: $"+e.getApellido());
            System.out.println(" ");
            //FECHA:
        }
        System.out.println("Fecha de incio: ");
        System.out.println(fechaInicio.getDia()+" "+fechaInicio.getMes()+" "+fechaInicio.getAnnio());
        System.out.println(" ");
        System.out.println("Fecha de salida: ");
        System.out.println(fechaFin.getDia()+" "+fechaFin.getMes()+" "+fechaFin.getAnnio());
        
        System.out.println("\n");
    }
}
