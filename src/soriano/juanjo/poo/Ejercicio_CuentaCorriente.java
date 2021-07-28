package soriano.juanjo.poo;

import java.util.Random;

public class Ejercicio_CuentaCorriente {
	
	private double saldo;
	
	private String nombreTitular;
	
	private long numeroCuenta;
	
	int min_val = 1, max_val = 100;
    
	
	public Ejercicio_CuentaCorriente(String nombreTitular, double saldo) {
		
		this.nombreTitular = nombreTitular;
		
		this.saldo = saldo;
		
		Random num_random = new Random();
		
		// this.numeroCuenta = (long) Math.floor(Math.random()*((max_val - min_val) +1 ) + min_val);
		
		this.numeroCuenta = Math.abs(num_random.nextLong());
		 
	}
	
	public void setIngreso (double ingreso) {
		
		this.saldo+=ingreso;
		
	}
	
	public void setReintegro (double reintegro) {
		
		this.saldo-=reintegro;
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
			
	}
	
	public String getDatosCuenta() {
		
		return ("\n - Datos cuenta: " + this.numeroCuenta + "\n - Titular: " + this.nombreTitular + "\n - Saldo: " + this.saldo);
		
	}
	
	public void setTransferencia(Ejercicio_CuentaCorriente destino, double valor_tx) {
		
		this.setReintegro(valor_tx);
		
		destino.setIngreso(valor_tx);
		
	}

}
