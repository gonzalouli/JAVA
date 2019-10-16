import java.util.*;
///Secuencial
public class escalaVector {
	
	public static void main(String[] args) {
		
		double n =  Math.pow(10, 8);
		///int n = 1000;
		
		int[] vector;
		
		vector =new int[(int) n];
	
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=  (int) (Math.random()*10);
		}
		
		int[] vector2;
		
		vector2 =new int[(int) n];
		
		for(int i=0;i<vector.length;i++) {
			vector2[i]=vector[i]*100;


		}
		
		
	}

}
