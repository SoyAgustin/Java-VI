package mx.com.bytebank.test;

import java.util.ArrayList;

import mx.com.bytebank.modelo.*;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 2);
		Cuenta cc2 = new CuentaCorriente(12, 3);
		
		lista.add(cc);
		lista.add(cc2);
		
		//Se puede eliminar el cast porque ya sabe que todos los elementos de la lista son de tipo Cuenta.
		Cuenta obtenerCuenta =  lista.get(0);
		//System.out.println(obtenerCuenta);
		
		//¿como podria obtener todos los elementos de la lista
		
		//Usando un for each
		int i = 0;
		for(Cuenta cuenta : lista) {
			System.out.println("-----elemento "+i+"-------");
			System.out.println(cuenta);
			System.out.println("----------------------\n");
			i++;
		}		
		
	}
}
