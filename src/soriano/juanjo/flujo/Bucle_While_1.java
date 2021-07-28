package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Bucle_While_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String password = "password";
		
		String clave = JOptionPane.showInputDialog(" Dame password");
		
		while ( ! clave.equals(password) ) {
			
			clave = JOptionPane.showInputDialog(" no es correcto, dame otra password");
			
		}
		
		System.out.println( " Acceso concedido !!! ");

	}

}
