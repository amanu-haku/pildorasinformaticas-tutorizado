package soriano.juanjo.poo;

public class Alumno {
	
	private String nombre_alumno;
	
	private double nota_media;
	
	private long alumnoId;
	
	
	private static long nextId=0;
	
	
	public Alumno(String nombre_alumno, double nota_media) {
		
		this.nombre_alumno = nombre_alumno;
		
		this.nota_media = nota_media;
		
		this.alumnoId = Alumno.getNextId();
		
	}
	
	public static long getNextId() {
		
		//++nextId;
		
		return nextId++;
		
	}
	
	public String getNombreAlumno() {
		
		return this.nombre_alumno;
		
	}
	
	public double getNotaMedia() {
		
		return this.nota_media;
		
	}
	
	public long getAlumnoId() {
		
		return this.alumnoId;
		
	}
	
	public String getTodosDatosAlumno() {
		
		return ("\n   - Nº Alumno:" + this.getAlumnoId() + "\n   - Id Alumno: " + this.getNombreAlumno() + "\n   - Nota Media: " + this.getNotaMedia());
		
	}
	
	public void setNota (double nota_media) {
		
		this.nota_media = nota_media;
		
	}
	
	
	
	
	
	

}
