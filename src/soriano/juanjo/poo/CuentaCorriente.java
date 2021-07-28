package soriano.juanjo.poo;

import java.security.SecureRandom;
import java.util.Date;

public class CuentaCorriente {
	
	private final String nombreTitular;
	
	private double saldoInicial;
	
	private long numCC;
	
	SecureRandom rand = new SecureRandom();
    
    //rand.setSeed(new Date().getTime());
    
    
	
	
	public CuentaCorriente (String nombreTitular, double saldoInicial) {
		
		this.nombreTitular = nombreTitular;
		
		this.saldoInicial = saldoInicial;
		
		this.numCC = CuentaCorriente.getNewCC();
		
	}
	
	public static long getNewCC() {
		
		
        SecureRandom rand = new SecureRandom();
        rand.setSeed(new Date().getTime());        
        long randomNum = Math.abs(rand.nextLong());
        
        //System.out.println(randomNum);
        
        return randomNum;
	
	}
	
	public String getDatosCC() {
		
		return ("\n - Titular: " + this.nombreTitular + "\n - Saldo Inicial: " + this.saldoInicial + "\n - NumCC: " + this.numCC);
		
	}
	
	public void setIngreso(double valor_ingreso) {
		
		this.saldoInicial += valor_ingreso;
		
	}
	
	public void setReintegro(double valor_reintegro) {
		
		this.saldoInicial -= valor_reintegro;
		
	}
	
	public double getSaldo() {
		
		return this.saldoInicial;
		
	}
	
	public void setTransferencia(CuentaCorriente cc_destino, double valor_transferencia) {
		
		//this.saldoInicial -= valor_transferencia;
		
		this.setReintegro(valor_transferencia);
		
		cc_destino.setIngreso(valor_transferencia);
		
		System.out.println("\n ... Transferencia a: " + cc_destino.getDatosCC() + "\n realizada ");
	}

}
