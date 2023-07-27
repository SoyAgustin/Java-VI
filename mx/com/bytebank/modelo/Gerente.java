package mx.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable { //Gerente ES UN funcionario
	
	private String clave;
	
	public void setClave(String clave){
		this.clave = clave;
	}
	public String getClave() {
		return clave;
	}
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	//Sobreescritura del método, porque volvimos a escribir el método.
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando bonificacion desde GERENTE");
		return super.getSalario()+ this.getSalario()*0.05;
		//     obtiene el salario + obtiene la bonificacion del funcionario
	}
}
