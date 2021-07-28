 package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Condiciona_Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog(" Dame número de hijos "));
		
		// double hijos2 = Double.parseDouble(JOptionPane.showInputDialog(" Dame número de hijos "));
		
		switch (hijos) {
		
		case 0:
			
			System.out.println(" la natalidad es baja ");
			break;
		
		case 1:
			
			System.out.println(" buen inicio ");
			break;
			
		case 2:
			
			System.out.println(" buena pareja ");
			break;
			
		case 3:
			
			System.out.println(" ya van 3 ");
			break;
			
		default:
			
			System.out.println(" eso ya es familia numerosa !!! ");
			break;
 
 
		}

	}

}
