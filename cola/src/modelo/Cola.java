/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author dacastro
 */
public class Cola<T extends Base> {
    
    private LinkedList<T> elems;
    
    public Cola(){
        elems=new LinkedList<>();
    }
    
    public void encolar(T elemento){
        elems.addLast(elemento);
    }
    
    public T desencolar(){
        return elems.removeFirst();
    }
    
    public boolean estaVacia(){
        return elems.isEmpty();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (T e : elems) {
            sb.append(" ").append(e.toString());
        }
        sb.append("]");

        return sb.toString();
    }
}
