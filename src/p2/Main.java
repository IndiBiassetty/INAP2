package arboles_ordenamiento;



public class Main
{
    public static void main(String[] args) {
        ABB arbol = new ABB();
        /*
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(10);
        arbol.insertar(2);
        arbol.insertar(8);
        arbol.insertar(15);
        arbol.insertar(9);

        //System.out.println("Mostrando por niveles:");
        //arbol.porNivel();

        arbol.eliminar(11);
        //System.out.println("Mostrando en preorden:");
        //arbol.preOrden();
        arbol.eliminar(6);
        arbol.eliminar(1);
        arbol.eliminar(10);
        System.out.println("Mostrando en postorden (eliminado 6):");
        arbol.preOrden();
        System.out.println("Mostrando por niveles:");
        arbol.porNivel();
        */
        
        arbol.insertar('g');
        arbol.insertar('d');
        arbol.insertar('k');
        arbol.insertar('b');
        arbol.insertar('i');
        arbol.insertar('n');
        arbol.insertar('c');
        arbol.insertar('f');
        arbol.insertar('m');
        arbol.insertar('j');
        arbol.insertar('o');
        arbol.insertar('e');
        arbol.insertar('a');
        arbol.insertar('p');
        
        
        System.out.println(arbol.esVacio());
        System.out.println(arbol.raiz.dato);
        System.out.println(arbol.raiz.izquierdo.dato);
        System.out.println(arbol.raiz.derecho.dato);
        System.out.println(arbol.raiz.derecho.derecho.dato);
        System.out.println("______________________________");
        arbol.enOrden(arbol.raiz);
        System.out.println("");
        System.out.println(arbol.buscarMin(arbol.raiz.derecho.derecho).dato);
        
        arbol.eliminar('k');
        arbol.enOrden(arbol.raiz);
        
        
    }

        
        
    
}