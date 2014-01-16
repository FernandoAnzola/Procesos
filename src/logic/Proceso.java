/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import gui.Estado;

/**
 *
 * @author FernandoAnzola
 */
public class Proceso {

    private String identificador;
    private String nombre_proceso;
    private Estado estado;
    private int tiempo;
    private int cantidad_memoria;
    public Proceso() {
    }

    public Proceso(String identificador, String nombre_proceso, Estado estado, int tiempo, int cantidad_memoria) {
        this.identificador = identificador;
        this.nombre_proceso = nombre_proceso;
        this.estado = estado;
        this.tiempo = tiempo;
        this.cantidad_memoria = cantidad_memoria;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nombre_proceso
     */
    public String getNombre_proceso() {
        return nombre_proceso;
    }

    /**
     * @param nombre_proceso the nombre_proceso to set
     */
    public void setNombre_proceso(String nombre_proceso) {
        this.nombre_proceso = nombre_proceso;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
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
     * @return the cantidad_memoria
     */
    public int getCantidad_memoria() {
        return cantidad_memoria;
    }

    /**
     * @param cantidad_memoria the cantidad_memoria to set
     */
    public void setCantidad_memoria(int cantidad_memoria) {
        this.cantidad_memoria = cantidad_memoria;
    }
    
    
    
    
}
