/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Rafael Melara
 */
public class Piso {
    private double costo;
    private boolean estado;
    private char piso;

    public Piso(){}
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public char getPiso() {
        return piso;
    }

    public void setPiso(char piso) {
        this.piso = piso;
    }
    
    
    public void verificar(){
        
    }
    
}
