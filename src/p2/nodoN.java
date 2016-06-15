//Esta es la lista de adyacencia donde se almacenan las rutas 

package p2;
public class nodoN{

 	public String Ruta;		//Ruta 
 	public int Distancia;           //Distgancia a recorrer desde punto "x" a puto "y"
        public int Tiempo;              //Tiempo entre punto "x" y punto "y"

//////////////Constructores/////////////////// 	
        
        public nodoN(){
            Ruta = null;
            Distancia = 0;
            Tiempo =0;
	}
////////////Constructor de Ruta///////////////
	public nodoN(String r, int d ,int t){
		this.Ruta = r;
		this.Distancia = d;
                this.Tiempo = t;
	}
   ////////////Lista de rutas//////////////
	public String listaRutas(){
		return "\n>>> Ruta = "+Ruta +"\n>>> Distancia a recorrer ="+Distancia+"\n>>> Tiempo de recorrido ="+Tiempo+" "+">>>";
	}

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

}
