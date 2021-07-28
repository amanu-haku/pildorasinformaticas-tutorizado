package soriano.juanjo.poo;

public class ColegioJ {
	
	
	private String nombre;
	
	private AlumnoJ arrayAlumnos[];
	
	private int posicionArray = 0;
	
	
	public ColegioJ(String nombre, int numAlumnos) {
		
		this.nombre = nombre ;
		
		arrayAlumnos = new AlumnoJ[numAlumnos];
		
	}
	
	public String getNombreColegio() {
		
		return this.nombre;
		
	}
	
	private AlumnoJ getAlumno(int nAlumno) {
		
		return arrayAlumnos[nAlumno];
		
	}
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		
		AlumnoJ nuevoAlumno = new AlumnoJ (this, nombreAlumno, notaAlumno);
		
		arrayAlumnos[posicionArray] = nuevoAlumno;
		
		posicionArray++;
		
	}
	
	public void expulsaAlumno(String nombreAlumno) {
		
		for (int i=0; i<arrayAlumnos.length; i++) {
			
			if (this.getAlumno(i) != null) {
				
				if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					arrayAlumnos[i] = null;
				}
			}
		}
		
	}
	
	public void setNotaMedia (String nombreAlumno, double nuevaNotaMedia) {
		
		for (int i=0; i<arrayAlumnos.length; i++) {
			
			if (this.getAlumno(i) != null ) {
				
				if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				}
			}
		}
	}
	
	public void getTodosAlumnos() { 
		
		for (int i = 0; i < arrayAlumnos.length; i++) {
			
			if (this.getAlumno(i) != null) {
				
				System.out.println(this.getAlumno(i) + "\n\n");
				
			}
			
		}
		
	}

}
