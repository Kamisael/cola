/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author dacastro
 */
public class Cliente extends Base{

    private String nombreC;
    private int tiempo;

    public Cliente() {
    }

    public Cliente(String nombreC, int tiempo) {
        this.nombreC = nombreC;
        this.tiempo = tiempo;
    }
    
    /**
     * Get the value of tiempo
     *
     * @return the value of tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Set the value of tiempo
     *
     * @param tiempo new value of tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Get the value of nombreC
     *
     * @return the value of nombreC
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Set the value of nombreC
     *
     * @param nombreC new value of nombreC
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public Base copy() {
        
        return new Cliente(nombreC, tiempo);
        
    }

}
