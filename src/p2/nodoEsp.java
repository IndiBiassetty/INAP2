/*
 * En esta clse se creara la lista de supermercados con los cuales se trabajara
 */
package p2;


import java.util.*;

public class nodoEsp{
 	public String   nombreSuperMercado;	//Guarda el supermercado
        public String numEmpleados = null;
 	public boolean  IndicadorVisitado;	//Booleano encargado de decir si el nodo de visito
 	public LinkedList <nodoN> Rutas;        //Lista de Rutas
      //Public arbol inventario= null;          //Aqui va ir el inventario
        
        
  ///////////////Constructor//////////////
 	public nodoEsp(){
            nombreSuperMercado  = null;
            numEmpleados  = null;
            IndicadorVisitado  = false;
            Rutas = new LinkedList<nodoN>();
	}

	public nodoEsp(String nombreSucursal, String cantEmpleados){
            this.nombreSuperMercado = nombreSucursal;
            this.numEmpleados = cantEmpleados;
          //this.inventario = new arbol;   //Aqui va ir el inventario
            this.IndicadorVisitado   = false;
            this.Rutas  = new LinkedList<nodoN>();
	}

    public void setNombreSuperMercado(String nombreSuperMercado) {
        this.nombreSuperMercado = nombreSuperMercado;
    }

    public void setNumEmpleados(String numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public void setIndicadorVisitado(boolean IndicadorVisitado) {
        this.IndicadorVisitado = IndicadorVisitado;
    }

    public void setRutas(LinkedList<nodoN> Rutas) {
        this.Rutas = Rutas;
    }
        
        

	public String ListaSuper(){
		return "\n>>> Nombre de Supermercado ="+this.nombreSuperMercado +" " +"\n>>>";
	}

}
