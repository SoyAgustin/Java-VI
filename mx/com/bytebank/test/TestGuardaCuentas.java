package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestGuardaCuentas {
	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11,22);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(13, 23);
		guardaCuentas.adicionar(cc2);
		
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
		
	}
}
