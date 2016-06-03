package p2;

import java.util.*;

public class Grafo{
	public LinkedList <nodoEsp> SuperMercados;  //Lista de Supermercados


	//Constructor del grafo
	public Grafo(){
            this.SuperMercados = new LinkedList<nodoEsp>();
	}

	//Método para agregar un vértice al grafo
	public void agregarSuperMercado(String s){
            SuperMercados.add(new nodoEsp(s));  
	}

	//Método para agregar una arista al grafo
	public void agregarRutas(String Inicio, String Final, int Distancia, int Tiempo){
            buscarSuperMercado(Inicio).Rutas.add(new nodoN(Final, Distancia ,Tiempo));  
	}

	//Método para buscar un vértice en la lista de vertices del grafo según el dato indicado
	public nodoEsp buscarSuperMercado(String s){
            for(int cont = 0; cont < this.SuperMercados.size(); cont++){
                if(this.SuperMercados.get(cont).SuperM == s)  
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
                if(!this.SuperMercados.get(buscador).Indicador ){ 
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
                System.out.println(">>> Super Mercado : "+actual.SuperM);
                for(int ruta = 0; ruta < actual.Rutas.size(); ruta++){
                        System.out.println("\n>>> Super Mercado :"+actual.SuperM+ "\n>>> Con destino a : "+actual.Rutas.get(ruta).Ruta + "\n>>> Con distancia de : "+actual.Rutas.get(ruta).Distancia+"Km"+"\n>>> Con una  Duracion de : " + actual.Rutas.get(ruta).Tiempo+"min");
                }
            }
	}


	//Para eliminar un Super Mercado y sus  Rutas
	public void eliminarSuperMercado(String s){
            this.SuperMercados.remove(buscarSuperMercado(s)); 
            for(int i = 0; i < SuperMercados.size(); i++)
                eliminarRutas(SuperMercados.get(i).SuperM, s);
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
			if(!actual.Indicador){
				System.out.print(actual.SuperM + " "); 
				actual.Indicador = true;
			}
			for(int prof = 0; prof < actual.Rutas.size(); prof++){
				if(! buscarSuperMercado(actual.Rutas.get(prof).Ruta).Indicador) 
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
                if(!actual.Indicador){
                    System.out.print(actual.Rutas + " "); 
                    actual.Indicador = true; //Indica que ya fue vicitado
                    Cola.add(actual);}
               
                for(int anch = 0; anch < actual.Rutas.size(); anch++){
                    if(!buscarSuperMercado(actual.Rutas.get(anch).Ruta).Indicador){
                        System.out.print(actual.Rutas.get(anch).Ruta + " ");  
                        Cola.add(buscarSuperMercado(actual.Rutas.get(anch).Ruta)); 
                        buscarSuperMercado(actual.Rutas.get(anch).Ruta).Indicador = true;  
                    }
                }
                while(Cola.size() > 0){
                    nodoEsp auxiliar;
                    for(int cont = 0; cont < Cola.getFirst().Rutas.size(); cont++){
                        auxiliar = buscarSuperMercado(Cola.getFirst().Rutas.get(cont).Ruta);
                        if(auxiliar.Indicador){ 
                            System.out.print(auxiliar.Indicador + " "); 
                            auxiliar.Indicador = true;	
                            Cola.add(auxiliar);}}
                    Cola.removeFirst();}
            actual = buscarSuperMercadoSinvicitar();}
            System.out.println();
    }}
