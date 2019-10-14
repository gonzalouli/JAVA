import java.util.Scanner;

public class newtonraphson {

	public static void main(String[] args) {
			
		 Scanner sc = new Scanner(System.in);
        
        System.out.println("Aproximación => ");
        double x0 = sc.nextDouble();
        
        System.out.println("Número de iteraciones:");
        int iter = sc.nextInt();
	        
		double xn = x0;
		double xn1;
		
		for(int i=0; i<iter;i++) {
			if(f(xn) != 0 ) {
				xn1=xn - (f(xn)/fp(xn));
				System.out.println("Iteracion: " + i + "    aproximacion: " +xn1);
				xn = xn1;
			}
		}
			
		System.out.println("Resultado : " + xn);
	}
	
	static float f(double xn) {
		return (float) (Math.cos(xn-1)-Math.pow(xn-1, 3));
		
	}
	
	static float fp(double xn) {
		return (float) (-Math.sin(xn-1)-3*Math.pow(xn-1, 2));
		
	}

}
