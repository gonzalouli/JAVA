
public class sistemasolar {

	public static void main(String[] args) {
		System.out.println("Crea 4 objetos planetarios:");

			System.out.print("\nLUNA: ");
			cuerpoastrofisico luna =new cuerpoastrofisico(0, 0, null);
			luna.damedatos();
			
			
			System.out.print("\nSOL: ");
			cuerpoastrofisico sol =new cuerpoastrofisico(0, 0, null);
			sol.damedatos();

			System.out.print("\nTIERRA: ");
			cuerpoastrofisico tierra =new cuerpoastrofisico(0, 0, null);
			tierra.damedatos();
			
			System.out.print("\nMARTE: ");
			cuerpoastrofisico marte =new cuerpoastrofisico(0, 0, null);
			marte.damedatos();
			
			System.out.print("\nLUNA: ");

			luna.muestrodatos();
			System.out.print("\nSOL: ");

			sol.muestrodatos();
			System.out.print("\nTIERRA: ");

			tierra.muestrodatos();
			System.out.print("\nMARTE: ");

			marte.muestrodatos();
			
	}

	

	

}
