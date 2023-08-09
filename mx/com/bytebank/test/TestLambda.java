package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.com.bytebank.modelo.Cliente;
import mx.com.bytebank.modelo.Cuenta;
import mx.com.bytebank.modelo.CuentaAhorros;
import mx.com.bytebank.modelo.CuentaCorriente;

public class TestLambda {

	public static void main(String[] args) {
	    Cuenta cc1 = new CuentaCorriente(22, 33);
	    Cliente clienteCC1 = new Cliente();
	    clienteCC1.setNombre("Diego");
	    cc1.setTitular(clienteCC1);
	    cc1.depositar(333.0);

	    Cuenta cc2 = new CuentaAhorros(22, 44);
	    Cliente clienteCC2 = new Cliente();
	    clienteCC2.setNombre("Renato");
	    cc2.setTitular(clienteCC2);
	    cc2.depositar(444.0);

	    Cuenta cc3 = new CuentaCorriente(22, 11);
	    Cliente clienteCC3 = new Cliente();
	    clienteCC3.setNombre("Liam");
	    cc3.setTitular(clienteCC3);
	    cc3.depositar(111.0);

	    Cuenta cc4 = new CuentaAhorros(22, 22);
	    Cliente clienteCC4 = new Cliente();
	    clienteCC4.setNombre("Noel");
	    cc4.setTitular(clienteCC4);
	    cc4.depositar(222.0);
	    
	    List<Cuenta>  lista = new ArrayList<>();
	    lista.add(cc1);
	    lista.add(cc2);
	    lista.add(cc3);
	    lista.add(cc4);
		
		System.out.println("Antes de ordenar por numero");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getNumero());
		}
		/*Las lambdas son funciones que pueden reemplazar
		 *  una clase anónima o una interfáz funcional
		 *  simplemente se declara la estructura
		 *  (parametros)->{return logica}
		 *  o bien si es una sola linea
		 *  (parametros -> logica)*/
		
		//por ejemplo:
		lista.sort((Cuenta o1,Cuenta o2)->
		Integer.compare(o1.getNumero(), o2.getNumero()));
		System.out.println("Despues de ordenar por numero");
		
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getNumero());
		}
		
		
		//También funciona con collections
		System.out.println("Antes de ordenar por nombre");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getTitular().getNombre());
		}
		
		Collections.sort(lista,(c1,c2)->{//Vemos que como la lista ya esta tipada no es ni siquiera necesario declarar el tipo de los parámetros de la expresión lambda
			String nombre1 = c1.getTitular().getNombre();
			String nombre2 = c2.getTitular().getNombre();
			return nombre1.compareTo(nombre2);
		});
		
		System.out.println("Después de ordenar por nombre");
		/*Las listas tienen su propio metodo for each
		 * se implementa con una interfaz funcional Consumer*/
		lista.forEach((cuenta) ->
		System.out.println(cuenta.getTitular().getNombre()));
		
	}
	
}
