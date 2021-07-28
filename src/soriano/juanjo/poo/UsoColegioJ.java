package soriano.juanjo.poo;

public class UsoColegioJ {

	public static void main(String[] args) {
		// 
		
		ColegioJ SanJavier = new ColegioJ ("San Javier", 20);
		
		ColegioJ Cervantes = new ColegioJ ("Cervantes", 10);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		
		SanJavier.nuevoAlumno("Juan", 7);
		
		
		Cervantes.nuevoAlumno("Ana", 5);
		
		Cervantes.nuevoAlumno("Antonio", 6.5);
		
		
		Cervantes.expulsaAlumno("Antonio");
		
		Cervantes.setNotaMedia("Ana", 8.3);
		
		Cervantes.getTodosAlumnos();
		

	}

}
