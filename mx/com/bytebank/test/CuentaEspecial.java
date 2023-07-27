package mx.com.bytebank.test;

import mx.com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	

	public CuentaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double saldo) {
		super.saldo = 0.0;
		
	}

}
