package soriano.juanjo.poo;

import javax.swing.JOptionPane;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		
		
		
		// datos de la primera sucursal
		
		String num_sucursal = JOptionPane.showInputDialog("Dame numero de sucursal");
		
		String direccion = JOptionPane.showInputDialog("Dame direccion de envio");
		
		String ciudad = JOptionPane.showInputDialog("Dame ciudad de envio");
		
		Sucursal sucursal1 = new Sucursal(num_sucursal, direccion, ciudad);
		
		
		
		long ref_envio;
		
		double peso;
		
		String dni_remitente;
		
		byte prioridad_envio;
		
		
		// pedimos número de paquetes a enviar
		
		int paquetes_a_enviar = Integer.parseInt(JOptionPane.showInputDialog("Dame numero de paquetes a enviar"));
		
		Paquete [] array_paquetes = new Paquete[paquetes_a_enviar];
		
		
		
		for (int i=0; i<paquetes_a_enviar; i++) {  // en el bucle vamos a recoger los datos de los paquetes a enviar
			
			ref_envio = Long.parseLong(JOptionPane.showInputDialog("Dame Ref. envio"));
			
			dni_remitente = JOptionPane.showInputDialog("Dame DNI remitente");
			
			peso = Double.parseDouble(JOptionPane.showInputDialog("Dame peso paquete"));
			
			prioridad_envio = Byte.parseByte(JOptionPane.showInputDialog("Dame prioridad de envio (0 - baja, 1 - alta, 2 - urgente"));
			
			Paquete un_paquete = new Paquete(ref_envio, peso, dni_remitente, prioridad_envio);
			
			array_paquetes[i] = un_paquete;
			
			
		}
		
		// mostramos datos de la sucursal
		
		System.out.println("Núm. Sucursal: " + sucursal1.getNumSucursal());
		
		System.out.println("Direccón sucursal: " + sucursal1.getDireccion());
		
		System.out.println("Ciudad sucursal: " + sucursal1.getCiudad());
		
		
		// mostramos datos de los paquetes a enviar
		
		for (Paquete paquete:array_paquetes) {
			
			System.out.println(" - Ref: " + paquete.getPrioridadEnvio());
			
			System.out.println(" - Peso: " + paquete.getPeso());
			
			System.out.println(" - Prioridad: " + paquete.getPrioridadEnvio());
			
			System.out.println(" - Precio envío: " + sucursal1.setCalculaPrecio(paquete));
		}
		

	}

}
