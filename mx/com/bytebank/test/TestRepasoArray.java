package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		
		/*
		 * Ya sabemos que un entero 'int' es un primitivo
		 * y es diferente de un Objeto.
		 * Existe la clase Integer como lo sería String.
		 * Entonces los metodos como ArrayList que comen 
		 * objetos pueden guardar automaticamente (autoboxing)
		 * los enteros.
		 * */
		
		int numero=40;
		Integer numeroObjeto = new Integer(40);
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(numero);
		lista.add(numeroObjeto);
		lista.add(new Integer(40)); // Esto es lo que hace por debajo (autoboxing)
		
		
	}
}
