package soriano.juanjo.flujo;

public class Bucle_For {

	public static void main(String[] args) {
		/*
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(" fila: " + i);
			
			if (i == 8 ) break;
			
		} */
		
		System.out.println( " Has salido del bucle ");
		
		for (int i=1; i<=10; i++) {
			
			System.out.print(" fila: " + i + "\n");
			
			for (int j=1; j<=10; j++) {
				
				System.out.print(j);
				
			}
			
			System.out.println("");
			
		}

	}

}
