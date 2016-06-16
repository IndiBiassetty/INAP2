package p2;
import p2.*;

public class ABB {
    public Nodo_Arbol raiz;                      //raiz del 
    public String tab = "\t";
    public String enter = "\n";
    public String varTexto = "";
    public int tamañoArbol = 0;
    
    // Constructor de un arbol vacio
    public ABB() {                             //construye
        raiz = null;
    }

    public boolean esVacio(){           //metodo para saber si arbol esta vacio {
        boolean vacio = true;              //salidas booleano
        if ( raiz != null ){
            vacio = false;
        }
        return vacio;
    }

    public void insertar(char c)               //entrada: char
    {                                          //si arbol esta vacio inserta en raiz
        if(esVacio())                           
        {
            raiz = new Nodo_Arbol(c);
        }
        else
        {
            Nodo_Arbol padre = raiz;
            Nodo_Arbol pivote= raiz;             //sino crea pivote y un padre del pivote
            while(pivote != null)                //ubica posicion del char
            {
                if((int)c != (int)pivote.dato) 
                {
                    
                    if ((int)c > (int)pivote.dato)       //si char mayor que pivote va a a la derecha sino a la izquierda
                    {
                        pivote=pivote.derecho;
                    }
                    else
                    {
                        pivote=pivote.izquierdo;
                    }
                    if(pivote != null)          //ubica el padre del pivote
                    {
                        padre = pivote;
                    }
                }
                
                else                   //dato de pivote igual a char
                {
                    break;
                }
            }  
            if (pivote == null)
            {
               
                Nodo_Arbol nuevo = new Nodo_Arbol(c);    //lugar donde se crea la nueva hoja
                if((int)c > (int)padre.dato)             //ubica la zona donde se ubica la hoja, der o iz
                {
                    padre.derecho = nuevo;
                }
                else
                {
                    padre.izquierdo = nuevo;
                }
            }
        }
        tamañoArbol++;
    }

    public boolean buscarSiExiste(char x)        //Agarra un char y lo revisa en arbol para ver si esta o no
    {
        boolean existe = false;
        if(!esVacio())
        {
            Nodo_Arbol pivote = raiz;
            while(pivote != null)
            {
                if((int)x != (int)pivote.dato)
                {
                    if((int)x > (int)pivote.dato)
                    {
                        pivote = pivote.derecho;
                    }
                    else
                    {
                        pivote = pivote.izquierdo;
                    }
                }
                else
                {
                    existe = true;
                    break;
                }
            }
        }

        return existe;
    }

    public Nodo_Arbol getNodo(char x)           //devuelve un nodo del arbol
    {                                            //se ingresa variable y la busca para ser devuelta
        Nodo_Arbol N = null;
        if(!esVacio())
        {
            if(buscarSiExiste(x)){
                
                Nodo_Arbol pivote = raiz;
                
                while(pivote.dato != x){
                    if((int)x > (int)pivote.dato)
                    {
                        pivote = pivote.derecho;
                    }
                    else
                    {
                       pivote = pivote.izquierdo; 
                    }
                }
                N = pivote;
                
            }
            
        }
        return N;
    }
    public Nodo_Arbol buscarMin(Nodo_Arbol inicio)       //busca la hoja con el valor menor de un sub arbol
    {
        Nodo_Arbol min = null;
        if(inicio != null)
        {
            Nodo_Arbol pivote = inicio;
            while(pivote.izquierdo != null)
            {
                pivote = pivote.izquierdo;
            }
            min = pivote;
        }
        return min;
    }
    public char buscarMin(char x)         //busca el minimo total del arbol
    {
        char min;
        if(raiz != null)
        {
            Nodo_Arbol pivote = raiz;
            while (pivote.izquierdo != null)
            {
                pivote = pivote.izquierdo; 
            }
            min=pivote.dato;
        }
        else
        {
            min = 63;//ASCII de ? si no lo encuentra 
        }
        return min;  
    }

    private boolean esHoja(char x)   //booleando que devuelve si el nodo donde esta el char es hoja o no
    {
        boolean hoja = false;
        if(!esVacio())
        {
           if(buscarSiExiste(x))
            {
                Nodo_Arbol pivote = raiz;
                while(pivote.dato != x)
                {
                    if((int)x > (int)pivote.dato)
                    {
                        pivote = pivote.derecho;
                    }
                    else
                    {
                        pivote = pivote.izquierdo;
                    }
                }
                if(pivote.derecho == null && pivote.izquierdo == null)    //linea donde se sabe si es hoja o no
                {
                    hoja = true;
                }
            }
            else
            {
                System.out.println("No existe");
            }
        }
        else
        {
            System.out.println("El arbol esta vacio");
        }
        return hoja;
    }

    public void eliminar(char x)    //elimina el nodo que contiene al char, de existir el mismo
    {
        if(!esVacio())
        {
            if(buscarSiExiste(x))   //busca si el char existe en el arbol
            {
                Nodo_Arbol padre = raiz;   //si existe crea pivote y padre de pivote
                Nodo_Arbol pivote = raiz;
                while(pivote.dato != x)      //ubica el pivote para que quede en el nodo donde esta el char
                {
                    if((int)x > (int)pivote.dato)
                    {
                        pivote = pivote.derecho;
                    }
                    else
                    {
                        pivote = pivote.izquierdo;
                    }
                    if(pivote.dato != x)
                    {
                        padre = pivote;         //ubica al padre, lo coloca por encima de pivote
                    }
                }
                if(pivote.izquierdo != null && pivote.derecho != null) //caso donde tiene dos hijos, caso complejo
                {
                    Nodo_Arbol AUX = pivote.derecho;
                    Nodo_Arbol padre_de_AUX = pivote.derecho;
                    while(AUX.izquierdo != null)
                    {
                        AUX = AUX.izquierdo;
                        if(AUX.izquierdo != null)
                        {
                           padre_de_AUX = AUX;
                        }
                    }
                    pivote.dato = AUX.dato;
                    padre_de_AUX.izquierdo = null;
                }
                else if(pivote.izquierdo != null ^ pivote.derecho != null)  //caso donde solo tiene un hijo
                {
                    if(pivote.izquierdo != null)
                    {
                        pivote.dato = pivote.izquierdo.dato;
                        pivote.izquierdo = null;
                    }
                    if(pivote.derecho != null)
                    {
                        pivote.dato = pivote.derecho.dato;
                        pivote.derecho = null;
                    }
                }
                else if(pivote.izquierdo == null && pivote.derecho == null)  //caso donde nodo es una hoja
                {
                    if(padre.izquierdo != null)
                    {
                        if(padre.izquierdo.dato == pivote.dato)
                        {
                            padre.izquierdo = null;
                        }
                    }
                    if(padre.derecho != null)
                    {
                        if(padre.derecho.dato == pivote.dato)
                        {
                            padre.derecho = null;
                        }
                    }
                }
            }
        }
        tamañoArbol--;
    }

    public void preOrden(Nodo_Arbol raiz)   //realiza recorrido en arbol de pre orden
    {
        if(raiz != null)
        {
            System.out.print(raiz.dato+" ");
            preOrden(raiz.izquierdo);
            preOrden(raiz.derecho);
        }
    }
    
    
    public String enOrden(Nodo_Arbol raiz){  //realiza recorrido en el arbol en orden
            if(raiz != null){
            enOrden(raiz.izquierdo);
            varTexto= varTexto+ (">>LETRA: "+raiz.dato+enter);
            if(raiz.listaDeProductos.tamaño != 0){
                varTexto= varTexto+ (raiz.listaDeProductos.retornarProductos());
            }
            enOrden(raiz.derecho);
        }
        return varTexto;
        
    }
     
    public void postOrden(Nodo_Arbol raiz)  //realiza recorrido en arbol en post orden
    {
        if(raiz != null)
        {
            postOrden(raiz.izquierdo);
            postOrden(raiz.derecho);
            System.out.print(raiz.dato+" ");
        }
    }
    
    public void agregarProductos(char nodoProducto,String nombre, int cantidadProd, int precio){
        // se ocupa un metodo que busque el nodo que ocupo
        Nodo_Arbol auxiliar = getNodo(nodoProducto);
        auxiliar.listaDeProductos.agregar(nombre, cantidadProd, precio);
    }
    
    //Funciones defectuosas
    public String consultarInventario (Nodo_Arbol raiz){
        varTexto = "";
        enOrden(raiz);
        System.out.println(varTexto);
        return varTexto;
    }

    
}
