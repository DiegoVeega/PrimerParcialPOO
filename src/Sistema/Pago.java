
package Sistema;

/**
 *
 * @author Kriz
 */
public class Pago {
    private double MontoTotal;
    private Fecha FechaPago;
    public Cliente Cliente;
    public Habitacion CostoHabitacion;
    private String Codigo;
    /*----------------------------------ATRIBUTOS NECESARIOS PARA CALCULAR EL MONTO TOTAL------------------------
    public Piso CostoPiso;
    public Paquete CostoPaquete;
*/
    public Pago(){}
    
    public Pago(double MontoTotal, Fecha FechaPago, Cliente Cliente, Habitacion CostoHabitacion, String Codigo) {
        this.MontoTotal = MontoTotal;
        this.FechaPago = FechaPago;
        this.Cliente = Cliente;
        this.CostoHabitacion = CostoHabitacion;
        this.Codigo = Codigo;
    }
    
    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public Fecha getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Fecha FechaPago) {
        this.FechaPago = FechaPago;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Habitacion getCostoHabitacion() {
        return CostoHabitacion;
    }

    public void setCostoHabitacion(Habitacion CostoHabitacion) {
        this.CostoHabitacion = CostoHabitacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
