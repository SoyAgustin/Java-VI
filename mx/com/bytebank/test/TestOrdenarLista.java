package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mx.com.bytebank.modelo.*;

public class TestOrdenarLista {
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
		
		/*Como podemos ordenar las cuentas*/
	    
	    //Ordenando por numero
	    //---------------------------------------
		System.out.println("Antes de ordenar por numero");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getNumero());
		}
		
		/*Ordenado por el numero de cuenta:
		 * El método sort de las listas necesita un comparador de la forma Comparator<? extends Cuenta>
		 * 
		<? extends Cuenta> = Cualquier objeto que extiende de Cuenta
		
		*Primero implementamos el comparador para que lo reciba sort*/
		
		Comparator<Cuenta> Comparator = new OrdenadorNumeroPorNumeroCuenta();
		lista.sort(Comparator);
		System.out.println("Despues de ordenar por numero");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getNumero());
		}
		//--------------------------------------------
		
		//Ordenando por nombre:
		//--------------------------------------------
		System.out.println("Antes de ordenar por nombre");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getTitular().getNombre());
		}
		
		
		Comparator<Cuenta> ComparatorNombre = new OrdenadorPorNombre();
		lista.sort(ComparatorNombre);
		
		System.out.println("Después de ordenar por nombre");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getTitular().getNombre());
		}
		//------------------------------------------
		System.out.println("Antes de ordenar por saldo con Collections");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getSaldo());
		}
		/*Se pueden ordenar las listas con la clase
		 *  collections, para esto se debe implementar
		 *  la interfaz 'Comparable' a la clase de los
		 *  objetos que deseemos comparar. 
		 *  En este caso a la clase cuenta
		 *  posteriormente se tiene que sobreescribir 
		 *  el método 'compareTo' para establecer
		 *  un criterio de comparación. */
		
		/*Implementamos una clase anónima, con esto nos
		 * ahorramos el escribir una nueva clase ordenadorPorNombre*/
		Collections.sort(lista, new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
			String nombre1=o1.getTitular().getNombre();
			String nombre2=o2.getTitular().getNombre();
			
			return nombre1.compareTo(nombre2);
		}
			});
		System.out.println("Después de ordenar por saldo con Collections");
		
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getSaldo());
		}
		
	}
}

/*Creamos directamente una clase que implementa el 
 * comparador, que nos va a servir para ordenar por 
 * numero de cuenta*/
class OrdenadorNumeroPorNumeroCuenta implements Comparator<Cuenta>{
	
/*Internamente Java entiende que si el método compare
 * regresa 0 el primero es igual que el segundo
 * regresa 1 si es mayor
 * y regresa -1 si es menor*/
	
	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		/*
		if(o1.getNumero()==o2.getNumero()) {
			return 0;
		}else if(o1.getNumero()>o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}*/
		/*Equivalentemente de forma intermedia:
		 return o1.getNumero()-o2.getNumero();*/
		/*Usando wrappers:*/
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}
 
class OrdenadorPorNombre implements Comparator<Cuenta>{
	@Override
	public int compare(Cuenta o1,Cuenta o2) {
	String nombre1=o1.getTitular().getNombre();
	String nombre2=o2.getTitular().getNombre();
	
	return nombre1.compareTo(nombre2);/*Usando un método
	 de String que retorna un entero*/
	} 
} 