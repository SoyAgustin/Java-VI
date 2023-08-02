package mx.com.bytebank.modelo;

public class GuardaCuentas {
	//Crear un objeto para guardar muchas cuentas
	//Nos permite agregar cuentas con un método (para arrays)
	
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;
	
	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
}
