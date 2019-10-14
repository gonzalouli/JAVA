import java.util.Random;
import java.util.Scanner;
public class intDefinidaMonteCarlo {

	public static void main(String[] args) {
		
		
		Random rd = new Random();
		double exito = 0;
		double N = 1000000;
		double isx;
		double isy;
		
			for(long i=0;i< N;i++){
				
				
				isx = rd.nextDouble();
				isy = rd.nextDouble();
				///System.out.println(isx);
				///	System.out.println(isy);
				
				if(isy <= f(isx))
					exito++;			
			}
			
			System.out.println(exito);
			System.out.println(N);
			
double aprox = exito / N;		

System.out.printf("Integral aproximada: " + aprox );
	}
	
	static float f(double isx) {
		return (float) Math.sin(isx);
	}

}
