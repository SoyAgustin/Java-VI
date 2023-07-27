package mx.com.bytebank.modelo;

public class SistemaInterno {
	
	private String clave = "AluraCursosOnline";
	
	public boolean Autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
