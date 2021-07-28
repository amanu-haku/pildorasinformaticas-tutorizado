package soriano.juanjo.arrays;

import java.security.SecureRandom;

public class Ejercicio_Copia_Array_Una_Dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dimension1 = 5, valor_min = 1, valor_max = 20;
		
		int numeros[] = new int[dimension1];
		
		// llenado array con números aleatorios
		
				
					
		for (int j=0; j<dimension1; j++) {
			
			numeros[j] = 1 + (new SecureRandom().nextInt(valor_max));
			
			System.out.print(numeros[j] + " ");
			
		}
		
		System.out.println(" ");
		
		
		// clonamos array numeros
		
		int [] numeros2 = numeros.clone();
		
		
		System.out.println("\n\n\n --- numeros: " + numeros.hashCode());
		
		for (int j:numeros) {  // mostramos el array numeros
			
			System.out.print(j + " ");
			
		}
		
		System.out.println(" ");
	
	
		numeros2[4] = 2222;  // aquí modificamos una posición del nuevo array
		
		System.out.println("\n\n numeros2[4] " + numeros2[4]);  // se muestra la posición
		
		System.out.println(" --- numeros2: " + numeros.hashCode());
		
		for (int j:numeros2) {  // mostramos el array numeros2
			
			System.out.print(j + " ");
			
		}
		
		System.out.println("\n\n\n --- numeros: " + numeros.hashCode());
		
		for (int j:numeros) {  // mostramos el array numeros
			
			System.out.print(j + " ");
			
		}
	
				

	}

}
