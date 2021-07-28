
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Hoy es un buen día para estudiar el Curso de Java";
		
		int longitud = cadena.length();
		
		byte posicion = 14;
		
		System.out.println(" La cadena: " + cadena + ", tiene: " + cadena.length() + " caracteres");
		
		System.out.println(" el caracter " + posicion + " es " + cadena.charAt(posicion));
		
		System.out.println(" el último caracter es: " + cadena.charAt(longitud - 1));
		
		// explicacion video 13
		
		String frase = "No hay nada mejor que una buena comida";
		
		System.out.println(" De : " + frase + " \n extraemos cadena: " + frase.substring(0, 2));
		
		String palabra1= "Casa", palabra2 = "casa";
		
		System.out.println(palabra1 + " = " + palabra2 + " ? --> " + palabra1.equals(palabra2) );
		
		System.out.println(palabra1 + " = " + palabra2 + " ? --> " + palabra1.equalsIgnoreCase(palabra2) );
		
		// examen casting
		
		long num1 = 1;
		
		double num2;
		
		System.out.println("valor de num1 (long) : " + num1);
		
		num2 = (double) num1;
		
		System.out.println("valor de num2 (double): " + num2);
		
		/* charAt no devuelve String
		
		String nombre = "Angel";
		
		String segunda_posicion = nombre.charAt(0);
		
		*/ 
		
		

	}

}
