package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Factorial {

	public static void main(String[] args) {
		
		// factorial de un número dado por teclado
		
		int resultado=1, numero=Integer.parseInt(JOptionPane.showInputDialog(" dame número" ));
		
		for ( int i = numero; i>=1 ; i-- ) {
			
			resultado = resultado * i;
			
		}
		
		System.out.println( numero + "! = " + resultado);
		
		
		boolean valido=false;
		
		int num1 = 3, num2;
		
		
		// prueba con do - while
		
		do {
			
			num2 = Integer.parseInt(JOptionPane.showInputDialog(" dame número "));
			
			if ( num2 == num1 ) valido=true;
			
			System.out.println(num2 + "<>" + num1);
			
			
		} while (!valido);

	}

}
