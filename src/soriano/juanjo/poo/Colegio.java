package soriano.juanjo.poo;

public class Colegio {
	
	
	private String nombre_colegio;
	
	private Alumno arrayAlumnosColegio[];
	
	private int posicion_a_insertar= -1;
	
	
	public Colegio (String nombre_colegio, int plazas)
	{
		
		this.nombre_colegio = nombre_colegio;
		
		arrayAlumnosColegio = new Alumno[plazas];
		
		System.out.println("\n *** creado colegio: " + nombre_colegio + " \n plazas: " + plazas + "\n");
		
	}
	
	
	public void setNuevoAlumno(Alumno nuevo_alumno) {
		
		int posicion = this.getPosicionAInsertar();
		
//		System.out.println("\n posicion insercion : " + posicion);
		
		this.arrayAlumnosColegio[posicion] = nuevo_alumno;
		
	}
	
	
	public int getPosicionAInsertar () {
		
		return ++posicion_a_insertar;
		
	}
	
	public String getDatosAlumno (Alumno unAlumno) {
		
		return unAlumno.getTodosDatosAlumno();
		
	}
	
	public void printDatosAlumno (Alumno unAlumno) {
		
		System.out.println(unAlumno.getTodosDatosAlumno());
		
	}
	
	public void printAlumnosColegio () {
		
		System.out.println("\n\n - Colegio: " + this.nombre_colegio);
		
		
		int i=0;
		
		while (this.arrayAlumnosColegio[i] != null & (i < this.arrayAlumnosColegio.length)) {
			
			System.out.println("\n posicion array: " + i + "\n" + this.arrayAlumnosColegio[i].getTodosDatosAlumno());
			
			i++;
			
		}
		
	}
	
	public void setNotaMedia (Alumno alumno_a_modificar, double nueva_nota_media) {
		
		int posicion_del_alumno = this.searchAlumno(alumno_a_modificar);
				
		if (posicion_del_alumno != -1) {  // si alumno encotrado
			
			alumno_a_modificar.setNota(nueva_nota_media);
			
			this.arrayAlumnosColegio[posicion_del_alumno] = alumno_a_modificar;
			
		} else {
			
			System.out.println("\n alumno no encontrado ! ");
			
		}

		
	}
	
	public int searchAlumno (Alumno alumno_a_buscar) {
		
		int alumno_buscado = -1, i = 0;
		
		
		System.out.println("\n Buscando a alumno: " + alumno_a_buscar.getTodosDatosAlumno());
		
				
		while (this.arrayAlumnosColegio[i] != null & (i < this.arrayAlumnosColegio.length)) {
			
			if (this.arrayAlumnosColegio[i].getNombreAlumno().equals(alumno_a_buscar.getNombreAlumno())) {
				
				alumno_buscado = i;
				
				System.out.println("\n alumno encontrado: " + alumno_a_buscar.getTodosDatosAlumno());
				
				break ;  // condición para salir del bucle sin llegar al final del tamaño del array
				
			}

			i++;
			
		}
		
		return alumno_buscado;
		
	}
	
	public void eliminaAlumno (Alumno alumno_a_eliminar) {
		
		int posicion_alumno_buscado = this.searchAlumno(alumno_a_eliminar);
		
		if ( posicion_alumno_buscado != -1) {  // si se encuentra el alumno
			
			int i = posicion_alumno_buscado;
			
			while (this.arrayAlumnosColegio[i] != null & (i < this.arrayAlumnosColegio.length)) {
				
				this.arrayAlumnosColegio[i] = this.arrayAlumnosColegio[i + 1];
				
				i++;
				
			}
			

			
		} else System.out.println(" \n *** alumno no encontrado");
		
	}
	
}
