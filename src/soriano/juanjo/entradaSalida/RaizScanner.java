package soriano.juanjo.entradaSalida;

import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		
		// calculo de raiz cuadrada de número introducido por consola
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Dame número y calcularé la raíz cuadrada: ");
		
		double numero = sc.nextDouble();
		
		System.out.println(" La raíz cuadrada de: " + numero + " es: " + Math.sqrt(numero));
		
		sc.close();
		

	}

}
