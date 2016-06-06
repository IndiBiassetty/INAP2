/*
 * En esta clse se creara la lista de supermercados con los cuales se trabajara
 */
package p2;


import java.util.*;

public class nodoEsp{
 	public String   nombreSuperMercado;				//Guarda el supermercado
        public String numEmpleados = null;
 	public boolean  IndicadorVisitado;			//Booleado encargado de actividad
 	public LinkedList <nodoN> Rutas;                //Lista de Rutas

        
        
  ///////////////Constructor//////////////
 	public nodoEsp(){
            nombreSuperMercado  = null;
            numEmpleados  = null;
            IndicadorVisitado  = false;
            Rutas = new LinkedList<nodoN>();
	}

	public nodoEsp(String nombreSucursal, String cantEmpleados){
			this.nombreSuperMercado      = nombreSucursal;
                        this.numEmpleados = cantEmpleados;
			this.IndicadorVisitado   = false;
			this.Rutas       = new LinkedList<nodoN>();
	}

	public String ListaSuper(){
		return "\n>>> Nombre de Supermercado ="+this.nombreSuperMercado +" " +"\n>>>";
	}

}
