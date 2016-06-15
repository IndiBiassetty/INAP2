package p2;
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
//Agrega productos a la lista de inventario, 
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
    //Este se usa para cuando solo hay un producto disponible en el nodo
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
//Esta funcion imprime la lista
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
   //Esta funcion retorna los productos de un nodo de la lista
   public String retornarProductos(){
        String varProd = ""; 
        nodo current= primero;
        if (current == null){
            System.out.println("Esta vacio" );
        }
        while(current != null){
        //Aqui el codigo esta loco se esta cayendo y no se sabe porque
            varProd= varProd + "Producto: "+current.nombreProducto +enter+tab+"Cantidad: "+ current.cantidadProducto+" unidades"+enter+tab+ "Precio Unitario: ₡"+current.precioProducto+ enter+enter;
        //SE cae
            current = current.siguiente;
        }
        System.out.println(varProd+ " Aqui va retornar productos");
        return varProd; 
   }
        
//Funcion que retorna el nodo del arbol con toda la informacion
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
   
   public boolean existeProducto(String producto){
       nodo actual= primero;
       boolean bandera = false;
        while(actual != null ){
            System.out.println(actual.nombreProducto +"nombre del producto antes del if");
            System.out.println(producto +"antes del if");
            if(actual.nombreProducto.equals(producto)){
                System.out.println(actual.nombreProducto +" despues del if");
                bandera= true;  
            }
            actual = actual.siguiente;
        }
       return bandera; 
   }
}