package soriano.juanjo.poo;

public class UsoColegio {

	public static void main(String[] args) {
		
		// definimos un colegio y le asignamos un alumno
		
		Colegio colegio1 = new Colegio("C1", 10);
		
		Alumno alumno1 = new Alumno("C1-Alumno1", 9);
		
		colegio1.setNuevoAlumno(alumno1);

		
		// al colegio se le agrega el segundo alumno
		
		Alumno alumno3 = new Alumno("C1-Alumno2", 3);
		
		colegio1.setNuevoAlumno(alumno3);		
		
		colegio1.printAlumnosColegio(); // mostramos los alumnos del colegio
		
		
		Colegio colegio2 = new Colegio("C2", 10);  // creamos un segundo colegio
		
		Alumno alumno2 = new Alumno("C2-Alumno1", 6);

		colegio2.setNuevoAlumno(alumno2); // asignamos alumno al colegio
		
		colegio2.printAlumnosColegio(); // y mostramos los alumnos del colegio
		
		
		System.out.println(" \n *** Cambio nota media para un alumno ");
		
		colegio1.setNotaMedia(alumno3, 5.5); // cambiamos la nota a un alumno
		colegio1.printAlumnosColegio();
		
		
		
		// agregamos segundo alumno en colegio2
		
		Alumno alumno4 = new Alumno("C2-Alumno2", 8.3);

		colegio2.setNuevoAlumno(alumno4); // asignamos alumno al colegio
		
		colegio2.printAlumnosColegio(); // y mostramos los alumnos del colegio
		
		// vamos a eliminar el primer alumno del colegio2
		
		System.out.println(" \n *** vamos a eliminar el primer alumno del colegio2");
		
		colegio2.eliminaAlumno(alumno2);
		
		colegio2.printAlumnosColegio(); // y mostramos los alumnos del colegio
		

	}

}
