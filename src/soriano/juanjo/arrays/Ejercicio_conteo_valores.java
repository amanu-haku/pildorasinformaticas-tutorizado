package soriano.juanjo.arrays;

import java.security.SecureRandom;
import java.util.Date;

public class Ejercicio_conteo_valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
        int longitud_array=100, min_val = 1, max_val = 100, num_random=0, positivos=0, negativos=0, cero=0, acumulado=0;
        
        int [] numeros = new int[longitud_array];
        
        
             
        SecureRandom rand = new SecureRandom();
        
        rand.setSeed(new Date().getTime());
        
        
        for (int i=0; i<longitud_array; i++) {
        	
        	num_random = rand.nextInt((max_val - min_val)) + min_val;
        	
        	numeros[i] = num_random;  // almacenamos en array
        	
        	// almacenamos valores para las posiciones pares
        	
        	if (i%2 !=0) acumulado = acumulado + num_random;
        	
        	// incrementamos los contadores
        	
        	if ( num_random > 0 ) {
        		
        		positivos++;
        		
        	} else if (num_random < 0){
        		
        		negativos++;
        		
        	} else if (num_random == 0){
        		
        		cero++;
        		
        	}
        	
        	//System.out.print(num_randomeros[i] + " ");
        	
        }
        
        System.out.println(" positivos: " + positivos + " negativos: " + negativos + " cero: " + cero);
        
        System.out.println(" media: " + acumulado + "/" + longitud_array/2 + " = " + acumulado / (longitud_array/2));
        
        
        // bucle for-each para recorrer el array
        
        for (int dimension1:numeros ) {
        	
        	System.out.print(dimension1 + " ");
        	
        }
        	

	}

}
