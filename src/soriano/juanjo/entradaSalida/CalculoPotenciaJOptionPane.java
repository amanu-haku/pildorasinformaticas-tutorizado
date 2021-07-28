package soriano.juanjo.entradaSalida;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		/* Al ejecutar el programa nos debe pedir introducir dos valores numéricos utilizando una ventana de tipo showInputDialog:

			Una base
			Un exponente
		Una vez introducidos los dos valores, el programa mostrará en consola el resultado de elevar la base al exponente */
		
		System.out.println("Vamos a calcular una base elevada a un exponente");
		
		int base = Integer.parseInt(JOptionPane.showInputDialog(" Dame base: "));
		
		int exponente = Integer.parseInt(JOptionPane.showInputDialog(" Dame exponente: "));
		
		System.out.println(base + " elevado a " + exponente + " = " + Math.pow(base, exponente));

	}

}
