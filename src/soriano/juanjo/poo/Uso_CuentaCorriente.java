package soriano.juanjo.poo;

public class Uso_CuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente miCuenta = new CuentaCorriente("Juanjo", 1000.0);
		
		CuentaCorriente piCuenta = new CuentaCorriente("Pi", 1500.0);
		
		System.out.println(miCuenta.getDatosCC());
		
		System.out.println(piCuenta.getDatosCC());
		
		miCuenta.setTransferencia(piCuenta, 500.0);
		
		System.out.println(miCuenta.getDatosCC());
		
		System.out.println(piCuenta.getDatosCC());

	}

}
