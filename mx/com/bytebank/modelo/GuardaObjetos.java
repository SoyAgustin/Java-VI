package mx.com.bytebank.modelo;

public class GuardaObjetos {
	//Esta clase guarda todo tipo de objetos en un array
	
	Object[] objeto = new Object[10];
	int indice = 0;
	
	public void adicionar(Object objetoNuevo) {
		objeto[indice] = objetoNuevo;
		indice++;
	}
	public Object obtener(int indice) {
		return objeto[indice];
	}
}
