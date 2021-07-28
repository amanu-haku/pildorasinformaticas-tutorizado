package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Bucle_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, " Programa que cuenta los caracteres introducidos,\n introduce salir para fin ");
		
		String texto = "";
		
		do
		{
			texto = JOptionPane.showInputDialog(" Dame texto: ");
			
			JOptionPane.showMessageDialog(null, " El texto tiene " + texto.length() + " caracteres ");
			
		} while (! texto.equalsIgnoreCase("salir"));
			
		
		System.out.println(" Has salido del bucle ");	
				

	}

}
