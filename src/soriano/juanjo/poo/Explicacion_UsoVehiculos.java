package soriano.juanjo.poo;

import javax.swing.JOptionPane;

public class Explicacion_UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculos micoche = new Vehiculos(3);
		
		System.out.println("El color INICIAL de mi nuevo coche es: " + micoche.getColor());
		
		// cambiamos el color del coche		
		
		micoche.setColor(JOptionPane.showInputDialog("Dame color del coche"));
		
		System.out.println("El color actual de mi nuevo coche es: " + micoche.getColor());
		
		Vehiculos moto1 = new Vehiculos(2);
		
		System.out.println(micoche.getVehiculo());
		
		Vehiculos cochePremium = new Vehiculos(4);
		
		cochePremium.setExtra(true);
		
		System.out.println(cochePremium.getExtra());
		
		
		
		

	}

}
