
public class hebra extends Thread{ ///extiende de la clase thread
		public static int iter0=0;
		public static int iter1=0;
	    private int tipoHilo; 
	    public static int n=0; //variable de clase 
	    private int nVueltas; 
	 
	    public hebra(int nVueltas, int tipoHilo) 
	    {this.nVueltas=nVueltas; this.tipoHilo=tipoHilo;} 
	 
	    public void run() ///método run de thread
	    { 
	      switch(tipoHilo){ 
	        case 0: for(int i=0; i<nVueltas; i++) {n++; iter0++;} break; 
	        case 1: for(int i=0; i<nVueltas; i++) {n--; iter1++;} break; 
	      } 
	 
	    } 
	
	 
	}
	
	
