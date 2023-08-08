package mx.com.bytebank.test;

public class TestRepasoArray {
	public static void main(String[] args) {
		
		/**
		 ** Ya sabemos que un entero 'int' es un primitivo
		 ** y es diferente de un Objeto.
		 ** Existe la clase Integer como lo sería String.
		 ** Entonces los metodos como ArrayList que comen 
		 ** objetos pueden guardar automaticamente (autoboxing)
		 ** los enteros.
		 ** **/
		
		int numero=40;
		//Esa forma de 'envolver' se llma WRAPPER.
		
		/*autoboxing: cuando un metodo necesita un objeto
		 * y se detecta un primitivo automaticamente hace 
		 * el siguiente método por debajo*/
		Integer numeroObjeto = Integer.valueOf(40);
		
		
		/*unboxing: Lo contrario a autoboxing, si lo que se 
		 *necesita es un entero a partir del objeto
		 *java lo extrae con el siguiente método*/
		
		int valorPimitivo = numeroObjeto.intValue();
		//Equivalentemente se puede hacer lo siguiente 
		//de forma mas comoda 
		int valorPrimitivoCorto = numeroObjeto;
		
		/*Con los Wrappers podemos obtener el valor en otros
		 * tipos de valores, por ejemplo*/
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.floatValue();
		
		/*
		 * Tambien se pueden obtener los valores máximos y mínimos de los tipos de datos*/
		
		System.out.println(Integer.MAX_VALUE); //el numero mas grande soportado
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);//el numero pero en bits
		System.out.println(Integer.BYTES);
		
	}
}
