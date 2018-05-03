package Sistema;

import java.util.ArrayList;

/**
 *
 * @author Kriz
 */
public class Cliente {

    private String id;
    private String Nombre;
    private String Apellido;
    public ArrayList<Habitacion> habitaciones_de_cliente;
    public Fecha FechaLlegada;
    public Fecha FechaSalida;
    public Pago pago;

    public Cliente() {
    }

    public Cliente(String id, String Nombre, String Apellido, ArrayList<Habitacion> habitaciones_de_cliente, Fecha FechaLlegada, Fecha FechaSalida, Pago pago) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.habitaciones_de_cliente = habitaciones_de_cliente;
        this.FechaLlegada = FechaLlegada;
        this.FechaSalida = FechaSalida;
        this.pago = pago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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
