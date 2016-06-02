/*
 * En esta clse se creara la lista de supermercados con los cuales se trabajara
 */
package grafo;


import java.util.*;

public class nodoEsp{
 	public String   SuperM;				//Guarda el supermercado
 	public boolean  Indicador;			//Booleado encargado de actividad
 	public LinkedList <nodoN> Rutas;                //Lista de Rutas

        
        
  ///////////////Constructor//////////////
 	public nodoEsp(){
		SuperM     = null;
		Indicador  = false;
		Rutas      = new LinkedList<nodoN>();
	}

	public nodoEsp(String s){
			this.SuperM      = s;
			this.Indicador   = false;
			this.Rutas       = new LinkedList<nodoN>();
	}

	public String ListaSuper(){
		return "\n>>> Nombre de Supermercado ="+this.SuperM +" " +"\n>>>";
	}

}
