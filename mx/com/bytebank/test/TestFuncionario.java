package mx.com.bytebank.test;
import mx.com.bytebank.modelo.Contador;
import mx.com.bytebank.modelo.Funcionario;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("4445566665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		
		System.out.println(diego.getBonificacion());
		
	}
}
