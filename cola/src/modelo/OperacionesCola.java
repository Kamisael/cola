/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dacastro
 */
public class OperacionesCola {

    public static <T extends Base> Cola<T> duplicarCola(Cola<T> CO) {
        Cola<T> coladuplicada = new Cola<>();
        Cola<T> colaAux = new Cola<>();
        while (!CO.estaVacia()) {
            colaAux.encolar(CO.desencolar());
        }
        
        while (!colaAux.estaVacia()) {  
            T elemento=colaAux.desencolar();
            T elementoCopiado=(T) elemento.copy();
            CO.encolar(elemento);
            coladuplicada.encolar(elementoCopiado);
        }

        return coladuplicada;
    }

}
