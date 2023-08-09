package mx.com.bytebank.modelo;

public abstract class Cuenta implements Comparable<Cuenta> {
	protected double saldo; // es accesible para las clases hijas (como CuentaAhorros al usar this.sal)
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(); 
	
	private static int total=0;
	 
	public Cuenta(int agencia, int numero) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}
		this.agencia = agencia;
		this.numero = numero; 
		/*total++;
		System.out.println("Cuentas totales = "+total);*/
		System.out.println("numero: "+numero+"  Agencia:"+agencia);
	}
	
	public abstract void depositar(double saldo);
	
	public boolean retirar(double valor) {
		if (this.saldo>=valor) {
			this.saldo = this.saldo-valor;
			return true; 
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo>= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() { 
		return this.saldo;
	}
	
	public void setAgencia(int agencia){
		if (agencia>=0) {
			this.agencia= agencia;
		}else {
			System.out.println("No están permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public static int getTotal() {
		return total;
	}
	
	//Esta sobreescritura modifica la forma en la que .contains
	//compara los objetos en una lista, en este caso estamos
	//comparando los valores y no sobre las referencias como 
	//viene por defecto.
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta)obj; //Cast de objeto a Cuenta
		return this.agencia == cuenta.getAgencia() &&
				this.numero == cuenta.getNumero();
	}
	
	
	/*En este caso 'compareTo' establece el criterio
	 * para comparar y hacer un ordenamiento de las 
	 * listas con la clase Collections del paquete
	 * Util*/
	@Override
	public int compareTo(Cuenta outra) {
		//Por ejemplo un ordenamiento por saldo
	        return Double.compare(this.saldo, outra.saldo);//Aqui se uso el metodo compare de los wrappers, pero pudo hacerse otra logica de comparación.
	}
	/*Este ultimo método es el que hace que funcione 
	 * Collections.sort(lista) en TestOrdenarLista.java*/
	
}