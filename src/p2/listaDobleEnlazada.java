package p2;

//Prueba
public class listaDobleEnlazada {
    public nodo  primero;
    public nodo  ultimo;
    public int   tamaño;
    public String tab = "\t";
    public String enter = "\n";
        
    //Constructor
    public listaDobleEnlazada(){
        primero=ultimo=null;
        tamaño=0;
    }
        
    public class nodo{
       public String nombreProducto;
       public int cantidadProducto;
       public int precioProducto;
       public nodo anterior;
       public nodo siguiente;
         
       public nodo(String nombre, int cantidadProd, int precio){  
           nombreProducto= nombre;
           cantidadProducto = cantidadProd;
           precioProducto = precio;
           siguiente=null;
           anterior = null;
       }
       
       //Set clase nodo

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public void setCantidadProducto(int cantidadProducto) {
            this.cantidadProducto = cantidadProducto;
        }

        public void setPrecioProducto(int precioProducto) {
            this.precioProducto = precioProducto;
        }
       
    }
    
    // Metodos lista
    public void agregar(String nombre, int cantidadProd, int precio){
        nodo nuevo = new nodo(nombre, cantidadProd, precio);
        
         if(tamaño ==0){
            primero = ultimo = nuevo;
            tamaño++;
        }
       
         else{
            nuevo.anterior = ultimo;
            ultimo.siguiente=nuevo;
            ultimo = nuevo;
            tamaño ++;
        }
    }
//Elimina todo el nodo del producto
    public void eliminar (String producto){
        if (tamaño!= 0){
            if (tamaño == 1){
                primero = ultimo = null;
                tamaño = 0;
              
            }
            else{
                if (primero.nombreProducto == producto){
                    primero= primero.siguiente;
                    primero.anterior=null;
                }
                else if(ultimo.nombreProducto == producto){
                    ultimo = ultimo.anterior;
                    ultimo.siguiente= null;
                    
                }
                else{
                    nodo aux = primero;
                    while(aux.siguiente.nombreProducto != producto && aux != null){
                        aux = aux.siguiente;
                    }
                    if (aux.siguiente.nombreProducto == producto){
                        aux.siguiente.siguiente.anterior= aux;
                        aux.siguiente=aux.siguiente.siguiente;   
                    }
                }              
                tamaño --;
            }
        }
        else{
        System.out.println("No hay elementos");
        }
    }

    
//Elimina solo un producto en el nodo, es decir, disminuye el contador
    public void eliminarCantProduto (String producto, int cantidad){
        nodo actual= primero;
        
        if (tamaño == 0){
            System.out.println("Esta vacio" );
        }
        else{
            while (actual != null){
                if (actual.nombreProducto == producto){
                    if( actual.cantidadProducto >= cantidad){
                        if (actual.cantidadProducto == cantidad){
                            eliminar(producto);

                        }
                        else{
                            actual.setCantidadProducto(actual.cantidadProducto-cantidad);
                        }
                    }
                    else{
                        System.out.println("No hay producto suficiente" );
                    }
                }

                actual = actual.siguiente;
            }
        }
    }    

   public void imprimir(){
        nodo actual= primero;
        if (actual == null){
            System.out.println("Esta vacio" );
        }
        while(actual != null){
            System.out.println("------------------------------------------------");
            System.out.println("Producto: "+ actual.nombreProducto+", Precio Unitario: "+ actual.precioProducto+", Cantidad existente: "+ actual.cantidadProducto);
            System.out.println("                                                ");
            actual = actual.siguiente;
        }
   }
   
   //Funciones defectuosas
   public String retornarProductos(){
        String varProd = "";        
                
        nodo current= primero;
        
        if (current == null){
            System.out.println("Esta vacio" );
        }
        while(current != null){
           //Aqui el codigo esta loco se esta cayendo y no se sabe porque
            varProd= varProd + "Producto: "+current.nombreProducto +enter+tab+"Cantidad: "+ current.cantidadProducto+" unidades"+enter+tab+ "Precio Unitario: ₡"+current.precioProducto+ enter+enter;
            current = current.siguiente;
        }
        
        return varProd;
        
   }

   public nodo retornarNodo(){
        nodo informacionNodo=null;
               
        nodo actual= primero;
        
        if (actual == null){
            System.out.println("Esta vacio" );
        }
        while(actual != null){
            actual = actual.siguiente;
            return actual;
            
        }
        return null;
    }
}