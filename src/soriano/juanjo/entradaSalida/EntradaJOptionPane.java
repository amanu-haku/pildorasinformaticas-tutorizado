package soriano.juanjo.entradaSalida;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = JOptionPane.showInputDialog(" Dame cadena: ");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" Dame edad: "));
		
		System.out.println(" la cadena es: " + cadena + " y la edad: " + edad);

	}

}
