package soriano.juanjo.poo;

public class Vehiculos {
	
	private int ruedas;
	
	private String color;
	
	private int largo;
	
	private int ancho;
	
	private int peso;
	
	private boolean climatizador, tapiceria_cuero, gps;
	
	
	public Vehiculos(int ruedas) { // este es el constructor de la clase, mismo nombre que la clase
		
		this.ruedas = ruedas;
		
		largo = 2;
		
		ancho = 1;
		
		peso = 2;
		
		color = "sin color";
		
	}
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador=climatizador;
		
	}
	
	public void setExtra(boolean climatizador, boolean gps, boolean cuero) {
		
		this.climatizador = climatizador;
		
		this.gps = gps;
		
		this.tapiceria_cuero = cuero;
		
	}
	
	public String getExtra() {
		
		String mensaje;
		
		if (this.climatizador)
			
			mensaje = "Tu coche tiene climatizador";
		
		else 
			
			mensaje = "Tu coche NO tiene climatizador";
		
		if (this.gps)
			
			mensaje += " y tiene GPS";
		
		else
			
			mensaje += " y NO tiene GPS";
		
		if (this.tapiceria_cuero)
			
			mensaje += " y tiene Tapicería de Cuero";
		
		else
			
			mensaje += " y NO tiene Tapicería de Cuero";
		
		return mensaje;
		
	}
	
	public void setColor(String color) {  // método setter, establece valor de propiedad
		
		this.color = color;
		
	}
	
	public String getColor() {  // método getter, devuelve valor de propiedad
		
		return color;
				
	}
	
	public String getVehiculo() {
		
		return ("El vehículo tiene:" + "\n - ruedas: " + this.ruedas + "\n - color: " + this.color + "\n - largo: " + this.largo + "\n - ancho: " + this.ancho + "\n - peso: " + this.peso);
		
	}

}
