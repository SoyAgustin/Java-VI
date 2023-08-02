package mx.com.bytebank.test;

import mx.com.bytebank.modelo.*;

public class TestGuardaObjetos {
 public static void main(String[] args) {
	GuardaObjetos go = new GuardaObjetos();
	Cuenta cc = new CuentaCorriente(12, 5);
	go.adicionar(cc);
	int numero = 10;
	go.adicionar(numero);
	go.adicionar("String en lugar 3");
	
	System.out.println(go.obtener(0));
	System.out.println(go.obtener(1));
	System.out.println(go.obtener(2));
}
}
