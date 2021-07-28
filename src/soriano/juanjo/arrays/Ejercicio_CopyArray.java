package soriano.juanjo.arrays;

public class Ejercicio_CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        
        int[][] array1 = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};

        int[][] array2 = array1.clone();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("array2 position [" + i + "][" + j + "] : " + array2[i][j]);

            }
        }
        
        array2[3][1]=3333;
        
        System.out.println(" array1:" + array1.hashCode());
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("  [" + i + "][" + j + "] : " + array1[i][j]);

            }
            
            System.out.println(" ");
        }
        
        System.out.println(" array2:" + array2.hashCode());
        
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print("  [" + i + "][" + j + "] : " + array2[i][j]);

            }
            
            System.out.println(" ");
        }

    }

}


