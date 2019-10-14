import java.util.Random;
import java.util.Scanner;

public class estadistica {
	
	static int numeros[];
   	static int numElementos;

	  public static void main(String[] args){
		    

		    Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce la dimension del array: ");
	        int dim = sc.nextInt();
	       
	        numeros = new int[dim];
	        numElementos = numeros.length;
		  
	        inicializar();
	        
			System.out.println("1.Mediana 2.Moda 3.Varianza 4.DesviacionTipica");
			Scanner s = new Scanner(System.in);
			int elec = s.nextInt();
			
			
			
			switch(elec){
				case 1: System.out.println("La mediana es:"+calcularMediana());
				break;
				case 2: System.out.println("La moda es:"+calcularModa());
				break;
				case 3:  System.out.println("La varianza es:"+calcularVarianza());
				break;
				case 4: System.out.println("La desviacion tipica es:" + calcularDesviacion());
				break;
				default: System.out.println("Eleccion incorrecta");
				
					

			}

}
	  
	  private static void inicializar() {
			Random r = new Random();
			for (int i = 0; i < numElementos; i++) {
				numeros[i] = r.nextInt(100) + 1;
				System.out.println(r.nextInt(100) + 1);
			}
	  }

public static double calcularMediana(){
    double mediana;
    if(numElementos % 2 == 0){
        int sumaMedios = numeros[numElementos/2] + numeros[numElementos/2 - 1]; 
        mediana = (double)sumaMedios / 2; 
    } else {
        mediana = numeros[numElementos/2];
    }
    return mediana;
}



public static double calcularModa() {

    int maximoNumRepeticiones= 0;
    double moda= 0;

    for(int i=0; i<numeros.length; i++)
    {
        int numRepeticiones= 0;
        for(int j=0; j<numeros.length; j++)
        {
            if(numeros[i]==numeros[j])
            {
                numRepeticiones++;
            }   //fin if
            if(numRepeticiones>maximoNumRepeticiones)
            {
                moda= numeros[i];
                maximoNumRepeticiones= numRepeticiones;
            }   //fin if
        }
    }   
   return moda;
}

public static double calcularVarianza() {
	double acMedia = 0, acMedia2 = 0;
	for(int i=0;i<numElementos;i++) {
			acMedia = acMedia + numeros[i];
			acMedia2 = acMedia2 + numeros[i] * numeros[i];
			
	}
	double varianza = acMedia2 / (numElementos -1) - (acMedia * acMedia) / (numElementos * (numElementos - 1));
	
	return varianza;
	
}


public static double calcularDesviacion() {
	
	return Math.sqrt(calcularVarianza());
	

}
}