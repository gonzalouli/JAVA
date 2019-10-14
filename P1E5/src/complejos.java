
public class complejos {

	private double real;
	private double imaginario;
	
	public double getreal() {
		return this.real;
	}
	
	public double getimaginario() {
		return this.imaginario;
	}
	
	
	
	public complejos(double real,double imaginario) {
		this.real=real;
		this.imaginario=imaginario;
	}
	
	public complejos sumaComplejos(complejos numero1,complejos numero2) {
		
		complejos resultado =new complejos(0,0);
		
		resultado.real=numero1.real+numero2.real;
		resultado.imaginario=numero1.imaginario+numero2.imaginario;
		
		return resultado;
		
	}
	
	public complejos restaComplejos(complejos numero1,complejos numero2) {
		
		complejos resultado =new complejos(0,0);
		
		resultado.real=numero1.real-numero2.real;
		resultado.imaginario=numero1.imaginario-numero2.imaginario;
		
		return resultado;
		
	}
	
	public complejos moduloComplejos(complejos numero1) {
		
		complejos resultado =new complejos(0,0);
		
		resultado.real = (double) Math.sqrt(Math.pow(numero1.real, 2)+Math.pow(numero1.real, 2));
		
		return resultado;
		
	}
	
	public complejos productoComplejos(complejos numero1,complejos numero2) {
		
		complejos resultado =new complejos(0,0);
		
		resultado.real=numero1.real*numero2.real-numero1.imaginario*numero2.imaginario;
		resultado.imaginario=numero1.real*numero2.imaginario+numero1.imaginario*numero2.real;
		
		return resultado;
		
	}
	
	public complejos cocienteComplejos(complejos numero1,complejos numero2) {
		
		complejos resultado =new complejos(0,0);
		
		resultado.real=(numero1.real*numero2.real+numero1.imaginario*numero1.imaginario)/(Math.pow(numero2.real, 2)+Math.pow(numero2.imaginario, 2));
		resultado.imaginario=(numero1.imaginario*numero2.real - numero1.real*numero2.imaginario)/(Math.pow(numero2.real, 2)+Math.pow(numero2.imaginario, 2));
		
		return resultado;
		
	}


}
