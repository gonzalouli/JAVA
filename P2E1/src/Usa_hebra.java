import java.lang.*;

public class Usa_hebra {

	 
	  public static void main(String[] args) throws Exception ///módulo main
	  {   
	      hebra p = new hebra(10000, 0); ///constructor de objeto hebra con el paso de parametros
	      hebra q = new hebra(10000, 1); 	
	      ///empiezo de hebras
	      p.start();
	      q.start();
	      ///finalizacion de hebras
	      p.join(); 
	      q.join(); 
	      System.out.println(hebra.n); 
	      System.out.println(hebra.iter0); 
	      System.out.println(hebra.iter1);
	  } 
	
}
