package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Bucle_For_Correo {

	public static void main(String[] args) {
		// 
		
		String direccion_correo, usuario, dominio;
		
		boolean correo_correcto = false;
		
		for (int i=0 ; i<=0 ; i-- ) {
			
			direccion_correo = JOptionPane.showInputDialog(" Dame dirección de correo válida ");
			
			usuario = direccion_correo.substring(0, direccion_correo.indexOf("@"));
			
			System.out.println(usuario);
			
			dominio = direccion_correo.substring(direccion_correo.indexOf("@") + 1, direccion_correo.length());
			
			if ( dominio.contains("@") ) { 
				
				correo_correcto = false; 
				
				System.out.println( direccion_correo + " dirección incorrecta, hay más de una @");
				
			} else if (dominio.contains(".")){			
							
				System.out.println(dominio);
				
				if (direccion_correo.length()<4) {
					
					correo_correcto = false;
					
					System.out.println( direccion_correo + " dirección incorrecta, menor de 4 carácteres");
				
				}
				
				else {
					
					correo_correcto = true;
					
					System.out.println( direccion_correo + " correo correcto !");
					
				}							
				
			} else {
				
				System.out.println(direccion_correo + " no tiene un .");
			}
			
						
			if (correo_correcto) break;
		}
			 

	}

}
