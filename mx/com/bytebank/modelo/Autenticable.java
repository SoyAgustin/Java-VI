package mx.com.bytebank.modelo;

//En las interfaces todo es abstracto, se le puede escribir el modificador private a todo pero no es necesario porque ya estan así por defecto
public interface Autenticable{ //Una interfaz no puede extender de una clase
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
	
}
