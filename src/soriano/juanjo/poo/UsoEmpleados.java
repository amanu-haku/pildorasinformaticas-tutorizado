package soriano.juanjo.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1 = new Empleados("Ana");
		
		System.out.println(empleado1.getSeccion());
		
		empleado1.setSeccion("RRHH");
		
		System.out.println(empleado1.getSeccion());
		
		//empleado1.setNombre("Paco");
		
		System.out.println(empleado1.getSeccion());
		
		
		Empleados empleado2 = new Empleados("Marcos");
		
		System.out.println(empleado2.getSeccion());
		
		System.out.println(Empleados.getNextId());

	}
	
	

}

class Empleados {
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=2;
	
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		
		this.seccion = "Administracion";
		
		this.Id = IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	public String getSeccion() {
		
		return ("\n El empleado: " + nombre + ", pertenece a la sección: " + seccion + "\n con Id: " + Id);
		
	}
	
	public static String getNextId() {
		
		return ("\n El Id del siguiente empleado será: " + IdSiguiente);
		
	}
	
}
