package soriano.juanjo.arrays;

import java.security.SecureRandom;

public class Ejercicio_copia_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dimension1 = 5, dimension2 = 3, valor_min = 1, valor_max = 20;
		
		int numeros[][] = new int[dimension1][dimension2];
		
		
		
		// llenado array con números aleatorios
		
		for (int i=0; i<dimension1; i++) {
			
			for (int j=0; j<dimension2; j++) {
				
				numeros[i][j] = 1 + (new SecureRandom().nextInt(valor_max));
				
				System.out.print(numeros [i] [j] + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		// clonamos array numeros
		
		int [][] numeros2 = numeros.clone();
		
		
		System.out.println("\n\n\n --- array numeros");
		
		for (int [] i:numeros) {
			
			for (int j:i) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println(" ");
		}
		
		numeros2[4][2] = 2222;  // aquí modificamos una posición del nuevo array
		
		System.out.println("\n\n numeros2[4][2] " + numeros2[4][2]);  // se muestra la posición
		
		
		System.out.println(" --- numeros: " + numeros.hashCode());
		
		for (int [] i:numeros) {
			
			for (int j:i) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println(" --- numeros2: " + numeros2.hashCode());
		
		for (int [] i:numeros2) {
			
			for (int j:i) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println(" ");
		}
		
		

	}

}
