/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_ordenamiento;

/**
 *
 * @author Andres
 */
public class Nodo_Arbol {
    char dato;
    Nodo_Arbol izquierdo;
    Nodo_Arbol derecho;
    
    public Nodo_Arbol(char datos){
        dato=datos;
        izquierdo = null;
        derecho = null;
        
        
    }
    public Nodo_Arbol getizquierdo(){
        return izquierdo;
    } 
    public Nodo_Arbol getderecho(){
        return derecho;
    }
    public char getdato(){
        return dato;
    }
    public void setizquierdo(Nodo_Arbol nuevoizquierdo){
        izquierdo=nuevoizquierdo;
    }
    public void setderecho(Nodo_Arbol nuevoderecho){
        derecho=nuevoderecho;
    }
    public void setdato(char nuevodato){
        dato=nuevodato;
    }
    public void print_Nodo_Arbol(){
        System.out.println(dato+" Iz: "+izquierdo.dato+" De: "+derecho.dato);
    }
}
