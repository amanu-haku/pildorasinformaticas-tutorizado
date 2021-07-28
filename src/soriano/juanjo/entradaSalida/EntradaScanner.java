package soriano.juanjo.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer número:");
		
		int num2 = sc.nextInt();
		
		System.out.println("Introduce cadena:");
		
		//System.out.println("Introduce primer número:");
		
		sc.nextLine();
		
		String nombre = sc.nextLine();
		
		
		
		//int num1 = sc.nextInt();
		
		
			
		
		System.out.println(" la cadena es: " + nombre + " número: " + num2);
		
		//System.out.println(" la suma es: " + (num1 + num2));
		
		sc.close();

	}

}
