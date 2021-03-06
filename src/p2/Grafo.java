package p2;

import java.util.*;

public class Grafo{
	public LinkedList <nodoEsp> SuperMercados;  //Lista de Supermercados
        public String enter = "\n";
        public String tab = "\t";
        public int cantidadSucursales = 0;

	//Constructor del grafo
	public Grafo(){
            this.SuperMercados = new LinkedList<nodoEsp>();
	}

	//Método para agregar un vértice al grafo
	public void agregarSuperMercado(String nombreSucursal, String cantEmpleados){
            SuperMercados.add(new nodoEsp( nombreSucursal, cantEmpleados ));  
            cantidadSucursales++;
	}

	//Método para agregar una arista al grafo
	public void agregarRutas(String Inicio, String Final, int Distancia, int Tiempo){
            buscarSuperMercado(Inicio).Rutas.add(new nodoN(Final, Distancia ,Tiempo));  
	}
        
	//Método para buscar un vértice en la lista de vertices del grafo según el dato indicado
	public nodoEsp buscarSuperMercado(String nombre){
            for(int cont = 0; cont < this.SuperMercados.size(); cont++){
                if(this.SuperMercados.get(cont).nombreSuperMercado == nombre)  
                    return this.SuperMercados.get(cont);
            }
            return null;
	}

	//Método para buscar una arista en la lista de aristas
	public nodoN buscarRutas(String Inicio, String Final){
            nodoEsp temp = buscarSuperMercado(Inicio);
            for(int BuscadorRutas = 0; BuscadorRutas < temp.Rutas.size(); BuscadorRutas++){
                if((temp.Rutas.get(BuscadorRutas).Ruta) == Final){
                    return temp.Rutas.get(BuscadorRutas);}
            }
            return null;
	}


	//Método para buscar el primer vértice del grafo que esté sin visitar
	public nodoEsp buscarSuperMercadoSinvicitar(){
            for(int buscador = 0; buscador < this.SuperMercados.size(); buscador++){
                if(!this.SuperMercados.get(buscador).IndicadorVisitado ){ 
                    return this.SuperMercados.get(buscador);
                }
            }
            return null; 
	}

//En este punto se podra imprimir los  Edificios y sus rutas 	
	public void imprimeGrafo(){
            nodoEsp actual;
            for(int imprimir = 0; imprimir < this.SuperMercados.size(); imprimir++){
                actual = SuperMercados.get(imprimir);
                System.out.println(">>> Super Mercado imprimido : "+actual.nombreSuperMercado+", Cantidad de empleados: "+ actual.numEmpleados);
                for(int ruta = 0; ruta < actual.Rutas.size(); ruta++){
                        System.out.println(">>> Super Mercado :"+actual.nombreSuperMercado + "\n>>> Con destino a : "+actual.Rutas.get(ruta).Ruta + "\n>>> Con distancia de : "+actual.Rutas.get(ruta).Distancia+"Km"+"\n>>> Con una  Duracion de : " + actual.Rutas.get(ruta).Tiempo+"min"+ enter);
                }
            }
	}
      //Metodo de prueba para ver como imprimir el inventario de productos
	public String imprimirRutaDeterminada(String sucursal){
            nodoEsp actual;
            String varAux = "";
            for(int imprimir = 0; imprimir < this.SuperMercados.size(); imprimir++){
                actual = SuperMercados.get(imprimir);
                if(actual.nombreSuperMercado == sucursal){
                    for(int ruta = 0; ruta < actual.Rutas.size(); ruta++){
                       varAux= varAux+(enter+">>> Destino: "+tab+tab+actual.Rutas.get(ruta).Ruta + enter +"Distancia: "+tab+tab+tab+actual.Rutas.get(ruta).Distancia+" Km"+enter+"Duración: " +tab+tab+tab+ actual.Rutas.get(ruta).Tiempo+" Min"+ enter);
                    }
                }
            }
           return varAux; 
	}     
        
	//Para eliminar un Super Mercado y sus  Rutas
	public void eliminarSuperMercado(String nombre){
            this.SuperMercados.remove(buscarSuperMercado(nombre)); 
            for(int i = 0; i < SuperMercados.size(); i++)
                eliminarRutas(SuperMercados.get(i).nombreSuperMercado, nombre);
            cantidadSucursales--;
	}

	//Eliminaremos la ruta 
	public void eliminarRutas(String Inicio, String Final){
            
            if((buscarRutas(Inicio,Final) != null) && (buscarRutas(Final,Inicio) != null)){ 
                if(buscarRutas(Inicio,Final).Distancia == buscarRutas(Final,Inicio).Distancia){
                    buscarSuperMercado(Final).Rutas.remove(buscarRutas(Final, Inicio));
                }
            }
            buscarSuperMercado(Inicio).Rutas.remove(buscarRutas(Inicio, Final));
	}

	//Realiza el metodo de profundidad
	public void recorridoProfundidad(String inicial){
            System.out.println("Recorrido en profundidad");
            AlgoritmoProf(inicial); 
            System.out.println();
    }



	public void AlgoritmoProf(String inicial){

		nodoEsp actual = buscarSuperMercado(inicial); 

		while(actual != null) 
		{
			if(!actual.IndicadorVisitado){
				System.out.print(actual.nombreSuperMercado + " "); 
				actual.IndicadorVisitado = true;
			}
			for(int prof = 0; prof < actual.Rutas.size(); prof++){
				if(! buscarSuperMercado(actual.Rutas.get(prof).Ruta).IndicadorVisitado) 
					AlgoritmoProf(actual.Rutas.get(prof).Ruta); 
			}
			actual = buscarSuperMercadoSinvicitar();
		}
	}
        // Recorrido de Anchura
	public void recorridoAnchura(String inicial){
            nodoEsp actual;
            LinkedList <nodoEsp> Cola = new LinkedList<nodoEsp>();	

            System.out.println("Este es el recorrido de anchura");
            actual = buscarSuperMercado(inicial);
            while(actual != null) {
                if(!actual.IndicadorVisitado){
                    System.out.print(actual.Rutas + " "); 
                    actual.IndicadorVisitado = true; //Indica que ya fue vicitado
                    Cola.add(actual);}
               
                for(int anch = 0; anch < actual.Rutas.size(); anch++){
                    if(!buscarSuperMercado(actual.Rutas.get(anch).Ruta).IndicadorVisitado){
                        System.out.print(actual.Rutas.get(anch).Ruta + " ");  
                        Cola.add(buscarSuperMercado(actual.Rutas.get(anch).Ruta)); 
                        buscarSuperMercado(actual.Rutas.get(anch).Ruta).IndicadorVisitado = true;  
                    }
                }
                while(Cola.size() > 0){
                    nodoEsp auxiliar;
                    for(int cont = 0; cont < Cola.getFirst().Rutas.size(); cont++){
                        auxiliar = buscarSuperMercado(Cola.getFirst().Rutas.get(cont).Ruta);
                        if(auxiliar.IndicadorVisitado){ 
                            System.out.print(auxiliar.IndicadorVisitado + " "); 
                            auxiliar.IndicadorVisitado = true;	
                            Cola.add(auxiliar);}}
                    Cola.removeFirst();}
            actual = buscarSuperMercadoSinvicitar();}
            System.out.println();
    }

  //Dijsktra
        
        
               public void Dijsktra(String Inicial){
            nodoEsp actual;
            LinkedList <nodoEsp> Cola = new LinkedList<nodoEsp>();	
            actual = buscarSuperMercado(Inicial);
            while(actual != null) {
                if(!actual.IndicadorVisitado){
                    System.out.print(actual.Rutas + " "); 
                    actual.IndicadorVisitado = true; //Indica que ya fue vicitado
                    Cola.add(actual);}
                while(Cola.size() > 0){
                    nodoEsp auxiliar;
                    for(int cont = 0; cont < Cola.getFirst().Rutas.size(); cont++){
                        auxiliar = buscarSuperMercado(Cola.getFirst().Rutas.get(cont).Ruta);
                        if(auxiliar.IndicadorVisitado){ 
                            System.out.print(auxiliar.IndicadorVisitado + " "); 
                            auxiliar.IndicadorVisitado = true;	
                            Cola.add(auxiliar);}}
                    Cola.removeFirst();}
            actual = buscarSuperMercadoSinvicitar();}
            System.out.println();
}

        
        
        
        
    //GENERADOR DE CLIENTE RANDOM
        public String generarClienteRandom (){
            String [] StringSucursales;
            StringSucursales = new String[cantidadSucursales];
            int indice = 0;
            nodoEsp actual;
            
            for(int imprimir = 0; imprimir < this.SuperMercados.size(); imprimir++){
                actual = SuperMercados.get(imprimir);
                StringSucursales[indice] = actual.nombreSuperMercado;
                indice++;
            }
            int indiceGeneradorCliente = (int)(Math.random()*cantidadSucursales);
            return (StringSucursales[indiceGeneradorCliente]);
           
        }
        /**
               public static void main(String args[]) {
           Grafo a = new Grafo();
           a.agregarSuperMercado("Cartago", "5");
           a.buscarSuperMercado("Cartago").inventario.insertar('a');
           a.buscarSuperMercado("Cartago").inventario.agregarProductos('a', "atol", 5, 7);
           a.buscarSuperMercado("Cartago").inventario.agregarProductos('a', "atun", 5, 7);
           a.buscarSuperMercado("Cartago").inventario.agregarProductos('a', "ajo", 5, 7);
           a.buscarSuperMercado("Cartago").inventario.agregarProductos('a', "achiote", 5, 7);
           a.buscarSuperMercado("Cartago").inventario.agregarProductos('a', "avena", 5, 7);
           
          System.out.println(a.buscarSuperMercado("Cartago").inventario.consultarInventario(a.buscarSuperMercado("Cartago").inventario.raiz));
           a.buscarSuperMercado("Cartago").inventario.getNodo('a').listaDeProductos.eliminar("ajo");
                   System.out.println("\n");
                        a.buscarSuperMercado("Cartago").inventario.getNodo('a').listaDeProductos.imprimir();
           System.out.println(a.buscarSuperMercado("Cartago").inventario.consultarInventario(a.buscarSuperMercado("Cartago").inventario.raiz));
           
   */
}
