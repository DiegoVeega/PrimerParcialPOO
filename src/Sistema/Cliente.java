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
    private String Direccion;
    public ArrayList<Habitacion> habitaciones_de_cliente;
    public Pago pago;

    public Cliente(String id, String Nombre, String Apellido, String Direccion, ArrayList<Habitacion> habitaciones_de_cliente, Pago pago) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.habitaciones_de_cliente = habitaciones_de_cliente;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Habitacion> getHabitaciones_de_cliente() {
        return habitaciones_de_cliente;
    }

    public void setHabitaciones_de_cliente(ArrayList<Habitacion> habitaciones_de_cliente) {
        this.habitaciones_de_cliente = habitaciones_de_cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    
}
