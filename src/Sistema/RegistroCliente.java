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

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Habitacion> getHabitaciones_de_cliente() {
        return habitaciones_de_cliente;
    }

    public void setHabitaciones_de_cliente(ArrayList<Habitacion> habitaciones_de_cliente) {
        this.habitaciones_de_cliente = habitaciones_de_cliente;
    }

    public Fecha getFechaLlegada() {
        return FechaLlegada;
    }

    public void setFechaLlegada(Fecha FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public Fecha getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Fecha FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
}
