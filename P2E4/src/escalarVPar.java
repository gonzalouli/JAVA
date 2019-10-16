
public class escalarVPar {
	

	public static void main(String[] args) throws InterruptedException {
		long n = (long) Math.pow(10, 8);	///TAMAÑO DEL VECTOR DEL EJERCICIO, PONEMOS UNO DE EJEMPLO NO TAN GRANDE
		///int n=20; ///TAMAÑO DEL VECTOR PARA EL EJEMPLO
		long[] vector;
		vector = new long[(int) n];///INSTANCIACION DEL VECTOR
		

		for(int i=0;i<vector.length;i++) {
			vector[i]=  (int) (Math.random()*10); ///INICIALIZACION DEL VECTOR CON ELEMENTOS DESDE EL 0-10 ALEATORIOS DE EJEMPLO	
			///System.out.print("  "+vector[i]);
		}
		
		///System.out.print("\n");
		
		Runnable a = new vectores(n,0,vector.length/4,vector);  ///DAMOS A CADA OBJETO RUNNABLE UN CUARTO DEL VECTOR
		Runnable b = new vectores(n,vector.length/4,vector.length/2,vector);	
		Runnable c = new vectores(n,vector.length/2,vector.length*(3/4),vector);	
		Runnable d = new vectores(n,vector.length*(3/4),vector.length,vector);	

		
		Thread h1 = new Thread(a); ///CREAMOS LOS OBJETOS H1 Y H2 DE TIPO RUNNABLE
		Thread h2 = new Thread(b);
		Thread h3 = new Thread(b);
		Thread h4 = new Thread(b);

		
		long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
		  TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		
		h1.start();	///EMPEZAMOS H1 Y H2 (RUN())
		h2.start();
		h3.start();
		h4.start();
		
		h1.join();	///PARAMOS LA EJECUCION
		h2.join();
		h3.join();
		h4.join();
		
		TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		  tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
		  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
		
		
		
	}
	
	
	

}
