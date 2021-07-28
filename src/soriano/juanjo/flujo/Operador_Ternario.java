package soriano.juanjo.flujo;

import javax.swing.JOptionPane;

public class Operador_Ternario {

	public static void main(String[] args) {
		/*
		
		double salario_mayor, salario1 = Double.parseDouble(JOptionPane.showInputDialog(" dame salario1 ")), salario2 = Double.parseDouble(JOptionPane.showInputDialog(" dame salario2 "));
		
		salario_mayor = (salario1 >= salario2) ? salario1 : salario2;
		
		System.out.println(" El salario mayor es: " + salario_mayor );
		
		*/
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" dame edad "));
		
		System.out.println( (edad >=18)?" Eres mayor de edad " : " Eres menor de edad ");
				

	}

}
