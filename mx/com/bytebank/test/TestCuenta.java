package mx.com.bytebank.test;
import mx.com.bytebank.modelo.CuentaAhorros;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca); // Esta opeación tiene una comisión de 10 centavos
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
