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
public class RegistroCliente extends Cliente {

    private ArrayList<Cliente> Clientes;
    private String id;
    public Fecha fechaInicio;
    private Fecha fechaFin;

    public RegistroCliente() {
        Clientes = new ArrayList<>();
    }

    public void add() {

        Cliente cliente = new Cliente();
        //Nombre nombre= new Nombre();
        Scanner input = new Scanner(System.in);

        System.out.println("ID:");
        cliente.setNombre(input.nextLine());

        System.out.println("Nombre:");
        cliente.setNombre(input.nextLine());

        System.out.println("Apellido:");
        cliente.setNombre(input.nextLine());

        Fecha fechaLlegada = new Fecha();
        Fecha fechaSalida = new Fecha();

        System.out.println("Fecha en que llega?");
        System.out.println("dia?");
        fechaLlegada.setDia(input.nextInt());
        System.out.println("mes?");
        fechaLlegada.setMes(input.nextInt());
        System.out.println("annio?");
        fechaLlegada.setAnnio(input.nextInt());
        
        System.out.println("Fecha en que sale?");
        System.out.println("dia?");
        fechaSalida.setDia(input.nextInt());
        System.out.println("mes?");
        fechaSalida.setMes(input.nextInt());
        System.out.println("annio?");
        fechaSalida.setAnnio(input.nextInt());
        
        cliente.setFechaLlegada(fechaLlegada);
        
        cliente.setFechaSalida(fechaSalida);
        
        
        Clientes.add(cliente);
        
    }

}
