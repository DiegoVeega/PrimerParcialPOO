package Sistema;

/**
 *
 * @author Kriz
 */
public class Nombre {
    public Piso piso;
    private int numero;
    
    public Nombre(){}

    public Nombre(Piso piso, int numero) {
        this.piso = piso;
        this.numero = numero;
    }

    
    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    
}
