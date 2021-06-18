package src.tablero;

public class Damas{
	int [][] tabla = new int [8][8];
	public static void main(String[] args) {
		Damas tablero = new Damas();
	}

	

	public Damas(){
		
		llenartabla();
		imprimirtabla();
		System.out.print("\n\n");
		pintartabla();
	}

	public void llenartabla(){
		for(int i = 0; i < tabla.length ; i++){
			for(int j = 0; j<tabla.length; j++){
				tabla[i][j]= 0;
			}
		}
	}

	public void imprimirtabla(){
		for (int i = 0 ; i<tabla.length;i++){
			for (int j = 0 ; j<tabla.length ; j++){
				System.out.print(negroRojo+tabla[j][i] + " "+reset);
			}
			System.out.println();
		}	
	}

    String blancoRojo = "\033[47;31m";
    String reset ="\033[0m";
    String negroRojo = "\033[40;31m";
    String fBlanco = "\033[47;37m";
    String fNegro = "\033[40;30m";
    String negroBlanco= "\033[40;37m";
	String celeste = "\033[36m";
	String blancoNegro= "\033[37;40m";
	String fGris = "\033[47m";

	
    
	public void pintartabla(){
		System.out.println("----------------------");
		System.out.println("|     TABLERO         |");
		System.out.println("----------------------\n");
		System.out.println(" a   b  c d  e  f  g  h");
		System.out.println(negroRojo+"8"+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+reset+""+negroRojo+"1");
		System.out.println(negroRojo+"7"+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+negroRojo+" O "+fBlanco+" O "+reset+""+negroRojo+"2");
		System.out.println(negroRojo+"6"+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+reset+""+negroRojo+"3");
		System.out.println(negroRojo+"5"+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+reset+""+negroRojo+"4");
		System.out.println(negroRojo+"4"+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+reset+""+negroRojo+"5");
		System.out.println(negroRojo+"3"+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+fNegro+" O "+fBlanco+" O "+reset+""+negroRojo+"6");
		System.out.println(negroRojo+"2"+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+reset+""+negroRojo+"7");
		System.out.println(negroRojo+"1"+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+negroBlanco+" O "+fBlanco+" O "+reset+""+negroRojo+"8"+reset);
		System.out.println(negroRojo+""+reset+" a   b  c d  e  f  g  h");
	}
	

}