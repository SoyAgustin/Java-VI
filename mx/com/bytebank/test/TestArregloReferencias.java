package mx.com.bytebank.test;

import mx.com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	public static void main(String[] args) {
		//Creandol un objeto del tipo cuenta corriente:
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		//Creando el array de tipos de cuenta corriente:
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		//Se puede declarar una variable pero sin  inicializarlos 
		CuentaCorriente cuentaV;
		System.out.println("-----------------");
		for (int i = 0; i<cuentas.length;i++) {
			System.out.println(cuentas[i]);
		}
	}
}
