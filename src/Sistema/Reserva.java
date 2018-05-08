package Sistema;

/**
 *
 * @author Julio Flores <00081817@uca.edu.sv>
 */
public class Reserva {
    //Atributos
    public Cliente cliente;
    public Habitacion habitacion;
    private int codigo;
    
    private String fechaent;
    private String fechasal;
    private int dias;
    private String paquete;
    
    //Constructor
    
    public Reserva(){}
    //Metodos

    public Reserva(Cliente cliente, Habitacion habitacion, int codigo, String fechaent, String fechasal, int dias, String paquete) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.codigo = codigo;
        
        this.fechaent = fechaent;
        this.fechasal = fechasal;
        this.dias = dias;
        this.paquete = paquete;
        
    }
    
    //Setters and Getters...
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaent() {
        return fechaent;
    }

    public void setFechaent(String fechaent) {
        this.fechaent = fechaent;
    }

    public String getFechasal() {
        return fechasal;
    }

    public void setFechasal(String fechasal) {
        this.fechasal = fechasal;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }
    
}
