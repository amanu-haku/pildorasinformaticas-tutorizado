package soriano.juanjo.poo;

public class AlumnoJ {
	
	
	private ColegioJ nombreColegio;
	
	private String nombreAlumno;
	
	private double notaMedia;
	
	private static int numeroAlumno=1;
	
	private int nAlumno;
	
	
	public AlumnoJ(ColegioJ nombreColegio, String nombreAlumno, double notaMedia) {
		
		this.nombreColegio = nombreColegio;
		
		this.nombreAlumno = nombreAlumno;
		
		this.notaMedia = notaMedia;
		
		nAlumno = numeroAlumno;
		
		numeroAlumno++;
		
	}
	
	public void setNotaMedia(double notaMedia) {
		
		this.notaMedia = notaMedia;
		
	}
	
	public String toString() {
		
		return "\n Nombre alumno: " + nombreAlumno + "\n Colegio: " + this.getNombreColegioAlumno() + "\n Nº alumno: " + nAlumno + "\n Nota media: " + notaMedia;
		
	}
	
	private String getNombreColegioAlumno() {
		
		return this.nombreColegio.getNombreColegio();
		
	}
	
	public String getNombreAlumno() {
		
		return nombreAlumno;
		
	}
	
	

}
