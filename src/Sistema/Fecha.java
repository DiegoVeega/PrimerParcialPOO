
package Sistema;

/**
 *
 * @author Kriz
 */
public class Fecha {
    private int dia;
    private int mes;
    private int annio;
         
    public Fecha(){};
    
    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
}
