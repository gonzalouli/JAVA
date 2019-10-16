
public class vectores implements Runnable{
	///ATRIBUTOS PRIVADOS
	public int ini; ///SEPARACION INICIAL
	public int fin;	///A DONDE LLEGA EL HILO
	public long vect[];	///NUEVO VECTOR DE ELEMENTOS MULTIPLICADOS POR K
	public long n;	///NUMEROS DE ELEMENTOS DEL VECTOR INICIAL (Y FINAL)
		
	public vectores(long n,int ini,int fin,long[] vector) {
		this.ini=ini;	///INSTANCIACION DE LOS ELEMENTOS DEL CONTRUCTOR
		this.fin=fin;
		this.n=n;
		vect = new long[(int) n]; ///PONEMOS EL TAMAÑO DEL VECTOR FINAL DE ENTEROS 

		
		for(int i=ini; i < fin;i++)	///RECORREMOS EL ENTERO PASADO POR EL CONSTRUCTOR Y LO INICIALIZAMOS EN EL DEL METODO
		{
			vect[i] = vector[i];	///PASAMOS UNO A UNO LOS ELEMENTOS...
		}
	}
	
	public void run() {///METODO RUN
		
		for(int i=ini;i<fin;i++) {
			vect[i]=vect[i]*10;	///PRODUCTO DE PARTE DEL VECTOR POR UN ENTERO K, EN ESTE CASO 10
			///System.out.print(" "+vect[i]);	///SE MUESTRA POR PANTALLA PARA PROBAR LA VALIDEZ
	}
	
	
}
}
