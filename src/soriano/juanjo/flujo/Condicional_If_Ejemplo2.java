package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" Dame edad: "));
		
		if (edad < 18) {
			
			System.out.println(" Eres una persona muy joven");
			
		} else if (edad < 40 ){
			
			System.out.println(" Eres una persona joven");
			
		} else if (edad < 65 ) {
			
			System.out.println( "Eres una persona madura");
			
		} else {
			
			System.out.println( "Cuídate !");
		}

	}

}
