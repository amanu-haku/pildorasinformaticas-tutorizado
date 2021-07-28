import java.util.Scanner;

public class Uso_Math {

	public static void main(String[] args) {
		// 
		
		Scanner entrada = new Scanner(System.in);
		
		//double numero;
		
		int numero, resultado1;
		
		
		// System.out.println(" Pi: " + Math.PI);
			
		System.out.println(" Vamos a averiguar la raíz cuadrada del número que des:");
		
		// numero = entrada.nextDouble();
		
		numero = entrada.nextInt();
		
		resultado1 = (int) Math.sqrt(numero);
		
		System.out.println("La raiz cuadrada de :" + numero + " es: " + resultado1);
		
		int redondeo = (int) Math.round(numero);
		
		System.out.println("El redondeo de: " + numero + " es: " + redondeo);
		
		
		

	}

}
