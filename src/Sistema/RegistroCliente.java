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
        cliente.setNombre(input.nextLine());
        
        System.out.println("Nombre:");
        cliente.setNombre(input.nextLine());
        
        System.out.println("Apellido:");
        cliente.setNombre(input.nextLine());
        int i=0;
        while(i<=2){
        System.out.println("cantidad de habitaciones?: (maximo 2)");
        i=input.nextInt();
        }
        if(i==1){
            Clientes.add(cliente);
        }
        else
        {
            Clientes.add(cliente);
            Clientes.add(cliente);
        }
        
    }
    
        
        
    }
    
    
}
