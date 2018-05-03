/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.ArrayList;
/**
 *
 * @author Kriz
 */
public class RegistroCliente extends Cliente{
    private ArrayList<Cliente> Clientes;
    private String id;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    
    public RegistroCliente(){}
    public RegistroCliente(ArrayList<Cliente> Clientes, String id, Fecha fechaInicio, Fecha fechaFin) {
        this.Clientes = Clientes;
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    
}
