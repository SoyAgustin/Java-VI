package mx.com.bytebank.modelo;

public class AutenticacionUtil {
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	public boolean setClave(String clave) {
		return this.clave == clave;
	}
}
