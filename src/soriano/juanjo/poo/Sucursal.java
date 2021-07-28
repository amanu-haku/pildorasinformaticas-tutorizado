package soriano.juanjo.poo;

public class Sucursal {
	
	private String num_sucursal;
	
	private String direccion;
	
	private String ciudad;
	
	
	public Sucursal (String num_sucursal, String direccion, String ciudad) {
		
		this.num_sucursal = num_sucursal;
		
		this.direccion = direccion;
		
		this.ciudad = ciudad;
		
	}
	
	public String getNumSucursal() {
		
		return this.num_sucursal;
		
	}
	
	public String getDireccion() {
		
		return this.direccion;
		
	}
	
	public String getCiudad() {
		
		return this.ciudad;
		
	}
	
	public double setCalculaPrecio (Paquete unpaquete) {
		
		int incremento=0;
		
		switch (unpaquete.getPrioridadEnvio()) {
		
			
			case 1:
				
				incremento = 10;
				
				break;
				
			case 2:
				
				incremento = 20;
				
				break;
		
		}
		
		return (unpaquete.getPeso() * 1.2 ) + incremento;
		
		
	}
		

}
