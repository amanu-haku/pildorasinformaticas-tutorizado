package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" Dame edad: "));
		
		boolean mayor_edad = false;
		
		if (edad >= 18) mayor_edad = true;
		
		
		if ( mayor_edad == true ) {
			
			String tienes_carnet = JOptionPane.showInputDialog(" Tienes carnet ? ");
			
			if (tienes_carnet.equals("si")) {
				
				System.out.println(" Puedes comprar un coche !");
				
				JOptionPane.showMessageDialog(null, " Puedes comprar un coche !");
				
			} else {
				
				JOptionPane.showMessageDialog(null, " NO Puedes comprar un coche !");
				
			}
			
		} else {
			
			JOptionPane.showMessageDialog(null, " NO Puedes tener carnet !");
			
		}
		

	}

}
