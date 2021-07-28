package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog(" Dame distantica al colegio en KM "));
		
		double renta_familiar = Double.parseDouble(JOptionPane.showInputDialog(" Dame renta familiar "));
		
		int hermanos_colegio = Integer.parseInt(JOptionPane.showInputDialog(" Dame hermanos en colegio "));
		
		if ( ((distancia_colegio > 10) && (renta_familiar < 20000)) || (hermanos_colegio > 2)) {
			
			System.out.println(" Tiene derecho a beca !");
			
		} else {
			
			System.out.println( " No tiene derecho a beca !");
		}

	}

}
