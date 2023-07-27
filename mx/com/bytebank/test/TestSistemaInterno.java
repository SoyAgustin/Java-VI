package mx.com.bytebank.test;
import mx.com.bytebank.modelo.Administrador;
import mx.com.bytebank.modelo.Gerente;
import mx.com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.Autentica(gerente1);
		sistema.Autentica(admin);
	}
}
