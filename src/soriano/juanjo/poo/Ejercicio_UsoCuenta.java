package soriano.juanjo.poo;

public class Ejercicio_UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio_CuentaCorriente Cuenta1 = new Ejercicio_CuentaCorriente("Juanjo", 500);
		
		Ejercicio_CuentaCorriente Cuenta2 = new Ejercicio_CuentaCorriente("Pi", 500);
		
		System.out.println(Cuenta1.getDatosCuenta());
		
		System.out.println(Cuenta2.getDatosCuenta());
		
		Cuenta1.setTransferencia(Cuenta2, 200);
		
		System.out.println(Cuenta1.getDatosCuenta());
		
		System.out.println(Cuenta2.getDatosCuenta());

	}

}
