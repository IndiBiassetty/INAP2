package p2;

public class listaDobleEnlazada {
    public nodo  primero;
    public nodo  ultimo;
    public int   tamaño;
        
    //Constructor
    public listaDobleEnlazada(){
        primero=ultimo=null;
        tamaño=0;
    }
        
    public class nodo{
       public String dato;
       public nodo anterior;
       public nodo siguiente;
         
       public nodo(String info){  
           dato = info;
           siguiente=null;
           anterior = null;
       }
    }
    
    public void agregar(String info){
        nodo nuevo = new nodo(info);
        
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

    public void eliminar ( String elemento){
        if (tamaño!= 0){
            if (tamaño == 1){
                primero = ultimo = null;
                tamaño = 0;
              
            }
            else{
                if (primero.dato == elemento){
                    primero= primero.siguiente;
                    primero.anterior=null;
                }
                else if(ultimo.dato == elemento){
                    ultimo = ultimo.anterior;
                    ultimo.siguiente= null;
                    
                }
                else{
                    nodo aux = primero;
                    while(aux.siguiente.dato != elemento && aux != null){
                        aux = aux.siguiente;
                    }
                    if (aux.siguiente.dato == elemento){
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

   public void imprimir(){
        nodo actual= primero;
        if (actual == null){
            System.out.println("Esta vacio" );
        }
        while(actual != null){
            System.out.println("------------------------------------------------");
            System.out.println("Dato: "+ actual.dato);
            System.out.println("                                                ");
            actual = actual.siguiente;
        }

   }
   
   public static void main(String[] args) {
       listaDobleEnlazada t = new listaDobleEnlazada();
       t.agregar("A");
       t.agregar("B");
       t.imprimir();
       t.eliminar("B");
       t.eliminar("A");
       t.imprimir();
  

   }   
}
