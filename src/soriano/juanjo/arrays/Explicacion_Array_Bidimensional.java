package soriano.juanjo.arrays;

import java.security.SecureRandom;

public class Explicacion_Array_Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[][] = new int[5][3];
		
		int numeros2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		
		
		// con bucle for		
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<3; j++) {
				
				numeros[i][j] = 1 + (new SecureRandom().nextInt(20));
				
				System.out.println(" numeros[" + i + "]" + "[" + j + "] = " + numeros [i] [j]);
				
			}
		}
		
		// con bucle for-each
		
		for (int [] dimension1:numeros) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		// copia de arrays
		
		int [][] copia_array = numeros;  // aquí creamos una copia por referencia, dos variables apuntan al mismo sitio
		
		System.out.println(" copia_array ");  // aquí mostramos
		
		for (int [] dimension1:copia_array) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		copia_array[4][2] = 1111;  // aquí modificamos una posición
		
		System.out.println(" copia_array[4][2] " + copia_array[4][2]);  // se muestra la posición
		
		
		System.out.println(" --- array numeros");
		
		for (int [] dimension1:numeros) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		// copia de arrays
		
		
		System.out.println(" --- array copia_array ");
		
		for (int [] dimension1:copia_array) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		// lo que hay que hacer realmente para copiar un array
		
		int [][] verdadera_copia_array = numeros.clone();
		
		
		// para probarlo vamos a modificar nuevamente una posición del verdadera_copia_array y mostrar los 2 arrays
		
		System.out.println("\n\n\n --- array numeros");
		
		for (int [] dimension1:numeros) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		verdadera_copia_array[4][2] = 2222;  // aquí modificamos una posición
		
		System.out.println("\n\n verdadera_copia_array[4][2] " + verdadera_copia_array[4][2]);  // se muestra la posición
		
		
		System.out.println(" --- array numeros: " + numeros.hashCode());
		
		for (int [] dimension1:numeros) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println(" --- array verdadera_copia_array: " + verdadera_copia_array.hashCode());
		
		for (int [] dimension3:verdadera_copia_array) {
			
			for (int dimension4:dimension3) {
				
				System.out.print(dimension4 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		// utilizando System.arraycopy
		
		int [][] tercera_copia_array = new int[5][3];
		
		System.arraycopy(numeros, 0, tercera_copia_array, 0, numeros.length);
		
		
		tercera_copia_array[4][2] = 3333;  // aquí modificamos una posición
		
		System.out.println("\n\n tercera_copia_array[4][2] " + tercera_copia_array[4][2]);  // se muestra la posición
		
		
		System.out.println("\n\n --- array numeros: "  + numeros.hashCode());
		
		for (int [] dimension1:numeros) {
			
			for (int dimension2:dimension1) {
				
				System.out.print(dimension2 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println("\n\n --- array tercera_copia_array: " + tercera_copia_array.hashCode());
		
		for (int [] dimension3:tercera_copia_array) {
			
			for (int dimension4:dimension3) {
				
				System.out.print(dimension4 + " ");
				
			}
			
			System.out.println(" ");
		}
		
		
		
	}

}
