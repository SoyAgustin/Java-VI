package mx.com.bytebank.modelo;

public class Contador extends Funcionario {
	//Contador es un funcionario
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando bonificacion desde CONTADOR");
		return 200;
	}
}
