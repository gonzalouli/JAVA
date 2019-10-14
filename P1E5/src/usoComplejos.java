import java.util.Scanner;

public class usoComplejos {
	
	
	
	public static void main(String[] args) {
		int op = 0;	
		Scanner sc=new Scanner(System.in);
		
		do {
			complejos resultado = new complejos(0,0);
			double complex;
			double realx;
		
		System.out.println("Dame los dos numeros complejos: ");
		

			
		System.out.print("Parte real 1: ");
		realx=sc.nextDouble();
		System.out.print("\nParte imaginaria 1: ");
		complex=sc.nextDouble();
		complejos num1 = new complejos(realx,complex);

		System.out.print("Parte real 2: ");
		realx=sc.nextDouble();
		System.out.print("\nParte imaginaria 2: ");
		complex=sc.nextDouble();
		complejos num2 = new complejos(realx,complex);

		System.out.println("1.Suma 2.Resta 3.Modulo 4.Producto 5.Cociente");
		op = sc.nextInt();
		
		System.out.println("El resultado es: ");
		
		switch(op) {
		case 1: 
			resultado=resultado.sumaComplejos(num1,num2);
			System.out.println(resultado.getreal()+"+"+resultado.getimaginario()+"i");
			break;
		case 2: 
			resultado=resultado.restaComplejos(num1, num2);
			System.out.println(resultado.getreal()+"+"+resultado.getimaginario()+"i");
			break;
		case 3:
			resultado=resultado.moduloComplejos(num1);
			System.out.println("El modulo del primer numero complejo es: "+resultado.getreal());
			break;
		case 4:
			resultado=resultado.productoComplejos(num1, num2);
			System.out.println(resultado.getreal()+"+"+resultado.getimaginario()+"i");
			break;
		case 5:
			resultado=resultado.cocienteComplejos(num1, num2);
			System.out.println(resultado.getreal()+"+"+resultado.getimaginario()+"i");
			break;
		default:
			System.out.println("Selecciona una opcion...");
			
		}
			
			
		}while(op!=0);

	}

}
