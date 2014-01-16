/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author FernandoAnzola
 */
public class Procesador {

    private int tiempo;
    private Proceso proceso;
    public Procesador() {
    }

    public Procesador(int tiempo, Proceso proceso) {
        this.tiempo = tiempo;
        this.proceso = proceso;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the proceso
     */
    public Proceso getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     */
    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }
    
    
    
    
    
}
