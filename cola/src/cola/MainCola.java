/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import datos.Cliente;
import modelo.Cola;

/**
 *
 * @author dacastro
 */
public class MainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola<Cliente> colaClientes=new Cola<>();
        colaClientes.encolar(new Cliente("David", 10));
        colaClientes.encolar(new Cliente("Juan", 5));
        colaClientes.encolar(new Cliente("Sara", 1));
        colaClientes.encolar(new Cliente("Mario", 18));
        
        
        
    }
    
}
