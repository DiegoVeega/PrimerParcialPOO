package Sistema;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Habitacion {
    //Atributos.
    private String TipoHabitacion;
    private Double precio;
    private Boolean Estado;
    private Cliente Huesped;
    //Metodos.
    //Constructor.
    public Habitacion(){
    }
    public Habitacion(String TipoHabitacion, Double precio, Boolean Estado, Cliente Huesped){
        this.TipoHabitacion=TipoHabitacion;
        this.precio=precio;
        this.Estado=Estado;
        this.Huesped=Huesped;
    }
    //SETTER Y GETTERS
    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    //A espera de la Clase.
    public Cliente getHuesped() {
        return Huesped;
    }

    public void setHuesped(Cliente Huesped) {
        this.Huesped = Huesped;
    }   
}
