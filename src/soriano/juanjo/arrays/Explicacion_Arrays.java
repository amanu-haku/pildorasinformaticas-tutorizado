package soriano.juanjo.arrays;

public class Explicacion_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array de strings
		
		String mi_array_string[] = {"Juan", "María", "Antonio", "Laura"};
		
		for (String z:mi_array_string) {
			
			System.out.println("mi_array_string[]=" + z);
			
		}
		
		System.out.println("");
		
		System.out.println(mi_array_string[0]);
		
		int mi_array[] = new int[5];
		
		mi_array[0]=1;
		mi_array[1]=3;
		mi_array[2]=5;
		mi_array[3]=7;
		mi_array[4]=9;
		
		for (int x=0; x<mi_array.length; x++) {
			
			System.out.println("array[" + x + "]=" + mi_array[x]);
		}
		
		System.out.println("");
		
		
		int mi_array2[] = {2, 4, 6, 8, 10, 12, 14};
		
		for (int i=0 ; i<mi_array2.length; i++) {
			
			System.out.println("array2[" + i + "]=" + mi_array2[i]);
		}
		
		System.out.println("");
		
		// bucle for-each
		
		for (int j:mi_array2) {
			
			System.out.println("array2[" + j + "]=" + j);
			
		}
		
		

	}

}
