package soriano.juanjo.flujo;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Ejercicio_While_Numeros_Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int numeroAleatorio = 1 + (new SecureRandom().nextInt(11));	
		
		// System.out.println(numeroAleatorio);
		
		int contador = 1, numero = Integer.parseInt(JOptionPane.showInputDialog(" Dame número "));
		
		String mensaje;
		
		while (numero != numeroAleatorio) {
			
			mensaje = ( numero >= numeroAleatorio ) ? "mayor" : "menor" ;
			
			//System.out.println(" tu número: " + numero + " es "  + mensaje + " que el número aleatorio: " + numeroAleatorio);
			
			System.out.println(" tu número: " + numero + " es "  + mensaje + " que el número aleatorio: ");
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(" no has acertado, dame otro número "));	
			
			contador++;
			
		}
		
		if ( numero == numeroAleatorio ) System.out.println( " " + numero + " correcto, has acertado en " + contador + " intentos !!!");
		
		

	}

}
