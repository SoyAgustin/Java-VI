package mx.com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.com.bytebank.modelo.*;

public class TestOrdenarLista {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		/*Como podemos ordenar las cuentas*/
		System.out.println("Antes de ordenar");
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
		System.out.println("Despues de ordenar");
		for(Cuenta cuenta:lista) {
			System.out.println(cuenta.getNumero());
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
		if(o1.getNumero()==o2.getNumero()) {
			return 0;
		}else if(o1.getNumero()>o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
