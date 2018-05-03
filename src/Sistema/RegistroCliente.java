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
public class RegistroCliente extends Cliente{
    private ArrayList<Cliente> Clientes;
    private String id;
    public Fecha fechaInicio;
    private Fecha fechaFin;
    
    public RegistroCliente(){
        Clientes = new ArrayList<>();
    }
    public void add(){
        
        Cliente cliente = new Cliente();
        //Nombre nombre= new Nombre();
        Scanner input=new Scanner(System.in);
        
        System.out.println("ID:");
        String cadena=input.nextLine();
        cliente.setNombre(cadena);
        
        System.out.println("Nombre:");
        String nombre=input.nextLine();
        cliente.setNombre(nombre);
        
        System.out.println("Apellido:");
        String apellido=input.nextLine();
        cliente.setNombre(apellido);
        int i=0;
        while(i>2){
        System.out.println("cantidad de habitaciones?: (maximo 2)");
        i=input.nextInt();
        break;
        
        
        System.out.println("Nombre:");
        String cadena=input.nextLine();
        cliente.setNombre(cadena);
        System.out.println("Nombre:");
        String cadena=input.nextLine();
        cliente.setNombre(cadena);
        System.out.println("Nombre:");
        String cadena=input.nextLine();
        cliente.setNombre(cadena);
        System.out.println("Nombre:");
        String cadena=input.nextLine();
        cliente.setNombre(cadena);
        
        
        Clientes.add(cliente);
    }
    
    
}
