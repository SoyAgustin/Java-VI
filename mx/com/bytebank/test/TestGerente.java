package mx.com.bytebank.test;
import mx.com.bytebank.modelo.Gerente;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setNombre("Diego");
		gerente.setTipo(1);
		gerente.setClave("AluraCursosOnline");
		
		
		
		System.out.println(gerente.getBonificacion());
		
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));

		
	}
}
