import java.util.Scanner;

public class ConcatenacionStrings {

	public static void main(String[] args) {
		// 
		
		double salario = 1850.55, salarioEnDolares=salario*1.2;
		
		System.out.println("El salario de Manuel es: " + salario + " hoy. \n Y en dolares:" + salarioEnDolares + "\n Y con complemento: " + (salario + 300));
		
		
		/* vamos a provocar un error en tiempo de ejecución.
		 * En el siguiente código si metemos un valor que no coincide on el tipo de dato de la variable provocará una excepciónd
		*/
		
		int edad;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		
		edad = entrada.nextInt();
		
		System.out.println(" tu edad es: " + edad);
		
		//System.out.println("PI: " + Math.PI5);
		

	}

}
