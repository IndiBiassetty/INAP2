package p2;

public class Main{



	public static void main(String args[]){
		Grafo g = new Grafo();


		
		g.agregarSuperMercado("a");
		g.agregarSuperMercado("b");
		g.agregarSuperMercado("c");
		g.agregarSuperMercado("d");
		g.agregarSuperMercado("f");

		g.agregarRutas("a","b",10,60);
		g.agregarRutas("a","c",20,120);
		g.agregarRutas("a","d",25,140);
		g.agregarRutas("a","f",14,60);
                
		g.agregarRutas("b","a",10,60);
		g.agregarRutas("b","c",16,80);
		g.agregarRutas("b","d",17,55);
		g.agregarRutas("b","f",17,60);
                
		g.agregarRutas("c","a",20,120);
		g.agregarRutas("c","b",16,80);
		g.agregarRutas("c","d",10,60);
		g.agregarRutas("c","f",10,60);
                
		g.agregarRutas("d","a",25,140);
		g.agregarRutas("d","b",17,55);
		g.agregarRutas("d","c",10,60);
	

		g.imprimeGrafo();
		g.recorridoProfundidad("a");
		g.recorridoAnchura("b");
                

	}


}