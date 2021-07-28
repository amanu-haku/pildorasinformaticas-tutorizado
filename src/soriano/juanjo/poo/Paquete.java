package soriano.juanjo.poo;

public class Paquete {
	
	private long referencia_envio;
	
	private double peso;
	
	private String dni_remitente;
	
	private byte prioridad_envio;
	
	
	public Paquete(long referencia_envio, double peso, String dni_remitente, byte prioridad_envio) {
		
		this.referencia_envio = referencia_envio;
		
		this.peso = peso;
		
		this.dni_remitente = dni_remitente;
		
		this.prioridad_envio = prioridad_envio;
		
	}
	
	public long getReferencia() {
		
		return this.referencia_envio;
	}
	
	public void setPeso(double peso) {
		
		this.peso = peso;
		
	}
	
	public void setPrioridadEnvio(byte prioridad) {
		
		this.prioridad_envio = prioridad;
		
	}
	
	public double getPeso() {
		
		return this.peso;
		
	}
	
	public byte getPrioridadEnvio() {
		
		return this.prioridad_envio;
		
	}
	
	

}
