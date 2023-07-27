package mx.com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

	//Queremos que el administrador tambien se pued autenticar
	//La clase con ese método es Gerente
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.setClave(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.iniciarSesion(clave);
		
	}

}
