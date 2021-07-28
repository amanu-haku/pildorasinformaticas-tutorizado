package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factor = 0, altura = Integer.parseInt(JOptionPane.showInputDialog(" Dame tu altura en cm "));
		
		String sexo = JOptionPane.showInputDialog(" Dame tu género: H / M ?");
		
		
		if ( sexo.equalsIgnoreCase("M") ) factor = 120;
		
		else if (sexo.equalsIgnoreCase("H")) factor = 110;
			
			
		System.out.println(" el peso ideal es: " + (altura - factor) );
		
		

	}

}
